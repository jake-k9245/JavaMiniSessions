package lv1;

public class Main {

    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("피카츄", "전기", 100, 20, 10);
        Pokemon pieri = new Pokemon("파이리", "불꽃", 90, 25, 8);
        Pokemon kkobugi = new Pokemon("꼬부기", "물", 110, 18, 12);

        pikachu.printInfo();
        pieri.printInfo();
        kkobugi.printInfo();

    }
}
