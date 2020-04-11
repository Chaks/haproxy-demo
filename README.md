# haproxy-demo project

`./mvnw quarkus:dev`

`./mvnw clean install`

`docker build -f src/main/docker/Dockerfile.jvm -t demos/ha-proxy`

```
docker container run -d --name pinginstance_1 -p 9010:8080 demos/ha-proxy-demo:latest
docker container run -d --name pinginstance_2 -p 9020:8080 demos/ha-proxy-demo:latest
docker container run -d --name pinginstance_3 -p 9030:8080 demos/ha-proxy-demo:latest
docker container run -d --name pinginstance_4 -p 9040:8080 demos/ha-proxy-demo:latest
docker container run -d --name pinginstance_5 -p 9050:8080 demos/ha-proxy-demo:latest
 ```

`haproxy -f haproxy-simple.cfg`

`haproxy -f haproxy-acl.cfg`