public class Paladino implements Jogador {
    private int xp;

    public void atacar() {
        System.out.println("Haa!!");
    }
    public void atacar(Inimigo inimigo){
        inimigo.receberDano();
        inimigo.receberDano();
    }
    public void ganharXP() {
        xp++;
    }

    public void perderXP() {
        xp--;
    }

    public String toString() {
        return "Paladino: XP="+xp;
    }

    public void pegararma(){
        System.out.println("Paladino pegou suas armas 🗡️espada  🛡️escudo");
}
