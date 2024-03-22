# Chat Application REST API

## Overview
This document describes the RESTful API endpoints for the Chat Application.
## Endpoints

### Send Message
- **URL:** `/api/chat/send`
- **Method:** `POST`
- **Description:** Sends a message to the chat.

**Request Body:**
  - Content Type: `application/json`
  - Example:
    ```json
    {
      "message": "Hello, world!"
    }

### Add User
- **URL:** `/api/chat/addUser`
- **Method:** `POST`
- **Description:** Adds a user to the chat.

**Request Body:**
  - Content Type: `application/json`
  - Example:
    ```json
    {
      "username": "JohnDoe"
    }