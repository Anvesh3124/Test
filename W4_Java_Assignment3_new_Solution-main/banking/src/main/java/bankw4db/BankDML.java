package bankw4db;
public class BankDML 
{
	
	public String insertCustomerTable()
    {
    	String str = "INSERT INTO customer(custid,fname,mname,ltname,city,mobileno,occupation) \r\n"
    			+ "VALUES('C00001','Ramesh','Chandra','Sharma','Delhi','9543198345','Service')\r\n"
    			+ ",('C00002','Avinash','Sunder','Minha','Delhi','9876532109','Service')\r\n"
    			+ ",('C00003','Rahul',null,'Rastogi','Delhi','9765178901','Student')\r\n"
    			+ ",('C00004','Parul',null,'Gandhi','Delhi','9876532109','Housewife')\r\n"
    			+ ",('C00005','Naveen','Chandra','Aedekar','Mumbai','8976523190','Service')\r\n"
    			+ ",('C00006','Chitresh',null,'Barwe','Mumbai','7651298321','Student')\r\n"
    			+ ",('C00007','Amit','Kumar','Borkar','Mumbai','9875189761','Student')\r\n"
    			+ ",('C00008','Nisha',null,'Damle','Mumbai','7954198761','Service')\r\n"
    			+ ",('C00009','Abhishek',null,'Dutta','Kolkata','9856198761','Service')\r\n"
    			+ ",('C00010','Shankar',null,'Nair','Chennai','8765489076','Service'); ";
    	return str;
    }
    public String insertBranchTable()
    {
    	String str = "INSERT INTO branch(bid,bname,bcity) \r\n"
    			+ "VALUES('B00001','Asaf ali road','Delhi')\r\n"
    			+ ",('B00002','New delhi main branch','Delhi')\r\n"
    			+ ",('B00003','Delhi cantt','Delhi')\r\n"
    			+ ",('B00004','Jasola','Delhi')\r\n"
    			+ ",('B00005','Mahim','Mumbai')\r\n"
    			+ ",('B00006','Vile parle','Mumbai')\r\n"
    			+ ",('B00007','Mandvi','Mumbai')\r\n"
    			+ ",('B00008','Jadavpur','Kolkata')\r\n"
    			+ ",('B00009','Kodambakkam','Chennai');";
    	return str;
    }
    public String insertAccountTable()
    {
    	String str = "INSERT INTO account(acnumber,custid,bid,opening_balance,atype,astatus) \r\n"
    			+ "VALUES('A00001','C00001','B00001',1000,'Saving','Active')\r\n"
    			+ ",('A00002','C00002','B00001',1000,'Saving','Active')\r\n"
    			+ ",('A00003','C00003','B00002',1000,'Saving','Active')\r\n"
    			+ ",('A00004','C00002','B00005',1000,'Saving','Active')\r\n"
    			+ ",('A00005','C00006','B00006',1000,'Saving','Active')\r\n"
    			+ ",('A00006','C00007','B00007',1000,'Saving','Suspended')\r\n"
    			+ ",('A00007','C00007','B00001',1000,'Saving','Active')\r\n"
    			+ ",('A00008','C00001','B00003',1000,'Saving','Terminated')\r\n"
    			+ ",('A00009','C00003','B00007',1000,'Saving','Terminated')\r\n"
    			+ ",('A00010','C00004','B00002',1000,'Saving','Active');";
    	return str;
    }

}
