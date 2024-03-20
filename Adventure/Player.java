import java.util.ArrayList;

public abstract class Player {
    private int xp;
    private int hp;    
    private ArrayList<Item> items;

    public Player() {
        xp = 0;
        hp = 10;
        items = new ArrayList<Item>();
    }

    public String toString() {
        return super.toString()+" xp: "+xp+", hp: "+hp+", items: "+items;
    }

    public void attack(Enemy enemy) {
        enemy.hpDown();
        if(!enemy.isAlive()) {
            this.xpUp();
            Item item = enemy.getItem();
            items.add(item);
        }
    }

    public boolean isAlive() {
        return hp>0;
    }

    public void xpUp() {
        xp++;
    }

    public void xpDown() {
        xp--;
    }

    public void resetXp() {
        xp = 0;
    }

    public void hpUp() {
        hp++;
    }

    public void hpDown() {
        hp--;
    }



}
