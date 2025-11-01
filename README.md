# Plant Management System

A comprehensive JavaFX-based desktop application for agricultural management, developed as part of a Java sessional project during second year.

## 🌱 Project Overview

This plant management system provides farmers and agricultural enthusiasts with tools for crop disease identification, inventory management, crop planning, and agricultural guidance. The application features an intuitive GUI built with JavaFX and FXML.

## 🛠️ Technology Stack

- **Programming Language**: Java
- **GUI Framework**: JavaFX 21
- **UI Design**: FXML
- **Build Tool**: Maven
- **Testing**: JUnit 5
- **Data Storage**: CSV files

## ✨ Key Features

### 1. Disease Identification System
- **Crop Disease Detection**: Identify diseases in Rice, Jute, Wheat, and Maize
- **Visual Disease Guide**: Images and symptoms for various plant diseases
- **Disease Information**: Detailed descriptions of bacterial blight, leaf streak, stem rot, and more

### 2. Inventory Management
- **Stock Tracking**: Add and manage agricultural inventory items
- **Expiration Monitoring**: Track expiration dates for stored items
- **Report Generation**: Generate inventory reports with date tracking
- **CSV Data Storage**: Persistent data storage using CSV files

### 3. Crop Planning & Guidance
- **Seasonal Planning**: Season and soil-based crop recommendations
- **Intercropping Suggestions**: Get intercropping recommendations based on conditions
- **Cultivation Guides**: Detailed growing instructions for various crops (carrot, corn, rice, wheat, etc.)
- **Video Resources**: Educational video content for crop management

### 4. Help & Support System
- **User Assistance**: Built-in help and support functionality
- **Agricultural Information**: Comprehensive crop cultivation guides

## 📁 Project Structure

```
src/main/java/com/example/demo4/
├── Start.java                    # Main application entry point
├── functions.java                # Main navigation controller
├── ArifJavaClass/               # Inventory & Support modules
│   ├── InventController.java    # Inventory management
│   ├── ReportController.java    # Report generation
│   └── HelpAndSupportController.java
├── MoonJAVAClass/              # Disease identification modules
│   ├── DiseasesController.java  # Disease selection
│   ├── SelectDiseasesController.java
│   └── webpage.java            # Web content display
└── ZishanJavaClass/            # Crop planning modules
    ├── cropPlanningController.java
    ├── IntercroppingController.java
    └── VideoController.java
```

## 🚀 How to Run

1. **Prerequisites**: Ensure Java 11+ and Maven are installed
2. **Clone the repository**
3. **Navigate to project directory**
4. **Run the application**:
   ```bash
   mvn javafx:run
   ```
   Or compile and run:
   ```bash
   mvn clean compile
   java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -cp target/classes com.example.demo4.Start
   ```

## 📊 Data Sources

The application uses various CSV and text files containing:
- **Disease Information**: Symptoms and identification guides for crop diseases
- **Crop Cultivation Data**: Growing guides for different crops
- **Inventory Records**: User inventory data stored in CSV format

## 👥 Development Team

This project was developed collaboratively with contributions from multiple team members:
- **Arif**: Inventory management and support system
- **Moon**: Disease identification system
- **Zishan**: Crop planning and educational content

## 📝 Academic Context

This project was developed as part of a Java programming sessional course during the second year of study, demonstrating practical application of:
- Object-Oriented Programming concepts
- JavaFX GUI development
- File I/O operations
- MVC architecture pattern
- Team collaboration and project management

---

*This project serves as a learning exercise in desktop application development and agricultural technology.*