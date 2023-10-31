package interface05;

public class DaoTest {
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		
		System.out.println();
		
		dbWork(new MysqlDao());
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
