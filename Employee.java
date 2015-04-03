/**
 * @(#)Employee.java
 *
 *
 * @Derick Warshaw // Lab 8 // COSC1337
 * @version 1.00 2014/3/25
 */

/**This class allows the user to create an Employee object. It contains methods
 *for accessing and mutating name, id number, department, and position data.
 * */
public class Employee
{

    private String name;
    private String idNumber;
    private String department;
    private String position;

	/**The Employee constructor performs setup and initialization operations
	 *for employee name, id number, department and position data.
	 **There is input validation to prevent a negative number from being
	 *entered. */
    public Employee(String inputName, String inputIdNum, String inputDepartment,
                    String inputPosition)
    {

		int badIdNum;

		badIdNum = Integer.parseInt(inputIdNum);

    	if(badIdNum < 0)
    	{
    		idNumber = "00000";
    		System.out.println("Invalid ID Number @ all data constructor " +
    			                              " " + inputName + " " + badIdNum);

			name = inputName;
			department = inputDepartment;
    		position = inputPosition;
    	}

		else
		{

			name = inputName;
	    	idNumber = inputIdNum;
	    	department = inputDepartment;
	    	position = inputPosition;

		}


    }

	/**The Employee constructor performs setup and initialization operations.
	 *This particular constructor setup is for when the user only passes name
	 *and id number */
    public Employee(String inputName, String inputIdNum)
    {

		int badIdNum;

		badIdNum = Integer.parseInt(inputIdNum);

    	if(badIdNum < 0)
    	{

    		idNumber = "00000";
    		System.out.println("Invalid ID Number @ name and ID number " +
    			              "constructor" + " " + inputName + " " + badIdNum);

			name = inputName;
			department = "";
			position = "";

    	}

    	else
    	{

    		name = inputName;
	    	idNumber = inputIdNum;
	    	department = "";
	    	position = "";

    	}

    }

	/**The Employee constructor performs setup and initialization operations.
	 *This particular constructor setup is for a no-arg constructor */
    public Employee()
    {

    	name = "";
    	idNumber = "0";
    	department = "";
    	position = "";

    }

	/**The setName method allows the user to change employee name data.
	 *@param theName used to change name data */
    public void setName(String theName)
    {

    	name = theName;

    }

	/**The setIdNum method allows the user to change employee id number data.
	 *There is input validation to prevent a negative number from being
	 *entered.
	 *@param theIdNum used to change empoloyee id number data  */
	public void setIdNum(String theIdNum)
    {
		int badIdNum;

		badIdNum = Integer.parseInt(theIdNum);

    	if(badIdNum < 0)
    	{

    		idNumber = "00000";
    		System.out.println("Invalid ID Number @ setID mutator " +
    			               "for ID number " + badIdNum);

    	}

    	else
    	{
    		idNumber = theIdNum;
    	}

    }

	/**The setDepartment method allows the user to change employee department
	 *data.
	 *@param theDepartment used to change employee department data  */
    public void setDepartment(String theDepartment)
    {

    	department = theDepartment;

    }

	/**The setDepartment method allows the user to change employee position
	 *data.
	 *@param setPosition used to change employee position data  */
    public void setPosition(String thePosition)
    {

    	position = thePosition;

    }

	/**The getName method is used to access the employee name data.
	 *@return a string data type name */
    public String getName()
    {

    	return name;


    }

	/**The getIdNum method is used to access the employee id number data.
	 *@return a string data type id number */
    public String getIdNum()
    {

    	return idNumber;


    }

	/**The getDepartment method is used to access the employee department data.
	 *@return a string data type department */
    public String getDepartment()
    {

    	return department;


    }

	/**The getPosition method is used to access the employee position data.
	 *@return a string data type name */
	public String getPosition()
    {

    	return position;


    }

}