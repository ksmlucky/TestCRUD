package com.example.testgradle.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("championdatas")
public class Product {
    @Id
    private String id;

    private String englishname;

    private String name;

    private String title;

    private String blurb;

    private String difficulty;

    public Product() {
    }

    public Product(String id, String englishname, String name, String title, String blurb, String difficulty) {
        this.id = id;
        this.englishname = englishname;
        this.name = name;
        this.title = title;
        this.blurb = blurb;
        this.difficulty = difficulty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
