package lab3java.test;

public class Obrot3D extends Obrot{ // takjakby obrot OS
        public Obrot3D(double kat){
            super(kat);
        }   // wlasciwy 3D, w radianach
            // katA, katB, katC -- jako alfa, beata..
            //  wywoluje 3x transformuj3D dla kazdego kata
        @Override
        public Punkt3D transformuj3D(Punkt3D p){  // wzgledem osi X
        // ew. poprawic aby otrzymywał os na której chcemy obracac
            // public Punkt3D transformuj3D( int os, double kat, Punkt3D p)

            double newY = p.getY() * Math.cos(kat) - p.getZ() * Math.sin(kat);
            double newZ = p.getY() * Math.sin(kat) + p.getZ() * Math.cos(kat);
            return new Punkt3D(p.getX(), newY, newZ);
        }

        @Override
        public Transformacja3D getTransformacjaOdwrotna3D()  throws BrakTransformacjiOdwrotnejException3D{
            return (Transformacja3D) new Obrot3D(-kat);
        }

        @Override
        public String toString(){
            return "Obrót o kąt:"+Math.toDegrees(kat)+" stopni w 3D";
        }

}
