package home_work_1;

public class CreatePhonNamber {

    /**
     * ВВобще вроде все работает но хочу довести код так чтобы пользователь вводил саи номер , так же выбирпл самостоятельно положение скобок и тере!!!!!!
     * @param args
     */
    public static void main(String[] args) {
        int[] container = {1,3,5,3,7,4,2,8,4,2};

        String str = createPhoneNumber(container);
        System.out.println( str );

    }

    /**
     * Метод который принимает массив чисел
     * @param container массив из 10 чисел
     * @return возвращает отформатированую строку
     */
    public static String createPhoneNumber(int[]container ){
        String str = "";
        for(int i = 0;i<=container.length- 1;i++){
            if(i==container.length-7) {
                str += ")";
                str +=container[i];
            }else if(i==container.length - 4) {
                str+="-";
                str +=container[i];
            }else {
                str +=container[i];
            }
        }
        return "("+str;
    }
}