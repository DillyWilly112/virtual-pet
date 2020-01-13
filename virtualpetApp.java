import java.util.Scanner;
public class virtualpetApp extends virtualPet{ 
	public virtualpetApp(String user, String petType, String petName, Object petColor) {
		super(user, petType, petName, petColor);
	}
	public static void main(String[] args) {
 Scanner input = new Scanner(System.in); //scanner in.
System.out.println("What is your name?"); // Get user name
 String user = input.next();	
System.out.println("Welcome " + user + " Do you have a dog or a cat?"); //Get pet name
 String petType = input.next();
System.out.println("Well " + user + " what is your " + petType + "'s name?");
 String petName = input.next();
System.out.println("What color is " + petName + "?");
 String petColor = input.next();
 System.out.println("Okay I think i've got what I need. hold on while I create your profile...");
 virtualPet newpet = new virtualPet(user, petName, petType, petColor);
 System.out.println(".....");
 System.out.println("Your profile has been created!");
 for(;;){
 System.out.println("What would you like to do " + "with " + petName + "?");
 System.out.println("1. feed 4. wake up");
 System.out.println("2. play 5. say hello");
 System.out.println("3. bedtime 6. quit");
 System.out.println("7. Display Stats");
 int option = input.nextInt();
	if(option == 1 && energy < 10) {
	energy++;
	bored++;
	hunger++;
	System.out.println("you fed " + petName + ".");
	System.out.println("energy + 1, bored - 1, hunger - 1;");
    }
	else if(option == 2 && energy > 2) {
    energy--;
    bored++;
    hunger--;
    System.out.println("You're playing with " + petName + ".");
    System.out.println("energy - 1; bored - 1, hunger + 1");
	}
    else if(option == 3 && energy == 1) {
	energy = energy + 2;
	hunger = hunger - 2;
	bored = 0;
	System.out.print(petName + " went to bed. Zzz...");
	System.out.println("energy + 2, hunger + 2, bored = 0");
    }
	else if(option == 4) {
    System.out.println( petName + " is well rested.");
	}
	else if(option == 5) {
    energy++;
    bored--;
    hunger--;
    System.out.println("You said hello to " + petName + ".");
    System.out.println("energy + 1, bored + 1, hunger +1");
	}
    else if(option == 6) {
    System.out.println("Goodbye.");
    newpet.displayStats();
    System.exit(0);
    }
    else if(option == 7) {
    	newpet.displayStats();
    }
	if(energy == 2) {
		System.out.println("Put " + petName + " to bed !");
	}
	if(bored <= 2 && energy >= 1 && energy < 10) {
		System.out.println(petName + " is bored! Play with them!");
	}
    if(energy <= 0) {
    System.out.println(petName + " died of Exhaustion. Gameover...");
    newpet.displayStats();
    System.exit(0);
    }
    if(energy == 10) {
		System.out.println(petName + " is full. Play with " + petName + " to famish.");
    }
    if(bored <= 0) {
    	System.out.println(petName + " got too bored and ran away. Gameover... ");
    	System.exit(0);
    }
    if(energy == 11) {
    	System.out.println(petName + " has eaten too much and exploded. Gameover...");
    	System.exit(0);
    }
    if(hunger == 0) {
    System.out.println(petName + " starved to death. Gameover...");
    newpet.displayStats();
    System.exit(0);
    }
    if(hunger == 2) {
    System.out.println(petName + " is hungry, feed " + petName + " before starvation. ");	
	} 
    else;
	}
	}
}//Close class
