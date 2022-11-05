/**
 * Author - a random guy.exe
 * Team - Dillusioners
 * Word - Cake
 */
import java.util.Scanner;
class Cake{
    public static void main(String args[]){
        //Declaring variables,objects and taking input
        Scanner sc=new Scanner(System.in);
        System.out.print("Welcome to fool's bakery...\nPlease choose a cake of your wish\n1.CreamNLemon-120\n2.Choclate(Regular)-100\n3.Choclate(dark-310)\n4.VanillaNBerries-420");
        int x=sc.nextInt();
        double cost=0.0;
        //using switch case for billing of each seperate cake
        switch(x){
            case 1:
                cost=120;
                System.out.print("Would you like seasoning?");
                String s=sc.nextLine();
                //Extras
                if("yes".equalsIgnoreCase(s))
                    cost=cost+50;
                System.out.print("Any numba 9 with extra dip?");
                s=sc.nextLine();
                if("yes".equalsIgnoreCase(s))
                    cost=cost+70;
            case 2:
                cost=100;
                System.out.print("Would you like seasoning?");
                String s2=sc.nextLine();
                //Extras
                if("yes".equalsIgnoreCase(s2))
                    cost=cost+50;
                System.out.print("Any numba 9 with extra dip?");
                s=sc.nextLine();
                if("yes".equalsIgnoreCase(s2))
                    cost=cost+70;
            case 3:
                cost=310;
                System.out.print("Would you like seasoning?");
                String s3=sc.nextLine();
                //Extras
                if("yes".equalsIgnoreCase(s3))
                    cost=cost+50;
                System.out.print("Any numba 9 with extra dip?");
                s=sc.nextLine();
                if("yes".equalsIgnoreCase(s3))
                    cost=cost+70;
            case 4:
                cost=120;
                System.out.print("Would you like seasoning?");
                String s4=sc.nextLine();
                //Extras
                if("yes".equalsIgnoreCase(s4))
                    cost=cost+50;
                System.out.print("Any numba 9 with extra dip?");
                s=sc.nextLine();
                if("yes".equalsIgnoreCase(s4))
                    cost=cost+70;
            default:
                System.out.println("Sorry sir but we ran outta cakes...");
        }
        System.out.println("Checkout: ");
        System.out.println("Payable amount is rupees "+cost+20.0);//+20 for gst
        sc.close();
    }
}