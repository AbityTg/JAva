import java.util.Scanner;

public class WifiDiagnosis {
  
public void fixWifi()
{
Scanner keyboard = new Scanner(System.in);
  
// First step is Reboot Computer 
System.out.println("First step: Reboot your computer. ");
System.out.print("Are you able to connect with the internet? (Yes or No): ");
String choice = keyboard.nextLine();
while(!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"))
{
System.out.println("Please enter Yes or No!\n");
System.out.print("Are you able to connect with the internet? (Yes or No): ");
choice = keyboard.nextLine();
}
if(choice.equalsIgnoreCase("Yes"))
{
System.out.println("Rebooting your computer seemed to work");
return;
}
  
// Second step is to reboot router
System.out.println("Second step: Reboot your Router");
System.out.print("Now are you able to connect with the internet? (Yes or No): ");
choice = keyboard.nextLine();
while(!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"))
{
System.out.println("Please enter Yes or No!\n");
System.out.print("Now are you able to connect with the internet? (Yes or No): ");
choice = keyboard.nextLine();
}
if(choice.equalsIgnoreCase("Yes"))
{
System.out.println("Rebooting your router seemed to work, goodbye.");
return;
}
  
// Third step is to make sure cables are connected
System.out.println("Third step: Make sure the cables to your router are plugged in firmly and your router is getting power");
System.out.print("Now are you able to connect with the internet? (Yes or No): ");
choice = keyboard.nextLine();
while(!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"))
{
System.out.println("Please enter Yes or No!\n");
System.out.print("Now are you able to connect with the internet? (Yes or No): ");
choice = keyboard.nextLine().trim();
}
if(choice.equalsIgnoreCase("Yes"))
{
System.out.println("Checking the router's cables seemed to work, goodbye!");
return;
}
  
// Fourth step is to move closer to router
System.out.println("Fourth step: move your computer closer to your router");
System.out.print("Now are you able to connect with the internet? (Yes or No): ");
choice = keyboard.nextLine();
while(!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"))
{
System.out.println("Please enter Yes or No!\n");
System.out.print("Now are you able to connect with the internet? (Yes or No): ");
choice = keyboard.nextLine();
}
if(choice.equalsIgnoreCase("Yes"))
{
System.out.println("Moving your computer closer to the router seemed to work, goodbye!");
return;
}
  
// Fifth step is to contact ISP
System.out.println("Fifth step: contact your ISP\n"
+ "Make sure your ISP is hooked up to your router.");
}
}