package com.blogpost.blog.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts") // Specify the table name
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Specify the column name
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false) // Specify the foreign key column
    private User user;

    @Column(name = "title", nullable = false) // Specify the column name
    private String title;

    @Column(name = "post_description", nullable = false) // Specify the column name
    private String postDescription;

    @Column(name = "status", nullable = false) // Specify the column name
    private Integer status;

    @Column(name = "updated_by") // Specify the column name
    private Integer updatedBy;

    @Column(name = "date_created", nullable = false) // Specify the column name
    private LocalDateTime dateCreated;

    @Column(name = "date_updated") // Specify the column name
    private LocalDateTime dateUpdated;

    public Post(int postId) {

    }

    public Post() {

    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
