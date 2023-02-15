package com.ejercicios.ejercicios1502;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicios1502Application {

  /*
  1.- Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división*/
  public static void operatoriasMatematicas(double numero1, double numero2){
    double resultadoSuma = numero1 + numero2;
    double resultadoResta = numero1 + numero2;
    double resultadoMultiplicacion = numero1 + numero2;
    double resultadoDivision = numero1 / numero2;

    System.out.println("Suma : "+numero1+" + "+numero2+" = "+resultadoSuma);
    System.out.println("Resta : "+numero1+" - "+numero2+" = "+resultadoResta);
    System.out.println("Multiplicación : "+numero1+" * "+numero2+" = "+resultadoMultiplicacion);
    System.out.println("División : "+numero1+" / "+numero2+" = "+resultadoDivision);
  }

  /*
   * 2.- Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su 
programa para que ahora calcule el área de un cuadrado de igual medida al ancho del 
rectángulo anterior?
   */

   public static void areaRectanguloCuadrado(double ancho,double largo){

    double areaRectangulo = ancho * largo;
    double areaCuadrado = ancho * ancho;

    System.out.println("El área del rectangulo de ancho "+ancho+" y largo "+largo+" es de "+areaRectangulo);
    System.out.println("El área del cuadrado de lado "+ancho+" es de "+areaCuadrado);
   }

   /*
    3.-Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por 
teclado, calcule la cantidad de dólares que se pueden comprar
    */

    public static void pesosADolares(int pesosChilenos){

      double dolares = pesosChilenos * 0.0013;

      System.out.println("Con $"+pesosChilenos+" puedes comprar "+dolares+" dolares.");

    }

    /*
     4.- Escriba un algoritmo que permita calcular la edad de una persona según su año de 
nacimiento.
     */

     public static void calcularEdad(int anioNacimiento){
      int anioActual = 2023;
      int edad = anioActual - anioNacimiento;

      System.out.println("Tu edad es de "+edad);
     }

     /*
      5.- Escriba un programa que solicite al usuario 4 notas y calcule su promedio. 
      */

      public static Double calcularPromedio(double[] notas){
        double promedio = 0.0;
        for(int i = 0; i < notas.length; i++){
          promedio = promedio + notas[i];
        }
        promedio = promedio / notas.length;

        return promedio;
      }


      /*
       * 
       6.-  Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las 
horas que trabaja y el valor por hora ($H/H) que recibe.
       */

       public static void sueldoSemanal(int horasTrabajadas, double valorHora){

        double sueldoSemanal = horasTrabajadas * valorHora;

        System.out.println("El sueldo semanal es de $"+sueldoSemanal);

       }



       /*
        7.-  Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad 
dada de metros cuadrados, a partir del costo ingresado por el usuario.
        */
        public static void costoParedPintada(double metrosPared, double costoPared){
          double precio = metrosPared * costoPared;
          System.out.println("El costo de pintar "+metrosPared+"m² es de $"+precio);
        }


        /*
         8.- Escriba un programa que permita determinar el costo que tendrá el realizar una llamada 
telefónica en base al tiempo que dura la llamada y su costo por segundo.
         
         */
        public static void costoLlamada(int segundos, double costoSegundo){
          double costo = segundos * costoSegundo;

          System.out.println("El costo de la llamada es de $"+costo+" ya que duró "+segundos+"seg y el costo por segundo es de $"+costoSegundo);
        }




        /* 
         9.-  Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por 
un artículo, considerando que tiene un descuento de 20%, y debe pagar 15% de IVA.
         */

         public static void articuloDescuento(double precio){
          double iva = 0.15;
          double descuento = 0.20;
          double precioFinal = 0;
          double precioIVA = 0;

          precioFinal = precio + (precio * iva);
          precioIVA = precioFinal;
          precioFinal = precioIVA - (precioIVA * descuento);

          System.out.println("El precio inicial es: $"+precio);
          System.out.println("Al aplicar el IVA queda en: $"+precioIVA);
          System.out.println("El precio final con descuento es de : $"+precioFinal);

         }


	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //1.-
    // System.out.println("Ingrese un primer numero");
    // double num1 = Double.parseDouble(sc.nextLine());

    // System.out.println("Ingrese un segundo numero");
    // double num2 = Double.parseDouble(sc.nextLine());

		// operatoriasMatematicas(num1, num2);
    // sc.close();



    //2.-
    // System.out.println("Ingrese el ancho de su rectángulo");
    // double ancho = Double.parseDouble(sc.nextLine());
    // System.out.println("Ingrese el Largo de su rectángulo");
    // double largo = Double.parseDouble(sc.nextLine());
    // areaRectanguloCuadrado(ancho, largo);
    // sc.close();



    //3.-
    // System.out.println("Ingrese la cantidad de pesos Chilenos");
    // int pesos = Integer.parseInt(sc.nextLine());
    // pesosADolares(pesos);
    // sc.close();



    //4.-
    // System.out.println("Ingrese su año de nacimiento");
    // int anioNacimiento = Integer.parseInt(sc.nextLine());
    // calcularEdad(anioNacimiento);
    // sc.close();



    //5.-
    // double[] notas = new double[4];
    // for(int i = 0; i < 4;i++){
    //   System.out.println((i+1)+".- Ingrese nota");
    //   notas[i] = Double.parseDouble(sc.nextLine());
    // }
    // double promedio = calcularPromedio(notas);
    // System.out.println("El promedio es de "+promedio);
    //sc.close();




    //6.-
    // System.out.println("Ingrese las horas trabajadas");

    // int horasTrabajadas = Integer.parseInt(sc.nextLine());

    // System.out.println("Ingrese el valor de la hora");
    // double valorHora = Double.parseDouble(sc.nextLine());
    // sueldoSemanal(horasTrabajadas,valorHora);
    // sc.close();



    //7.-
    // System.out.println("Ingrese la cantidad de m² que quiere pintar");
    // double metrosPared = Double.parseDouble(sc.nextLine());

    // System.out.print("Ingrese el valor por m² : $");
    // double costoPared = Double.parseDouble(sc.nextLine());

    // costoParedPintada(metrosPared, costoPared);
    // sc.close();



    //8.-
    // System.out.println("Ingrese los segundos de la llamada");
    // int segundos = Integer.parseInt(sc.nextLine());

    // System.out.println("Ingrese el costo x segundo");
    // double costoSegundo = Double.parseDouble(sc.nextLine());

    // costoLlamada(segundos, costoSegundo);
    //sc.close();



    //9.-
    System.out.println("Ingrese el precio sin IVA");
    double precio = Double.parseDouble(sc.nextLine());
    articuloDescuento(precio);
    sc.close();
	}

}
