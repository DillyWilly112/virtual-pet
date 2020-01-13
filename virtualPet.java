public class virtualPet{
	    static int bored;
	    static int hunger;
	    static int energy;
		static int tired;
		static String user;
		static String petName;
		public static String petType;
		protected static Object petColor; 
		
public virtualPet(String user, String petType, String petName, Object petColor) {
	virtualPet.user = user;
	virtualPet.petType = petType;
	virtualPet.petName = petName;
	virtualPet.petColor = petColor;
	energy = 5;
	bored = 5;
	hunger = 5;
}
public void displayStats() {
System.out.println(user + " your " + petColor  + " "+ petName + "'s name is " + petType + ". GameStats are below.");
System.out.println("Energy: " + energy);
System.out.println("Bored: " + bored);
System.out.println("Hunger: " + hunger);

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
public String getuserName() {
	return user;
}
public int getEnergy( ) {
	return energy;
}
public int getBored() {
	return bored;
}
public int getHunger() {
	return hunger;
}
}
