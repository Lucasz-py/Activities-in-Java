import java.util.Scanner;
/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*** Gestion Cuotas ***");
        System.out.println("Ingrese el nombre de la marca: ");
        String marca = scanner.nextLine();
        System.out.println("Elige el Electrodomestico : \n 1. Cocina \n 2. Heladera \n 3. Lavarropas");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch(opcion){
            case 1:
                System.out.println("Ingrese el precio: ");
                float precioCocina = scanner.nextFloat();
                 System.out.println("Ingrese el Stock: ");
                int stockCocina = scanner.nextInt();
                
                System.out.println("Cantidad de Hornallas: ");
                int hornallas = scanner.nextInt();
                System.out.println("Calorias: ");
                int calo = scanner.nextInt();
                System.out.println("Dimenciones: ");
                String dimen = scanner.next();
                
                Cocina cocina = new Cocina(marca, precioCocina, stockCocina, hornallas, calo, dimen);
                System.out.println(">>> En cuantas Cuotas? ");
                int cuotasC = scanner.nextInt();
                System.out.println(">>> Ingrese el interes: ");
                float interesC = scanner.nextFloat();
                
                cocina.creditoConAdicional(cuotasC, interesC);
                cocina.imprimir();
                System.out.println("Cuotas: "+cuotasC+" - Interes: "+interesC);
                System.out.println("Valor Cuota: "+cocina.cuotaCredito(cuotasC, interesC));

            break;
                
            case 2:
                System.out.println("Ingrese el precio: ");
                float precioHeladera = scanner.nextFloat();
                 System.out.println("Ingrese el Stock: ");
                int stockHeladera = scanner.nextInt();
                
                System.out.println("Pies: ");
                int pies = scanner.nextInt();
                System.out.println("Puertas: ");
                int puertas = scanner.nextInt();
                System.out.println("Posee Compresor? (y/n)");
                String com = scanner.next();
                boolean compresor;
                if(com.equals("y")){
                    compresor = true; 
                } else {
                    compresor = false;
                }
                
                Heladera heladera = new Heladera(marca, precioHeladera, stockHeladera, pies, puertas, compresor);
                
                System.out.println(">>> En cuantas Cuotas? ");
                int cuotasH = scanner.nextInt();
                System.out.println(">>> Ingrese el interes: ");
                float interesH = scanner.nextFloat();
                
                heladera.creditoConAdicional(cuotasH, interesH);
                heladera.imprimir();
                System.out.println("Cuotas: "+cuotasH+" - Interes: "+interesH);
                System.out.println("Valor Cuota: "+heladera.cuotaCredito(cuotasH, interesH));
                System.out.println("Valor Cuota con Adicional: "+heladera.creditoConAdicional(cuotasH, interesH));
            break;
            
            case 3:
                System.out.println("Ingrese el precio: ");
                float precioLava = scanner.nextFloat();
                 System.out.println("Ingrese el Stock: ");
                int stockLava = scanner.nextInt();
                
                System.out.println("Cantidad de Programas: ");
                int program = scanner.nextInt();
                System.out.println("Capacidad en Kilos: ");
                float kilos = scanner.nextFloat();
                System.out.println("Es Automatico? (y/n)");
                String auto = scanner.next();
                boolean automatico;
                if(auto.equals("y")){
                    automatico = true; 
                } else {
                    automatico = false;
                }
                
                Lavarropas lavarropa = new Lavarropas(marca, precioLava, stockLava, program, kilos, automatico);
                
                System.out.println(">>> En cuantas Cuotas? ");
                int cuotasL = scanner.nextInt();
                System.out.println(">>> Ingrese el interes: ");
                float interesL = scanner.nextFloat();
                
                lavarropa.creditoConAdicional(cuotasL, interesL);
                lavarropa.imprimir();
                System.out.println("Cuotas: "+cuotasL+" - Interes: %"+interesL);
                System.out.println("Valor Cuota: "+lavarropa.cuotaCredito(cuotasL, interesL));
                System.out.println("Valor Cuota con Adicional: "+lavarropa.creditoConAdicional(cuotasL, interesL));
            break;
        }
    }
}