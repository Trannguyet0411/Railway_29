package entity;

import java.time.LocalDate;

public class Question {
	public int id;
	public String conten;
	public TypeQuestion type;
	public Account creator;
	public LocalDate createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConten() {
		return conten;
	}

	public void setConten(String conten) {
		this.conten = conten;
	}

	public TypeQuestion getType() {
		return type;
	}

	public void setType(TypeQuestion type) {
		this.type = type;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", conten=" + conten + ", type=" + type + ", creator=" + creator + ", createDate="
				+ createDate + "]";
	}
}
