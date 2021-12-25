package entity;

// class là một nhóm các đối tượng  
public class Department {
	//thuộc tính 
	public int id;
	public String name;
	//phương thức,menthod 
	//phương thức in thông tin của đối tượng 
	public void printDepartment() {
		System.out.println("Thông tin phòng : " +id+ ",Tên : " + name );
		
	}
	//để trả về giá trị id 
	public int getId() {
		return id;
	}
	//để cài đặt giá trị cho id  
	public void setId(int id) {
		this.id = id;
	}
	//để cài trả về giá trị cho name 
	public String getName() {
		return name;
	}
	//để cài đặt giá trị cho name 
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}
