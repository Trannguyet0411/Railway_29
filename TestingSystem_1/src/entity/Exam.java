package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Exam {
	public int id;
	public String code;
	public String tile;
	public CategoryQuestion[] category;
	public int duration;
	public Account creator;
	public LocalDate createDate;
	public Question[] questions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTile() {
		return tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}

	public CategoryQuestion[] getCategory() {
		return category;
	}

	public void setCategory(CategoryQuestion[] category) {
		this.category = category;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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

	public Question[] getQuestions() {
		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", tile=" + tile + ", category=" + Arrays.toString(category)
				+ ", duration=" + duration + ", creator=" + creator + ", createDate=" + createDate + ", questions="
				+ Arrays.toString(questions) + "]";
	}
}
