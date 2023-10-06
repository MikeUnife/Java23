
/**
 * EsempioOrologio
 */
import java.lang.Thread;

public class EsempioOrologio {

    public static void main(String[] args) {
        Orologio o;
        o = new Orologio();

        while (true) {

            o.tic();
            System.out.println(o.getOre() + "min:" + o.getMin() + "sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Gestisci l'eccezione qui, ad esempio, stampa il messaggio di errore o fai
                // altre operazioni necessarie.
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

        }
        // o.reset();
        // System.out.println(o.getOre() + "h:" + o.getMin());
    }
}