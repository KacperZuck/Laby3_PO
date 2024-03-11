package lab3java.test;

public class Main {
    public static void main(String[] args) {
        try
        {
            /*
            Punkt p1 = new Punkt(2, 2); // Początkowy punkt (2, 2)
            System.out.println("Początkowy punkt: " + p1);

            Transformacja[] transformacje = {
                    new Translacja(3, 4), // Translacja o (3, 4) -- DODAJE
                    new Skalowanie(2, 2) // Skalowanie o 2 wzdłuż osi x i y -- MNOZY
            };
            // tworzymy zlozenie jako argument z plikiem danych
            Transformacja zlozenie = new ZlozenieTransformacji(transformacje);
            System.out.println("Wykonujemy złożenie transformacji: " + zlozenie);

            Punkt p2 = zlozenie.transformuj(p1); // Wykonanie złożenia transformacji dla x (2+3)*2
            System.out.println("Po złożeniu transformacji: " + p2);

            Transformacja zlozenieOdwrotna = zlozenie.getTransformacjaOdwrotna(); // Pobranie transformacji odwrotnej
            System.out.println("Transformacja odwrotna: " + zlozenieOdwrotna);

            Punkt p3 = zlozenieOdwrotna.transformuj(p2); // Wykonanie transformacji odwrotnej
            System.out.println("Po transformacji odwrotnej: " + p3);
             */

            Punkt3D P1 = new Punkt3D(1,2,3);
            System.out.println("Punkt początkowy: "+P1);
            Transformacja3D[] transformacje3D ={
                    new Translacja3D(15, 16 , 17),
            };

            Transformacja3D zlozenie3D = new ZlozenieTransformacji3D(transformacje3D);
            System.out.println("Złożenie transformcji3D: "+ zlozenie3D);
            Punkt3D P2 = zlozenie3D.transformuj3D(P1);
            System.out.println("Po złożeniu3D: "+P2);

            double kat = Math.PI; // 180 stopni w radianach
            Obrot3D obrot = new Obrot3D(kat);

            System.out.println(obrot);

            Transformacja3D zlozenieOdwrotne3D = zlozenie3D.getTransformacjaOdwrotna3D();
            System.out.println("Odwrotna3D: "+zlozenieOdwrotne3D);
            Punkt3D P3 = zlozenieOdwrotne3D.transformuj3D(P2);
            System.out.println("Po odwrotnym3D: "+P3);

        }
            catch(BrakTransformacjiOdwrotnejException3D ex){
            ex.printStackTrace();
        }
            System.out.println();
    }
}