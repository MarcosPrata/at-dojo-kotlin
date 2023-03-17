FROM gradle:7.6.1-jdk17-alpine AS build

WORKDIR /data
COPY . /data

RUN apk upgrade --update && apk add --update curl unzip

RUN gradle assemble --no-daemon

CMD ["bash"]
