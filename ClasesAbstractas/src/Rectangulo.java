public class Rectangulo extends Geometricas
{
    @Override
    public double Area() {
    double resultado= this.getBase() *this.getAltura();
    return resultado;
    }

    @Override
    public double Perimetro() {
        return 0;
    }


}
