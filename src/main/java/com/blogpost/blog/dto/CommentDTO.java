package com.blogpost.blog.dto;

import java.time.LocalDateTime;

public class CommentDTO {
    private int id;
    private int postId;
    private int commentBy;
    private String comments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor
    public CommentDTO(int id, int postId, int commentBy, String comments, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.postId = postId;
        this.commentBy = commentBy;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCommentBy() {
        return commentBy;
    }

    public void setCommentBy(int commentBy) {
        this.commentBy = commentBy;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

