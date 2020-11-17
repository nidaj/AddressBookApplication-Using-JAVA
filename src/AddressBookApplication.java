import java.util.Scanner;
class AddressBookApplication{
	static String OutputText = String.format("%-15s%-15s%-15s%-30s%-15s%-15s%-10s", "Fname","Lname","MobileNo","EmailId","State","Country","ZipCode");
	public static void main(String[] args) {
		
		char ans = 'y';
		Scanner sc = new Scanner(System.in);
		AddressBook obj = new AddressBook();
		obj.addPerson();
		System.out.println("\n1. Print all Data");
		System.out.println("2. Sort By First name");
		System.out.println("3. Sort By Last name");
		System.out.println("4. Sort By ZipCode");
		System.out.println("5. Update Details");
		System.out.println("6. Remove Person Details");
		do {
			System.out.println("\nEnter your Choice");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println(OutputText);
					obj.printAll();
					break;				
				case 2:
					System.out.println("\nSorted by Fname");
					System.out.println(OutputText);
					obj.sortByFname();
					break;
				case 3:
					System.out.println("\nSorted by Lname");
					System.out.println(OutputText);
					obj.sortByLname();
					break;
				case 4:
					System.out.println("\nSorted by Zip");
					System.out.println(OutputText);
					obj.sortByZipCode();
					break;
				case 5:
					System.out.println("\nTo Update Details");
					obj.update();
					System.out.println("Table Status After Update operation");
					System.out.println(OutputText);
					obj.printAll();
					break;
				case 6:
					System.out.println("\nTo Remove Person Details");
					obj.removePerson();
					System.out.println("Table Status After Remove operation");
					System.out.println(OutputText);
					obj.printAll();
					break;
				default:
					System.out.println("\nEnter Proper choice:");
			}
			System.out.println("\n1. Print all data");
			System.out.println("2. Sort By First name");
			System.out.println("3. Sort By Last name");
			System.out.println("4. Sort By ZipCode");
			System.out.println("5. Update Details");
			System.out.println("6. Remove Person Details");
			System.out.println("Do you want to continue (Y/N)");	
		    ans = sc.next().charAt(0);
		}while(ans == 'y' || ans == 'Y');
	sc.close();
	System.out.println("Thank You for Using the Application");
	}
	
}



