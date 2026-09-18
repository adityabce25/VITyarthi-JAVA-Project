# Project Statement

## Campus Event Manager

### Java-Based College Event and Registration Management System

---

## 1. Project Overview

**Campus Event Manager** is a console-based Java application developed to provide a simple and organized method for managing college events and student registrations.

In many college clubs and departments, event information is maintained through messages, spreadsheets, or manually managed lists. Such methods can become difficult to manage when the number of events and participants increases.

This project provides a structured application where event coordinators can create and view events, students can register for active events, and existing events can be cancelled. The system also validates user input to reduce invalid operations.

---

## 2. Problem Statement

College events are frequently organized by clubs, departments, and student committees. The information related to these events may be distributed across different communication platforms or stored manually.

This can result in:

* Difficulty maintaining updated event information.
* Duplicate or incorrect registrations.
* Difficulty tracking cancelled events.
* Increased manual work for event coordinators.
* Difficulty maintaining student registration records.
* Lack of a centralized record for event information.

Therefore, a lightweight digital system is required to organize event and registration information in one place.

---

## 3. Proposed Solution

The proposed solution is the **Campus Event Manager**, a Java-based console application that provides basic event and registration management functionality.

The application maintains event and registration records using Java objects and `ArrayList` collections.

The system provides four main operations:

1. Creating an event.
2. Viewing event records.
3. Registering a student for an event.
4. Cancelling an existing event.

Input validation is included to prevent common invalid operations such as entering incorrect IDs, blank information, or attempting to register for a cancelled event.

---

## 4. Objectives

The main objectives of the project are:

* To develop a simple college event management application using Java.
* To maintain event records in a structured format.
* To allow students to register for active events.
* To provide event cancellation functionality.
* To validate user input.
* To prevent invalid registration operations.
* To demonstrate Object-Oriented Programming concepts.
* To separate user interaction from business logic.
* To develop a project that can be extended in the future.

---

## 5. Target Users

The system is intended for small-scale college event management.

Potential users include:

### Students

Students can view available events and register for events using their details.

### Event Coordinators

Coordinators can create events, view event information, and cancel events when required.

### College Clubs and Departments

Small college clubs or departments can use the application as a basic centralized event record system.

---

## 6. Scope of the Project

The current project focuses on the core operations required for small college events.

### Included in the Current Version

* Event creation.
* Event viewing.
* Student registration.
* Event cancellation.
* Input validation.
* Event status management.
* In-memory record storage.
* Console-based user interaction.

### Outside the Current Scope

The current version does not include:

* Permanent database storage.
* Online registration.
* GUI.
* User authentication.
* Email/SMS notifications.
* Advanced analytics.

These features can be considered for future development.

---

## 7. Functional Requirements

### FR1 — Create Event

The system should allow the user to create an event by entering an event ID, title, date, and venue.

### FR2 — View Events

The system should display the available event records to the user.

### FR3 — Register Student

The system should allow a student to register for an active event by providing the student's name and event ID.

### FR4 — Cancel Event

The system should allow an existing event to be cancelled using its event ID.

### FR5 — Validate Input

The system should identify invalid input and display an appropriate message instead of allowing the operation to proceed incorrectly.

### FR6 — Validate Event ID

The system should check whether the entered event ID exists before performing registration or cancellation operations.

### FR7 — Prevent Registration for Cancelled Events

The system should reject registration attempts when the selected event has already been cancelled.

---

## 8. Non-Functional Requirements

### Usability

The application uses a menu-driven console interface with clear prompts so that users can understand the available operations.

### Reliability

Input validation is used for blank values, invalid numbers, unknown IDs, and cancelled events.

### Maintainability

The project separates model classes, business logic, and user interaction into different files.

### Performance

Java `ArrayList` collections are sufficient for the small datasets expected in a college event management application.

### Error Handling

Invalid input should result in a suitable message and return the user to the appropriate workflow rather than terminating the application unexpectedly.

---

## 9. Technology Requirements

The project uses:

* **Java** — Application development.
* **Object-Oriented Programming** — Software design.
* **ArrayList** — In-memory data storage.
* **Console I/O** — User interaction.
* **Git/GitHub** — Version control and project hosting.

---

## 10. System Architecture

The application follows a simple three-layer architecture.

### Presentation Layer

`Main.java`

This layer manages the menu, user input, and output.

### Service Layer

`EventService.java`

This layer contains the application's main business logic, including adding events, registering students, and cancelling events.

### Model Layer

`Event.java` and `Registration.java`

These classes represent the application's main data entities.

```text
User
  |
  v
Main.java
  |
  v
EventService.java
  |
  +------------------+
  |                  |
  v                  v
Event.java      Registration.java
```

This structure separates responsibilities and makes the project easier to understand and maintain.

---

## 11. Data Design

### Event

The `Event` model represents an individual college event.

Important attributes include:

* Event ID
* Title
* Date
* Venue
* Status

### Registration

The `Registration` model represents a student's registration.

Important attributes include:

* Registration ID
* Student Name
* Event ID

The current version stores these objects in memory using Java collections.

---

## 12. Working of the System

The application begins by displaying a menu to the user.

The user selects an operation such as adding an event, viewing events, registering a student, or cancelling an event.

The input is then validated.

If the input is valid, `Main.java` passes the required information to `EventService.java`. The service layer performs the required operation using the model objects.

After completing the operation, the result is displayed to the user and the application returns to the main menu.

The process continues until the user selects the exit option.

---

## 13. Input Validation

Validation is an important part of the project because it prevents incorrect operations.

Examples of validation include:

* Checking for blank event titles.
* Checking for blank dates.
* Checking numerical input.
* Checking whether an event ID exists.
* Checking whether an event has been cancelled.
* Preventing registration for unavailable events.

This improves the reliability and usability of the application.

---

## 14. Storage Approach

The current project uses **in-memory storage** through Java `ArrayList` collections.

This approach is appropriate for demonstrating the core Java implementation and keeping the application lightweight.

However, the records exist only while the program is running. When the application is closed, the stored information is lost.

A future implementation can introduce **SQLite or MySQL** to provide permanent storage.

---

## 15. Testing

The application was tested using both valid and invalid scenarios.

| Test Scenario                | Expected Result           | Status |
| ---------------------------- | ------------------------- | ------ |
| Add a valid event            | Event should be stored    | Pass   |
| Enter blank event title/date | Validation message        | Pass   |
| Enter invalid menu option    | Error handled             | Pass   |
| Register valid student       | Registration confirmation | Pass   |
| Enter unknown event ID       | Registration rejected     | Pass   |
| Register for cancelled event | Registration rejected     | Pass   |
| View event records           | Correct records displayed | Pass   |

The testing confirms that the main application workflows and validation conditions function as expected.

---

## 16. Challenges Faced

During development, the main challenges included:

### Input Validation

Different types of invalid input had to be handled without causing the application to terminate unexpectedly.

### Menu Management

The console interface needed to remain simple while providing multiple operations.

### Separation of Responsibilities

The project needed to keep user interaction separate from business logic. This was addressed by using a dedicated `EventService` class.

### Record Management

Events and registrations needed to be stored and accessed efficiently during program execution.

---

## 17. Learning Outcomes

The project helped strengthen practical understanding of:

* Java classes and objects.
* Constructors.
* Encapsulation.
* ArrayList collections.
* Conditional statements.
* Loops.
* Console input/output.
* Input validation.
* Modular programming.
* Basic software architecture.
* Software testing.
* Project documentation.
* Git and GitHub project organization.

---

## 18. Limitations

The current implementation has several limitations:

1. Data is not permanently stored.
2. The application is console-based.
3. There is no authentication system.
4. There are no separate user roles.
5. Event capacity is not currently managed.
6. There are no automated notifications.
7. Automated unit testing is not included.
8. The application is primarily designed for small-scale datasets.

These limitations provide opportunities for future development.

---

## 19. Future Enhancements

The following improvements can be added in future versions:

### Database Integration

Events and registrations can be stored permanently using MySQL or SQLite.

### Login System

A login system can provide separate access for students and event coordinators.

### Role-Based Access

Different users can receive different permissions based on their roles.

### Graphical Interface

A GUI can make the system easier to use than the current console interface.

### Event Capacity

A maximum participant limit can be assigned to each event.

### Search Functionality

Users can search and filter events based on title, date, venue, or status.

### Notification System

The system can provide reminders about upcoming events and registration status.

### Automated Testing

JUnit or another testing framework can be added for systematic testing of individual components.

---

## 20. Expected Outcome

The expected outcome of the project is a simple and functional Java application that demonstrates how Object-Oriented Programming can be used to solve a practical college-management problem.

The application provides a structured approach to event creation, event viewing, student registration, cancellation, and validation.

The project also provides a foundation for developing a more advanced event management system with database storage, authentication, graphical interfaces, and notification features.

---

## 21. Conclusion

The **Campus Event Manager** demonstrates the practical application of Java programming concepts in a real-world college scenario.

By combining Java classes, objects, encapsulation, collections, validation, and modular design, the project provides a simple solution for managing college events and registrations.

Although the current implementation is limited to console interaction and in-memory storage, its modular structure allows the system to be extended with databases, authentication, GUI support, notifications, and automated testing in future versions.

Overall, the project provides practical experience in Java programming, Object-Oriented Design, software organization, testing, and project documentation.

---

## 22. Author

**Aditya Choudhary**
**Registration Number:** 25BCE11161
**B.Tech Computer Science and Engineering**
**Java Programming Project — Academic Year 2026**
