# BACK END prueba tecnica CIVA

## Dependencias
- Spring Data JPA
- MySQL Driver
- Lombok 
- Spring Web
- Spring Security
- Validation 

## Consideraciones antes de usarse
Para poder ser usado se debe aplicar las siguientes configuraciones
<img src="src/main/java/com/CIVA/IMg/carbon.png" alt="configuraciones"></img><br>
Como se puede ver en la imagen: 
- se usa el puerto 4000 
- se debe crear una base de datos con el nombre <strong>busesciva</strong>
- la contraseña está colocada con una variable de entorno para que pueda ser creada por cualquiera que use esta api, el nombre de esta es <strong>DB_MYSQL_PASSWORD</strong>

## API funcionando
Una vez realizadas las configuraciones podremos usarla y se podran usar los siguientes endpoints
- http://localhost:4000/bus GET
- http://localhost:4000/bus/id GET
- http://localhost:4000/bus POST
- http://localhost:4000/marcas GET
- http://localhost:4000/marcas POST
