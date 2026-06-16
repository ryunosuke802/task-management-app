package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  // ←これがあることで「DBのテーブル」として扱われる
public class Task {

    @Id  // ←主キー（一意のID）であることを示す
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ←自動で番号を振る
    private Long id;

    private String title;     // タスクの名前
    private boolean completed; // 完了したかどうか
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

    // ↓Eclipseで自動生成できる（後述）
    // getter / setter
}
