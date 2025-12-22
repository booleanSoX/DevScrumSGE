import java.util.*;

public class AlSeVI {
    public class generadorID int id(){


        Random rand = new Random();
        int id = rand.nextInt(100) + 1;

        while (!(Scrum.vehiculosID.add(id))){
            id = rand.nextInt(100)+ 1 ;
        }
        System.out.println("ID generado con éxito: " + id);
        return id;



    }

}
