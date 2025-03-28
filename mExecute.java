package monoRating;
import java.util.Scanner;
public class mExecute {
// Collect MonolithServers character information
	uData userData;
// Globally defined variable(s)
	int scoreCount = 0;
	/*4 is perfect
	 * 3 is nice
	 * 2 is acceptable
	 * 1 is poor
	 */
	
	public mExecute() { // Call uData to other functions
	userData = new uData();	
	}
	
	public void prof(String nName, int nTurn) {
		int i = nTurn;
		String level = nName;
		 if (userData.skLevels[i] >= 75 && userData.skLevels[i] <= 100) {
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
			 System.out.println("You're inexperienced in " + level + ", I suggest you look at the guides on Discord \n https://discord.com/channels/250412667649392642/1352523490418360341");
			 scoreCount += 1;
		 }
		 else {
			 System.out.println("ERROR");
		 }
			
	}	


public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in); // scanner 
	mExecute exInt = new mExecute(); // object  
	
	// Call method to access how many level integers exits
	int [] skLevels = exInt.userData.getSkillLevels();
	
	for (int i = 0; i < levelNames.values().length; ++i) { // Loop runs to store skill level(s)
		
			System.out.println("Enter your level for " + levelNames.values()[i] + ": "); // Prints prompt according to respective skill input
			skLevels[i] = scn.nextInt(); // scans for skill integer
			
			while (skLevels[i] > 100 || skLevels[i] < 0) { // check to make sure that a valid option is input
				System.out.println("You have entered an invalid option, values 0-100 are valid.");
				skLevels[i] = scn.nextInt(); // rescan to ensure correct value is put
			}
		}

for (levelNames level : levelNames.values()) {
	
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
	
		
	}
}


	
	
