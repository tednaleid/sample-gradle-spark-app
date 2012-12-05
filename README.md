sample-gradle-spark-app
=======================

Sample application using gradle with tomcat plugin and spark endpoint.


You can generate IDEA project files with:

    gradle idea

You can create a war file with:

    gradle war

You can instantiate a tomcat server and run it on port 9090 with:

    gradle tomcatRunWar

and then hit these urls:

- [http://localhost:9090/myapp/](http://localhost:9090/myapp/)  - serves up html5 boilerplate html file
- [http://localhost:9090/myapp/api/hello/ted](http://localhost:9090/myapp/api/hello/ted)  - hello world for "ted" served by java spark application, you can change the name