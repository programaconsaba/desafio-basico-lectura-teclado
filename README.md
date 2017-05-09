# Desafio básico lectura teclado
Bienvenidos al nivel básico de esta serie de desafíos Java.

## Enunciado
Leer los números introducidos por teclado y mostrarlos por pantalla.

*   Número de elementos de entrada: 4
*   Tipo elementos de entrada: int
*   Salida esperada: Se espera que se imprima por pantalla los números leidos (un número por línea)

## Notas
En este desafío vamos a aprender a leer números que se introducen por el teclado haciendo uso de la classe Scanner (importar clase java.util.Scanner)

    Scanner in = new Scanner(System.in);
    
    in.nextInt();
    
El test espera que se imprima por pantalla los números que previamente se han leído haciendo uso del método

    System.out.println(...);
    
Son buenas prácticas cerrar los recursos abiertos :)

    in.close();

Se puede consultar el proceso paso a paso en la URL [https://programaconsaba.com/desafios](https://programaconsaba.com/desafios "https://programaconsaba.com/desafios")   

# License
    desafios - source code for the https://programaconsaba.com/desafios application
    Copyright (C) 2016 José Antonio Sabalete

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>
