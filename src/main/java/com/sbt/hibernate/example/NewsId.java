package com.sbt.hibernate.example;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by 15 on 20.11.2017.
 */
@Embeddable
public class NewsId implements Serializable {
private String title;
private String laungage;
}
