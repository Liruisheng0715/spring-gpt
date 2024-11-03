package com.example.spring_gpt.repository;

import com.example.spring_gpt.entity.ChatSession;
import org.springframework.data.repository.CrudRepository;

public interface ChatSessionRepository extends CrudRepository<ChatSession, String> {
}