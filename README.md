
# Java Task List Application

A simple, menu-driven Task List Application developed using Java. It allows users to create, view, and remove tasks through a command-line interface.

## Overview

The Java Task List Application helps users manage everyday tasks using a simple and interactive menu. It demonstrates core Java programming concepts, including object-oriented programming, collections, methods, loops, conditional statements, and user input handling.

## Features

- **Add Tasks:** Add new tasks to your list.
- **View Tasks:** Display all tasks with numbered entries.
- **Remove Tasks:** Remove a task by selecting its number.
- **Input Validation:** Handle invalid numeric inputs and task numbers.
- **Interactive Menu:** Navigate through the application using a simple menu.
- **Task Name Validation:** Prevent empty task names from being added.

## Technologies Used

- Java
- Java Collections Framework (`ArrayList`)
- Java Scanner Class
- Visual Studio Code
- Git and GitHub

## Project Structure

```text
TaskListApplication/
├── TaskListApp.java
├── README.md
└── 
```

## Prerequisites

- Java Development Kit (JDK)
- Visual Studio Code or another Java-compatible editor
- Git (optional, for version control)

## Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/paavanijillella-source/java-task-list-app.git
```

### 2. Navigate to the Project Directory

```bash
cd java-task-list-app
```

### 3. Compile the Java Program

```bash
javac TaskListApp.java
```

### 4. Run the Application

```bash
java TaskListApp
```

## Usage

After launching the program, select an option from the menu:

```text
Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option:
```

 
## Sample Output

```text
Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option: 1
Enter task name: Complete Java project
Task added successfully.

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option: 1
Enter task name: Practice coding
Task added successfully.

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option: 1
Enter task name: Read a book
Task added successfully.

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option: 3
1. Complete Java project
2. Practice coding
3. Read a book

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option: 2
1. Complete Java project
2. Practice coding
3. Read a book
Enter the task number to remove: 2
Task removed successfully.

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option: 3
1. Complete Java project
2. Read a book

Task List Application
1. Add Task
2. Remove Task
3. List Tasks
4. Quit
Select an option: 4
Exiting Task List Application.
```


## Concepts Demonstrated

- Classes and objects
- Encapsulation through class-based task management
- ArrayList for dynamic data storage
- Methods and modular programming
- Loops and switch statements
- Exception handling and input validation
- Basic command-line application development



## Author

**Pavani Jillella**

GitHub: https://github.com/pavanijillella-source

---

If you find this project useful, consider giving the repository a star!
