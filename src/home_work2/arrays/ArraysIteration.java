package home_work2.arrays;

public class ArraysIteration {


    /**
     * ПЕребор масивва с помощью цикла do While
     * @param container Мыссив который передаются методу
     * @return вовращение массва
     */
    public static int [] doWhile(int[] container){
        int i =0;
        do {
            System.out.println(container[i]);
            i++;
        }while (i<container.length-1);
        return container;


    }

    /**
     * ПЕребор масивва с помощью цикла while
     * @param container  Мыссив который передаются методу
     * @return вовращение массва
     */
    public static int[] wHile(int[]container){
        int i =0;
        while (i<container.length){
            System.out.println(container[i]);
            i++;

        }
        return container;
    }

    /**
     * ПЕребор масивва с помощью цикла for
     * @param containre  Мыссив который передаются методу
     * @return вовращение массва
     */
    public static int[] foR(int[]containre){
        for (int i =1;i<containre.length;i++){
            System.out.println(containre[i]);
        }
        return containre;
    }

    /**
     * ПЕребор масивва с помощью цикла foreach
     * @param container  Мыссив который передаются методу
     * @return вовращение массва
     */
    public static int[] forE(int[]container){
        for(int i:container){
            System.out.println(i);
        }
        return container;
    }

}
