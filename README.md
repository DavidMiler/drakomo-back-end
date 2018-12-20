# drakomo-back-end

Building and running


```
./gradlew --no-daemon shadowJar

sudo docker build -t kotlin .

sudo docker run -p 8080:8080 kotlin
```