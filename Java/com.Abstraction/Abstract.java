abstract class mobile{
    abstract void display();
    abstract void charger();
    abstract void performance();
}
class Samsung extends mobile{

    void display(){
        System.out.println("The display is super");
    }
    void charger(){
        System.out.println("The capacity is low");
    }
    void performance(){
        System.out.println("Performance is super");
    }
}
class Redmi extends mobile{
    void display(){
        System.out.println("The display is very good");
    }
    void charger(){
        System.out.println("The capacity is good");
    }
    void performance(){
        System.out.println("Performance is good");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Samsung obj = new Samsung();
        Redmi obj1 = new Redmi();

        obj.charger();
        obj.display();
        obj.performance();

        // obj1.charger();
        // obj1.display();
        // obj1.performance();
    }
}
