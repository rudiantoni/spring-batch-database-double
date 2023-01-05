# spring-batch-database-double
- Applied various testings and changes in different loggging systems using log4j2 and logback
- Applied various testings with external and internal xml definitions and the application properties file.
- Changed the standard database do PostgreSQL.
- Defined an additional database for future usage as an batch application data source.
- That project was the first defined standard to follow.
- Basic working structure without single responsibility, using job, step and tasklet.
- First project using multiple databases (PostgreSQL) for batch metadata persistence and data source.
- Dockerized project: both application and database runs in separate containers.
- Automation oriented: most settings are done via shell scripts and environment variables.
- **Note**: At the devops implementation stage, an custom postgres database image was created (based on the official postgres 15 image), it just enables you to setup an initialized PostgreSQL database with multiple databases and others, if you want to know more about this, take a look at:
    - Used image name: **rudiantoni/postgres:15**
    - [GitHub - rudiantoni/devops](https://github.com/rudiantoni/devops)
    - [DockerHub - rudiantoni/postgres](https://hub.docker.com/repository/docker/rudiantoni/postgres)

## Requirements
- Operational system Linux Ubuntu or related distros.
- Docker
    - Instructions: [Install Docker Engine on Ubuntu | Docker Documentation](https://docs.docker.com/engine/install/ubuntu/)
- Docker compose
    - Instructions: [Install the Compose standalone | Docker Documentation](https://docs.docker.com/compose/install/other/)
- Java (JRE/JDK)
    - Recommended JRE version 17.
    - Instructions: [OpenJDK: Download and install](https://openjdk.org/install/)

## Running
- Run the file *deploy.sh* with: `sh deploy.sh`.
    - It uses the following command line argument(s):
        - name
- For didatic purposes (like connecting and checking the database, checking logs, etc), the application doesn't clean the created containers automatically when finishes it's execution, so just follow the *Stopping* section instructions in order to fully stop and clean the application containers.
        
## Stopping
- Run the file *stop.sh* with: `sh stop.sh` to fully stop and remove the application containers.
    - You don't need to stop the application if you want to run it again.

> If you want to change the name in the message, you can change the **JOB_PARAMETER_NAME** variable value inside the file *docker/environment.env*.

Log image with working example:
- [spring-batch-database-double](https://imgur.com/a/LihhjIm)