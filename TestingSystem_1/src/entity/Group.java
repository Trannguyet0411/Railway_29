package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	public int id;
	public String name;
	public Account creatorId;
	public LocalDate creatorDate;
	public Group[] group;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Account creatorId) {
		this.creatorId = creatorId;
	}
	public LocalDate getCreatorDate() {
		return creatorDate;
	}
	public void setCreatorDate(LocalDate creatorDate) {
		this.creatorDate = creatorDate;
	}
	public Group[] getGroup() {
		return group;
	}
	public void setGroup(Group[] group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", creatorDate=" + creatorDate
				+ ", group=" + Arrays.toString(group) + "]";
	}
}
