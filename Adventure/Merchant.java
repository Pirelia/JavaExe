import java.util.ArrayList;
import java.util.List;

public class merchant extends NPC {

    private int totalItens;
    private int;
    private ArrayList<Item> inventory;

    
    
    public void addToInventory(Item item){
        inventory.add(item);

    }

    public void listItemsForSale() {
        System.out.println("Itens disponiveis para venda: ")
        for (Item item : inventory) {
            System.out.println("- "+ item.getName() +": "+ item.getPrice() + " gold");

        }

        public void interact() {
            System.out.println("Bem vindo a loja de " + name + "!")
            listItemsForSale();

        }
    }

}