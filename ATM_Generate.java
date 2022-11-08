package hello;
import java.util.Scanner;
interface intro{			//Multi_inheritance-	Using Interface 
	default void show() {
		 System.out.println("		Greetings User..!\n	**Welcome to the SBI portal**");
		 System.out.println("*>------------		***		------------<*");
		 System.out.println("*-> Please Insert the Debit/Credit Card \n\n"
		 		+ "*->Please Don't Remove the Card until the System Say So....\n");
		 }
}
class data implements intro     // merging interface into the class 
{		
	private  void option()					//Using Encapsulation
	{
		 int num, balance ,deposite ,withdraw ,acc;
		String name = "Saravanan.S";							//We can alter the User data here 
		String Bank ="State Bank Of India";
		String place = "Chennai";
	    acc=28467920;
		System.out.println("*-->Enter the number to be selected :");
		System.out.println("	1.BALANCE\n	2.DEPOSITE\n	3.WITHDRAWAL\n	4.DETAILS\n	5.EXIT\n");
		System.out.println("*<--------------------------------------->*");
		Scanner sc = new Scanner(System.in);
		num=  sc.nextInt();
		balance =40000;
		
		switch(num)				//Using Switch case 
			{
				case (1):
					System.out.println("==>You have selected Check Balance : \nHolder name : "+name+""
							+ " \n Your account Clear balance : Rs. "+ balance+"-/-");
				 break;
				case(2):
					System.out.println("You have selected Deposite : \nEnter the amount: ");
				deposite= sc.nextInt();
				System.out.println ("Deposited amount = Rs. "+deposite+"-/-\n"
				+ "Holder name : "+name+" \n Your account Clear Balance = Rs. "+ (balance+deposite )+"-/-");
				break;
				case(3):
					System.out.println("You have selected  Withdraw cash : \nEnter the amount: ");
				withdraw= sc.nextInt();
				if (withdraw<=balance) {
				System.out.println ( "Withdraw amount = Rs. "+ withdraw+"-/-"+
				"\nHolder name : "+name+" \n  Your account Clear Balance = Rs. "+ (balance-withdraw)+"-/-");
				}
				else {
					System.out.println("Insufficient amount please enter a valid one");
				}
				break;
				case(4):
					System.out.println("Account Details: \n	Holder Name : "+name+"\n	Account Number : "+acc+
					"\n	Bank Nme : "+Bank+"\n"+ "	Branch : "+place);
				System.out.println("For Further More Details Please Contact Your Branch");
				break;
				case(5):
					System.out.println("<-------	Please Visit Again	-------->");
				break;
				default :
					System.out.println("Incorrect Option ---please enter a valid one");
				}
			int n;
			Scanner in = new Scanner(System.in);
			System.out.println("	--->1-If you Wish to continue  \n	--->2-If you want to close  ");
			System.out.println("<------------	***  	------------>");
			n=in.nextInt();
				if (n==1) {			
				System.out.println();
				option();
				}
				else if (n==2) {
				System.out.println("\n-----	Thank you come again	------ ");
				}
				else {
					System.out.print("Unidentified Suggestion\n-------- Please Visit Again----------");
				}
	}
	protected void m() {								//protected method used for securing data
		int pin ;
		Scanner P = new Scanner(System.in);
		System.out.println("Please Enter the Pin Number here :- ");
		pin =P.nextInt();
			if (pin==1234) {  					//If Else- statement For password control
			option();
		}
		else {
			System.out.println("You Have Entered a incorrect pin\nEnter a valid one ");
			m();
		}
	}
}
public class ATM_Generate extends data {
	public static void main(String[] args) {
	data a = new data();
	a.show();
	a.m();
	}
}