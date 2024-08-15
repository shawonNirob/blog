package com.blogpost.blog.repositories;

import com.blogpost.blog.dto.UserDTO;
import com.blogpost.blog.dto.UserSummariesDTO;
import com.blogpost.blog.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT new com.blogpost.blog.dto.UserDTO(u.id, u.fullName, u.dob, u.userType, u.userStatus, u.dateCreated, u.dateUpdated) FROM User u")
    List<UserDTO> findAllUsers();

    @Query("SELECT new com.blogpost.blog.dto.UserDTO(u.id, u.fullName, u.dob, u.userType, u.userStatus, u.dateCreated, u.dateUpdated) FROM User u")
    Page<UserDTO> findAllUsers(Pageable pageable);

    @Query("SELECT new com.blogpost.blog.dto.UserSummariesDTO(u.id, u.fullName, u.dob, u.userType, u.userStatus, u.dateCreated, u.dateUpdated, COUNT(p.id))" +
            "FROM User u LEFT JOIN u.posts p " +
            "GROUP BY u.id, u.fullName, u.dob, u.userType, u.userStatus, u.dateCreated, u.dateUpdated")
    List<UserSummariesDTO> findAllUserSummaries();
}
