package monoRating;

public class uData {
	public String steamUser; // Steam user name
	public String monoUser; // RP user name
	public int pLevel; // Character's player level
	// "param" appended to the beginning of any word refers to the input of data from user
	
 public void cData (String paramSteam, String paramChar, int paramPlevel) { // cData refers to the basic player information, not character level information
	this.steamUser = paramSteam;
	this.monoUser = paramChar; 
	this.pLevel = paramPlevel;  }
 
public int[] skLevels = new int[8]; // equivalent to SkillLevels

// Getter method to access the length of int[] levels
public int[] getSkillLevels() { // getter for skill levels to be assigned.
	return skLevels;
}
//set methods
	public void setSkillLevels(int[] inpSkillLevel) {
		this.skLevels = inpSkillLevel;
	}
public String toString() {
StringBuilder returnString = new StringBuilder();
	System.out.println("Program created by: Lambsauce & Coffii on 03.28.2025");
	System.out.println("Steam Name: " + this.steamUser + "\n" + "Character Name: " + this.monoUser + "\n" + "Player Level: " + this.pLevel + "\n");
for (int c = 0; c < levelNames.values().length; ++c) {
	returnString.append("Your skill level for " + levelNames.values()[c] + " is: " + skLevels[c] + "\n\n");	
		}
return returnString.toString(); // returns append of returnString

	}
}
