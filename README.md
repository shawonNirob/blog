# User Management API

This repository contains a simple User Management REST API built with Spring Boot. The `UserController` class provides endpoints for managing users, including creating, retrieving, updating, and deleting user records. This API also includes functionality for pagination and user summaries.

## Features

- **Retrieve All Users**: Fetches a list of all users.
- **Retrieve User Summaries**: Fetches a summarized list of user data.
- **Pagination**: Fetches a paginated list of users.
- **Retrieve User by ID**: Fetches a single user by their ID.
- **Create User**: Adds a new user to the system.
- **Update User**: Updates the details of an existing user.
- **Delete User**: Deletes a user from the system.

## API Endpoints

### 1. Get All Users

**Endpoint:** `GET /api`

**Response:** Returns a list of `UserDTO` objects.

### 2. Get All User Summaries

**Endpoint:** `GET /api/summaries`

**Response:** Returns a list of `UserSummariesDTO` objects.

### 3. Get All Users with Pagination

**Endpoint:** `GET /api/users`

**Parameters:**
- `page` (default: 0) - The page number to retrieve.
- `size` (default: 2) - The number of users per page.

**Response:** Returns a paginated list of `UserDTO` objects.

### 4. Get User by ID

**Endpoint:** `GET /api/{id}`

**Path Variable:**
- `id` - The ID of the user to retrieve.

**Response:** Returns the `User` object if found, otherwise a `404 Not Found` response.

### 5. Create a New User

**Endpoint:** `POST /api`

**Request Body:** A JSON object representing the new user.

**Response:** Returns the newly created `User` object.

### 6. Update User by ID

**Endpoint:** `PUT /api/{id}`

**Path Variable:**
- `id` - The ID of the user to update.

**Request Body:** A JSON object representing the updated user details.

**Response:** Returns the updated `User` object.

### 7. Delete User by ID

**Endpoint:** `DELETE /api/{id}`

**Path Variable:**
- `id` - The ID of the user to delete.

**Response:** Returns a `204 No Content` response on successful deletion.

## Prerequisites

- Java 17 or later
- Maven or Gradle
- Spring Boot 3.x

## Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/blogpost-user-management.git
   cd blogpost-user-management
