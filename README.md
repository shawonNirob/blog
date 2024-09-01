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

### User Management

- `GET /users` - Retrieve all users.
- `GET /users/{id}` - Retrieve a user by ID.
- `POST /users` - Create a new user.
- `PUT /users/{id}` - Update a user by ID.
- `DELETE /users/{id}` - Delete a user by ID.

### Post Management

- `GET /posts` - Retrieve all posts.
- `GET /posts/{id}` - Retrieve a post by ID.
- `POST /posts` - Create a new post.
- `PUT /posts/{id}` - Update a post by ID.
- `DELETE /posts/{id}` - Delete a post by ID.

### Comment Management

- `GET /comments` - Retrieve all comments.
- `POST /comments` - Add a new comment to a post.
- `GET /comments/{id}` - Retrieve a comment by ID.
- `DELETE /comments/{id}` - Delete a comment by ID.

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
