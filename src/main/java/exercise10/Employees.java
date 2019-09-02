package exercise10;

import java.util.Scanner;

public class Employees extends HumanInformation {
    Scanner in = new Scanner(System.in);
    private double salary;
    private String position;

    Employees(){
        salary = 0;
        position = null;
    }

    @Override
    public void input(){
        super.input();
        System.out.print("Enter position: ");
        position = in.nextLine();
        System.out.print("Enter salary: ");
        salary = in.nextDouble();
    }

    private void setSalary(double salary){
        this.salary = salary;
    }

    private void setPosition(String position){
        this.position = position;
    }

    @Override
    public void display(){
        int choice;
        double salary;
        String position;

        System.out.println("0. Change salary");
        System.out.println("1. Change position");
        System.out.println("Enter your choice");
        choice = in.nextInt();
        switch (choice){
            case 0:
                System.out.print("Change salary to: ");
                salary = in.nextDouble();
                setSalary(salary);
                break;
            case 1:
                System.out.print("Change position to: ");
                position = in.nextLine();
                setPosition(position);
                break;
            default:
                System.out.println("Just enter 0-1");
        }
        super.display();
        System.out.println("Salary of employee: " + this.salary);
        System.out.println("Position of employee: " + this.position);
    }
}
