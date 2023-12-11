public class Practice{
    public static void main(String[] args) {
        //Reverse a string
        String output = reverse("ddd");
        System.out.println(output);

        }
        static String reverse(String str1){
        String str = "akhil";
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        System.out.println(builder);
        return builder.toString();
        
    }
}