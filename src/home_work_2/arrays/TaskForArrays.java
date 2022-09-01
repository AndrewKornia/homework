package home_work_2.arrays;



public class TaskForArrays {

    /**
     * Метод находит сумму четных эдементов массива
     * @param container передаем массив в аргумент
     * @return врщврашаем переменннцю кторая хранит суму  четных эдементов массива
     */
    public static int sumOfEvenPositiveElements(int[]container){
        int sum = 0;
        for(int i = 0;i<container.length;i++){
            if(container[i]%2==0){
                sum+=container[i];
            }
        }
        return  sum;
    }

    /**
     * метод нахиодит максимальное число из всех чисел в масиве
     * @param container передаем массив в аргумент
     * @return возвращаем переменную кготорая хранит максимальный здемент
     */
    public static int maximumElement(int []container){
        int maxElement = 0;
        for(int i = 0;i<container.length;i+=2){
            if(i%2==0){
                if(container[i]>=maxElement){
                    maxElement=container[i];
                }
            }
        }
        return maxElement;
    }

    /**
     * находим элемнты массивая , которые меньше среднего арифметического
     * @param container передаем массив в аргумент
     * @return возыращаем минимальные эдементы массива
     */
    public static String arithmeticMean(int [] container){
        int sum = 0;
        for (int i = 0;i<container.length;i++){
            sum+=container[i];
        }
       String str = " ";
        sum/=container.length;
        for (int j = 0;j<container.length;j++){
            if(container[j]<sum){
                str +=container[j]+",";
            }
        }
        return str;
    }

    /**
     * метод находит 2 минисальных эдемента массива
     * @param container передаем массив в аргумент
     * @return возвращает перемнную с  2 минмальными числами массива
     */
    public static String tooMinElement(int[] container){ //Есть вопросы поповоду изначальног оминимального числа
        int min1 =99;
        for (int i =0; i<container.length;i++) {
            if (container[i] < min1) {
                min1 = container[i];
            }
        }
            container[0]=min1;
            int min2 = 99;
            for(int j = 1;j<container.length;j++){
                if(container[j]<min2){
                    min2=container[j];
                }
            }
            String result = ""+min1+","+min2;
            return result;
    }

    /**
     *метод Находит   сумму всех цифр целочисленного массива
     * @param container передаем массив в аргумент
     * @return возвращаем пееремную которая хранит суммк все чисел массива
     */
    public static int sumNumerArray(int[] container){
        int sum=0;
        for (int i = 0;i< container.length;i++){
            if(container[i]/10==0){
                sum+=container[i];
            }else {
                sum+=container[i]%10;
                sum+=container[i]/10%10;
            }
        }
        return sum;
    }
    public static int[] deleteElemets(int[]container){
        int j = 0;
        int[] resultArr = new int [container.length/2];
        for(int i =0;i<container.length;i+=2,j++){
            resultArr[j]=container[i];
        }
        return resultArr;
    }


}
