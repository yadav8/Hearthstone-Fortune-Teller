# Script to create classes for all minions
# identified under our lookup json files

import json


NUM_TIERS = 6
CARD_DATA_PATH = "../../../CardData/"
SAMPLE_FILE = "./SampleMinion.txt"

# This tracks the $REPLACE tags in the SampleMinion.txt to
# the relavant key in our minion lookup files
replace_dict = { \
	"$TIER_PACKAGE": "tier_package",
	"$CLASSNAME": "classname",
	"$ID": "id", 
	"$TRIBE": "tribe",
	"$TIER": "tier",
	"$NAME": "name",
	"$ATTACK": "attack",
	"$HEALTH": "health",
}


def createMinionClass(tier):
	input_filename = "tier" + str(tier) + "lookup.json"
	sample_filedata = ""

	with open(SAMPLE_FILE, "r") as sample_file:
		sample_filedata = sample_file.read()


	with open(CARD_DATA_PATH + input_filename, "r") as minion_list_file:
		minion_list = json.load(minion_list_file)

		for minion in minion_list:
			current_filedata = sample_filedata
			for item in replace_dict:
				current_filedata = current_filedata.replace(item, str(minion[replace_dict[item]]))

			output_filename = "../tier" + str(tier) + "/" + minion["classname"] + ".java"
			
			with open(output_filename, "w") as write_file:
				write_file.write(current_filedata)


def getClassNameFromName(name):
	blacklist = {" ", "-", "'"}
	classname = ""
	for c in name:
		if c not in blacklist:
			classname += c
	return classname


def getTribeFromMinion(minion):
	minion_type = {20: "BEAST", 15: "DEMON", 17: "MECH", 14: "MURLOC", 24: "DRAGON"}

	if "minionTypeId" in minion:
		return minion_type[minion["minionTypeId"]]
	else:
		return "NEUTRAL"


if __name__ == "__main__":
	for tier in range(1, NUM_TIERS+1):
		createMinionClass(tier)