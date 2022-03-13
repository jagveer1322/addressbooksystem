package addressbook;
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Address Book Program");
		AddressBook addressBook = new AddressBook();
		System.out.println("Enter choice::::::::::::::\n" + "1-->add contact\n"+ "2--> edit contact\n"+ "3--> delete contact\n"+ "0--> exit");
		int choice = sc.nextInt();
		 switch (choice) {
         case 1 : {
             addressBook.addContact();
           }
         case 2 :{
             addressBook.editContact();
           }
         case 3 : {
             addressBook.deleteContact();
           }
         default : {
        	 System.out.println("Enter Correct choice.");
         }
      }
	}
}