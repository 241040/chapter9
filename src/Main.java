public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "勇者の剣(レプリカ)";
        s.damage = 10;

        Hero h1 = new Hero();
        h1.name = "勇者ヒンメル";
        h1.hp = 100;
        h1.sword = s;
        Hero h2 = new Hero();
        h2.name = "フリーレン";
        h2.hp = 100;
        Hero h3 = new Hero();
        h3.name = "センシ";
        h3.hp = 1000;
        Wizard w = new Wizard();
        w.name = "ハイター";
        w.hp = 50;

        w.heal(h1);
        w.heal(h2);
        w.heal(h3);

        System.out.println("現在の武器は" + h1.sword.name);

        /*Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';*/
    }
}
