public class strongNumber {
    public static void main(String[] args) {
        int num = 145;
        String value = Integer.toString(num);
        int length = value.length();
        char ch;
        int sent;
        int fact;
        int result=0;
        for(int i=0;i<length;++i){
            ch = value.charAt(i);
            sent = Character.getNumericValue(ch);
            fact = 1;
         for(int j=1;j<=sent;++j){
             fact = fact*j;
            }
            result=result+fact;
        } 
        System.out.println(result + " is a Strong Number") ;
    }
}
