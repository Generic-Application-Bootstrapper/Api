# First Time Setup Locally

Run:

```
    git submodule update --init --recursive
    git submodule update --init --recursive
```

to get the schema submodules and any others that may exist then do

```
    mvn compile
```

to create target files such as the application jar.

#To Run the API

```
    mvn spring-boot:run
```

will start spring-boot. There are three options for starting the application each should be identical and should be undated to only have one. Within an IDE such as Intellij or Eclipse: `com.entry.Application.java`, `org.openapitools.OpenApiGeneratorApplication.java`, and `org.openapitools.OpenAPI2SpringBoot.java` all function as main functions to start the application.

See the DockerFile to what the docker virtual environment uses, though the virtual environment shouldn't be necessary.

# OpenAPI generated server

Spring Boot Server

## Overview

This server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://openapis.org), you can easily generate a server stub.
This is an example of building a OpenAPI-enabled server in Java using the SpringBoot framework.

The underlying library integrating OpenAPI to SpringBoot is [springfox](https://github.com/springfox/springfox)

Start your server as an simple java application

You can view the api documentation in swagger-ui by pointing to
http://localhost:8080/

Change default port value in application.properties
