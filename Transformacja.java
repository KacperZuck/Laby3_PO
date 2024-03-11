package lab3java.test;

public interface Transformacja {
        Punkt transformuj(Punkt p);
        Transformacja getTransformacjaOdwrotna()
                throws BrakTransformacjiOdwrotnejException;


}
