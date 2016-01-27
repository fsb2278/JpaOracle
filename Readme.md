# Simple example of Spring Data JPA with Oracle

1. Create a new Spring Starter Project with JPA in STS
2. Add 
        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc7</artifactId>
            <version>12.1.0.1</version>
        </dependency>
  to pom.xml
3. Add the Database Connection to the Database Source Explorer in STS
4. In the Project Properties add Java and JPA in the Project Facet
5. Add the 3 Packages config, model and repository
6. Add JpaConfiguration.java to the config Package 
7. In the JPA Tools use Generate Entities from Tables and select the tables
8. Move the generated File to the model package
9. Create a Repository.java file in the repository package
10. Configurate the db settings in application.properties
11. Update the junit Test file to test the connection

