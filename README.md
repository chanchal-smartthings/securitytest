# securitytest

The Application acts as Resource Sevrer in Oauth2 server archietcture and responsible for securing rest calls using clientid and secret key.

The client has to provide valid token which will be verified by configured oauth server and if validation is sucessful the access to resource will be granted.


Please configure your auth server information in application.yml file

 clientId: "clientid"
 clientSecret: "secret"
 tokenInfoUri: "authserverURI"
 
 
 once done you can run application using below maven command
 
 ```
 mvn spring-boot:run
 ```

Testing : 

Use Advance Rest client or run following curl REST request 

```

curl --header "Authorization: Bearer token" http://localhost:8080/kafka/topic

```