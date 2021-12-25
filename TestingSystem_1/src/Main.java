import entity.Department;

public class Main {
	public static void main(String[] args) {
		Department department1 = new Department();
//tạo 1 opject department 
		department1.setId(1);
		department1.setName("Phòng Dev");

		department1.printDepartment();
		System.out.println("---------------");
		/*System.out.println("department1 ID =" + department1.getId());*/
		System.out.println(department1.toString());
		System.out.println("---------------");
		

		Department department2 = new Department();
		department2.setId(2);
		department2.setName("Phòng Kinh Doanh");

		department2.printDepartment();
	}
}
