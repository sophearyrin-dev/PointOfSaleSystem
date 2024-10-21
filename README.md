# Point_Of_Sale
```
NODE_OPTIONS=--openssl-legacy-provider ng serve
```
```js
"scripts": {
  "ng": "ng",
  "start": "NODE_OPTIONS=--openssl-legacy-provider ng serve",
  "build": "ng build",
  "test": "ng test",
  "lint": "ng lint",
  "e2e": "ng e2e"
}
```


The culprit is Lombok. The minimal Lombok version compatible with JDK 21 is 1.18.30.

This implies that the minimal Spring Boot version is 3.1.4, unless you want to meddle with the Spring Boot autoconfiguration and set the Lombok version in your project differently from the Spring Boot BOM defined in spring-boot-dependencies.

See: [BUG] Lombok 1.8.26 incompatible with JDK 21 #3393


![image](https://github.com/user-attachments/assets/b3a07897-f9bf-48d4-b095-dd439fed7da7)


