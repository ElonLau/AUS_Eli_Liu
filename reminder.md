
- Your project must compile and work. Please include a README file for any special installs, docker images, etc. that we’ll need to run
-
- Use logging


- Hardcoded responses….a big no-no for us. We want to see conversations extensible and sustainable without requiring a recompile. 
- Read me instructions-  Have a solid readme file.  Please include high-level overview of what your code is doing in readme file. 


OVERVIEW

pom.xml: Includes mysql-connector-java and junit dependencies
DDL.sql: create the table 'robot' and insert the response statements there. The responses can grow organically over time

Entity class:
  Constants.java: Includes all the final Strings such as MySQL connection credentials
  Robot.java: Declare and initialize all the row id in sql database
              Robot class includes id, parentId, question, and answer

JDBC class:
  RobotQuery.java: Connecting to Mysql database, fetching the user input and preparing for corresponding statements
  
 Client.java: Declare and initialize a new socket and read in user inputs
 Server.java: Socket server services
