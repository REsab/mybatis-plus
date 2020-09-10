FROM java
VOLUME /tmp



ADD target/mybatis-plus-0.0.1-SNAPSHOT.jar /job.jar
#创建一个新的容器并在新的容器中运行命令
RUN bash -c 'touch /job.jar'
#设置时区
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#相当于在容器中用cmd命令执行jar包  指定外部配置文件
ENTRYPOINT ["java","-jar","/job.jar","--spring.config.location=/usr/local/project/docker/xxl-job/config/application.yml"]
