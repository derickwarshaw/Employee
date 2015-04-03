/**
 * @(#)EmployeeTest.java
 *
 *
 * @Derick Warshaw // Lab 8 // COSC1337
 * @version 1.00 2014/3/25
 */

/**This class creates a program that will test all public methods, accessors,and
 *mutators that reside in the Employee Class. It also tests data validation
 *for employee ID number. */
public class EmployeeTest
{

    public static void main(String[] args)
    {
    // variable definitions

    // variables used in test on set methods
	String employee1Name;
	String employee2Name;
	String employee3Name;
	String employee1Department;
	String employee2Department;
	String employee3Department;
	String employee1Position;
	String employee2Position;
	String employee3Position;
	String employee1IdNum;
	String employee2IdNum;
	String employee3IdNum;

	// variables used in test on constructor receiving all data
	String employeeConstructor1Name;
	String employeeConstructor1Department;
	String employeeConstructor1Position;
	String employeeConstructor1IdNum;
	String employeeConstructor2Name;
	String employeeConstructor2Department;
	String employeeConstructor2Position;
	String employeeConstructor2IdNum;
	String employeeConstructor3Name;
	String employeeConstructor3Department;
	String employeeConstructor3Position;
	String employeeConstructor3IdNum;

	// variables used in test on constructor receiving only name and id number
	String employeeConstructor4Name;
	String employeeConstructor4Department;
	String employeeConstructor4Position;
	String employeeConstructor4IdNum;
	String employeeConstructor5Name;
	String employeeConstructor5Department;
	String employeeConstructor5Position;
	String employeeConstructor5IdNum;
	String employeeConstructor6Name;
	String employeeConstructor6Department;
	String employeeConstructor6Position;
	String employeeConstructor6IdNum;

	// variables used in test on no-arg constructor
	String employeeConstructor7Name;
	String employeeConstructor7Department;
	String employeeConstructor7Position;
	String employeeConstructor7IdNum;
	String employeeConstructor8Name;
	String employeeConstructor8Department;
	String employeeConstructor8Position;
	String employeeConstructor8IdNum;
	String employeeConstructor9Name;
	String employeeConstructor9Department;
	String employeeConstructor9Position;
	String employeeConstructor9IdNum;

	// variables used in test on bad data

	// variables used in test on constructor receiving all data
	String employeeConstructor10Name;
	String employeeConstructor10Department;
	String employeeConstructor10Position;
	String employeeConstructor10IdNum;
	String employeeConstructor11Name;
	String employeeConstructor11Department;
	String employeeConstructor11Position;
	String employeeConstructor11IdNum;
	String employeeConstructor12Name;
	String employeeConstructor12Department;
	String employeeConstructor12Position;
	String employeeConstructor12IdNum;

	// variables used in test on constructor receiving only name and id number
	String employeeConstructor13Name;
	String employeeConstructor13Department;
	String employeeConstructor13Position;
	String employeeConstructor13IdNum;
	String employeeConstructor14Name;
	String employeeConstructor14Department;
	String employeeConstructor14Position;
	String employeeConstructor14IdNum;
	String employeeConstructor15Name;
	String employeeConstructor15Department;
	String employeeConstructor15Position;
	String employeeConstructor15IdNum;


	/////////////////////////-------------------//////////////////
	/////////////////////////-------------------//////////////////
	/////////////////////////-GOOD DATA TESTING-//////////////////
	/////////////////////////-------------------//////////////////
	/////////////////////////-------------------//////////////////


	System.out.println("");
	System.out.println("TESTING FOR GOOD DATA");
	System.out.println("");
	System.out.println("");

	// create 3 employee objects to use with test on set methods
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();

    // passing employee information name, id number, department, and position
    employee1.setName("Susan Meyers");
    employee1.setIdNum("47899");
    employee1.setDepartment("Accounting");
	employee1.setPosition("Vice President");

    employee2.setName("Mark Jones");
	employee2.setIdNum("39119");
	employee2.setDepartment("IT");
	employee2.setPosition("Programmer");

    employee3.setName("Joy Rogers");
	employee3.setIdNum("81774");
	employee3.setDepartment("Manufacturing");
	employee3.setPosition("Engineer");

	// having object's methods return data previously entered to variable
    employee1Name = employee1.getName();
    employee1IdNum = employee1.getIdNum();
	employee1Department = employee1.getDepartment();
	employee1Position = employee1.getPosition();

    employee2Name = employee2.getName();
	employee2IdNum = employee2.getIdNum();
	employee2Department = employee2.getDepartment();
	employee2Position = employee2.getPosition();

    employee3Name = employee3.getName();
	employee3IdNum = employee3.getIdNum();
	employee3Department = employee3.getDepartment();
	employee3Position = employee3.getPosition();


    // creating 3 employee objects using constructor that receives all data
   	Employee employeeConstructor1 = new Employee("Susan Meyers", "47899",
   		                                        "Accounting", "Vice President");

    Employee employeeConstructor2 = new Employee("Mark Jones", "39119",
   		                                        "IT", "Programmer");

    Employee employeeConstructor3 = new Employee("Joy Rogers", "81774",
   		                                        "Manufacturing", "Engineer");

   	// all data constructor variable initialization
	employeeConstructor1Name = employeeConstructor1.getName();
	employeeConstructor1IdNum = employeeConstructor1.getIdNum();
	employeeConstructor1Department = employeeConstructor1.getDepartment();
	employeeConstructor1Position = employeeConstructor1.getPosition();

	employeeConstructor2Name = employeeConstructor2.getName();
	employeeConstructor2IdNum = employeeConstructor2.getIdNum();
	employeeConstructor2Department = employeeConstructor2.getDepartment();
	employeeConstructor2Position = employeeConstructor2.getPosition();

	employeeConstructor3Name = employeeConstructor3.getName();
	employeeConstructor3IdNum = employeeConstructor3.getIdNum();
	employeeConstructor3Department = employeeConstructor3.getDepartment();
	employeeConstructor3Position = employeeConstructor3.getPosition();



   	// creating 3 employee objects using constructor that receives only name/id
   	Employee employeeConstructor4 = new Employee("Susan Meyers", "47899");
    Employee employeeConstructor5 = new Employee("Mark Jones", "39119");
    Employee employeeConstructor6 = new Employee("Joy Rogers", "81774");


    // name and id constructor variable initialization
	employeeConstructor4Name = employeeConstructor4.getName();
	employeeConstructor4IdNum = employeeConstructor4.getIdNum();
	employeeConstructor4Department = employeeConstructor4.getDepartment();
	employeeConstructor4Position = employeeConstructor4.getPosition();

	employeeConstructor5Name = employeeConstructor5.getName();
	employeeConstructor5IdNum = employeeConstructor5.getIdNum();
	employeeConstructor5Department = employeeConstructor5.getDepartment();
	employeeConstructor5Position = employeeConstructor5.getPosition();

	employeeConstructor6Name = employeeConstructor6.getName();
	employeeConstructor6IdNum = employeeConstructor6.getIdNum();
	employeeConstructor6Department = employeeConstructor6.getDepartment();
	employeeConstructor6Position = employeeConstructor6.getPosition();



    // creating 3 employee objects using no-arg constructor
   	Employee employeeConstructor7 = new Employee();
    Employee employeeConstructor8 = new Employee();
    Employee employeeConstructor9 = new Employee();


	// no-arg constructor variable initialization
	employeeConstructor7Name = employeeConstructor7.getName();
	employeeConstructor7IdNum = employeeConstructor7.getIdNum();
	employeeConstructor7Department = employeeConstructor7.getDepartment();
	employeeConstructor7Position = employeeConstructor7.getPosition();

	employeeConstructor8Name = employeeConstructor8.getName();
	employeeConstructor8IdNum = employeeConstructor8.getIdNum();
	employeeConstructor8Department = employeeConstructor8.getDepartment();
	employeeConstructor8Position = employeeConstructor8.getPosition();

	employeeConstructor9Name = employeeConstructor9.getName();
	employeeConstructor9IdNum = employeeConstructor9.getIdNum();
	employeeConstructor9Department = employeeConstructor9.getDepartment();
	employeeConstructor9Position = employeeConstructor9.getPosition();


	// display employee information sent using set methods
	System.out.println("Testing individual values sent using set methods");
	System.out.println("");
	System.out.println("Name\t\t\t" + "ID Number\t\t" + "Department\t\t" +
		               "Position");
	System.out.println("");
	System.out.println("-----------------------------------------------------" +
		               "-------------");
    System.out.println(employee1Name + "\t\t" +
    	               employee1IdNum + "\t\t" +
    	               employee1Department + "\t\t" +
    	               employee1Position);
    System.out.println(employee2Name + "\t\t\t" +
    	               employee2IdNum + "\t\t" +
    	               employee2Department + "\t\t\t\t" +
    	               employee2Position);
    System.out.println(employee3Name + "\t\t\t" +
    	               employee3IdNum + "\t\t" +
    	               employee3Department + "\t" +
    	               employee3Position);



	// display data sent using constructor that received all data
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println("");
System.out.println("Testing constructor receiving name, ID, Department, " +
		               "and Position");
	System.out.println("");
	System.out.println("Name\t\t\t" + "ID Number\t\t" + "Department\t\t" +
		               "Position");
	System.out.println("");
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println(employeeConstructor1Name + "\t\t" +
		               employeeConstructor1IdNum + "\t\t" +
    	               employeeConstructor1Department + "\t\t" +
    	               employeeConstructor1Position);
   	System.out.println(employeeConstructor2Name + "\t\t\t" +
   		               employeeConstructor2IdNum + "\t\t" +
    	               employeeConstructor2Department + "\t\t\t\t" +
    	               employeeConstructor2Position);
   	System.out.println(employeeConstructor3Name + "\t\t\t" +
   		               employeeConstructor3IdNum + "\t\t" +
    	               employeeConstructor3Department + "\t" +
    	               employeeConstructor3Position);



	// display data sent using constructor that receives only name and id number
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println("");
	System.out.println("Testing constructor receiving only name and ID number");
	System.out.println("");
	System.out.println("Name\t\t\t" + "ID Number\t\t" + "Department\t\t" +
		               "Position");
	System.out.println("");
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println(employeeConstructor4Name + "\t\t" +
		               employeeConstructor4IdNum + "\t\t" +
    	               employeeConstructor4Department + "\t\t" +
    	               employeeConstructor4Position);
   	System.out.println(employeeConstructor5Name + "\t\t\t" +
   		               employeeConstructor5IdNum + "\t\t" +
    	               employeeConstructor5Department + "\t\t\t\t" +
    	               employeeConstructor5Position);
   	System.out.println(employeeConstructor6Name + "\t\t\t" +
   		               employeeConstructor6IdNum + "\t\t" +
    	               employeeConstructor6Department + "\t" +
    	               employeeConstructor6Position);
    System.out.println("-----------------------------------------------------" +
		               "-------------");



	// displaying data sent using no-arg constructor
	System.out.println("");
	System.out.println("Testing no-arg constructor");
	System.out.println("");
	System.out.println("Name\t\t\t" + "ID Number\t\t" + "Department\t\t" +
		               "Position");
	System.out.println("");
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println(employeeConstructor7Name + "\t\t\t\t\t" +
		               employeeConstructor7IdNum + "\t\t" +
    	               employeeConstructor7Department + "\t\t" +
    	               employeeConstructor7Position);
   	System.out.println(employeeConstructor8Name + "\t\t\t\t\t" +
   		               employeeConstructor8IdNum + "\t\t" +
    	               employeeConstructor8Department + "\t\t\t\t" +
    	               employeeConstructor8Position);
   	System.out.println(employeeConstructor9Name + "\t\t\t\t\t" +
   		               employeeConstructor9IdNum + "\t\t" +
    	               employeeConstructor9Department + "\t" +
    	               employeeConstructor9Position);
    System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println("");


	/////////////////////////------------------//////////////////
	/////////////////////////------------------//////////////////
	///////////////////////// BAD DATA TESTING //////////////////
	/////////////////////////------------------//////////////////
	/////////////////////////------------------//////////////////


	System.out.println("");
	System.out.println("TESTING FOR BAD DATA");
	System.out.println("");
	System.out.println("");
	System.out.println("LIST OF BAD DATA ENTERED");
	System.out.println("");

	// passing employee information name, id number, department, and position
    employee1.setName("Susan Meyers");
    employee1.setIdNum("-47899");
    employee1.setDepartment("Accounting");
	employee1.setPosition("Vice President");

    employee2.setName("Mark Jones");
	employee2.setIdNum("-39119");
	employee2.setDepartment("IT");
	employee2.setPosition("Programmer");

    employee3.setName("Joy Rogers");
	employee3.setIdNum("-81774");
	employee3.setDepartment("Manufacturing");
	employee3.setPosition("Engineer");

	// having object's methods return data previously entered to variable
    employee1Name = employee1.getName();
    employee1IdNum = employee1.getIdNum();
	employee1Department = employee1.getDepartment();
	employee1Position = employee1.getPosition();

    employee2Name = employee2.getName();
	employee2IdNum = employee2.getIdNum();
	employee2Department = employee2.getDepartment();
	employee2Position = employee2.getPosition();

    employee3Name = employee3.getName();
	employee3IdNum = employee3.getIdNum();
	employee3Department = employee3.getDepartment();
	employee3Position = employee3.getPosition();



    // creating 3 employee objects using constructor that receives all data
   	Employee employeeConstructor10 = new Employee("Susan Meyers", "-47899",
   		                                        "Accounting", "Vice President");

    Employee employeeConstructor11 = new Employee("Mark Jones", "-39119",
   		                                        "IT", "Programmer");

    Employee employeeConstructor12 = new Employee("Joy Rogers", "-81774",
   		                                        "Manufacturing", "Engineer");

   	// all data constructor variable initialization
	employeeConstructor10Name = employeeConstructor10.getName();
	employeeConstructor10IdNum = employeeConstructor10.getIdNum();
	employeeConstructor10Department = employeeConstructor10.getDepartment();
	employeeConstructor10Position = employeeConstructor10.getPosition();

	employeeConstructor11Name = employeeConstructor11.getName();
	employeeConstructor11IdNum = employeeConstructor11.getIdNum();
	employeeConstructor11Department = employeeConstructor11.getDepartment();
	employeeConstructor11Position = employeeConstructor11.getPosition();

	employeeConstructor12Name = employeeConstructor12.getName();
	employeeConstructor12IdNum = employeeConstructor12.getIdNum();
	employeeConstructor12Department = employeeConstructor12.getDepartment();
	employeeConstructor12Position = employeeConstructor12.getPosition();


   	// creating 3 employee objects using constructor that receives only name/id
   	Employee employeeConstructor13 = new Employee("Susan Meyers", "-47899");
    Employee employeeConstructor14 = new Employee("Mark Jones", "-39119");
    Employee employeeConstructor15 = new Employee("Joy Rogers", "-81774");


    // name and id constructor variable initialization
	employeeConstructor13Name = employeeConstructor13.getName();
	employeeConstructor13IdNum = employeeConstructor13.getIdNum();
	employeeConstructor13Department = employeeConstructor13.getDepartment();
	employeeConstructor13Position = employeeConstructor13.getPosition();

	employeeConstructor14Name = employeeConstructor14.getName();
	employeeConstructor14IdNum = employeeConstructor14.getIdNum();
	employeeConstructor14Department = employeeConstructor14.getDepartment();
	employeeConstructor14Position = employeeConstructor14.getPosition();

	employeeConstructor15Name = employeeConstructor15.getName();
	employeeConstructor15IdNum = employeeConstructor15.getIdNum();
	employeeConstructor15Department = employeeConstructor15.getDepartment();
	employeeConstructor15Position = employeeConstructor15.getPosition();


	// display employee information sent using set() methods
	System.out.println("");
	System.out.println("Testing individual values sent using set methods");
	System.out.println("");
	System.out.println("Name\t\t\t" + "ID Number\t\t" + "Department\t\t" +
		               "Position");
	System.out.println("");
	System.out.println("-----------------------------------------------------" +
		               "-------------");
    System.out.println(employee1Name + "\t\t" +
    	               employee1IdNum + "\t\t" +
    	               employee1Department + "\t\t" +
    	               employee1Position);
    System.out.println(employee2Name + "\t\t\t" +
    	               employee2IdNum + "\t\t" +
    	               employee2Department + "\t\t\t\t" +
    	               employee2Position);
    System.out.println(employee3Name + "\t\t\t" +
    	               employee3IdNum + "\t\t" +
    	               employee3Department + "\t" +
    	               employee3Position);


	// display data sent using constructor that received name, id, dept, and
	// position
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println("");
	System.out.println("Testing constructor receiving name, ID, Department, " +
		               "and Position");
	System.out.println("");
	System.out.println("Name\t\t\t" + "ID Number\t\t" + "Department\t\t" +
		               "Position");
	System.out.println("");
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println(employeeConstructor10Name + "\t\t" +
		               employeeConstructor10IdNum + "\t\t" +
    	               employeeConstructor10Department + "\t\t" +
    	               employeeConstructor10Position);
   	System.out.println(employeeConstructor11Name + "\t\t\t" +
   		               employeeConstructor11IdNum + "\t\t" +
    	               employeeConstructor11Department + "\t\t\t\t" +
    	               employeeConstructor11Position);
   	System.out.println(employeeConstructor12Name + "\t\t\t" +
   		               employeeConstructor12IdNum + "\t\t" +
    	               employeeConstructor12Department + "\t" +
    	               employeeConstructor12Position);


	// display data sent using constructor that receives only name and id number
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println("");
	System.out.println("Testing constructor receiving only name and ID number");
	System.out.println("");
	System.out.println("Name\t\t\t" + "ID Number\t\t" + "Department\t\t" +
		               "Position");
	System.out.println("");
	System.out.println("-----------------------------------------------------" +
		               "-------------");
	System.out.println(employeeConstructor13Name + "\t\t" +
		               employeeConstructor13IdNum + "\t\t" +
    	               employeeConstructor13Department + "\t\t" +
    	               employeeConstructor13Position);
   	System.out.println(employeeConstructor14Name + "\t\t\t" +
   		               employeeConstructor14IdNum + "\t\t" +
    	               employeeConstructor14Department + "\t\t\t\t" +
    	               employeeConstructor14Position);
   	System.out.println(employeeConstructor15Name + "\t\t\t" +
   		               employeeConstructor15IdNum + "\t\t" +
    	               employeeConstructor15Department + "\t" +
    	               employeeConstructor15Position);
    System.out.println("-----------------------------------------------------" +
		               "-------------");

	System.out.println("");
	System.out.println("");
	System.out.println("TEST COMPLETE");


    }


}