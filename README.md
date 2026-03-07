# Words Generator API

## Overview

Words Generator is a Spring Boot REST API that generates random sequences of letters from multiple alphabets and languages.  
The service can produce randomized character strings using Latin, Greek, and Cyrillic alphabets commonly used across different countries.

The API is designed as a simple backend service demonstrating REST architecture, service-layer abstraction, and random data generation.

## Technology Stack

- Java
- Spring Boot
- Spring Web
- Maven

## Project Structure

The application follows a layered architecture.


com.words.spring
├── WordsApp # Spring Boot entry point
├── controllers
│ └── LetterController # REST API endpoints
├── services
│ └── LetterService # Service interface
└── services.impl
└── LetterServiceImpl # Business logic implementation


## Features

- Random letter generation
- Support for multiple alphabets
- RESTful API endpoints
- Stateless service design
- Simple extensible architecture for adding new languages

## Supported Languages / Alphabets

The service currently supports random letter generation for:

- Greek
- English
- German
- Italian
- Swedish
- Albanian
- Mongolian
- Polish
- French
- Spanish
- Bulgarian
- Serbian (Cyrillic)
- Serbian (Latin)
- Russian

## Running the Application

Requirements:

- Java 17 or newer
- Maven

Run the application:


mvn spring-boot:run


Default server:


http://localhost:8080


## API Endpoints

Base path:


/api/letters


Generate random letters using a specified alphabet and count.

### Greek


GET /api/letters/generaterandommg/{count}


Example:


http://localhost:8080/api/letters/generaterandommg/10


### English


GET /api/letters/generaterandomen/{count}


### German


GET /api/letters/generaterandomger/{count}


### Italian


GET /api/letters/generaterandomit/{count}


### Swedish


GET /api/letters/generaterandomsw/{count}


### Albanian


GET /api/letters/generaterandomal/{count}


### Mongolian


GET /api/letters/generaterandommon/{count}


### Polish


GET /api/letters/generaterandompol/{count}


### French


GET /api/letters/generaterandomfr/{count}


### Spanish


GET /api/letters/generaterandomsp/{count}


### Bulgarian


GET /api/letters/generaterandombg/{count}


### Serbian Cyrillic


GET /api/letters/generaterandomsercy/{count}


### Serbian Latin


GET /api/letters/generaterandomserlat/{count}


### Russian


GET /api/letters/generaterandomru/{count}


## Example Response


ΔβΩφΑήπΣγτ


The response is a string containing randomly selected characters from the requested alphabet.

## Future Improvements

- Input validation
- Rate limiting
- Database storage of generated sequences
- Swagger/OpenAPI documentation
- Unit and integration tests
- Configurable alphabets
- CSV or Excel export functionality

## License

This project is open source and available for educational and development purposes.