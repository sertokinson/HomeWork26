package com.sbt.hibernate.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15 on 20.11.2017.
 */
@Entity
public class Book {
    @Id @GeneratedValue
    int id;

    String name;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name="Tag")
    @Column(name="Value")
    private List<String> tags = new ArrayList<String>();

    public Book() {
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }


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



    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
