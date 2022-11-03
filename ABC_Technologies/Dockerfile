FROM tomcat:9.0-alpine

LABEL maintainer="yoarsde@gmail.com"
ADD ./ABC_Technologies/targer/*.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]