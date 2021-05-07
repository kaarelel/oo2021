package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Enter a title")
    private String title;

    @NotBlank(message = "Enter description")
    private String description;

    public Task() {

    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", title=" + title + ", description=" + description + '}';
    }
}