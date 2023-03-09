import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("Anna");
        list.add("Maria");
        list.add("Julia");

        System.out.println(list.get(1));

        list.remove(2);

        list.clear();

        System.out.println(list.isEmpty());

        System.out.println(Arrays.toString(list.toArray()));

    }
}
