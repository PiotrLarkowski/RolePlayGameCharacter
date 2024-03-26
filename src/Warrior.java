public class Warrior extends Fighter{
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        boolean vulnerable = fighter.isVulnerable();
        if(fighter.getClass()==Wizard.class){
            return 10;
        }else{
            if(vulnerable){
                return 10;
            }else{
                return 6;
            }
        }
    }
}
