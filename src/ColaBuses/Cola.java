
package ColaBuses;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Cola {
    LinkedList cola = new LinkedList();
    
public void enqueue(Object o){
    cola.addLast(o);
}
public void listaCola(){
    Bus bus;
    System.out.println("\nListando..");
    System.out.println("(inicio)");
    System.out.println("PLACA / FECHA / EMPRESA");
    
    for (Object elem : cola) {
        bus = (Bus) elem;
        System.out.println(bus.getPlaca()+ " "+ bus.getFecha()+ " "+ bus.getEmpresa());
        
        System.out.println("\n(FIN..)");
        
    }
}
public void dequeue(){
    Bus busRegistrado;
    if(cola.isEmpty())
        System.out.println("No se puede eliminar, cola vacia..");
    busRegistrado = (Bus) cola.removeFirst();
    System.out.println("Atendiendo el bus con placas: " + busRegistrado.getPlaca());
}

public void ordenar(){
    System.out.println("\nOrdenando...");
    Collections.sort(cola);
    listaCola();
}

}
