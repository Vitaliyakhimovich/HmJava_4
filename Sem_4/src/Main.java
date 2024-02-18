import main.GbList;
import main.list.imple.GbArrayList;
import main.list.imple.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
//        GbList<String> list = new GbArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        System.out.println(list);
//
//        list.remove(3);
//        System.out.println(list);
//
//        System.out.println(list.size());

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println("----------------------------------------------------------------");

//        list.addLast(2);
//        System.out.println(list);
//        System.out.println("----------------------------------------------------------------");

        list.addFirst(3);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(3));
    }
}
