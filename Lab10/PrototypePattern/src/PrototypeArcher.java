class PrototypeArcher extends WarriorPrototype {
    public PrototypeArcher() {
        super("Archer");
    }

    @Override
    public void attack() {
        System.out.println("Archer prototype shoots");
    }
}
