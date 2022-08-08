FROM node:18-alpine3.15

RUN apk update

WORKDIR /app
COPY ./ /app
RUN npm install @openapitools/openapi-generator-cli

RUN apk add openjdk11 curl bash maven git tar unzip bash-completion ca-certificates


ENTRYPOINT ["/bin/bash"]