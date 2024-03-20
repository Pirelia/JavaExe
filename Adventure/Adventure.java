public class Adventure {
  
    public static void main(String args[]) {
        new Adventure().startGame();
        Merchant merchant = new Merchant("Bobs's Shop", new String[]{"Espada", "Poção de Cura", "Armadura"});
        merchant.interact();
        merchant.venderItem("Espada");
    }    
    
    public void startGame() {

        Mage player1 = new Mage();
        Barbarian player2 = new Barbarian();
        Goblin enemy1 = new Goblin();

        //Estado anterior às ações
        this.displayState(player1, player2, enemy1);

        player1.attack(enemy1);        
        player2.attack(enemy1);
        player1.attack(enemy1);
        
        // Estado após ações
        this.displayState(player1, player2, enemy1);
    }

        
        

    public void displayState(Player p1, Player p2, Enemy e1) {
        System.out.println();        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(e1);
    }

   
}