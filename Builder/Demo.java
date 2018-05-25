import EmployeeDTO.EmployeeDTOBuilder;

public class Demo
{
	public static void main(String[] args)
	{

		Employee employee = createEmployee();
		EmployeeDTO myDto = build(EmployeeDTO.getBuilder(), employee);
		System.out.println(myDto);
	}

	//chain
	public static EmployeeDTO build(EmployeeDTOBuilder builder, Employee employee)
	{
		return builder.firstName(employee.getFirstName()).lastName(employee.getlastName())
				.address(employee.getAddress()).age(employee.getAge()).SSN(employee.getSSN()).build();
	}

	public static Employee createEmployee()
	{
		Employee employee = new Employee();
		Address address = new Address();
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setAge(25);
		employee.setSSN(1234);
		address.setUnitNumber(123);
		address.setStreet(" My street");
		address.setCity(" My City");
		address.setState(" My State");
		address.setZipcode(" My ZipCode");
		employee.setAddress(address);
		return employee;
	}
}
