package lab3java.test;

public class Punkt {
        private final double x,y;
        public Punkt(double x, double y) {  // przypisanie
            this.x=x;
            this.y=y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        @Override
        public boolean equals(Object obj) {
            if( obj instanceof Punkt){

                Punkt other = (Punkt)obj;
                return (x==other.x)&&(y==other.y);
            }
            return false;
        }
        @Override
        public int hashCode() {
            return 59 * Double.hashCode(x+y) +7;
        }
        @Override
        public String toString() {
            return "Klasa Punkt ma współżędne x:"+x+" i y:"+y;
        }
        public static final Punkt O = new Punkt(0, 0);
        /**
         * Punkt (1,0) w układzie współrzędnych
         */
        public static final Punkt E_X = new Punkt(1, 0);

        /**
         * Punkt (0,1) w układzie współrzędnych
         */
        public static final Punkt E_Y = new Punkt(0, 1);

}
