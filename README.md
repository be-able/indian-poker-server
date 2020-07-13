# indian-poker-server
the marvelous game server based on spring-boot
## requirements
  - Java 11
  - docker
## how to build
  - ``cp .env.example .env`` : copy example file and write .env
  - ``docker-compose build`` : build required services
  - ``docker-compose up`` : run required services
 
### use mariadb
  - ``mysql -u root -p -h 0.0.0.0 -P 33060``
