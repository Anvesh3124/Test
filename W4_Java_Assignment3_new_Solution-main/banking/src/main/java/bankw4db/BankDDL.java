package bankw4db;
public class BankDDL 
{
	 public String createdb()
	    {
	    	String str = "CREATE DATABASE bank;";
	    	return str;
	    }
	    public String usedb()
	    {
	    	String str = "use bank;";
	    	return str;
	    }
	    public String createCustomerTable()
	    {
	    	String str = "CREATE TABLE customer\r\n"
	    			+ "   (\r\n"
	    			+ "       custid VARCHAR(6),\r\n"
	    			+ "       fname VARCHAR(30),\r\n"
	    			+ "       mname VARCHAR(30),\r\n"
	    			+ "       ltname VARCHAR(30),\r\n"
	    			+ "       city VARCHAR(15),\r\n"
	    			+ "       mobileno VARCHAR(10),\r\n"
	    			+ "       occupation VARCHAR(10),\r\n"
	    			+ "      CONSTRAINT customer_custid_pk PRIMARY KEY(custid)   \r\n"
	    			+ "   );";
	    	return str;
	    }
	    public String createBranchTable()
	    {
	    	String str = "CREATE TABLE branch\r\n"
	    			+ "(bid VARCHAR(6),\r\n"
	    			+ "bname VARCHAR(30),\r\n"
	    			+ "bcity VARCHAR(30),\r\n"
	    			+ "CONSTRAINT branch_bid_pk PRIMARY KEY(bid));";
	    	return str;
	    }
	    public String createAccountTable()
	    {
	    	String str = " CREATE TABLE account\r\n"
	    			+ "   ( acnumber VARCHAR(6),\r\n"
	    			+ "      custid  VARCHAR(6),\r\n"
	    			+ "      bid VARCHAR(6),\r\n"
	    			+ "      opening_balance INT(7),\r\n"
	    			+ "      atype VARCHAR(10),\r\n"
	    			+ "      astatus VARCHAR(10),\r\n"
	    			+ "      CONSTRAINT account_acnumber_pk PRIMARY KEY(acnumber),\r\n"
	    			+ "      CONSTRAINT account_custid_fk FOREIGN KEY(custid) REFERENCES customer(custid),\r\n"
	    			+ "      CONSTRAINT account_bid_fk FOREIGN KEY(bid) REFERENCES branch(bid) );";
	    	return str;
	    }
	    public String dropdb()
	    {
	    	String str = "DROP DATABASE BANK";
	    	return str;
	    }
}
