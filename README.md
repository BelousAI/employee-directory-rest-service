Spring Boot REST Web Service: Employee-Directory-REST-service
====================================================================

Используемые технологии / инструменты / фреймворки:\
Spring Boot REST/ JPA(Hibernate)/ MySQL/ Maven

**Проект развернут на Heroku:** [https://rest-employee-directory.herokuapp.com](https://rest-employee-directory.herokuapp.com/)

### REST API:
| **HTTP Method**    |   | **CRUD Action** |
|:-------------  |:---------------| :-------------|
| POST           | /api/employees               | Create a new employee       |
| GET            | /api/employees               | Read a list from employees  |
| GET            | /api/employees/{employeeId}  | Read a single employee      |
| PUT            | /api/employees               | Update an existing employee |
| DELETE         | /api/employees/{employeeId}  | Delete an existing employee |

### Другие проекты:
- [Web App: Spring 5 (MVC, AOP) + JSP + Spring Security + Hibernate API](https://github.com/BelousAI/spring-web-crm-demo)
- [Web App: Spring Boot 2 + Thymeleaf + Spring Security + Spring Data JPA](https://github.com/BelousAI/spring-boot-web-employee-directory)
- [RESTful service: Regular Spring REST + native Hibernate API](https://github.com/BelousAI/crm-rest-service)