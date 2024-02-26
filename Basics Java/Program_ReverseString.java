public class Program_ReverseString {
    public static void main(String[] args) {
        // StringBuilder builder = new StringBuilder();
        // for(int i = 0; i < 26; i++){
        //     char ch = (char)('a' + i);
        //     builder.append(ch);
        // }
        // System.out.println(builder.reverse());
        String name = "Akhil Verma";

       StringBuilder strBuilder = new StringBuilder(name);
       strBuilder.reverse();

       String output = strBuilder.toString();
       System.out.println(output);
    }
}
