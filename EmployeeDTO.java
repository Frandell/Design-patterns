public class EmployeeDTO 
{
	private String name;
	private String address;
	private int age;
	private int SSN;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getSSN()
	{
		return SSN;
	}
	public void setSSN(int SSN)
	{
		this.SSN = SSN;
	}
	//Instances not truly needed
	public static EmployeeDTOBuilder getBuilder()
	{
		return new EmployeeDTOBuilder();
	}

	public static class EmployeeDTOBuilder
	{
		private String firstName;
		private String lastName;
		private int age;
		private int SSN;
		private String address;
		private EmployeeDTO employeeDTO;

		public EmployeeDTOBuilder firstName(String firstname)
		{
			this.firstName = firstname;
			return this;
		}
		public EmployeeDTOBuilder lastName(String lastName)
		{
			this.lastName = lastName;
			return this;
		}
		public EmployeeDTOBuilder age(int age)
		{
			this.age = age;
			return this;
		}
		public EmployeeDTOBuilder SSN(int SSN)
		{
			this.SSN = SSN;
			return this;
		}
		public EmployeeDTOBuilder address(Address address)
		{
			this.address = address.getUnitNumber() + " " + address.getStreet() + address.getZipcode()+ " " + address.getCity()
						+ " " + address.getState();
			return this;
		}
		public EmployeeDTO build()
		{
			this.employeeDTO = new EmployeeDTO();
			employeeDTO.setName(firstName + " " + lastName);
			employeeDTO.setAddress(address);
			employeeDTO.setAge(age);
			employeeDTO.setSSN(SSN);
			return employeeDTO;
		}
		public EmployeeDTO getEmployeeDTO()
		{
			return this.employeeDTO;
		}
	}
	//overRide
	public String toString()
	{
		return "name = " + name + "\nage = " + age + "\nSSN = " + SSN + "\naddress = " + address;
	}
}
