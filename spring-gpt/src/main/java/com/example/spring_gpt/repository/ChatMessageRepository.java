package com.example.spring_gpt.repository;

import com.example.spring_gpt.entity.ChatMessage;
import org.springframework.data.repository.CrudRepository;

public interface ChatMessageRepository  extends CrudRepository<ChatMessage, String> {
}