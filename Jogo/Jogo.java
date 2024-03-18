public class Jogo {
    
    private Jogador jog1;
    private Jogador jog2;

    private Inimigo ini1;
    private Inimigo ini2;

    public static void main(String args[]) {
        new Jogo().rodar();
    }

    public void rodar() {
        jog1 = new Paladino();
        jog2 = new Mago();
        ini1 = new Orc();
        ini2 = new Orc();
        this.mostraSituacao();
        
        jog1.atacar(ini1);
        this.mostraSituacao();

        jog2.atacar(ini1);
        this.mostraSituacao();
        
        jog2.ganharXP();
        this.mostraSituacao();
        
        jog1.atacar(ini2);
        this.mostraSituacao();
    }

    public void mostraSituacao() {
        System.out.println("Situação do jogo");
        System.out.println(jog1);
        System.out.println(jog2);
        System.out.println(ini1);
        System.out.println(ini2);
        System.out.println("--------------------");
    }
}
