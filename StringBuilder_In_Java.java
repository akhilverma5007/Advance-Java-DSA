public class StringBuilder_In_Java {
    public static void main(String[] args) {
        
        //String Performance
        String series = "";
        for (int i = 0; i < 26; i++) {
        char ch = (char)('a' + i);
        System.out.print(ch + " ");
        //series += i;//adding all characters
        }
        //System.out.println(series);
    
        
        //Solving and saving mrmory from getting waster by Using StringBuilder
        //StringBuilder is Mutable like Arrays
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        //String methods
        //1) .toCharArray()   (It converts string into array of characters)
        String name = "Akhil Verma";
        System.out.println(java.util.Arrays.toString(name.toCharArray()));

        //2) .length  (It will provide you the length)
        System.out.println(name.length());

        //3) .tolowerCase (converts to lowercase)
        System.out.println(name.toLowerCase());

        //4) .indexOf (It will give index value)
        System.out.println(name.indexOf("V"));

        //5) .lastIndexOf (it will give last index value)
        System.out.println(name.lastIndexOf("Verma"));

        //6) .strip()  (white spaces are removed)
        System.out.println(name.strip());

        //7) .split()
        String names = "John,Doe,Jane,Smith";
        String[] nameArray = names.split(",");
        System.out.println(java.util.Arrays.toString(nameArray));

        //Reverse a String in Java
        String nomad = "abcdefghijklmnopqrstuxyz";
        StringBuilder builder1 = new StringBuilder(nomad);
        System.out.println(builder1.reverse());

    }
}
