FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.5.0
COPY app.jar /manager-service.jar
ENTRYPOINT exec java $JAVA_OPTS  -jar /manager-service.jar
