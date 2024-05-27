
El método main es el punto de entrada del programa. Aquí se inicia el programa.


Creación de un objeto Persona:

Se crea una instancia de la clase Persona llamada persona1.


Entrada de datos:

Se utiliza un objeto Scanner para leer los valores de peso y altura ingresados por el usuario.
El usuario debe ingresar su peso en kilogramos y su altura en metros.


Cálculo del IMC:

El IMC se calcula dividiendo el peso (en kg) entre el cuadrado de la altura (en m): IMC=altura2peso​

El resultado se almacena en el objeto persona1.



Impresión de resultados:

Se imprimen los valores de peso, altura e IMC.
Luego, se evalúa el IMC y se muestra una clasificación según los siguientes rangos:

IMC < 17.0: “Delgadez Severa”
17.0 ≤ IMC < 18.5: “Delgadez Moderada”
18.5 ≤ IMC < 25: “Peso normal”
25 ≤ IMC < 30: “Sobrepeso”
30 ≤ IMC < 35: “Obesidad leve”
35 ≤ IMC < 40: “Obesidad moderada”
IMC ≥ 40: “Obesidad mórbida”



Cierre del objeto Scanner:

Se cierra el objeto Scanner para liberar recursos.