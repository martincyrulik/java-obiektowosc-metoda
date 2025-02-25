/**
 * Zadanie 6 - Rysowanie obrazów #11
 * Napisz program rysujący obrazy. Obraz jest kwadratem nxn, wypełniony wzorami.
 * Program powinien rysować obraz dla dowolnie podanego n oraz wzoru (znaku).
 * Narysuj obrazy:
 * n = 5, znak '$'
 * $$$$$
 * $$$$$
 * $$$$$
 * $$$$$
 * $$$$$
 * n = 100, znak = 'K'
 * n = 59, znak = 't'
 */

public class MainObraz {
    public static void main(String[] args) {

        Obraz obraz = new Obraz();

        //wyśwtlimy teraz obraz dla n = 5 i znaku $
        obraz.NarysujKwadrat(5, '$');

        //wyśwtlimy teraz obraz dla n = 100 i znaku 'K'
        System.out.println("---------------");
        obraz.NarysujKwadrat(100, 'K');

        //wyśwtlimy teraz obraz dla n = 59 i znaku 't'
        System.out.println("---------------");
        obraz.NarysujKwadrat(59, 't');
    }
}
