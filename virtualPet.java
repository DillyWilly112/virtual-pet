package virtualPetGame;

public class virtualPet{
	    static int hunger;
	    static int energy;
		static int tired;
		static int bored;
		static int age;
		
		final static int starving = 14;
		final static int sleep = 10;
		final int full = 15;
		final static int hungerDie = 15;
		final static int tiredDie = 12;
		final static int tooOld = 1000; 
		final int toobored = 12;
		
		String user;
		String type;
		static String petName;
		private static String petType;
		protected static Object petColor; 

public virtualPet(String user, String petType, String petName, Object petColor) {
	this.user = user;
	virtualPet.petType = petType;
	virtualPet.petName = petName;
	virtualPet.petColor = petColor;
	age = 0;
	energy = 100;
	tired = 0;
	bored = 4;
	hunger = 0;
}
public static void displayStats() {
System.out.println("Your " + petType + "'s name is " + petName + " your " + petType + " is " + petColor + ".");
}
public String getPetType() {
	return petType;
}
public String getPetName() {
	return petName;
}
public Object getPetColor() {
	return petColor;
}
}