public class Mago implements Jogador{
    private int xp;

    public void ganharxp(){
        xp++;
    }
    public void perderxp(){
        xp--;
    }
    public void atacar(Inimigo inimigo){
        inimigo.receberDano();
        inimigo.receberDano();
    }
    public void prepararmagia(){
        System.out.println("PELA LUUUZZZ!!!");
    }

    public String toString(){
        return "Mago XP = "+xp;
    }
}
