package com.todoapp.model;

import javax.persistence.*;

@Entity
@Table(name = "TodoItems")
public class TodoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="title")
	private String title;

	public TodoItem() {
	}

	public TodoItem(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "TodoItem{" + ", Id='" + id + '\'' + ", Title=" + title + '}';
	}
}
