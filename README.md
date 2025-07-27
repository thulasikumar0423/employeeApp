# 👨‍💼 Employee Management System - Spring Boot Mini Project

A simple and efficient **Employee Management System** built using **Spring Boot**, integrated with **MySQL**, and tested using **Postman**. This project demonstrates how to build a CRUD (Create, Read, Update, Delete) RESTful API with Spring Boot for managing employee records.

---

## 🚀 Features

* ✅ Add a new employee (single and bulk)
* 📃 Get all employee details
* 🔍 Fetch employee details by ID
* ✏️ Update employee salary by name
* 🗑️ Delete employee by ID or name
* 🧪 API tested with Postman
* 📍 MySQL integration for persistent storage

---

## 💪 Tech Stack

| Technology    | Purpose                                        |
| ------------- | ---------------------------------------------- |
| Spring Boot   | Backend framework                              |
| MySQL         | Relational database                            |
| JPA/Hibernate | ORM for DB interactions                        |
| Postman       | API testing                                    |
| Maven         | Dependency management                          |
| Java          | Programming language (No Java 8 features used) |

---

## 📁 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.employee
│   │       ├── controller
│   │       ├── model
│   │       ├── repository
│   │       └── service
│   └── resources
│       └── application.properties
```

---

## 📌 Endpoints & Sample Usage

### ➕ Add Employee(s)

* `POST /api/employees`
* Body (Single):

```json
{
  "name": "Likhith",
  "sal": 45000.0,
  "dept": "IT"
}
```

* Body (Bulk):

```json
[
  {
    "name": "Riya",
    "sal": 40000.0,
    "dept": "HR"
  },
  {
    "name": "Arjun",
    "sal": 50000.0,
    "dept": "Finance"
  }
]
```

---

### 📄 Get All Employees

* `GET /api/employees`

---

### 🔍 Get Employee by ID

* `GET /api/employees/by-id/{id}`

---

### ✏️ Update Salary by Name

* `PUT /api/employees/update-salary/{name}?newSalary=55000.0`

---

### ❌ Delete by ID

* `DELETE /api/employees/by-id/{id}`

### ❌ Delete by Name

* `DELETE /api/employees/by-name/{name}`

---

## ⚙️ Database Configuration

In `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=your_password_here
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=8080
```

> ✅ Ensure MySQL is running and a database named `employeedb` exists.

---

## 🧪 Testing With Postman

* Import endpoints manually or use JSON request collections.
* Use correct headers:

  * `Content-Type: application/json`
* Test GET, POST, PUT, DELETE requests

---

## 📚 What I Learned

* Building REST APIs with Spring Boot
* Structuring Model, Repository, Service, and Controller layers
* Mapping JSON payloads to Java objects
* CRUD operations with MySQL using Spring Data JPA
* API testing with Postman

---

## 📈 Future Improvements

* Add pagination and sorting to `GET` endpoint
* Swagger API documentation
* Spring Security and JWT Authentication
* React frontend for UI interaction

---

## 📌 Author

**Thulasi Kumar**
🔗 [LinkedIn](https://linkedin.com/)
📧 Reach me for collaboration and learning!

---

## ⭐ Feedback

If you liked this project, please give it a ⭐ on GitHub and share it with fellow developers!
