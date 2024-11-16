
public class Main {
    public static void main(String[] args) {
        WarriorFactory factory = new WarriorFactory();

        Warrior swordsman = factory.createWarrior("swordsman");
        swordsman.attack();

        Warrior archer = factory.createWarrior("archer");
        archer.attack();

        Warrior spearman = factory.createWarrior("spearman");
        spearman.attack();
    }
}