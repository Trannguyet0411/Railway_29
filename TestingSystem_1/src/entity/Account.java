package entity;

import java.time.LocalDate;
import java.util.Arrays;

import javax.swing.GroupLayout.Group;

public class Account {
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department departmentID;
	public Position positionID;
	public LocalDate createDate;
	public Group[] groups;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Department departmentID) {
		this.departmentID = departmentID;
	}

	public Position getPositionID() {
		return positionID;
	}

	public void setPositionID(Position positionID) {
		this.positionID = positionID;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", departmentID=" + departmentID + ", positionID=" + positionID + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}

}
