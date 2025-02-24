/**
 * Zadanie 5 - Muzeum bursztynu #9
 * Napisz program dla muzeum bursztynu. Program ma przechowywać
 * informacje o zbiorach, które się w nim znajdują.
 * Bursztyn ma barwę, twardość, gęstość oraz temperaturę topnienia (w st. Celsjusza).
 * Dodaj klika bursztynów.
 * Dodatkowe założenia:
 * -- program powinien umożliwiać wyświetlenie temperatury topnienia
 * dla dowolnego bursztynu w stopniach Fahrenheita. (metoda)
 * -- program powinien umożliwiać zwiększenie gęstości
 * bursztynu o dowolną wartość, przekazaną do obiektu. (metoda)
 *
 * https://pl.wikipedia.org/wiki/Bursztyn
 */

public class BursztynProgram {
    public static void main(String[] args) {

        //let's create a few ambers
        char[] barwa1 = {'j','a','s','n','o','ż','ó','ł','t','y'};
        Bursztyn b1 = new Bursztyn(barwa1, 2.05, 1.06, 288);
        char[] barwa2 = {'m','l','e','c','z','n','o','b','i','a','ł','y'};
        Bursztyn b2 = new Bursztyn(barwa2, 2.34, 1.08, 295);
        char[] barwa3 = {'n','i','e','b','i','e','s','k','i'};
        Bursztyn b3 = new Bursztyn(barwa3, 2.18, 1.07, 291);
        char[] barwa4 = {'z','i','e','l','o','n','y'};
        Bursztyn b4 = new Bursztyn(barwa4, 2.43, 1.09, 300);

        //wrzućmy bursztyny do tablicy
        Bursztyn[] bursztyns = new Bursztyn[4];
        bursztyns[0] = b1;
        bursztyns[1] = b2;
        bursztyns[2] = b3;
        bursztyns[3] = b4;

        //wyświetlimy info o wszystkich bursztynach
        for (Bursztyn b: bursztyns){
            b.display();
        }

        //wyświetlimy temperaturę topnienia w Fahrenheitach dla drugiego bursztyna
        System.out.println("--------------------");
        System.out.print("Temperatura topnienia w Fahrenheitach dla drugiego bursztyna: ");
        System.out.print(bursztyns[1].Zamiana());
        System.out.println();

        //wyświetlimy temperaturę topnienia w Fahrenheitach dla trzeciego bursztyna
        System.out.print("Temperatura topnienia w Fahrenheitach dla trzeciego bursztyna: ");
        System.out.print(bursztyns[2].Zamiana());

        //zwiększymy teraz gęstość 1 bursztyna o wartość 0.01
        System.out.println();
        System.out.print("Powiększona gęstość 1 bursztyna o 0.01: ");
        System.out.print(bursztyns[0].powiekszGestosc(0.01));



    }
}
