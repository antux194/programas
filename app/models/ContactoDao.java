package models;// se le indica que la clase pertenece al paquete modelos


import java.util.ArrayList;
import java.util.List;
import java.util.Map; // se importa la clase MAP con la cual se le dara mapao a los objetos con la bd
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;// se importa la clase AtomicLong la cual nos permitira hacer una programacion concurrente con la bd

public class ContactoDao {

public static AtomicLong uuid = new AtomicLong();// se crea un objeto de la clas AtomicLong
public static Map<Long,Contacto > contactos = new ConcurrentHashMap<Long,Contacto >();// organizara de forma concurrente todas las queries que llegen a contactos


public static List<Contacto> findAll(){// se crea el metodo encontrar todos en el cual se lista los objetos de la tabla contactos
    List<Contacto> resultado = new ArrayList<Contacto>();// ese listado se guarda en un arreglo llamado resultado

    for(Contacto contacto: contactos.values() ){// se crea un for para recoger todos los datos recogidos por contactos
        resultado.add(contacto);// y se van agregando al arreglo resultados
    }
    return resultado;// se retorna el arreglo con todos los contactos
}

public static void guardar (Contacto contacto){
    contacto.id = uuid.incrementAndGet();
    contactos.put(contacto.id,contacto);

}

}