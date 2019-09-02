package exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bill[] a = new Bill[100];
        Scanner in = new Scanner(System.in);
        int choice;
        int sumOfBill = 0;
        int countDate = 0;
        int countHour = 0;
        double sum = 0;

        System.out.print("Enter sum of bill: ");
        sumOfBill = in.nextInt();
        for (int i = 0; i < sumOfBill; i++) {
            System.out.println("1. Hourly invoice");
            System.out.println("2. Invoice by date");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    a[i] = new HourlyInvoice();
                    a[i].input();
                    countHour++;
                    break;
                case 2:
                    a[i] = new InvoiceByDate();
                    a[i].input();
                    countDate++;
                    break;
                case 0:
                    System.out.println("Bye !!!");
                    System.exit(0);
                default:
                    System.out.println("Just enter 0-2");
            }
        }
        System.out.println("Count of hourly invoice: " + countHour);
        System.out.println("Count of invoice by date: " + countDate);
        for (int i = 0; i < sumOfBill; i++){
            a[i].output();
            if (a[i].dateBill.substring(3).equals("09/2013"))
                sum+= a[i].totalMoney;
        }
        System.out.println("Average bill payment room in 9/2013: " + sum);}
}

