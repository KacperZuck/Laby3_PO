package lab3java.test;

public class ZlozenieTransformacji3D implements Transformacja3D{

        private final Transformacja3D[] transformacje;

        public ZlozenieTransformacji3D(Transformacja3D... transformacje){
            this.transformacje = transformacje;
        }

        @Override
        public Transformacja3D getTransformacjaOdwrotna3D() throws BrakTransformacjiOdwrotnejException3D {
            // Zwracamy złożenie transformacji odwrotnych w odwrotnej kolejności
            Transformacja3D[] odwrotne = new Transformacja3D[transformacje.length];
            for (int i = 0; i < transformacje.length; i++) {
                odwrotne[i] = transformacje[transformacje.length - 1 - i].getTransformacjaOdwrotna3D();
            }
            return new ZlozenieTransformacji3D(odwrotne);
        }

        @Override
        public Punkt3D transformuj3D(Punkt3D p) {
            // Wykonujemy kolejne transformacje na punkcie
            for (Transformacja3D transformacja : transformacje) {
                p = transformacja.transformuj3D(p);
            }
            return p;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Zlozenie transformacji: [");
            for (int i = 0; i < transformacje.length; i++) {
                sb.append(transformacje[i]);
                if (i < transformacje.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }


}
