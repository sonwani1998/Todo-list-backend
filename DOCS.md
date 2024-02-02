# TodoApp Backend Documentation

## Technologies Used

- **Spring Boot:** Java-based framework for building RESTful APIs.
- **Spring Data JPA:** Simplifies data access using JPA and Hibernate.
- **MySQL:** Relational database for storing task data.

## Project Structure

- **`src/main/java/com/app`:**
  - `Controller:` Handles HTTP requests, processes data, and returns responses.
  - `Entity:` Represents data models for tasks.
  - `Repo:` Interfaces for CRUD operations on tasks using Spring Data JPA.
  
- **`src/main/resources`:**
  - `application.properties:` Configuration file for database and Spring settings.

## How to Run Locally Configure Database:

Download the project and Navigate to the Backend Directory: cd TodoApp


Configure Database:

Open src/main/resources/application.properties.
Update spring.datasource.url, spring.datasource.username, and spring.datasource.password.

Run the Backend:

API Endpoints
Get All Tasks:

Endpoint: /api/tasks
Method: GET
Get Task by ID:

Endpoint: /api/tasks/{id}
Method: GET
Create Task:

Endpoint: /api/tasks
Method: POST
Update Task by ID:

Endpoint: /api/tasks/{id}
Method: PUT
Mark Task as Completed:

Endpoint: /api/tasks/{id}/complete
Method: PUT
Delete Task by ID:

Endpoint: /api/tasks/{id}
Method: DELETE
