package com.example.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.model.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer>{

}
