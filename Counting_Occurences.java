public class Counting_Occurences {
    public static void main(String[] args) {
        // 1,2,3,4,5,3,6,7,8,3  ==> Ans = 3
        int n = 45533336;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n = n /10;
        }
        System.out.println(count);
    }
}
