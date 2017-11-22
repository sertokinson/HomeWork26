package com.sbt.hibernate.example;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Created by 15 on 20.11.2017.
 */
@Entity
public class News {
    @EmbeddedId
    private NewsId id;
}
