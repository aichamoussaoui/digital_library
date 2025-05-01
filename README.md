# 📚 Digital Library Management System

![Java](https://img.shields.io/badge/Java-17-%23ED8B00?logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-4%20Pillars-%23A259FF)
![GitHub](https://img.shields.io/badge/License-MIT-%2300C4CC)
![Build](https://img.shields.io/badge/Build-Passing-%2342f545)

A modern, object-oriented digital library management system with console interface, built with Java following clean architecture principles.

<div align="center">
  <img src="https://media.giphy.com/media/LHZyixOnHwDDy/giphy.gif" width="400" alt="Library Animation">
</div>

## ✨ Features

### 📚 Core Functionality
| Feature                | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| **Book Management**    | Add, search, and manage physical books and e-books                         |
| **Borrower System**    | Register and track borrowers with student IDs                               |
| **Loan Transactions**  | Process book borrowing and returning with date tracking                    |
| **Reporting**         | View all books, borrowers, and active loans                                |

### 🛠️ Technical Highlights
- **Full OOP Implementation** (Encapsulation, Inheritance, Polymorphism, Abstraction)
- **Clean Architecture** with proper separation of concerns
- **Input Validation** and error handling
- **Comprehensive Documentation** with JavaDoc

## 🚀 Getting Started

### Prerequisites
- Java JDK 17+
- Git (for version control)

### Installation
```bash
# Clone the repository
git clone https://github.com/aichamoussaoui/digital_library.git
```

# Navigate to project directory
```bash
cd digital_library
```

classDiagram
    direction TB
    
    class Book {
        <<abstract>>
        -String title
        -String author
        -String isbn
        -boolean isBorrowed
        +getBookType()* String
        +toString() String
    }
    
    Book <|-- PhysicalBook
    Book <|-- EBook
    
    class Borrower {
        -String name
        -String studentId
        -List<Book> borrowedBooks
        +borrowBook(Book)
        +returnBook(Book)
    }
    
    class LibraryService {
        -List<Book> books
        -List<Borrower> borrowers
        -List<BorrowRecord> borrowRecords
        +addBook(Book)
        +borrowBook(String, String, LocalDate)
    }
    
    class MenuService {
        -LibraryService libraryService
        -Scanner scanner
        +displayMainMenu()
    }

```bash
digital_library/
├── src/                   # Source code
│   ├── models/            # Domain models (Book, Borrower, etc.)
│   ├── services/          # Business logic services
│   └── Main.java          # Application entry point
├── bin/                   # Compiled classes
├── .gitignore            # Git ignore rules
├── LICENSE               # MIT License
└── README.md            # Project documentation
```

## 🛠️ Development
- **Built With**
- **Java SE 17**

- **Object-Oriented Principles**

- **Clean Code Architecture**

- **Git Version Control**

## 🧪 Testing Approach
- **Manual testing of all features**

Input validation testing

Edge case testing

🌿 Git Workflow
# Create feature branch
```bash
git checkout -b feature/new-feature
```

# Make changes and commit
```bash
git add .
git commit -m "feat: add new book search functionality"
```

```bash

# Push to remote
git push origin feature/new-feature
```

## 📚 OOP Implementation

Principle	Implementation Example	Benefit
Encapsulation	Private fields with public getters/setters	Data protection
Inheritance	PhysicalBook and EBook extend Book	Code reuse
Polymorphism	Treat all books uniformly via base class	Flexible system design
Abstraction	Abstract Book class with abstract method	Clear contract for subclasses

## 📝 Code Examples
Creating a New Book
java
// Create a physical book
Book physicalBook = new PhysicalBook(
    "Clean Code", 
    "Robert Martin", 
    "978-0132350884"
);

// Create an e-book
Book ebook = new EBook(
    "Effective Java", 
    "Joshua Bloch", 
    "978-0134685991"
);
Borrowing a Book
java
// Borrow a book
libraryService.borrowBook(
    "978-0132350884", 
    "S10001", 
    LocalDate.now().plusWeeks(2)
);

## 📜 License
Distributed under the MIT License. See LICENSE for more information.

## ✉️ Contact
Moussaoui Aicha - aichamoussaoui@email.com

Project Link: https://github.com/aichamoussaoui/digital_library

🙏 Acknowledgments
Oracle Java Documentation

VS Code Java Extension Pack

GitHub for project hosting

All open source contributors