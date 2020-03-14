# indian-poker-server
the marvelous game server
## requirements
  - Java 13
  - docker
## how to build
  - ``cp .env.example .env`` : copy example file and write .env
  - ``docker-compose up`` : run required services
  - ``./gradlew build``
 
### use mariadb
  - ``mysql -u root -p -h 0.0.0.0 -P 33060``
