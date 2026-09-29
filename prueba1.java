import java.util.Scanner;

public class prueba1 {
 public static void main(String[] args) {
    
for (int i= 0; i < 10; i++) 
   System.out.println(i);

//... actividad while.. pedir un num hasta romper el bucle 0 

Scanner sc = new Scanner(System.in);
System.out.println("Ingresa un numero");

int numero= sc. nextInt();

while (numero!=0) {
  
System.out.println("Estoy dentro");

System.out.println("Introduce un numero");
numero= sc.nextInt();

System.out.println("Estoy fuera");

}



  























 }
    
}