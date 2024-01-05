class Employee
{
	String name;
	int employee_id;
	double salary;
	
	Employee(String nm,int id,double sl)
	{
		name = nm;
		employee_id = id;
		salary = sl;
	}
         public String getName() 
	 {
        	return name;
   	 }

    	 public void setName(String nm)
	 {
       		 name = nm;
    	 }

    	public int getId() 
	{
        	return employee_id;
    	}

   	public void setId(int id)
	{
        	employee_id = id;
   	}

    	public double getSalary() 
	{
       	 	return salary;
    	}

    	public void setSalary(double sl) 
	{
        	salary = sl;
  	}

       public void raiseSalary() 
	{
           double increasedSalary = salary * 0.1;
           salary = salary + increasedSalary;
       	   setSalary(salary);
        
    	}
	

    public static void main(String[] args) 
    {
        // Create an employee object
        Employee employee1 = new Employee("John Doe", 101, 50000.0);

        // Display initial information
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("ID: " + employee1.getId());
        System.out.println("Salary: $" + employee1.getSalary());

        // Raise salary by 10%
        employee1.raiseSalary();

        // Display updated information
        System.out.println("\nAfter Salary Raise:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("ID: " + employee1.getId());
        System.out.println("Updated Salary: $" + employee1.getSalary());
	
    }
}
    

	