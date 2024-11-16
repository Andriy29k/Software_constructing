import java.util.Locale;

public class WarriorFactory {
    public Warrior createWarrior(String type){
        return switch (type.toLowerCase(Locale.ROOT)){
            case "swordsman" -> new Swordsman();
            case "archer" -> new Archer();
            case "spearman" -> new Spearman();
            default -> throw new IllegalArgumentException("Invalid warrior type: " + type);
        };
    }
}
