public class ConstOver{
    String name ;
    int id;

    ConstOver(){
        System.out.println("Constructor overloading");
    }
    ConstOver(String name , int id){
               this.name = name;
               this.id = id;
    }
    public static void main(String[] args) {
      ConstOver obj = new ConstOver("Venkat", 36);
      System.out.println("Name:" + obj.name + " ID:" + obj.id);
      new ConstOver();
        
    }
}
