package exercise10;

import java.util.Scanner;

public class Customer extends HumanInformation{
    Scanner in = new Scanner(System.in);
    private String typeOfCar;

    Customer(){
        typeOfCar = null;
    }

    @Override
    public void input(){
        super.input();
        System.out.print("Enter type of car: ");
        typeOfCar = in.nextLine();
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Type of car: " + typeOfCar);
    }
}
