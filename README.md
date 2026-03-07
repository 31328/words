# Spoken Numbers

# Spoken Numbers Generator

A Spring Boot REST service that generates binary numbers or random numeric sequences and can export them into an Excel sheet.

## Overview

The application exposes HTTP endpoints that allow clients to:

- Generate binary numbers with a specified number of digits
- Generate random numeric sequences with a specified number of digits
- Export generated numbers into an Excel spreadsheet

The service is designed as a simple backend utility that demonstrates REST API design, service abstraction, and file generation using Apache POI.

## Technology Stack

- Java
- Spring Boot
- Spring Web
- Apache POI
- Maven

## Application Structure

The project follows a layered architecture:

- **Controller layer** – Handles HTTP requests and responses
- **Service layer** – Contains the business logic for number generation
- **Application entry point** – Bootstraps the Spring Boot application

## API Endpoints

### Generate Binary Numbers

Generates binary numbers with a specific number of digits.

GET /api/generatenumbers/binarydigits/{digits}/{count}


Parameters:

- `digits` – number of digits in each binary number
- `count` – number of binary numbers to generate

Example:


GET /api/generatenumbers/binarydigits/8/10


Response:


[
"01011010",
"11100001",
"00110101"
]


---

## Generate Random Numbers

Generates random numeric sequences.


GET /api/generatenumbers/randomnumbers/{digits}/{count}


Parameters:

- `digits` – number of digits in each number
- `count` – number of sequences to generate

Example:


GET /api/generatenumbers/randomnumbers/6/5


Response:


[
"482901",
"105772",
"938204"
]


---

## Generate Excel Sheet

Creates an Excel file containing the provided binary numbers.


POST /api/generatenumbers/generatebinarysheet


Request body:


[
"101010",
"111000",
"010101"
]


Response:

- Returns a downloadable Excel file (`binarysheet.xlsx`)
- Each digit is stored in a separate cell

## Running the Application

Build the project:


mvn clean install


Run the application:


mvn spring-boot:run


The service will start on:


http://localhost:8080


## Example Workflow

1. Generate binary numbers using the API.
2. Send the generated numbers to the Excel generation endpoint.
3. Download the generated spreadsheet.

## Notes

- Input validation ensures non-positive digit or count values return empty results.
- Excel generation uses Apache POI with automatic resource management via try-with-resources.
