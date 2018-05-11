import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Metallica");
        list.add("Упячка");
        list.add("Cats");
        list.add("Hunter");
        list.add("Cannibal Corpse");

        int largestString = list.get(0).length();
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > largestString) {
                largestString = list.get(i).length();
                index = i;
            }
        }

        System.out.println(list.get(index) + " is largest string");
    }


}
