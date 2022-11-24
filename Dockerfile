FROM public.ecr.aws/docker/library/openjdk:11.0.16-jdk
EXPOSE 8965
ADD /target/EAuction.jar EAuction.jar
ENTRYPOINT ["java","-jar","/EAuction.jar"]

