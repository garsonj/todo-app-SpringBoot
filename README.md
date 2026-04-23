# **Todo List Web App**

A simple web-based task management application built with **Spring Boot**, **Thymeleaf**, and **H2 Database**. This app allows users to create, view, edit, complete, and delete tasks through a clean browser interface.



##** Features**

- ✅ Add new tasks with a title and description
- 📋 View all tasks on the home page
- ✏️ Edit existing tasks
- ☑️ Mark tasks as complete / incomplete
- 🗑️ Delete tasks
- 💾 Persistent storage using H2 in-memory database

---

## 🛠️ Tech Stack

| Layer        | Technology              |
|--------------|-------------------------|
| Backend      | Spring Boot 4.x         |
| UI Templates | Thymeleaf               |
| Database     | H2 (In-Memory)          |
| ORM          | Spring Data JPA         |
| Build Tool   | Maven                   |
| Language     | Java 21                |

---

## 📁 Project Structure

```
todo-app/
├── src/main/java/com/example/todo/
│   ├── TodoApplication.java
│   ├── controller/
│   │   └── TodoController.java
│   ├── model/
│   │   └── Todo.java
│   ├── repository/
│   │   └── TodoRepository.java
│   └── service/
│       └── TodoService.java
├── src/main/resources/
│   ├── templates/
│   │   ├── index.html
│   │   └── edit.html
│   └── application.properties
└── pom.xml
```

---

## ⚙️ Prerequisites

Make sure you have the following installed:

- [Java JDK 21+](https://adoptium.net)
- [VS Code](https://code.visualstudio.com/) with:
  - Extension Pack for Java (Microsoft)
  - Spring Boot Extension Pack (VMware)
- Maven (comes bundled with Spring Boot Extension Pack)

---

## 🏃 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/garsonj/todo-app.git
cd todo-app
```

### 2. Open in VS Code

```bash
code .
```

### 3. Run the Application

- Open the **Spring Boot Dashboard** from the left sidebar in VS Code
- Click the **▶ Run** button next to `TodoApplication`

Or run via terminal:

```bash
./mvnw spring-boot:run
```

### 4. Open in Browser

```
http://localhost:8080
```

---

## 🗄️ Database

This app uses an **H2 in-memory database** — no setup required. The database resets every time the app restarts.

To view the H2 console (useful for debugging):

```
http://localhost:8080/h2-console
```

| Setting  | Value                      |
|----------|----------------------------|
| JDBC URL | `jdbc:h2:mem:tododb`       |
| Username | `sa`                       |
| Password | *(leave blank)*            |

---

## 📸 Pages

| Page       | URL              | Description              |
|------------|------------------|--------------------------|
| Home       | `/`              | View and manage all tasks|
| Add Task   | `/add`           | Form to add a new task   |
| Edit Task  | `/edit/{id}`     | Form to edit a task      |
| Delete     | `/delete/{id}`   | Deletes a task           |
| Complete   | `/complete/{id}` | Toggles task completion  |

---

## 🧱 Database Schema

**Table: `todos`**

| Column      | Type    | Description              |
|-------------|---------|--------------------------|
| id          | Long    | Auto-generated ID        |
| title       | String  | Task name                |
| description | String  | Optional task details    |
| completed   | Boolean | Completion status        |
| createdAt   | Date    | Date the task was created|

---

## 🔮 Future Improvements

- [ ] User authentication (Spring Security)
- [ ] Task due dates and reminders
- [ ] Filter tasks by status (All / Active / Completed)
- [ ] REST API endpoints
- [ ] Switch to MySQL for persistent storage

---



## 🙋 Author

**GARANGA JOHN**  
Built as a beginner Spring Boot learning project.
