package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String translate = "Неизвестное слово. " + eng;
        return translate;
    }
    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String result = dummyDic.engToRus("qwerty");
        System.out.println(result);
    }
}
