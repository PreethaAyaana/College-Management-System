package college;

public class Record {
	private String name;
	private int idNumber;
	private long contactNumber;

	// Default Constructor
	public Record() {}

	// Parameterized Constructor
		public Record(String name, int idNumber,
				long contactNumber)
	{
		this.name = name;
		this.idNumber = idNumber;
		this.contactNumber = contactNumber;
	}

	public long getContactNumber() {
		return contactNumber; 
	}
	public void setContactNumber(int contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	public int getIdNumber() {
		return idNumber; 
	}
	public void setIdNumber(int idNumber){
		this.idNumber = idNumber;
	}
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	@Override 
	public String toString()
	{
		// Returning the record
		return "Records{"
			+ "name=" + name + ", idNumber=" + idNumber
			+ ", contactNumber=" + contactNumber + '}';
	}
}
