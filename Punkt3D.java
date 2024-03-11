package lab3java.test;

public class Punkt3D extends Punkt {    // Dziedziczenie po Punkt
    private final double z;
    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z=z;
    }
    public double getZ(){
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Punkt3D){

            Punkt3D other = (Punkt3D) obj;
            return super.equals(obj)&&(z==other.z);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 7*super.hashCode()+13;
    }

    @Override
    public String toString() {
        return "Klasa Punkt3D ma współżędne x:"+super.getX()+", y:"+super.getY()+" i z:"+z;
    }
}
