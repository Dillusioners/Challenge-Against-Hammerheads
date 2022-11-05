#  *
#  * Author - Tommy Shelby
#  * Team - Dillusioners
#  * Program word - basis
#  * This is a youtube channel finder on the basis of words inputted
#  *

ytchannelname = ["Pewdipie", "Wallibear", "Markiplier", "MrsOki", "MrBeats", "Belle Deplhine", "KSI", "Vikkstar123", "Manny",
                 "Zerkaa", "Pokimane", "BeastBoyShub", "Eminem", "YungFilly", "Mia Khalifa", "Technoblade", "HannahXXRose",
                 "NotAestheticHannah", "Javed", "TechnoGamers", "Nick Crowley", "Nexpo", "Disrupt", "COC India", "TSG Gamer",
                 "Veritasium", "Action Lab", "Eminem", "Alan Walker","Dumbass", "Memecream", "T-Series"]
#taking three strings as input for searching youtubers
x = input("Enter your first letter or phrase")
y = input("Enter your second letter or phrase")
z = input("Enter your third letter or phrase")

x = x[0]
y = y[0]
z = z[0]
i = 0
#searching the inputted letters in the list of youtubers from above 
for i in range(len(ytchannelname)):
    if x in ytchannelname[i] and y in ytchannelname[i] and z in ytchannelname[i]:
        print(ytchannelname[i])