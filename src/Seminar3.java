import java.util.*;

public class Seminar3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // создание интового листа
        ArrayList<Integer> list1 = new ArrayList<>();

//        Object object; // корневой тип в java
//        list.add(1);        //Integer добавляет элемент в конец списка
//        list.add(.324);     //Double
//        list.add("Привет!");    //String
//        list.add(true); //Boolean
//
//        if (list.get(2) instanceof String) {
//            String a = (String) list.get(2);
//        }

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));//заполнили массив из 10 элементов рандомными числами в пределе 15 добавляя элементы в конец массива
            list1.add(new Random().nextInt(15));
        }

//        list.add(0, 1234); //добавляет элемент 1234 по индексу 0
//        list.add(list.size()/2, 1); //добавляет элемент 1 в середину массива
//        list.addAll(list1); //добавляет все элементы из другого списка
//        list.addAll(0, list1); //добавляет все элементы из другого списка по индексу 0
//        list.size(); //возвращает количество элементов в массиве
//        if (list.isEmpty()); //возвращает тру если список пустой
//        list.clear(); // чистит массив (присваивает всем объектам статус Null)
//        list.set(0, 1234); //изменяет параметр 0 на 1234

        ArrayList<String> list2 = new ArrayList<>(); // создание стрингового листа
        list2.add("Hello!");
        list2.add("Hello!");
        list2.remove(0); // удаляет элемент по индексу
        list2.remove("Hello!"); // удаляет элемент по содержимому
//        list2.get(0); // получить элемент по индексу
//        String as = list2.get(0);
        if (list2.contains("Hello!")); // возвращает тру если объект содержится в списке
//        list.trimToSize(); //обрезает массив до величины количества элементов list.size()
//        list.ensureCapacity(100); // убедиться в ёмкости массива

//        for (int i = 0; i < list.size(); i++) { // прохождение по всем элементам списка
//            System.out.println(list.get(i));
//        }
//
//        for (int i: list) { //фор ич жава проходит по всем элементам i списка list. С элементами в данном случае ничего сделать НЕЛЬЗЯ.
//            System.out.println(i);// выводит все элементы i списка
//        }
//
//        ListIterator<Integer> iterator = list.listIterator(list.size()-1); //
//        while (iterator.hasPrevious()){
//            int i = iterator.previous();
//            iterator.nextIndex();
//            System.out.println(i);
//            iterator.remove();
//        }

//        list.forEach(n -> System.out.println(n));

//        System.out.println(list.size());

        System.out.println(list);
        System.out.println(list1);
        System.out.println("-".repeat(16));

//        list.retainAll(list1);
        list.removeAll(list1);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(list);

        List<Integer> list3 = list1.subList(0, list1.size()/2);
        System.out.println(list3);

        list1.clear();
        list.forEach(n -> list1.add(0, n));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(null);

    }

}