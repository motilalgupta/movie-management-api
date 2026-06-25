# 🎬 Movie Management REST API

A simple Spring Boot REST API for managing movies. This project demonstrates CRUD (Create, Read, Update, Delete) operations using in-memory storage.

## 🚀 Features

* Add a new movie
* Get all movies
* Get movie by ID
* Update movie details
* Delete a movie
* RESTful API design
* JSON request and response handling

## 🛠️ Technologies Used

* Java 17+
* Spring Boot
* Maven
* REST API
* Postman (for testing)

## 📂 Movie Model

```java
public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private float rating;
}
```

## 📌 API Endpoints

| Method | Endpoint     | Description     |
| ------ | ------------ | --------------- |
| POST   | /movies      | Create a movie  |
| GET    | /movies      | Get all movies  |
| GET    | /movies/{id} | Get movie by ID |
| PUT    | /movies/{id} | Update movie    |
| DELETE | /movies/{id} | Delete movie    |

## 📥 Sample Request

```json
{
  "id": 1,
  "title": "Inception",
  "genre": "Sci-Fi",
  "releaseYear": 2010,
  "rating": 8.8
}
```

## ▶️ Run the Project

1. Clone the repository

```bash
git clone https://github.com/your-username/movie-management-api.git
```

2. Navigate to project directory

```bash
cd movie-management-api
```

3. Run the application

```bash
mvn spring-boot:run
```

4. Open Postman and test the APIs.

## 🎯 Learning Outcomes

* Spring Boot fundamentals
* REST API development
* Request mapping annotations
* JSON serialization and deserialization
* CRUD operations
* HTTP status codes

## 👨‍💻 Author

Motilal Gupta
