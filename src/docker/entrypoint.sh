#!/bin/bash
echo "Starting java"
exec java ${JAVA_OPTS} -jar ${JAVA_PROPS} app.jar
