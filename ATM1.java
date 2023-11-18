import java.util.Scanner;

public static void main(String args[])
{
    int balance=500000,withdraw,deposit;
    Scanner obj=new Scanner(System.in);

    while(true)
    {
        System.out.println("ATM Machine Menues");
        System.out.println("Choose 1 for wthdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for check Balance");
        System.out.println("Choose 4 for EXIT");

        System.out.println("Choose the opration you want to perform:");
        int choice=obj.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter Amount to be withdrow");
            withdrow=obj.nextInt();
            if(balance>=withdraw){
                balance=balance-withdraw;
                System.out.println("Pleace collect your money");

        
            }
            else{
                System.out.println("Insufficient balance");
        
            }
            break;

            case 2:
            System.out.println("Enter amount to be deposited");
            deposit=obj.nextInt();
            balance=balance+deposit;
            System.out.println("Your money has been deposited successfully");
            break;

            case 3:
            System.out.println("Balance :+balance");
            break;

            case 4:
            system.exit(0);
        
        
        }
    }
}