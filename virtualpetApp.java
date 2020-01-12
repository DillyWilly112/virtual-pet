package virtualPetGame;

import java.util.Scanner; //import scanner

public class virtualpetApp extends virtualPet{
	static int random1 = 1;
	static int random2 = 2;
	static int random3 = 3;
	static int random4 = 4;
	static int random5 = 5;
	public virtualpetApp(String user, String petType, String petName) {
		super(user, petType, petName, petColor);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //scanner in.
		System.out.println("What is your name?"); // Get user name
   	 String user = input.nextLine();	
System.out.println("Welcome " + user + " Do you have a dog or a cat?"); //Get pet name
String petType = input.nextLine();
System.out.println("Well " + user + " does your " + petType + " have a name?");
String petName = input.nextLine();
System.out.println("What color is your " + petType + "?");
String petColor = input.nextLine();
System.out.println("So what would you like to do " + "with " + petName + "?");
System.out.println("feed enter 1"  + "," + " " + "play enter 2" + "," + " " + "bed enter 3" + "," + " " + "say hello enter 4" + "," + " " + "to quit enter 5.");
int option = input.nextInt();
	virtualPet newpet= new virtualPet(user, petName, petType, petColor);
for(;;) {
	if(random1 == option);
	age++;
	energy++;
	tired++;
	bored++;
	System.out.println("you fed " + newpet + ".");
	virtualPet.displayStats();
    if(random2 == option);
    age++;
    energy--;
    tired++;
    bored--;
    hunger++;
    System.out.println("You're playing with " + newpet + ".");
    virtualPet.displayStats();
	if(random3 == option);
	age++;
	energy++;
	tired--;
	hunger++;
	System.out.print("you put " + newpet + " to bed. Zzz...");
	virtualPet.displayStats();
    if(random4 == option);
    age++;
    energy++;
    bored--;
    hunger++;
    System.out.println("You said hello to " + petName + ".");
    virtualPet.displayStats();
    if(random5 == option);
    System.out.println("Goodbye " + user);
    System.exit(0);
    if(age >= tooOld);
    System.out.println(petName + " die of old age. Gameover...");
    System.exit(0);
    if(energy >= sleep);
    System.out.println(petName + " fell asleep...Zzzz...");
    System.exit(0);
    if(tired >= tiredDie);
    System.out.println(petName + " died of Exhaustion. Gameover...");
    System.exit(0);
    if(hunger >= hungerDie);
    System.out.println(petName + " starved to death. Gameover...");
    System.exit(0);
    if(hunger >= starving);
    System.out.println(petName + " is hungry, feed " + petName + " before starvation. ");	
    input.close();
}
	}	
}//Close class
