package lv1;

public class Pokemon {

    // 필드 정의
    private String name;
    private String type;
    private int hp;
    private int attack;
    private int defense;

    // 생성자
    public Pokemon(String name, String type, int hp, int attack, int defense) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    // 메서드
    public void attack(Pokemon targetPokemon) {

    }

    public void takeDamage(Integer amount) {

    }

    public void printInfo() {
        System.out.println(name + " | 타입: " + type + " | 체력: " + hp + " | 공격력: " + attack + " | 방어력: " + defense);
    }
}
