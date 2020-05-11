const Promise = require("bluebird");
const rp = require("request-promise");
const fs = require('fs');

const express = require("express");

// Fill this in with your own creds
const client_id = "";
const client_secret = "";

const credentials = {
    client: {
        id: client_id,
        secret: client_secret
    },
    auth: {
        tokenHost: "https://us.battle.net"
    }
};
const oauth2 = require("simple-oauth2").create(credentials);
let token = null;

const getToken = () => {
    if (token === null || token.expired()) {
        return oauth2.clientCredentials
            .getToken()
            .then(oauth2.accessToken.create)
            .then(t => {
                token = t;
                return t.token.access_token;
            });
    } else {
        return Promise.resolve(token.token.access_token);
    }
};

const getTieredBGCards = (tier) => {
    return getToken()
        .then(token => {
            return rp.get({
                uri: `https://us.api.blizzard.com/hearthstone/cards`,
                json: true,
                qs: {
                    locale: "en_US",
                    gameMode: "battlegrounds",
                    tier: tier
                },
                headers: {
                    Authorization: `Bearer ${token}`
                }
            });
        })
        .then(cards => cards.cards)
};


const getAndWriteCardsForTier = (tier) => {
    return Promise.all([getTieredBGCards(tier)])
        .then((cards) => {
            // TODO: Make this async, its quick enough it doesn't matter but still
            fs.writeFileSync(`../CardData/tier${tier}`, JSON.stringify(cards, null, 2), 'utf-8' );
        })
};

// BG has 6 tiers
for(i = 1; i < 7; i++){
    getAndWriteCardsForTier(i);
}
