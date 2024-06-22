package com.db.msApp.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "libros")
public class Libro {

    @Id
    private String id;
    private String title;

    @DBRef
    private Set<Autor> author = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Autor> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Autor> author) {
        this.author = author;
    }
}
