package home_work_4.Test;

import home_work_4.DataContainer;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] containre = new Integer[10];
        DataContainer<Integer> container = new DataContainer<>(containre);
        ComparatorHW cmp1= new ComparatorHW();
        int index0 = container.add(90);
        System.out.println(container.get(0));
        int index1 = container.add(20);
        System.out.println(container.get(1));
        int index2 = container.add(20);
        System.out.println(container.get(2));
        int index3 = container.add(40);
        System.out.println(container.get(3));
        int index4 = container.add(50);
        System.out.println(container.get(4));
        int index5 = container.add(70);
        System.out.println(container.get(5));
        int index6 = container.add(70);
        System.out.println(container.get(6));
        int index7 = container.add(80);
        System.out.println(container.get(7));
        int index8 = container.add(90);
        System.out.println(container.get(8));
        int index9 = container.add(100);
        System.out.println(container.get(9));
        int index10 = container.add(10);
        System.out.println(container.get(10));
        boolean indexDel=container.delete(0);
        System.out.println(indexDel);
        boolean itemDel = container.delete((Integer) 20);
        System.out.println(itemDel);
        System.out.println(Arrays.toString(container.getItems()));
        container.sort(cmp1);
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container);
        container.sort(container);
        System.out.println(container);






    }



}
