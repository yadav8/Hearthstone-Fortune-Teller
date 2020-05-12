# Script to create an internal lookup table based on
# data collected from card APIs

import json


NUM_TIERS = 6
CARD_DATA_PATH = "../CardData/"


def createMinionLookup(tier):
	input_filename  = "tier" + str(tier)
	output_filename = "tier" + str(tier) + "lookup.json"

	# Read from Bnet imported data
	with open(CARD_DATA_PATH + input_filename, "r") as read_file:
		minion_list = json.load(read_file)[0]

		minion_list.sort(key = lambda m: m['name'])	# Sort alphabetically by name
		output_list = []
		internal_id = tier * 1000

		for minion in minion_list:
			minion_lite = 	\
				{ 			\
					"id": internal_id,
					"bnet_id": 	minion["id"],
					"name": minion["name"],
					"attack": minion["attack"],
					"health": minion["health"],
					"tier": tier,
					"tier_package": "tier" + str(tier),
					"tribe": getTribeFromMinion(minion),
					"classname": getClassnameFromName(minion["name"])
				}
			internal_id += 1
			output_list.append(minion_lite)

	# Write into lookup file
	with open(CARD_DATA_PATH + output_filename, "w") as write_file:
			json.dump(output_list, write_file, indent=4)

def getClassnameFromName(name):
	#blacklist = {" ", "-", "'", ","}
	#whitelist = [a-z, A-Z]
	classname = ""
	for c in name:
		if c.isalpha():
			classname += c
	return classname


def getTribeFromMinion(minion):
	# Maps Bnet data "minionTypeID" to our Tribe names
	minion_type = {20: "BEAST", 15: "DEMON", 17: "MECH", 14: "MURLOC", 24: "DRAGON"}

	if "minionTypeId" in minion:
		return minion_type[minion["minionTypeId"]]
	else:
		return "NEUTRAL"


if __name__ == "__main__":
	for tier in range(1, NUM_TIERS+1):
		createMinionLookup(tier)