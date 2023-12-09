import java.util.ArrayList;

public class ArrayList_In_Java {
    public static void main(String[] args) {
        ArrayList<Integer> tempList = new ArrayList<>();

        tempList.add(233);
        tempList.add(23);
        tempList.add(34433);
        tempList.add(5553);
        tempList.add(44343);


        //System.out.println(tempList);
        //System.out.println(tempList.toArray());
        //System.out.println(tempList.contains(233));

        // tempList.set(0, 10000);
        // System.out.println(tempList);
        // tempList.remove(0);
        // System.out.println(tempList);

        for (int i = 0; i < 5; i++) {
            System.out.print(tempList.get(i));
        }
        System.out.println(tempList);
    }
}
