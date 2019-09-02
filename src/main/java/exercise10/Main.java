package exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HumanInformation[] humanInformations = new HumanInformation[100];
        Student student = new Student();
        Employees employees = new Employees();
        Customer customer = new Customer();
        int choice, sum;
//      System.out.print("Enter sum of person: ");
//        sum = in.nextInt();
        for(int i = 0; ; i++){
            System.out.println("1. Student");
            System.out.println("2. Employee");
            System.out.println("3. Customer");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    humanInformations[i] = new HumanInformation();
                    humanInformations[i] = student;
                    humanInformations[i].input();
                    humanInformations[i].display();
                    break;
                case 2:
                    humanInformations[i] = new HumanInformation();
                    humanInformations[i] = employees;
                    humanInformations[i].input();
                    humanInformations[i].display();
                    break;
                case 3:
                    humanInformations[i] = new HumanInformation();
                    humanInformations[i] = customer;
                    humanInformations[i].input();
                    humanInformations[i].display();
                    break;
                case 0:
                    System.out.println("Bye !!!");
                    System.exit(0);
                default:
                    System.out.println("Just enter 0-3");
            }
        }
    }
}
