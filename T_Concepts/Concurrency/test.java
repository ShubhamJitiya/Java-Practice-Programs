package Concurrency;

import java.util.Scanner;

class test{
    static double init_amount=5000,current_balance=6000;
    test()
    {
        System.out.println("Account Holder Name:\nRamesh Jayprakash");
        System.out.println("initial amount in Account:\n"+init_amount);
    }
    test(double current_balance ){
        System.out.println("Account type: Saving");
        System.out.println("Current Balance: "+current_balance);
    }
    static void deposite(){
        double deposite = 2000;
        current_balance=current_balance+deposite;
        System.out.println("balance after deposite Current balance is : "+current_balance);
    }
    static void withdraw(){
        double withdraw = 1500;
        current_balance=current_balance - withdraw;
        System.out.println("balance after withdraw Current balance is : "+current_balance);

    }
    static void get_balance(){
        System.out.println("Enter your amount: ");
        Scanner sc= new Scanner(System.in);
        Double get_balance=sc.nextDouble();
        System.out.println("Get amount is :"+get_balance);
    }


    public static void main (String[] args) {
        test s1=new test();
        test s2=new test(current_balance);
        deposite();
        withdraw();
        get_balance();
    }
}


