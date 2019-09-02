package exercise6;

import java.util.Scanner;

public class InvoiceByDate extends Bill {
    private int numberOfDaysRented;

    InvoiceByDate(){
        numberOfDaysRented = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        super.input();
        System.out.print("Enter the number of rental days: ");
        numberOfDaysRented = in.nextInt();
    }

    public void output(){
        super.output();
        System.out.println("The number of rental days: " + numberOfDaysRented);
        if(numberOfDaysRented > 7){
            totalMoney = 7 * unitPrice + (numberOfDaysRented - 7) * unitPrice * 0.8;
        }
        else {
            totalMoney = numberOfDaysRented * unitPrice;
        }
        System.out.println("Total money you have to pay: " + totalMoney);
    }
}
