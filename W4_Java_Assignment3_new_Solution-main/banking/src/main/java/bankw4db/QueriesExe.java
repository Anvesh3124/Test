package bankw4db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QueriesExe {
	public static void main(String[] args) throws Exception  {
		
		QueriesExe query = new QueriesExe();
		query.ddl();
		query.dml();
		query.listBranchDetails();
		
	}
	
	public void ddl() throws Exception
	{
		BankDDL ddl = new BankDDL();
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/","root","root");
		//DBConnection conClass = new DBConnection();
		//Connection con = conClass.getFileFromResources();
        Statement stmt = con.createStatement();

		String createdb = ddl.createdb();
		stmt.executeUpdate(createdb);
		System.out.println("Database created successfully...");

		String usedb = ddl.usedb();
		stmt.executeUpdate(usedb);
		System.out.println("Database in use successfully...");

		String createcustomertable = ddl.createCustomerTable();
		stmt.executeUpdate(createcustomertable);
		System.out.println("customer table created successfully...");

		String createbranchtable = ddl.createBranchTable();
		stmt.executeUpdate(createbranchtable);
		System.out.println("branch table created successfully...");

		String createaccounttable = ddl.createAccountTable();
		stmt.executeUpdate(createaccounttable);
		System.out.println("account table created successfully...");
		
		con.close();
		
	}
	public void dml() throws Exception
	{
BankDML dml = new BankDML();

Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/bank","root","root");
//DBConnection conClass = new DBConnection();
//Connection con = conClass.getFileFromResources();
Statement stmt = con.createStatement();


		String insertcustomertable = dml.insertCustomerTable();
		stmt.executeUpdate(insertcustomertable);
		System.out.println("Customer table inserted successfully...");

		String insertbranchtable = dml.insertBranchTable();
		stmt.executeUpdate(insertbranchtable);
		System.out.println("branch  table inserted successfully...");

		String insertaccounttable = dml.insertAccountTable();
		stmt.executeUpdate(insertaccounttable);
		System.out.println("account  table inserted successfully...");
		
		con.close();
	}
	
	public void dropall() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bank","root","root");
		BankDDL ddl = new BankDDL();
		Statement stmt = con.createStatement();
		String dropdb = ddl.dropdb();
		stmt.executeUpdate(dropdb);
		System.out.println("bank db dropped  successfully...");
		con.close();
	}
	public List<Branch> listBranchDetails() throws Exception {
		Inputqueries in = new Inputqueries();
		List<Branch> list = new ArrayList<Branch>();
		Branch Branch = new Branch();
		BankDDL ddl = new BankDDL();
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/bank","root","root");
			Statement stmt = null;
		try
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(in.problem1());
			System.out.println("==================================");
			System.out.println("Executing Problem-1");
			System.out.println("=====================================");
			while (rs.next()) 
			{
				Branch.setBid(rs.getString(1));
				Branch.setBname(rs.getString(2));
				Branch.setBcity(rs.getString(3));			
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" " +rs.getString(3));				
				list.add(Branch);
			}
			System.out.println("=====================================");
		}
		catch (SQLException e) {
            e.printStackTrace();
        }		
		return list;
	}
}
