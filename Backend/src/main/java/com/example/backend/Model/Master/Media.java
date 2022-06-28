package com.example.backend.Model.Master;
import javax.persistence.*;

@Entity
public class Media {
    @Id
    @GeneratedValue
    private String id;
    private String title;
    private String author;
    private int length;
}
