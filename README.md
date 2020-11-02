### Build and run

 You can run it with intellij or Eclipse IDE like any Spring-boot app.

Or by console: 

 Build:`mvn install` or `mvn clean install`
  
 Run: in the target folder `java -jar transaction-api-0.0.1-SNAPSHOT.jar`

### Notes

Usa HSQLDB para levantar una BDDD en memoria cada vez que corre, ejecutando un script `scheme-all.sql` que inserta transacciones dummys para probar los escenarios descritos.

En el fichero feature de cucumber los escenrarios (D) y (E) que realizan los test para el dia de hoy la fecha de `transaction_date` puesta es **03/11/2020** por si no se ejecuta en dicha fecha, en cualquier caso solo seria modificar el insert en el fichero `scheme-all.sql` y volver a ejecutar.


<br />

### Lenguages and  tools

- SpringBoot 
- Swagger/OpenApi 
- HSQLDB
- Cucumber

<br />
<br />

---

### 📕 EndPoints 

ContentType Applicaton/JSON

- localhost:8080/transaction/

Example request:
```
{
      "reference": 0,
      "iban": "string",
      "transaction_date": "string",
      "amount": 0,
      "fee": 0,
      "description": "string"
 }
 ```
- localhost:8080/searchTrByIban/

Example request:
```
{
  "iban": "ES9820385778983000760236",
  "sortByAmount": "ASC"
}
```
- localhost:8080/transactionStatus/

Example request:
```
{
  "reference": 12345,
  "channel": "CLIENT"
}
```
