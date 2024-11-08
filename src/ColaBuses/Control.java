package ColaBuses;
import colalinkedlist.*;
import java.util.Scanner;


public class Control {
    Scanner sc = new Scanner(System.in);
    Cola cola = new Cola();
    
    void menu(){
        int opc;
            do{
            System.out.println("---MENU DE OPCIONES---\n");
            System.out.println("1. Registro de datos(llegada buses)");
            System.out.println("2. Listado de buses(segun su orden de llegada)");
            System.out.println("3. Salida de buses por orden de llegada");
            System.out.println("4. Salir");
            System.out.println("\n--SELECCIONE UNA OPCION--");
            opc = sc.nextInt();
             switch(opc){
                 case 1:
                     this.agregar();
                     break;
                 case 2: 
                     cola.listaCola();
                     System.out.println("");
                     break;
                 case 3: 
                     cola.dequeue();
                     break;
             }    
         }  while(opc > 0 & opc < 5);
    }
    
    void agregar(){
        System.out.println("AGREGAR BUS A LA COLA: ");
        System.out.println("Digite la placa: ");
        String plac = sc.next();
        System.out.println("Digite la fecha de llegada: ");
        String fech = sc.next();
        System.out.println("Digite la empresa del bus: ");
        String emp = sc.next();
        
        Bus buss = new Bus();
        buss.setPlaca(plac);
        buss.setFecha(fech);
        buss.setEmpresa(emp);
        
        cola.enqueue(buss);
        System.out.println("Bus agregado a la cola...");
       
    }
}
