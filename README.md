# Spring Boot ESI Docker Example

This setup is divided in two applications, each with a separated frontend and backend container. 
Both applications are accessible via a central entry point represented by a Varnish Cache.
Varnish is configured to process edge side includes (ESI) so that both applications can define pages which include components from each other.

## Run it
Just run Docker Compose to build and start the containers.
```
docker-compose up --build
```

## Test it
Send a HTTP GET request to ``http://localhost:8000/a`` or ``http://localhost:8000/b`` to see the output of the applications.

The Varnish Cache caches the result for 10 seconds