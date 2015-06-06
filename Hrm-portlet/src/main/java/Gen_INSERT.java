
public class Gen_INSERT {
	public static void main(String[] args) {
		
		
		String query = "insert into hrm_recruitment_candidate values ('10', 'a', 'testValue', 'testValue', 'testValue@eco.com', '123-456-789', 'Ghi chú', '0', '2014-04-27 00:00:00', '1', 'zzz', '', '0', 'SHORTLIST', '20199', '20182');";
		for (int i = 401; i <= 700; i++) {
			System.out.println("insert into hrm_recruitment_candidate values ('"+ i + "', 'a"+i+"', 'testValue', 'testValue', 'testValue@eco.com', '123-456-789', 'Ghi chú', '0', '2014-04-27 00:00:00', '1', 'zzz', '', '0', '', '20199', '20182');");
		}
	}
}
