FROM docker-registry-mirror.netcetera.com/azul/zulu-openjdk:17

RUN useradd -u 1000 --create-home --user-group nca

ARG JAR_FILE

ENV JAVA_OPTS ""
ENV JAVA_PROPS ""

WORKDIR /app

COPY ${JAR_FILE} /app/app.jar

COPY entrypoint.sh /app/entrypoint.sh

EXPOSE 8080

USER root
RUN chown -R nca:root /app
USER nca

ENTRYPOINT [ "/app/entrypoint.sh"]
