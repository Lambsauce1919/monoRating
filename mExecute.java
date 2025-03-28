package monoRating;
import java.util.Scanner;
public class mExecute {
// Collect MonolithServers character information
	uData userData;
// Globally defined variable(s)
	int scoreCount = 0;
	
	public mExecute() { // Call uData to other functions
	userData = new uData();	
	}
	
	public void prof(String nName, int nTurn) {
		int i = nTurn;
		String level = nName;
		if (userData.skLevels[i] >= 175 && userData.skLevels[i] <= 200) {
			 System.out.println("You clearly have no life, WOW " + level + ", I don't know if I should congratulate or be concerned for you. \n");
			 scoreCount += 7;
		 }
		else if (userData.skLevels[i] >= 150 && userData.skLevels[i] < 175) {
			 System.out.println("Holy, you've put some hours in I see" + level + ", do you have a life? \n");
			 scoreCount += 6;
		 }
		else if (userData.skLevels[i] >= 100 && userData.skLevels[i] < 150) {
			 System.out.println("You excell above most people in " + level + ", amazing work there! \n");
			 scoreCount += 5;
		 }
		else if (userData.skLevels[i] >= 75 && userData.skLevels[i] < 100) {
			 System.out.println("You show excellence in " + level + ", good job. \n");
			 scoreCount += 4;
		 }
		 else if (userData.skLevels[i] >= 50 && userData.skLevels[i] < 75) {
			 System.out.println("You're proficient in " + level + ", well done. \n");
			 scoreCount += 3;
		 }
		 else if (userData.skLevels[i] >= 25 && userData.skLevels[i] < 50) {
			 System.out.println("You're an amateur in " + level + ", you should get to it. \n");
			 scoreCount += 2;
		 }
		 else if (userData.skLevels[i] < 25 && userData.skLevels[i] >= 0 ){
			 System.out.println("You're inexperienced in " + level + ", I suggest you look at the guides on Discord\n https://discord.com/channels/250412667649392642/1352523490418360341\n");
			 scoreCount += 1;
		 }
		 else {
			 System.out.println("ERROR");}}
	
// Main code that runs, the lean cut of steak
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); // scanner 
	mExecute exInt = new mExecute(); // object  
	
	// Player enters their basic player and user information
	System.out.println("Enter your Steam Name: ");
	String steamName = scn.nextLine();
	System.out.println("\nEnter your Character Name: ");
	String characterName = scn.nextLine();
	System.out.println("\nEnter your Player Level: ");
	int playerLevel = scn.nextInt();
	
	// Sends user information back to uData class to be stored preferably privately, will look into.
	exInt.userData.cData(steamName, characterName, playerLevel);
	
	// Call method to access how many level integers exits so they can be assigned in uData
	int [] skLevels = exInt.userData.getSkillLevels();
	
	for (int i = 0; i < levelNames.values().length; ++i) { // Loop runs to store skill level(s)
		boolean isMastered = false;
			System.out.println("Enter your level for " + levelNames.values()[i] + ": "); // Prints prompt according to respective skill input
			skLevels[i] = scn.nextInt(); // scans for skill integer
			
			while (skLevels[i] > 100 || skLevels[i] < 0) { // check to make sure that a valid option is input
				System.out.println("You have entered an invalid option, values 0-100 are valid.");
				skLevels[i] = scn.nextInt(); // rescan to ensure correct value is put
			}
			System.out.println("Have you mastered this skill? Respond with: true / false"); // mastery prompt
			String booleanInput = scn.next();
			
			while (!booleanInput.equalsIgnoreCase("true") && !booleanInput.equalsIgnoreCase("false")) { // makes sure the right strings are input, if not program will not continue until conditions are met.
				System.out.println("Enter a valid response as instructed; Respond with: true / false");
				booleanInput = scn.next(); }
			
			if (booleanInput.equalsIgnoreCase("True")){
				isMastered = true;
			} else if (booleanInput.equalsIgnoreCase("False")) {
				isMastered = false;
			} if (isMastered) {
				System.out.println("Additional points will be added to your score count.\n");
				skLevels[i] += 100; 
			} else {
				System.out.println("You do not qualify for additional points.\n"); } }

System.out.println(exInt.userData.toString()); // ensure correct values are printing (debug)

for (levelNames level : levelNames.values()) { // repeats the switch below until all instances of the enum have been processed
	
	 switch (level) {
	 case MINING: // Runs through a set of pre-defined ranges to determine how versed the user is in a particular skill set
		 exInt.prof("Mining", 0); 
	 break;
	 
	 case FISHING:
		 exInt.prof("Fishing", 1);
	 break;
	 
	 case CHEMISTRY:
		 exInt.prof("Chemistry", 2);
	 break;
	 
	 case COOKING:
		 exInt.prof("Cooking", 3);
	 break;
	 
	 case WOODCUTTING:
		 exInt.prof("Woodcutting", 4);
	 break;
	 
	 case CRAFTING:
		 exInt.prof("Crafting", 5);
	 break;
	 
	 case METALWORKING:
		 exInt.prof("Metalworking", 6);
	 break;
	 
	 case FARMING:
		 exInt.prof("Farming", 7);
	 break;
	 
	default:
		System.out.println("INVALID: ERROR");
		break;
		 
	 }
}	
if (exInt.scoreCount == 56) {
	System.out.println("You've achieved a perfect score, congratulations to mastering your character on Monolith Server!");	
} else if (exInt.scoreCount < 56 && exInt.scoreCount > 40) {
	System.out.println("You have a well rounded character, you're way up there, leagues above a majority of players.");
}
else if (exInt.scoreCount <= 40 && exInt.scoreCount >= 28) {
	System.out.println("You exceed above most people overall, do you have too much time on your hands?");
}
else if (exInt.scoreCount > 0 && exInt.scoreCount <28) {
	System.out.println("You're pretty average around here, nothing too notable about you.");
}
scn.close(); // closed scanner to prevent resource leakage. 
	}{

}

}

	
	
