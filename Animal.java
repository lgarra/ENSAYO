
public class Animal {
    protected double peso;
    protected double altura;
    protected Alimento alimsIngeridos[];

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setAlimsIngeridos(Alimento alimsIngeridos[]){
        this.alimsIngeridos = alimsIngeridos;
    }

    public Alimento[] getAlimsIngeridos(){
        return this.alimsIngeridos;
    }

    public double getPeso(){