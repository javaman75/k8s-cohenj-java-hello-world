# Use this base image to run the program.
# This is coming from the Docket HUB.
FROM openjdk:8

# where the program and supporting files will be saved to
WORKDIR /app

# Copy my program (all files), into the WORKDIR.
COPY . /app/

# Compile first
RUN javac Main.java

# Finally, it runs the program
ENTRYPOINT ["java", "Main"]



# After this we need to build the docker, using 
# docker build -t <tag-name>         .
# docker build -t hello-world-docker .
# docker images 
# docker run hello-world-docker
# docker ps -all 
# docker rm 6c5fd1ec9446
