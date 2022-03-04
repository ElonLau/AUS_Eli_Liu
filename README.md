
OVERVIEW

pom.xml: Includes mysql-connector-java and junit dependencies<br />
DDL.sql: create the table 'robot' and insert the response statements there. The responses can grow organically over time<br />
<br />
Entity class: <br />
  Constants.java: Includes all the final Strings such as MySQL connection credentials<br />
  Robot.java: Declare and initialize all the row id in sql database<br />
              Robot class includes id, parentId, question, and answer<br />
<br />
JDBC class:<br />
  RobotQuery.java: Connecting to Mysql database, fetching the user input and preparing for corresponding statements<br />
  <br />
 Client.java: Declare and initialize a new socket and read in user inputs<br />
 Server.java: Socket server services<br />

INITIALIZATION STEPS:<br />
Preferred to run in Intellij IDEA environment
<br />
1. Make sure mysql is running <br />
2. Update mysql username and password accordingly <br />
3. Create a new schema and use DDL.sql to create a new table <br />
4. Complie the java files <br />
5. Start Server.java <br />
6. Start Client.java <br />
