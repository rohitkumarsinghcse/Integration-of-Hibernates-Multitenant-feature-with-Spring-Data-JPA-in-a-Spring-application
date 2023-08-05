# Integration-of-Hibernates-Multitenant-feature-with-Spring-Data-JPA-in-a-Spring-application
The Java Persistence API provides Java developers with an api for mapping java objects to relational data.The JPA API, JPQL (Java Persistence query language), Java Persistence Criteria API and how you can perform ORM (Object Relational Mapping) with JPA.
         ![images](https://github.com/rohitkumarsinghcse/Integration-of-Hibernates-Multitenant-feature-with-Spring-Data-JPA-in-a-Spring-application/assets/91533334/328b07dd-5a89-4591-95bb-573523e08065)


# Introduction
Hibernate is the most popular implementation of JPA. It was the most popular ORM framework option before JPA emerged and it provides additional features on top of JPA. We will use Hibernate as the implementation in this course.
The java persistence API provides a specification for persisting, reading, and managing data from your java object to your relational tables in the database. JPA specifies the set of rules and guidelines for developing interfaces that follow standards. Straight to the point: JPA is just guidelines to implement ORM and there is no underlying code for the implementation. Spring Data JPA is part of the spring framework. The goal of spring data repository abstraction is to significantly reduce the amount of boilerplate code required to implement a data access layer for various persistence stores. Spring Data JPA is not a JPA provider, it is a library/framework that adds an extra layer of abstraction on the top of our JPA provider line Hibernate. 

# Modal layer:

Create a simple POJO(Plain old java class) with some JPA annotation.  

@Entity: This annotation defines that a class can be mapped to a table
@Id: This annotation specifies the primary key of the entity.
@Table: This annotation is used to specify the table generation .

DAO(Data access object) layer:

@Repository: The @Repository annotation is a marker for any class that fulfills the role or stereotype of a repository (also known as Data Access Object or DAO).
JpaRepository<Amazon_Orders, Integer> JpaRepository is a JPA-specific extension of the Repository. It contains the full API of CrudRepository and PagingAndSortingRepository. So it contains API for basic CRUD operations and also API for pagination and sorting. Here we enable database operations for Employees.


 Service Class: This  classes that provide some business functionalities. Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used. Here JPA repository has lots of predefined generic methods to perform the database operation some are used in the below code.


Controller layer:
@Autowired: This annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property, or methods with arbitrary names and/or multiple arguments.


![OIP](https://github.com/rohitkumarsinghcse/Integration-of-Hibernates-Multitenant-feature-with-Spring-Data-JPA-in-a-Spring-application/assets/91533334/a29d9a4e-6170-479c-9e11-84df324150d4)


# Spring JPA Configuration:  
For using Spring Data, first of all we have to configure DataSource bean. Then we need to configure LocalContainerEntityManagerFactoryBean bean. 
The next step is to configure bean for transaction management. In our example it’s JpaTransactionManager. 
@EnableTransactionManagement: This annotation allows users to use transaction management in application.
@EnableJpaRepositories("flipkart.*"): indicates where the repositories classes are present.

Configuring the DataSource Bean:
Configure the database connection. We need to set the name of the the JDBC url, the username of database user, and the password of the database user.
Configuring the Entity Manager Factory Bean:
We can configure the entity manager factory bean by following steps:

Create a new LocalContainerEntityManagerFactoryBean object. We need to create this object because it creates the JPA EntityManagerFactory.
Configure the Created DataSource in Previous Step.
Configure the Hibernate specific implementation of the HibernateJpaVendorAdapter . It will initialize our configuration with the default settings that are compatible with Hibernate.
Configure the packages that are scanned for entity classes.
Configure the JPA/Hibernate properties that are used to provide additional configuration to the used JPA provider.

Configuring the Transaction Manager Bean:

Because we are using JPA, we have to create a transaction manager bean that integrates the JPA provider with the Spring transaction mechanism. We can do this by using the JpaTransactionManager class as the transaction manager of our application.

We can configure the transaction manager bean by following steps:

Create a new JpaTransactionManager object.
Configure the entity manager factory whose transactions are managed by the created JpaTransactionManager object.

# Snapshot
 ![Select](https://github.com/rohitkumarsinghcse/Integration-of-Hibernates-Multitenant-feature-with-Spring-Data-JPA-in-a-Spring-application/assets/91533334/77a73fcd-7289-4c71-af80-6c4d93f3437d)

 
![Home](https://github.com/rohitkumarsinghcse/Integration-of-Hibernates-Multitenant-feature-with-Spring-Data-JPA-in-a-Spring-application/assets/91533334/46187601-7ed6-41d0-a7d7-91106ae28c20)


![Details](https://github.com/rohitkumarsinghcse/Integration-of-Hibernates-Multitenant-feature-with-Spring-Data-JPA-in-a-Spring-application/assets/91533334/26e79978-2b2b-4566-92bd-f5bd00b89b4c)

