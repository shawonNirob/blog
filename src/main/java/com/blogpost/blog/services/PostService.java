package com.blogpost.blog.services;

import com.blogpost.blog.entities.Post;
import com.blogpost.blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Integer id) {
        return postRepository.findById(id);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Post updatePost(Integer id, Post postDetails) {
        Post post = postRepository.findById(id).orElseThrow(() -> new RuntimeException("Post not found"));
        post.setTitle(postDetails.getTitle());
        post.setPostDescription(postDetails.getPostDescription());
        post.setStatus(postDetails.getStatus());
        post.setUpdatedBy(postDetails.getUpdatedBy());
        post.setDateCreated(postDetails.getDateCreated());
        post.setDateUpdated(postDetails.getDateUpdated());
        return postRepository.save(post);
    }

    public void deletePost(Integer id) {
        postRepository.deleteById(id);
    }
}

