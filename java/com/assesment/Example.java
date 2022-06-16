public class Example
{
    public void reverseWordInMyString(String str)
    {
        String[] words = str.split(" ");
   for (int i = words.length-1; i<words.length; ++i){
        System.out.print(words[i]+ " ");
    }}
    public static void main(String[] args)
    {
        Example obj = new Example();
        obj.reverseWordInMyString("Prasanna venkatesh");
    }
}