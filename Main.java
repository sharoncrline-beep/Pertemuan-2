public class Main {
     public static void main(String[] args) {
         System.out.println("Game sedang loading...");

         Hero sharon = new Hero();
              sharon.name = "Sharon";
              sharon.level = 10;
              sharon.hp = 100;
              sharon.showProfile();
              sharon.attack();

              Weapon katanaLangit = new Weapon();
              katanaLangit.name = "Katana Langit";
              katanaLangit.damage = 150;
              katanaLangit.showWeapon();
    }
}