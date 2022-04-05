# PizzaOrderReceiverService
This repo receives &amp; persists the Pizza order

## Installation Instructions
  You can import the project as a maven application to your favorite IDE. I made my tests by using eclipse.
  
  If lombok gets in your way, by referring [this answer](https://stackoverflow.com/a/22332248/4130569), you can install lombok by its jar file.

## To run the application
Use one of the several ways of running a Spring Boot application. Below are just three options:

Build using maven : `mvn clean install` and execute the resulting artifact as follows `java -jar PizzaOrderReceiverService-0.0.1-SNAPSHOT.jar`

## To test the application
  Curl url for testing :
  
    curl --location --request POST 'http://localhost:8091/persistOrder' \
	--header 'Content-Type: application/json' \
	--data-raw '[
	    {
	            "requestId": 1,
				"item": "Pizza",
				"quantity": 1,
	            "price" : 120
	    },
	    {
	            "requestId": 2,
				"item": "Coke",
				"quantity": 2,
	            "price" : 100
	    }
	]'

  You'll get a response as in below.
  
    true
  2. To check db entry in h2 db :
     Hit below url : http://localhost:8091/h2-console
     
     Password for connection - password
     
     Run the below query :
     select * from orderRequest;
     
     The db will give below result :
     
		 REQUESTID  	ITEM  	   QUANTITY  	     PRICE  
		     1	       Pizza	       1	       120
			 2	       Coke	       2	       100
		 (2 rows, 4 ms)
	 
## Run Junits :
mvn test

## Prerequisite
PizzaOrderService needs to be up & running
