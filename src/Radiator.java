public class Radiator {
    char[] color;
    double weight;
    int power;

    //stwórzmy własny konstruktor - będziemy go potrzebować do wuświetlania info o kaloryferach
    Radiator(char[] color, double weight, int power){
         this.color = color;
         this.weight = weight;
         this.power = power;
    }

    //stwórzmy metodę do wyświetlania info o kaloryferach
    void display() {
        System.out.println("-------------");
        System.out.print("Color: ");
        for (char c : color) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Weight: " + weight);
        System.out.println("Power: " + power + "W");
    }

    //tworzymy metodę do zamiany mocy W -> kWh
    double powerInKwh(){
        return (double) power/1000;
    }

}


