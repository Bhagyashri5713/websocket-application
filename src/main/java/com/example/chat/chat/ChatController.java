package com.example.chat.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @PostMapping("/api/chat/send")
    public String sendMessage(@RequestBody String message) {
        // Logic to send message
        return "Message sent successfully";
    }

    @PostMapping("/api/chat/addUser")
    public String addUser(@RequestBody String username) {
        // Logic to add user to the chat
        return "User added to the chat";
    }
}
