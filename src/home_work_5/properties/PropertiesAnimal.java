package home_work_5.properties;

import home_work_5.IProperties.IProperties;

import java.util.Random;

public class PropertiesAnimal implements IProperties {
    private String charAnySymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String charRus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private String nick = "RassKal,BigMan,GiGabytE,Alex&&&,ValeraNastaloTvoeVremu,SharliGrey";
    private  int age =1;



    @Override
    public void setNick(String nick) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String generationNameReal() {
        return null;
    }

    @Override
    public String generationNameChar(int length) {
        return null;
    }

    @Override
    public String generationNameCharRuss(int length) {
        return null;
    }

    @Override
    public String generationNIckReal() {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        String[] arraysName = nick.split(",");
        int random = r.nextInt(arraysName.length - 1);
        sb.append(arraysName[random]);
        return sb.toString();
    }

    @Override
    public String generationNickChar(int length)  {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(62);
            sb.append(charAnySymbols.charAt(random));
        }
        return sb.toString();
    }

    @Override
    public String generationNickCharRuss(int length) {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(62);
            sb.append(charRus.charAt(random));
        }
        return sb.toString();
    }

    @Override
    public int ageAdd() {
        Random random = new Random();
        age =1+ random.nextInt(14);
        return age;

    }

    @Override
    public String password() {
        return null;
    }
}
