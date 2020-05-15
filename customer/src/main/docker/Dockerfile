FROM openjdk:8-jre

MAINTAINER tong_hengzhen@163.com

VOLUME /tmp

COPY customer-1.0.0.jar /customer.jar

#
ENTRYPOINT ["java", "-jar", "customer.jar"]