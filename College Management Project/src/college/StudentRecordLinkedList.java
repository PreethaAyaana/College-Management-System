package college;

import java.util.Scanner;

public class StudentRecordLinkedList {
	public static void main(String[] args) {
		StudentRecordManagement hr = new StudentRecordManagement();
		Record record = new Record();
		record.setIdNumber(101);
		record.setContactNumber(225598);
		record.setName("Preetha");
		hr.add(record);
		Scanner input = new Scanner(System.in);
		int option = 0;
		do {
			menu();
			option = input.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter Student id Number ? ");
				int idNumber = input.nextInt();
				System.out.print("Enter Student Name ? ");
				String name = input.nextLine();
				System.out.print("Enter Student contact Number ? ");
				long contactNumber = input.nextLong();
				input.nextLine();
				record = new Record(name, idNumber, contactNumber);
				hr.add(record);
				System.out.println(record.toString());
				break;
			case 2:
				System.out.print("What is the Student id number ? ");
				int rId = input.nextInt();
				hr.delete(rId);
				break;
			case 3:
				System.out.print("What is the Student id number? ");
				int rIdNo = input.nextInt();
				hr.update(rIdNo, input);
				break;
			case 4:
				System.out.print("What is the Student id ? ");
				int bookId = input.nextInt();
				if (!hr.find(bookId)) {
					System.out.println("Student id does not exist\n");
				}
				break;
			case 5:
				hr.display();
				break;
			case 9:
				System.out.println("\nThank you and have a nice day :)\n");
				System.exit(0);
				break;
			default:
				System.out.println("\nInvalid input\n");
				break;
			}
		} while (option != 9);
	}

	public static void menu() {

		// Printing statements displaying menu on console
		System.out.println("MENU");
		System.out.println("1: Add Student");
		System.out.println("2: Delete Student");
		System.out.println("3: Update Student");
		System.out.println("4: Search Student");
		System.out.println("5: Display Students");
		System.out.println("9: Exit program");
		System.out.print("Enter your selection : ");
	}
}
