package MateAcademy.JavaBasicExtended.MethodAdvanced.Fighterwin;

public class main {
    public static void main(String[] args) {
        Fighter first = new Fighter();
        first.setDamagePerHit(10);
        Fighter second = new Fighter();
        second.setHealth(30);

        FighterService fighterService = new FighterService();

        System.out.println(fighterService.willFighterWin(first, second, 5));
        System.out.println(fighterService.willFighterWin(first, second, 2));
        System.out.println(fighterService.willFighterWin(first, second, 3));
    }
}
