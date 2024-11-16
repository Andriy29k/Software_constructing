abstract class WarriorPrototype implements Cloneable{
    private String name;

    public WarriorPrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attack();

    @Override
    public WarriorPrototype clone(){
        try {
            return (WarriorPrototype) super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException("Cloning not supported", e);
        }
    }
}
