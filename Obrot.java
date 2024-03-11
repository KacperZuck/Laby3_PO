package lab3java.test;

public abstract class Obrot implements Transformacja {
        public double kat;
        public Obrot(double kat){   // w radianach 1= 180st/PI
            this.kat=kat;
        }

        public double getKat(){
            return kat;
        }

        @Override
        public Punkt transformuj(Punkt p){

            double newX = p.getX() * Math.cos(kat) - p.getY() * Math.sin(kat);
            double newY = p.getX() * Math.sin(kat) + p.getY() * Math.cos(kat);
            return new Punkt( newX, newY);
        }

        @Override
        public Transformacja getTransformacjaOdwrotna()  throws BrakTransformacjiOdwrotnejException{
            return new Obrot(-kat) {
                @Override
                public Punkt3D transformuj3D(Punkt3D p) {
                    return null;
                }

                @Override
                public Transformacja3D getTransformacjaOdwrotna3D() throws BrakTransformacjiOdwrotnejException3D {
                    return null;
                }
            };
        }

    public abstract Punkt3D transformuj3D(Punkt3D p);

    public abstract Transformacja3D getTransformacjaOdwrotna3D()  throws BrakTransformacjiOdwrotnejException3D;

    @Override
        public String toString(){
            return "Obrót o kąt:"+Math.toDegrees(kat)+" stopni";
        }

}
