public class Wizard extends Fighter{
    boolean preparingSpell = false;
    boolean vulnerable = true;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        preparingSpell = !preparingSpell;
    }
    @Override
    boolean isVulnerable() {
        if(preparingSpell){
            vulnerable = false;
        }else{
            vulnerable = true;
        }
        return vulnerable;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.getClass()==Warrior.class){
            if(preparingSpell){
                return 12;
            }else{
                return 10;
            }
        }else{
            if(preparingSpell){
                return 12;
            }else{
                return 3;
            }
        }
    }
}
