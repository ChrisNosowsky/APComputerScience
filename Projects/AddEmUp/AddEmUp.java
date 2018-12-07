import java.io.*;
import java.util.*;

public class AddEmUp
{
public static void main(String args[])
{
Scanner keyboard = new Scanner(System.in);

System.out.print("Enter something like 8 + 33 + 1,345 + 137 : ");
String s = keyboard.nextLine();

Scanner keyboard1 = new Scanner(s);
//looking for a space.
keyboard1.useDelimiter("\\s");

int sum = 0;
String temp = "";

while(keyboard1.hasNext())
{
//First we are going to pull the postion we are at.
temp = keyboard1.next();

if(temp.equals("+"))
{
//If we pulled a plus sign we add the next number.
sum = sum + keyboard1.nextInt();
}
else if(temp.equals("-"))
{
//If we pulled a minus sign we subtract the next number.
sum = sum - keyboard1.nextInt();
}
else
{
//This is here if the first number in the equation is positive.
sum = sum + Integer.parseInt(temp);
}

}
System.out.println("Sum is: " + sum);
}
}