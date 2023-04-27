package MateAcademy.JavaBasicExtended.MethodAdvanced.Fighterwin;

public class FighterService {
    public boolean willFighterWin(Fighter firstFighter, Fighter secondFighter, int hits) {
        int totalDamage = firstFighter.getDamagePerHit() * hits;
        return totalDamage >= secondFighter.getHealth();


    }
}