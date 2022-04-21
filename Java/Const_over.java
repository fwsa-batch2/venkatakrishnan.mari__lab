public class Const_over {
    String name ;
    int id;

    Const_over(){
        System.out.println("Constructor overloading");
    }
    Const_over(String name , int id){
               this.name = name;
               this.id = id;
    }
    public static void main(String[] args) {
      Const_over obj = new Const_over("Venkat", 36);
      System.out.println("Name:" + obj.name + " ID:" + obj.id);
        
    }
}
