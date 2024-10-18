# Blood Bank Management System

A simple Blood Bank Management System built with Spring Boot and Aiven MySQL to manage donor registrations and blood inventory.

## Features

- **Donor Management**: Register and manage donor information.
- **Blood Inventory Management**: Track blood types and quantities available.
- **CRUD Operations**: Create, Read, Update, and Delete records for both donors and blood inventory.

## Technologies Used

- **Backend**: Spring Boot
- **Database**: Aiven MySQL
- **Build Tool**: Maven

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/blood-bank-management.git
Navigate to the project directory:

bash
Copy code
cd blood-bank-management
Set up the database connection in application.properties:

properties
Copy code
spring.datasource.url=mysql://<username>:<password>@<hostname>:<port>/<database>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Run the application:

bash
Copy code
mvn spring-boot:run
API Endpoints
Donor Management
Create Donor: POST /api/donors
Get All Donors: GET /api/donors
Get Donor by ID: GET /api/donors/{id}
Update Donor: PUT /api/donors/{id}
Delete Donor: DELETE /api/donors/{id}
Blood Inventory Management
Create Blood Inventory: POST /api/bloodinventory
Get All Blood Inventory: GET /api/bloodinventory
Get Blood Inventory by Blood Type: GET /api/bloodinventory/bloodType/{bloodType}
Update Blood Inventory: PUT /api/bloodinventory/{id}
Delete Blood Inventory: DELETE /api/bloodinventory/{id}
