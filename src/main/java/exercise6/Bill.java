package exercise6;

import java.util.Scanner;

public class Bill {
    protected String codeBill;
    protected String dateBill;
    protected String customerName;
    protected String roomCode;
    protected long unitPrice;
    protected double totalMoney;

    Bill(){
        codeBill = null;
        dateBill = null;
        customerName = null;
        roomCode = null;
        unitPrice = 0;
        totalMoney = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter code bill: ");
        codeBill = in.nextLine();
        System.out.print("Enter date bill(date/month/year): ");
        dateBill = in.nextLine();
        System.out.print("Enter customer name: ");
        customerName = in.nextLine();
        System.out.print("Enter room code: ");
        roomCode = in.nextLine();
        System.out.print("Enter unit price: ");
        unitPrice = in.nextLong();
    }

    public void output(){
        System.out.println("Code bill: " + codeBill);
        System.out.println("Date bill: " + dateBill);
        System.out.println("Customer name: " + customerName);
        System.out.println("Room code: " + roomCode);
    }
}
