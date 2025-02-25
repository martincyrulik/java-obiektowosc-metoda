public class Obraz {
    int n;
    char znak;

    //zrobimy metodę która na podstawie zadanej liczby n
    //i znaku wyświetli kwadrat nxn
    void NarysujKwadrat(int n, char znak){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
