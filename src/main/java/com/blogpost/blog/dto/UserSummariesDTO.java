package com.blogpost.blog.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserSummariesDTO {
    private Integer id;
    private String fullName;
    private LocalDate dob;
    private Integer userType;
    private Integer userStatus;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private Long postCount;

    public UserSummariesDTO(Integer id, String fullName, LocalDate dob, Integer userType, Integer userStatus, LocalDateTime dateCreated, LocalDateTime dateUpdated, Long postCount) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.userType = userType;
        this.userStatus = userStatus;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.postCount = postCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
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

    public Long getPostCount() {
        return postCount;
    }

    public void setPostCount(Long postCount) {
        this.postCount = postCount;
    }
}
