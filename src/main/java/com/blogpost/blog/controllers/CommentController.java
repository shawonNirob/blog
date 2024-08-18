package com.blogpost.blog.controllers;

import com.blogpost.blog.dto.CommentDTO;
import com.blogpost.blog.entities.Comment;
import com.blogpost.blog.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

}
