package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name = "musicproject", uniqueConstraints = {@UniqueConstraint(columnNames = {"projectname","title"})})
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(columnDefinition = "projectname")
    private String projectname;

    @Column(columnDefinition = "title")
    private String title;




    public Music() {
    }
    public Music(long id, String projectname, String title){
        this.id = id;
        this.projectname = projectname;
        this.title = title;
    }

    public void setState(Music music){
        this.projectname =music.getProjectname();
        this.title = music.getTitle();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
