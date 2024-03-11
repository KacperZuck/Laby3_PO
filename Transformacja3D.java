package lab3java.test;

public interface Transformacja3D {
        Punkt3D transformuj3D(Punkt3D p);
        Transformacja3D getTransformacjaOdwrotna3D()
                throws BrakTransformacjiOdwrotnejException3D;




}
