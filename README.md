# Build the program

    % javac Main.java

# BUild the docker image and give it a tag name
Note that we are running on the same directory.  Use "dot" at the end of the docker command.

    % docker build -t <tag-name>  .

for example:

    % docker build -t k8s-cohenj-java-hello-world:latest .


# List the images

    % docker images 

# Run the image in your local environment.

    % docker run k8s-cohenj-java-hello-world:latest

# Vulnerabilities in your image?
Check the following command for a vulnerability report

    % docker scout quickview


# Check your images running or not running

    % docker ps -all 

# Done with testing, delete it from your local.    

    % docker rm <container-id>

# Now put the image to your repo.

    % docker push cohenj/k8s-cohenj-java-hello-world:latest


