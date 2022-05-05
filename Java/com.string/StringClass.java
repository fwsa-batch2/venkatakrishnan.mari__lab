public class StringClass {

    public static void main(String[] args) {
        
        String str ="Hello World";
        String[] ftr = str.split(" ", 2);
        for(String a : ftr)
        System.out.println(a); 

        String gtr = "Venkatakrishnan";
        System.out.println(gtr.length());

        String name = "Venkatakrishnan";
        System.out.println(name.substring(2,7));
    }
    
}
