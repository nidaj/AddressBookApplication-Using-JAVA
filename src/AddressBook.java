import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class AddressBook {
	//List Interface....
	List<Person> people = new ArrayList<Person>();
	public void addPerson() {
		people.add(new Person("steven","king","515123456","steven.king@gmail.com","california","USA",90201));
		people.add(new Person("Neena","kochhar","8675654387","neena.kochhar@gmail.com","kerala","india",682001));
		people.add(new Person("Nida","Jawre","9768334455","nida.jawre@gmail.com","maharashtra","india",421301));
		people.add(new Person("Taukir","kazi","965987579","taukir.kazi@gmail.com","Ahmadi","kuwait",36361));
		people.add(new Person("Mayesha","Dolare","48767656","mayesha.dolare@yahoo.com","Abudabi","UAE",307501));
//		long mobile;
//		String fname;
//		String lname;
//		String emailId;
//		String state;
//		String country;
//		int zipCode;
//		char ans = 'y';
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("Enter First Name: ");
//			fname = sc.next();
//			System.out.println("Enter Last Name: ");
//			lname = sc.next();
//			System.out.println("Enter Mobile Number: ");
//			mobile = sc.next();
//			System.out.println("Enter emailId: ");
//			emailId = sc.next();
//			System.out.println("Enter state: ");
//			state = sc.next();
//			System.out.println("Enter country : ");
//			country = sc.next();
//			System.out.println("Enter ZipCode: ");
//			zipCode = sc.nextInt();
//			people.add(new Person(fname,lname,mobile,emailId,state,country,zipCode));
//			System.out.println("Do You want to continue");
//			ans = sc.next().charAt(0);
//		}while(ans=='y'||ans=='Y');
	}
	public void printAll() {
		for(Person person:people) {
			System.out.println(person);
		}
	}
	public void sortByFname() {
		Collections.sort(people,new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFname().compareToIgnoreCase(p2.getFname());
			}
				
			});
			for(Person person:people) {
				System.out.println(person);
			}
	}
	
	public void sortByLname() {
		Collections.sort(people,new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLname().compareToIgnoreCase(p2.getLname());
			}
				
			});
			for(Person person:people) {
				System.out.println(person);
			}
	}
	
	public void sortByZipCode() {
		
		Collections.sort(people,new Comparator<Person>() {
		
		@Override
		public int compare(Person p1, Person p2) {
			if(p1.getZipCode() > p2.getZipCode())
				return 1;
			else if (p1.getZipCode() < p2.getZipCode())
				return -1;
			return 0;			
		}
			
		});

		for(Person person:people) {
			System.out.println(person);
		}
	}
	
	public void removePerson() {
		Scanner sc = new Scanner(System.in);
		int flag=1,f=1;
		System.out.println("Enter the Person Name you want to remove:");
		String name = sc.next();
		for (int i = 0; i < people.size(); i++) {
			flag= people.get(i).getFname().compareToIgnoreCase(name);
	        if (flag == 0) {
	        	System.out.println("do you want to delete " +name+ " with Mobile No.: " +people.get(i).getMobileNo());
				System.out.println("Press Y to continue delete");
				char ans = sc.next().charAt(0);
				if(ans=='y'||ans=='Y') {
					people.remove(i);
					f=2;
				}
				else {
					System.out.println("Delete Operation cancelled.... ");
				}
			}
	    }
		if(f == 1) {
			System.out.println("Name Not found!!!!");
		}
//		sc.close();
	}
	
	public void update() {
		Scanner sc = new Scanner(System.in);
		String fname,lname;
		char ans = 'Y';
		System.out.println("Enter the Person First Name you want to update:");
		fname = sc.next();
		System.out.println("Enter the Person Last Name you want to update:");
		lname = sc.next();
		for (int i = 0; i < people.size(); i++) {
			int flag1 = (people.get(i).getFname().compareToIgnoreCase(fname));
			int flag2 = (people.get(i).getLname().compareToIgnoreCase(lname));
			if (flag1 == 0 && flag2 == 0 ) {
				System.out.println("\n1. New Mobile Number");
				System.out.println("2. New State Number");
				System.out.println("3. New Country Number");
				System.out.println("4. New ZipCode Number");
				do{
					System.out.println("Enter your choice for update");
					int ch = sc.nextInt();
					switch(ch) {
					case 1:
						System.out.println("Enter new Mobile Number:");
						String mobileno = sc.next();
						people.get(i).setMobileNo(mobileno);
						break;
					case 2:
						System.out.println("Enter new State:");
						String state = sc.next();
						people.get(i).setState(state);
						break;
					case 3:
						System.out.println("Enter New Country:");
						String country = sc.next();
						people.get(i).setCountry(country);
						break;
					case 4:
						System.out.println("Enter new ZipCode");
						int zip = sc.nextInt();
						people.get(i).setZipCode(zip);						
						break;
					default:
						System.out.println("Enter proper choice");
						
					}
				System.out.println("\n1. New Mobile Number");
				System.out.println("2. New State Number");
				System.out.println("3. New Country Number");
				System.out.println("4. New ZipCode Number");
				System.out.println("Do you want to continue (Y/N)");
				ans = sc.next().charAt(0);					
				}while(ans=='y'||ans=='Y');
//				sc.close();
			}
		}
	}
	
}

