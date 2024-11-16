// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WarriorPrototype swordsman = new PrototypeSwordsman();
        WarriorPrototype archer = new PrototypeArcher();
        WarriorPrototype spearman = new PrototypeSpearman();

        WarriorPrototype clonedSwordsman = swordsman.clone();
        WarriorPrototype clonedArcher = archer.clone();
        WarriorPrototype clonedSpearman = spearman.clone();

        clonedSwordsman.attack();
        clonedArcher.attack();
        clonedSpearman.attack();
    }
}