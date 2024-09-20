# Blog Application

## Overview

The **Blog** application is a Java-based web application designed for creating, managing, and viewing blog posts. Users can register, create posts, comment on posts, and manage their content. The application uses **Spring Boot** for the backend, **Spring Data JPA** for database interactions, and **MySQL** as the relational database.

## Features

- **User Management**: Users can register, log in, and manage their profiles.
- **Post Management**: Users can create, update, delete, and view blog posts.
- **Comment System**: Users can comment on posts, fostering interaction within the platform.
- **RESTful API**: Exposes endpoints for managing users, posts, and comments.
- **Data Persistence**: Utilizes MySQL for storing user, post, and comment data.

## Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For database interactions.
- **MySQL**: Database management system.
- **Hibernate**: ORM tool for database operations.
- **Gradle**: Build tool for managing dependencies and packaging the application.

## Installation

### Prerequisites

- Java Development Kit (JDK) 17 or higher.
- MySQL server installed and running.
- Gradle installed.

## API Endpoints

All API endpoints are prefixed with `/api`.

### User Management

- **Retrieve All Users**
  - `GET /api`  
    Retrieves a list of all users.

- **Retrieve User Summaries**
  - `GET /api/summaries`  
    Retrieves summaries of all users.

- **Retrieve Paginated Users**
  - `GET /api/users?page={page}&size={size}`  
    Retrieves users with pagination.  
    - `page`: Page number (default is `0`).
    - `size`: Number of users per page (default is `2`).

- **Retrieve a User by ID**
  - `GET /api/{id}`  
    Retrieves a user by their unique ID.

- **Create a New User**
  - `POST /api`  
    Creates a new user.  
    **Request Body:**  
    ```json
    {
      "fullName": "John Doe",
      "dob": "1990-01-01",
      "userType": 1,
      "userStatus": 1
    }
    ```

- **Update a User by ID**
  - `PUT /api/{id}`  
    Updates an existing user by their ID.  
    **Request Body:**  
    ```json
    {
      "fullName": "Jane Doe",
      "dob": "1990-01-01",
      "userType": 2,
      "userStatus": 1
    }
    ```

- **Delete a User by ID**
  - `DELETE /api/{id}`  
    Deletes a user by their ID.

### Post Management

- **Retrieve All Posts**
  - `GET /api/posts`  
    Retrieves a list of all blog posts.

- **Retrieve a Post by ID**
  - `GET /api/posts/{id}`  
    Retrieves a specific post by its unique ID.

- **Create a New Post**
  - `POST /api/posts`  
    Creates a new blog post.  
    **Request Body:**  
    ```json
    {
      "userId": 1,
      "title": "My First Blog Post",
      "postDescription": "This is the content of my first post.",
      "status": 1,
      "updatedBy": 1
    }
    ```

- **Update a Post by ID**
  - `PUT /api/posts/{id}`  
    Updates an existing post by its ID.  
    **Request Body:**  
    ```json
    {
      "title": "Updated Blog Post Title",
      "postDescription": "Updated content of the post.",
      "status": 2,
      "updatedBy": 2
    }
    ```

- **Delete a Post by ID**
  - `DELETE /api/posts/{id}`  
    Deletes a post by its ID.

### Comment Management

> **Note:** The `CommentController` is currently under development. Future updates will include endpoints for managing comments.

## Database Schema

### User Table

```sql
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    dob DATE,
    user_type INT,
    user_status INT,
    date_created DATETIME DEFAULT CURRENT_TIMESTAMP,
    date_updated DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

### Posts Table

```sql
CREATE TABLE posts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    post_description TEXT NOT NULL,
    status INT NOT NULL,
    updated_by INT,
    date_created DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    date_updated DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE
);
```

### Comments Table

```sql
CREATE TABLE comments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    post_id INT NOT NULL,
    comment_by INT NOT NULL,
    comments TEXT NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (post_id) REFERENCES posts(id) ON DELETE CASCADE,
    FOREIGN KEY (comment_by) REFERENCES user(id) ON DELETE CASCADE
);
```

## Testing

You can use [Postman](https://www.postman.com/) or any other API client to test the endpoints. Simply import the collection and run the requests against your local server.

## Contribution

Contributions are welcome! Please fork the repository and create a pull request to contribute to the project.

## Contact

For any inquiries or support, please contact me via [LinkedIn](https://www.linkedin.com/in/shawon-sarowar/).
