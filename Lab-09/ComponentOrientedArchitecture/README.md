# Component Oriented Library Application

## Overview
This is a simple component-oriented Java application for managing a library of books. It demonstrates separation of concerns using interfaces and components for storage, logging, and business logic.

## Architecture
- **MainApp**: Entry point, handles user interaction.
- **LibraryComponent**: Implements business logic, depends on `Storage` and `Logger` interfaces.
- **LibraryService**: Interface for library operations.
- **LibraryStorage**: Implements `Storage`, manages book persistence.
- **Storage**: Interface for storage operations.
- **Book**: Data model for books.
- **Logger**: Interface for logging.
- **ConsoleLogger**: Implements `Logger`, logs to the console.

## How to Compile
Open a terminal in the project root and run:
```sh
javac ComponentOrientedArchitecture/src/*.java -d ComponentOrientedArchitecture/bin
```

## How to Run
You can run the application using the provided batch file:
```sh
cd ComponentOrientedArchitecture
run-app.bat
```
Or manually:
```sh
java -cp ComponentOrientedArchitecture/bin MainApp
```

## Usage
- Add, delete, and list books via the console menu.
- All actions are logged to the console.

---
Feel free to extend the application with more features or different storage/logging implementations!
