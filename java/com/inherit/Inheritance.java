class human{
    
    String Human ="This is human";
}
class male extends human{
    String Male = "He is male";
}
class venkat extends male{
    String name = "Name is venkat";
    public void func(){
        System.out.println(name);
        System.out.println(super.Male);
        System.out.println(super.Human);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        venkat obj = new venkat();
        obj.func();


    }
}
