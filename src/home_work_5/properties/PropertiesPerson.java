package home_work_5.properties;

import home_work_5.IProperties.IProperties;

import java.util.Random;

public class PropertiesPerson implements IProperties {
    private String name = "Анатолий,Екатерина,Михаил,Валик,Мефодий,Констанция,Гриня,Вася,Джозепа";
    private String charAnySymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String charRus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private String nick = "RassKal,BigMan,GiGabytE,Alex&&&,ValeraNastaloTvoeVremu,SharliGrey";

    @Override
    public void setNick(String nick) {
        this.nick += nick;
    }

    @Override
    public void setName(String name) {
        this.name += name;
    }

    @Override
    public String generationNameReal() {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        String[] arraysName = name.split(",");
        int random = r.nextInt(arraysName.length - 1);
        sb.append(arraysName[random]);
        return sb.toString();

    }

    @Override
    public String generationNameChar(int length) {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(62);
            sb.append(charAnySymbols.charAt(random));
        }
        return sb.toString();
    }

    @Override
    public String generationNameCharRuss(int length) {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(62);
            sb.append(charRus.charAt(random));
        }
        return sb.toString();
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
    public String generationNickChar(int length) {
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
        return 0;
    }

    @Override
    public String password() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5 + random.nextInt(6); i++) {
            sb.append(str.charAt(random.nextInt(26)));
        }
        return sb.toString();
    }

}
