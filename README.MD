# Job Board

An API development in Java and Spring Boot of a job board that allows
companies to post job opportunities and users apply to them and track their
application progress.

# Functionalities

- 🔴 = TODO
- 🟠 = DOING
- 🟢 = DONE

| Functionality                                                      | Status |
|--------------------------------------------------------------------|--------|
| User registration and authentication (candidate and company roles) | 🟠     |
| Jobs publishing                                                    | 🔴     |
| Jobs application                                                   | 🔴     |
| Resume upload                                                      | 🔴     |
| Candidate matching                                                 | 🔴     |
| Email notifications                                                | 🔴     |
| Realtime chat                                                      | 🔴     |

# Stack
 - Java 17
 - Spring Boot 4

# Architecture

The project follows the layer architecture to isolate responsibilities
and for easier testing. This architecture also establishes a dependency
pipeline as shown bellow:

`Controller -> Service -> Repository -> Database`

# Execution instructions

1. Clone project
2. inside of project folder execute `./gradlew build` to build the project
3. Then execute `./gradlew bootRun` to run

# Configuration Variables

# Project Status

The project is in the first stages of development, bellow is the progress checklist:

- [X] Project setup and Hello World
- [X] REST API CRUD endpoints
- [ ] Database & JPA
- [ ] Validation & Error Handling
- [ ] Authentication - Spring Security
- [ ] Authorization and Roles
- [ ] Advanced Relationships and Quering
- [ ] Service Layer & Business Logic
- [ ] File Upload & Storage
- [ ] Email & notifications
- [ ] Caching
- [ ] API documentation
- [ ] Testing
- [ ] Queues and Asynch processing
- [ ] Websockets - Realtime
- [ ] Search - Elasticsearch
- [ ] Performance optimization
- [ ] Monitoring and Observability
- [ ] CI/CD & deployment
- [ ] Security hardening

# Contributing

This is a personal project for learning purposes, feedback is wellcome so open an issue
and submit a PR.

# License

All rights reserved to Rafael Marcos.