FROM openjdk

MAINTAINER sanjeev

ENV SERVICE_NAME=gradle-demo
ENV SERVICE_HOME=/usr/local/gradle-app
ENV SERVICE_SCRIPTS=${SERVICE_HOME}/scripts
ENV CONFIG=config
ENV LIB=lib

RUN mkdir -p $SERVICE_HOME
RUN mkdir -p $SERVICE_SCRIPTS

WORKDIR $SERVICE_HOME

RUN mkdir -p $LIB
RUN mkdir -p $CONFIG

COPY ./lib $SERVICE_HOME/$LIB
COPY ./scripts $SERVICE_SCRIPTS

RUN pwd
RUN ls -lart

RUN chmod 777 $SERVICE_SCRIPTS/gradle-demo
RUN ls -lart

EXPOSE 1000
ENTRYPOINT $SERVICE_SCRIPTS/gradle-demo