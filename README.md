# VITyarthi-JAVA-Project
# Campus Event Manager

## A Java-Based College Event and Registration Management System

**Campus Event Manager** is a console-based Java application developed to simplify the management of college events and student registrations. The project provides a structured way to create events, view available events, register students, and cancel events.

The system is designed as a small-scale college event management solution and demonstrates the practical use of **Core Java, Object-Oriented Programming (OOP), collections, input validation, modular programming, and basic software architecture**.

---

## 👨‍💻 Developer

**Name:** Aditya Choudhary
**Registration Number:** 25BCE11161
**Program:** B.Tech Computer Science and Engineering
**Subject:** Java Programming
**Academic Year:** 2026

---

## 📌 Problem Statement

College clubs, departments, and student committees often manage event information using messaging applications, spreadsheets, or manually maintained lists. This approach can make it difficult to keep event information organized and updated.

Some common problems include:

* Difficulty maintaining event records.
* Duplicate or incorrect registrations.
* Outdated event information.
* Difficulty identifying cancelled events.
* Manual effort in maintaining student registration details.
* Lack of a centralized system for small college events.

The Campus Event Manager addresses these problems by providing a simple centralized console application for managing event and registration records.

---

## 🎯 Objectives

The major objectives of the project are:

1. To create and maintain college event records.
2. To allow students to register for active events.
3. To display event and registration information clearly.
4. To provide event cancellation functionality.
5. To validate user inputs and prevent invalid operations.
6. To demonstrate practical implementation of Java OOP concepts.
7. To organize the application into separate and maintainable components.
8. To provide a foundation that can later be extended with database and GUI support.

---

## ✨ Features

### 1. Event Management

The application allows the user to create new events by entering information such as:

* Event ID
* Event title
* Event date
* Event venue

Events can also be viewed from the application.

### 2. Student Registration

Students can register for an existing active event by providing:

* Student name
* Event ID

After successful registration, the system displays a confirmation message.

### 3. Event Cancellation

An existing event can be cancelled using its event ID. The event status is updated so that further registration for the cancelled event can be prevented.

### 4. Input Validation

The application checks user input to reduce invalid operations. Validation includes:

* Blank fields.
* Invalid menu choices.
* Invalid numerical input.
* Unknown event IDs.
* Registration for cancelled events.

### 5. In-Memory Data Management

The current version uses Java `ArrayList` collections to store events and registrations while the application is running.

This keeps the implementation simple and makes it suitable for demonstrating Java collection handling.

---

## 🛠️ Technologies Used

| Technology                  | Purpose                                       |
| --------------------------- | --------------------------------------------- |
| Java                        | Main programming language                     |
| Object-Oriented Programming | Application design                            |
| ArrayList                   | In-memory collection management               |
| Console I/O                 | User interaction                              |
| Git                         | Version control                               |
| GitHub                      | Source-code hosting and project documentation |

---

## 🏗️ System Architecture

The project follows a simple **three-layer architecture**:

```text
                +----------------------+
                |     Presentation     |
                |       Main.java      |
                +----------+-----------+
                           |
                           v
                +----------------------+
                |       Service        |
                |   EventService.java  |
                +----------+-----------+
                           |
                           v
                +----------------------+
                |        Model         |
                | Event.java           |
                | Registration.java    |
                +----------------------+
```

### Presentation Layer

`Main.java` manages interaction with the user. It displays the menu, accepts input, and displays the results.

### Service Layer

`EventService.java` contains the main business logic of the application. It performs operations such as:

* Adding events.
* Registering students.
* Cancelling events.
* Managing event and registration records.

### Model Layer

The model layer contains:

* `Event.java` — represents an event.
* `Registration.java` — represents a student's registration for an event.

This separation makes the application easier to understand and maintain.

---

## 📂 Project Structure

```text
CampusEventManager/
│
├── src/
│   ├── Main.java
│   ├── Event.java
│   ├── Registration.java
│   └── EventService.java
│
├── README.md
├── statement.md
└── report.md
```

---

## 🔄 Application Workflow

The basic workflow of the application is:

```text
Start
  |
  v
Display Main Menu
  |
  v
Select Operation
  |
  v
Validate Input
  |
  +-----------------------------+
  |                             |
  v                             v
Update Records              Display Records
  |                             |
  +-------------+---------------+
                |
                v
          Return to Menu
                |
                v
              Exit
```

The application continues to display the menu until the user selects the exit option.

---

## 📋 Main Operations

### Add Event

The user enters the required event information. After validation, a new event object is created and stored.

### View Events

The system displays the available event records along with their relevant details and status.

### Register Student

The user provides a student's name and the required event ID. The system checks whether the event exists and is active before creating the registration.

### Cancel Event

The user provides an event ID. If the event exists, its status is changed to cancelled.

---

## 🧪 Testing

The project was tested using different valid and invalid inputs.

| Test Case                    | Expected Result                     | Status |
| ---------------------------- | ----------------------------------- | ------ |
| Add valid event              | Event is stored and displayed       | Pass   |
| Enter blank title/date       | Validation message displayed        | Pass   |
| Enter invalid menu number    | Error handled without crashing      | Pass   |
| Register valid student       | Registration confirmation displayed | Pass   |
| Enter unknown event ID       | Registration rejected               | Pass   |
| Register for cancelled event | Operation rejected                  | Pass   |
| View records                 | Correct records displayed           | Pass   |

---

## 🖥️ Screenshots

Screenshots of the running application can be added to this section.

### Main Menu

```text
[Add screenshot of the application's main menu here]
```

### Adding an Event

```text
[Add screenshot showing event creation here]
```

### Student Registration

```text
[Add screenshot showing successful student registration here]
```

---

## 💾 Storage

The current implementation stores data using Java `ArrayList` collections.

Therefore, the records are available only while the application is running. Once the program terminates, the in-memory data is lost.

A future version can use a relational database such as **SQLite or MySQL** for permanent storage.

---

## ⚙️ Setup and Installation

This section provides complete instructions for setting up and running the **Campus Event Manager** from a fresh environment. No prior knowledge of the project is required.

### 1. System Requirements

Before running the project, make sure the following software is installed:

* **Java Development Kit (JDK)**
* A terminal/command prompt
* A Java-compatible IDE (optional)

The project can be executed using the Java command line without requiring any additional framework.

### 2. Install Java

Install a recent version of the **Java Development Kit (JDK)** on your system.

After installation, verify that Java is correctly configured.

Open Terminal / Command Prompt and run:

```bash
java -version
```

Then verify that the Java compiler is available:

```bash
javac -version
```

Both commands should display the installed Java version.

If either command is not recognized, Java's installation directory needs to be added to the system's `PATH` environment variable.

---

### 3. Get the Project

Clone this GitHub repository:

```bash
git clone <YOUR-GITHUB-REPOSITORY-URL>
```

Move into the project directory:

```bash
cd CampusEventManager
```

Alternatively, the repository can be downloaded as a ZIP file and extracted manually.

---

### 4. Project Structure

After opening the project, the structure should look similar to:

```text
CampusEventManager/
│
├── src/
│   ├── Main.java
│   ├── Event.java
│   ├── Registration.java
│   └── EventService.java
│
├── README.md
├── statement.md
└── report.md
```

### Purpose of the Main Files

| File                | Purpose                                                 |
| ------------------- | ------------------------------------------------------- |
| `Main.java`         | Starts the application and handles the console menu     |
| `Event.java`        | Represents event information                            |
| `Registration.java` | Represents student registration information             |
| `EventService.java` | Contains the main event and registration business logic |
| `README.md`         | Project documentation                                   |
| `statement.md`      | Detailed project statement                              |
| `report.md`         | Complete project report                                 |

---

### 5. Dependencies

**No external dependencies are required.**

The project uses Java's standard functionality, including:

* Core Java
* Object-Oriented Programming
* `ArrayList`
* Console input/output

There is no requirement to install Maven, Gradle, third-party libraries, or external packages.

---

### 6. Configuration

**No additional configuration is required.**

The current version does not require:

* Database configuration
* API keys
* Environment variables
* External services
* Configuration files
* Internet connection during execution

The application stores event and registration records in memory using Java `ArrayList` collections.

> **Important:** Because the current version uses in-memory storage, records are available only while the application is running. Data is not permanently saved after the program is closed.

---

### 7. Compile the Project

Open a terminal inside the project directory.

Navigate to the `src` folder:

```bash
cd src
```

Compile all Java source files:

```bash
javac *.java
```

If the compilation is successful, Java `.class` files will be generated for the source files.

---

### 8. Run the Application

After successful compilation, run:

```bash
java Main
```

The application will start and display the main menu in the terminal.

The user can then select the required operation from the available menu options.

---

## 🖥️ Using the Application

After starting the program, follow the menu displayed on the screen.

The main operations include:

### Add Event

Enter the requested event information, such as:

* Event ID
* Event title
* Event date
* Event venue

The system validates the entered information and stores the event.

### View Events

Select the event-viewing option to display the events currently stored in the application.

### Register Student

Enter:

* Student name
* Event ID

The system checks whether the event exists and whether it is active before creating the registration.

### Cancel Event

Enter the event ID of the event that needs to be cancelled.

The system updates the event status and prevents further registration for the cancelled event.

### Exit

Select the exit option to terminate the application.

---

## 🔍 Example Execution

A typical execution flow is:

```text
Start Application
       ↓
Display Main Menu
       ↓
Select "Add Event"
       ↓
Enter Event Details
       ↓
Validate Input
       ↓
Event Created
       ↓
Return to Main Menu
       ↓
Select "Register Student"
       ↓
Enter Student Details
       ↓
Validate Event
       ↓
Registration Confirmed
       ↓
Return to Main Menu
       ↓
Exit
```

---

## 🛠️ Running Through an IDE

The project can also be run using a Java IDE such as IntelliJ IDEA, Eclipse, NetBeans, or VS Code.

### General IDE Steps

1. Open the project folder in the IDE.
2. Make sure the IDE detects a valid JDK.
3. Open the `src` folder.
4. Locate `Main.java`.
5. Compile/build the project.
6. Run the `main()` method in `Main.java`.
7. Use the console to interact with the application.

No additional framework or dependency configuration is required.

---

## ❗ Troubleshooting

### `java: command not found`

Java is either not installed or its executable is not available through the system `PATH`.

Verify the installation using:

```bash
java -version
```

### `javac: command not found`

The Java Runtime Environment may be installed without the complete JDK, or the JDK path may not be configured correctly.

Install/configure a JDK and verify:

```bash
javac -version
```

### `Could not find or load main class Main`

Make sure that:

1. You are inside the `src` directory.
2. The project has been compiled successfully.
3. `Main.class` exists.
4. You are running:

```bash
java Main
```

### Compilation Errors

Make sure all Java files are present inside the `src` directory:

```text
Main.java
Event.java
Registration.java
EventService.java
```

Then compile them together:

```bash
javac *.java
```

---

## 📌 Important Note About Data

The current version uses in-memory `ArrayList` storage. Therefore, events and registrations are not persisted after the application is closed.

For a future version, persistent storage can be implemented using a database such as SQLite or MySQL.


## 📚 Java Concepts Demonstrated

This project demonstrates several important Java programming concepts:

* Classes and Objects
* Constructors
* Encapsulation
* Methods
* ArrayList collections
* Loops
* Conditional statements
* User input using console I/O
* Input validation
* Modular programming
* Separation of responsibilities
* Basic service-oriented application structure

---

## ⚠️ Current Limitations

The current version is intentionally designed as a small console-based application. Some limitations are:

* Data is stored only in memory.
* There is no graphical user interface.
* There is no database integration.
* There is no login or authentication system.
* There are no separate administrator and student accounts.
* Event capacity management is not currently implemented.
* Automated unit testing is not included in the current version.

---

## 🚀 Future Enhancements

The project can be extended in several ways:

1. **Database Integration**
   Store events and registrations permanently using MySQL or SQLite.

2. **Graphical User Interface**
   Develop a GUI using JavaFX or Swing.

3. **User Authentication**
   Add login functionality with separate roles for students and event coordinators.

4. **Event Capacity**
   Set a maximum number of participants for each event.

5. **Search and Filtering**
   Allow users to search events by title, date, venue, or status.

6. **Notifications**
   Provide reminders and notifications for upcoming events.

7. **Automated Testing**
   Add unit tests to verify individual application components.

---

## 📖 Learning Outcomes

Through this project, the following concepts were practically implemented:

* Designing Java classes and objects.
* Applying encapsulation and modular programming.
* Using Java collections for storing records.
* Handling user input and validation.
* Separating business logic from user-interface code.
* Designing a basic multi-layer application.
* Testing different input scenarios.
* Documenting and maintaining a software project.

---

## 📄 Project Documentation

Additional documentation is available in this repository:

* `statement.md` — Detailed project statement.
* `report.md` — Complete project report.
* `README.md` — Project overview and setup instructions.

---

## 📚 References

1. Oracle Java Documentation — Java programming and API concepts.
2. VITyarthi Build Your Own Project — Project instructions and submission guidelines.
3. Java Programming course concepts and laboratory exercises.

---

## 📌 Project Status

**Status:** Completed — Academic Project

The current version provides the core functionality required for basic college event and registration management and can be further extended into a database-backed application.

---

## 👨‍💻 Author

**Aditya Choudhary**
B.Tech Computer Science and Engineering
Registration Number: **25BCE11161**
