package com.gillies.findmynexthome.model;

import jakarta.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;

    public Blog(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
