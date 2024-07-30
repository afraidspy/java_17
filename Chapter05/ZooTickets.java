public class ZooTickets {
    private String name = "BestZoo";
  
    {   
        System.out.println("Entrando a la parte de llaves");
        System.out.print(name + "-"); }
        private static int COUNT = 0;
        static { 
            System.out.println("Entrando a la parte de static 1");
            System.out.print(COUNT + "-");
         }
        static { 
            System.out.println("Entrando a la parte de static 2");
            COUNT += 10; System.out.print(COUNT + "-"); 
        }
    
        public ZooTickets() {
            System.out.print("Entrando al constructor");
            System.out.print("z- ");
     }
    
    public static void main(String... patrons) {
        System.out.print("Entrando al main antes de crear el objeto ZooTickets");
        ZooTickets zt = new ZooTickets();
        System.out.print("Entrando al después antes de crear el objeto ZooTickets");
    }
 }