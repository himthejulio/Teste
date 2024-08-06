package applicationareatrapezio;

public class ApplicationAreaTrapezio {
    
    import java.util.Scanner;
    
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in)
    double bMaior, bMenor, altura, areaT;
    System.out.println("Digitar o valor da Base Maior");
    bMaior = ler.nextDouble();
    System.out.println("Digitar o valor da Base Menor");
    bMenor = ler.nextDouble();
    System.out.println("Digitar o valor da Altura");
    altura = ler.nextDouble();
    
    areaT = (bMaior + bMenor) * altura / 2.0; 
    System.out.println("Área do trapézio = + areaT");
    
    ler.close();
            
}
    
}
