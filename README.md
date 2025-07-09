# 🌱 FutureForm Backend

**FutureForm** is an internship portal system built with Spring Boot, designed to streamline user, student, company, and internship data management. It supports user authentication, role-based access, and rich querying/filtering options.

---

## 🚀 Tech Stack

* **Java 22**
* **Spring Boot 3.5.3**
* **MySQL**
* **Spring Data JPA**
* **ModelMapper**
* **Lombok**

---

## 🗂️ Project Structure

```
ruwandilhara-futureform_backend/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── org.icet.future_form/
        │       ├── Main.java
        │       ├── config/
        │       ├── controller/
        │       ├── dto/
        │       ├── entity/
        │       ├── repository/
        │       ├── service/
        │       └── utill/
        └── resources/
            └── application.yml
```

---

## 🔐 Features

### ✅ **User Module**

* CRUD operations
* Role-based filtering (ADMIN, STUDENT, COMPANY)
* Advanced search by:

  * Username, full name, email
  * City, country, birthday
  * Creation and update dates
  * Active/inactive status

### 🎓 **Student Module**

* Academic details
* Skills & preferences
* Internship experience history
* Certifications and achievements

### 🏢 **Company Module**

* Basic company profile management

### 🧑‍💼 **Admin Module**

* Admin designation management

---

## 📦 Dependencies (from `pom.xml`)

* `spring-boot-starter-web`
* `spring-boot-starter-data-jpa`
* `lombok`
* `modelmapper`
* `mysql-connector-j`

---

## ⚙️ Configuration (`application.yml`)

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/future_form_db?createDatabaseIfNotExist=true
    username: root
    password: 12345
  jpa:
    hibernate:
      ddl-auto: update
```

---

## ✅ How to Run

1. Clone the repo:

```bash
git clone https://github.com/ruwandilhara/futureform_backend.git
```

2. Set up your MySQL database:

```sql
CREATE DATABASE future_form_db;
```

3. Open in IntelliJ or VSCode with JDK 22+.

4. Run `Main.java` or use:

```bash
mvn spring-boot:run
```

---

## 🔗 API Overview

| Endpoint                              | Method | Description                      |
| ------------------------------------- | ------ | -------------------------------- |
| `/api/v1/users/createUser`            | POST   | Create a new user                |
| `/api/v1/users/updateUser`            | PUT    | Update existing user             |
| `/api/v1/users/deleteUserById/{id}`   | DELETE | Delete user by ID                |
| `/api/v1/users/getAll`                | GET    | Fetch all users                  |
| `/api/v1/users/ByUsername/{username}` | GET    | Get user by username             |
| `/api/v1/users/ByRole/{role}`         | GET    | Get users by role (STUDENT etc.) |
| `/api/v1/users/ByCity/{city}`         | GET    | Get users by city                |
| ... *(and more filters)*              |        |                                  |

---

## 👨‍💼 Author

**Ruwan Dilhara**
[GitHub](https://github.com/RuwanDilhara) | [LinkedIn](https://www.linkedin.com/in/ruwan-dilhara-260131336)
