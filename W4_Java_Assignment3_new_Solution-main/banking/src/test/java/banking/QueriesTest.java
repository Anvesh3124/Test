package banking;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bankw4db.Branch;
import bankw4db.QueriesExe;

class QueriesTest {
	static QueriesExe query = new QueriesExe();
	@BeforeAll
	public static void setupdb() throws Exception 
	{
		query.ddl();
		query.dml();
	}
	
	@Test
	@DisplayName("Selecting All records from branch table")
	public void test1() throws Exception {
		List<Branch> listBranchDetails = query.listBranchDetails();

		assertEquals(listBranchDetails.size(), 9);
		//assertEquals(listBranchDetails.get(0).getBid(), "B00001");
	}
	
	@AfterAll
	public static void dropdb() throws Exception
	{
		//query.dropall();
	}

}
