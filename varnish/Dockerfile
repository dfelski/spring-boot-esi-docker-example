FROM alpine:3.9.3

RUN apk add --no-cache varnish=6.1.1-r0

COPY default.vcl /etc/varnish/default.vcl

COPY start.sh /start.sh

EXPOSE 80
CMD ["/start.sh"]
