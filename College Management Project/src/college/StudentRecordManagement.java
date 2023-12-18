package college;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordManagement {

	// Creating a LinkedList
	LinkedList<Record> list = new LinkedList<>();

	// Method 1
	// Adding Record
	public void add(Record record)
	{
		if(!find(record.getIdNumber())) {
			list.add(record);
		}
		else{
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	// Method 2
	// Searching Record
	public boolean find(int idNumber)
	{
		for(Record l : list) {
			if(l.getIdNumber() == idNumber) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}
	
	// Method 3
	// Delete Record
	public void delete(int recIdNumber)
	{
		Record recordDel = null;
		
		for(Record ll : list) {
			if(ll.getIdNumber() == recIdNumber) {
				recordDel = ll;
			}
		}
		if(recordDel == null) {
			System.out.println("Invalid record Id");
		}
		else{
			list.remove(recordDel);
			System.out.println(
				"Successfully removed record from the list");
		}
	}
	
	// Method 4
	// Finding Record
	public Record findRecord(int idNumber)
	{
		for(Record l : list) {
			if(l.getIdNumber() == idNumber) {
				return l;
			}
		}
		return null;
	}
	
	// Method 5
	// Update Record
	public void update(int id, Scanner input)
	{

		if(find(id)) {
			Record rec = findRecord(id);
			System.out.print("Enter the new Student id Number ? ");
			int idNumber = input.nextInt();
			System.out.print("Enter the new Student contact Number ");
			int contactNumber = input.nextInt();
			input.nextLine();
			System.out.print("Enter the new Student Name ? ");
			String name = input.nextLine();
			rec.setIdNumber(idNumber);
			rec.setName(name);
			rec.setContactNumber(contactNumber);
			System.out.println("Record Updated Successfully");
		}
		else{
			System.out.println("Record Not Found in the Student list");
		}
	}
	
	// Method 6
	// Display Records
	public void display()
	{
		if(list.isEmpty()) {
			System.out.println("The list has no records");
		}
		for(Record record : list) {
			System.out.println(record.toString());
		}
	}
}
