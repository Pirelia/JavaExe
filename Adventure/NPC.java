//Classe abstrata NPC
public abstract class NPC {

    private String name;
    private int hp = 10;
    
    
    public  NPC (String name){
        this.name = name;
    }
    
    public boolean isAlive() {
        return hp>0;
    }

     public void hpUp() {
        hp++;
    }

    public void hpDown() {
        hp--;
    }
}