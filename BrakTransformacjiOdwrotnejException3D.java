package lab3java.test;

public class BrakTransformacjiOdwrotnejException3D extends Exception{
        public BrakTransformacjiOdwrotnejException3D()
        {
            //Niejawne wywołanie konstruktora klasy nadrzędnej
            //super();
        }
        /*
         * Konstruktor przyjmujący jako parametr tekst opisujący błąd
         */
        public BrakTransformacjiOdwrotnejException3D(String message) {
            super(message);
        }
        /*
         * Konstruktor przyjmujący jako parametr referencje do innego
         * wyjątku, który spowodował błąd
         */
        public BrakTransformacjiOdwrotnejException3D(Throwable cause) {
            super(cause);
        }
        /*
         * Konstruktor przyjmujący jako parametr tekst opisujący błąd
         * oraz wyjątek, który spowodował błąd.
         */
        public BrakTransformacjiOdwrotnejException3D(String message, Throwable cause) {
            super(message, cause);
        }

}
