# Docker 镜像构建
# 基础镜像
FROM openjdk:8-jre-alpine
# 安装curl 供 healthcheck 使用
RUN apk add curl
#工作目录
WORKDIR /app
#拷贝jar包到指定目录下
COPY ./mybi-backend-0.0.1-SNAPSHOT.jar /app/mybi-backend-0.0.1-SNAPSHOT.jar
# 设置时区
ENV TZ="Asia/Shanghai"
#暴露端口
EXPOSE 8102
#设置 JVM参数
ENV JAVA_OPTS="-Xms256m -Xmx512m"
#启动命令
ENTRYPOINT java ${JAVA_OPTS} -jar mybi-backend-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod