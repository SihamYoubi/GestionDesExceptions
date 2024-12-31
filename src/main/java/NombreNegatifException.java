public class NombreNegatifException extends Exception {
    private int valeurErronee;

    public NombreNegatifException(int valeurErronee) {
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronnee() {
        return valeurErronee;
    }
}
