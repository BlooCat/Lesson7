package exercise10;

import java.util.Scanner;

public class Student extends HumanInformation {
    Scanner in = new Scanner(System.in);
    private float subjectScore1;
    private float subjectScore2;
    private float totalScore;

    Student(){
        subjectScore1 = 0f;
        subjectScore2 = 0f;
    }

    @Override
    public void input(){
        super.input();
        System.out.print("Enter subject score 1: ");
        subjectScore1 = in.nextInt();
        System.out.print("Enter subject score 2: ");
        subjectScore2 = in.nextInt();
    }

    public void totalScore(float subjectScore1, float subjectScore2){
        totalScore = subjectScore1 + subjectScore2;
    }

    private void setSubjectScore1(float subjectScore1){
        this.subjectScore1 = subjectScore1;
    }

    private void setSubjectScore2(float subjectScore2){
        this.subjectScore2 = subjectScore2;
    }

    @Override
    public void display(){
        int choice;
        float subjectScore1;
        float subjectScore2;

        System.out.println("0. Change subject score 1");
        System.out.println("1. Change subject score 2");
        System.out.print("Enter your choice: ");
        choice = in.nextInt();
        switch (choice){
            case 0:
                System.out.print("Change subject score 1 to: ");
                subjectScore1 = in.nextFloat();
                setSubjectScore1(subjectScore1);
                break;
            case 1:
                System.out.print("Change subject score 2 to: ");
                subjectScore2 = in.nextFloat();
                setSubjectScore2(subjectScore2);
                break;
            default:
                System.out.println("Just enter 0-1");
        }
        totalScore(this.subjectScore1, this.subjectScore2);
        super.display();
        System.out.println("Subject score 1: " + this.subjectScore1);
        System.out.println("Subject score 2: " + this.subjectScore2);
        System.out.println("Total score: " + totalScore);
    }
}
