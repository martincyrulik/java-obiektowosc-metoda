/**
 * Zadanie 1 - Informacje o kaloryferach
 * Napisz program przechowujący informacje o kaloryferach. Kaloryfer ma
 * kolor, wagę i moc (jednostka Wat).
 * Wypisz wszystkie informacje o kaloryferach.
 */

public class Main {
    public static void main(String[] args) {

        char[] red = {'r','e','d'};
        char[] blue = {'b','l','u','e'};
        Radiator r1 = new Radiator(red, 55, 1025);
        Radiator r2 = new Radiator(blue, 120, 5105);
        Radiator r3 = new Radiator(red, 15, 500);

        //stwórzmy tablicę kaloryferów
        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;


        //a co w przypadku gdy wychodzi nowa wersja radiatora -> radiators[1],
        //i będzię już nieco lżejszy - waga ze 120 kg na 119
//        radiators[1].weight = 119;
//        //chcemy wyświetlić o nim informację
//        System.out.println("-------------");
//        System.out.print("Color: ");
//        for (char c : radiators[1].color){
//            System.out.print(c);
//        }
//        System.out.println();
//        System.out.println("Weight: " + radiators[1].weight);
//        System.out.println("Power: " + radiators[1].power + "W");

        //Gdybym chciał wyświetlić informację o wszystkich kaloryferach zaraz po
        //tym jak weszła nowa wersja kaloryfera radiators[1], to znowu muszę
        //kopiować cały kod związany z wyświetlaniem:
//        for (Radiator r : radiators) {
//            System.out.println("-------------");
//            System.out.print("Color: ");
//            for (char c : r.color) {
//                System.out.print(c);
//            }
//            System.out.println();
//            System.out.println("Weight: " + r.weight);
//            System.out.println("Power: " + r.power + "W");
//        }
        //zróbmy to prościej używając metody display:
        for (Radiator r : radiators){
            r.display();    //szybko i wygodnie bez lopiowania całych linii kodu
        }

        //a dla pojedynczego kalortfera, którego parametry się zmieniły
        //również mogę wywołać metodę display()
        radiators[1].weight = 119;
        radiators[1].display();     //

    }
}
