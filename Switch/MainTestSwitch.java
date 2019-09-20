import java.util.Scanner;

public class MainTestSwitch{
    public static void main(String[] args) {

        Switch sw=new Switch();

        System.out.println("Your Switch is Off");

        Scanner input = new Scanner(System.in);

        while(true){

        System.out.println("Press x to change it, Press any other key to end this process");

        if (input.nextLine().equals("x"))

       sw.toggleState();

        else break;
    }
}
}