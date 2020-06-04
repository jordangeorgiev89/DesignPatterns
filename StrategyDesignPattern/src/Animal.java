public class Animal {
    public Flys flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbilty(Flys newFlyType) {
        flyingType = newFlyType;
    }
}
