
public class Practice {

  String name = "Ace";
  int id = 1452875429;
  Practice(){
    System.out.println("Overloading Constructor");
  }
  Practice(String Name, int ID){
      name = Name;
      id= ID;
  }
 
    public static void main(String[] args) {
        Sub Obj=new Sub();
        int sub=Obj.sub(100,90);
        System.out.println(sub);
        Practice obj = new Practice();
        System.out.println("Name: " + obj.name + " ID: " + obj.id);
        int sum = add(20,30);
        System.out.println(sum);

    }
    public static int add(int num1, int num2){
            int sum = num1 + num2;
            return sum;
    }



    }

class Sub {
  int sub;
  public  int sub(int a , int b) {
    sub=a-b;
    return sub;
  }
}