public class Enemy {

    private Item item;
    private in hp;

    public Enemy () {
        hp = 10;
        items = new Item();
        item.setName(name"AK47");

    }

    public Item getItem() {
        Item tempItem = item;
        this.item = null;

        return tempItem;

    }
    public String toString() {
        return super.toString()+"hp: "+hp+", Item: "+item;
    } 
    public boolean isAlive() {
        return hp > 0;
    }

    public void  hpUP() {

    }

    public void  hpDown() {


    }
}