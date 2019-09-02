package exercise10;

import java.util.Scanner;

public class HumanInformation {
    protected String name;
    protected String adress;

    HumanInformation(){
        name = null;
        adress = null;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter adress: ");
        adress = in.nextLine();
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Adress: " + adress);
    }
}
