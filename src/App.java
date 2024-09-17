public class App {
    public static void main(String[] args) throws Exception {
   
        Persona Antonio = new Persona("Antonio", "Garcia", "30852456-G", 1975, "España", 'H');
        Persona Angela = new Persona("Angela", "Gonzalez", "45875698-D", 1985, "Holanda", 'M');

       Antonio.Imprimir();
       Angela.Imprimir();
    }
}
