package exercise6;

import java.util.Scanner;

public class HourlyInvoice extends Bill{
    private int numberOfHoursRented;

    HourlyInvoice(){
        numberOfHoursRented = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        super.input();
        System.out.print("Enter the number of rental hours: ");
        numberOfHoursRented = in.nextInt();
    }

    public void output(){
        super.output();
        System.out.println("The number of rental hours: " + numberOfHoursRented);
        if(numberOfHoursRented <= 24){
            totalMoney = numberOfHoursRented * unitPrice / 24;
        }
        else if(24 < numberOfHoursRented && numberOfHoursRented <= 30){
            totalMoney = unitPrice;
        }
        else {
            int day = numberOfHoursRented / 24;
            if(day > 7){
                totalMoney = 7 * unitPrice + (day - 7) * unitPrice * 0.8;
            }
            else {
                totalMoney = day * unitPrice;
            }
        }
        System.out.println("Total money you have to pay: " + totalMoney);
    }
}
