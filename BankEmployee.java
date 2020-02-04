class BankEmployee
{
	int EmpId;
	String EmpName;
	int EmpSalary;
	public BankEmployee()
	{
		EmpId=10;
		EmpName="";
		EmpSalary=1000;
	}
	public BankEmployee(int ph,String dep,int no)
	{
		EmpId=ph;
		EmpName=dep;
		EmpSalary=no;
	}
	void setBankEmployee(int id,String name,int salary)
	{
		EmpId=id;
		EmpName=name;
		EmpSalary=salary;
	}
	void getBankEmployee()
	{
		System.out.println("id"+EmpId+"name"+EmpName+"salary"+EmpSalary);
	}
		int CalculateSalary()
		{
			return EmpSalary+500;
		}
}