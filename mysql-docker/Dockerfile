FROM ubuntu:12.04

ADD ./mysql-setup.sh /tmp/mysql-setup.sh
RUN /bin/sh /tmp/mysql-setup.sh

EXPOSE 3306

CMD ["/usr/sbin/mysqld"]