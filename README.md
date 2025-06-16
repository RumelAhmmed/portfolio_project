💼 Personal Portfolio Website

A Spring Boot-based personal portfolio website to showcase your profile, skills, and projects with a clean, responsive design. This project is ideal for developers who want a dynamic portfolio backed by a Java backend and an in-memory database.


🔗 Live URLs

| Page                  | URL                               |
|-----------------------|------------------------------------|
| 🏠 Home               | `http://localhost:8080/`           |
| 👤 About Me           | `http://localhost:8080/about`      |
| 📁 Projects           | `http://localhost:8080/projects`   |
| ✉️ Contact Information| `http://localhost:8080/contact`    |

🚀 Features

- ✅ **Spring Boot** for robust backend
- 💾 **H2 in-memory DB** (easily switchable to MySQL)
- 🧩 **Thymeleaf** with layout fragments (navbar & footer)
- 🔁 Full **CRUD** support for Projects
- 💻 Clean and responsive **Bootstrap UI**
- 📷 "About Me" with photo integration

🛠 Tech Stack

- **Backend**: Spring Boot
- **Frontend**: Thymeleaf, Bootstrap, CSS
- **Database**: H2 (default) or MySQL
- **Build Tool**: Maven / Gradle

📁 Project Structure
portfolio-website/
├── src/
│ ├── main/
│ │ ├── java/com/example/portfolio/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ └── service/
│ │ └── resources/
│ │ ├── static/ # CSS, images, JS
│ │ ├── templates/ # Thymeleaf views
│ │ │ ├── fragments/ # navbar.html, footer.html
│ │ │ ├── home.html
│ │ │ ├── about.html
│ │ │ ├── projects.html
│ │ │ └── contact.html
│ │ └── application.properties
├── pom.xml
└── README.md
