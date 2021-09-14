# EXPENSE CONTROL APPLICATION

A clean architecture study application with Java. Track daily expenses with this application.

## Build
Run this command on terminal to build the modules\
```mvn clean install```

## Presenters
The following presenters are available right now:
* **Spring-boot**
* **[DEMO](https://youtu.be/j2kKUWAF_g4)**
* Follow the steps:\
```cd application/spring-boot```\
```mvn spring-boot:run```

Use the following json for structure for requests:
```
    {
    "exp_price": 120.78,
    "exp_description": "any_postman_description",
    "exp_category": "Food",
    "exp_date": "2021-09-13"
    }
 ```

* **Command-line-app**
* * **[DEMO](https://youtu.be/X9R92eKtsak)**
* Follow the steps:\
```mvn exec:java -Dexec.mainClass="com.expensecontrol.appclean.Main" -Dexec.args=<ARGS>```\
* Example with args:\
```mvn exec:java -Dexec.mainClass="com.expensecontrol.appclean.Main" -Dexec.args="99.70 any_description Food 2021-09-13"```\


## Technologies
* Java11
* Maven
* Lombok
* Junit
* Mockito
* h2 database
* Jackson
* Spring-boot
* Spring-jdbc

## Next steps
* Fix unit tests runner from parent app
* Add database support
