DROP TABLE IF EXISTS ORDERREQUEST;  
CREATE TABLE ORDERREQUEST (  
REQUESTID INT AUTO_INCREMENT  PRIMARY KEY,  
ITEM VARCHAR(500) NOT NULL,  
QUANTITY INT NOT NULL,
PRICE INT
); 