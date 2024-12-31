public class EntierNaturel {
    private int valeur;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException(val);
        }
        this.valeur = val;
    }

    public int getVal() {

        return valeur;
    }

    public void setVal(int modifvaleur) throws NombreNegatifException {
        if (modifvaleur < 0) {
            throw new NombreNegatifException(modifvaleur);
        }
        System.out.println("Ancienne valeur: " + valeur);
        this.valeur = modifvaleur;
        System.out.println("Nouvelle valeur: " + valeur);
    }

    public void decrementer() throws NombreNegatifException {
        int valeurApresDecrement = valeur - 1;
        if (valeurApresDecrement < 0) {
            throw new NombreNegatifException(valeurApresDecrement);
        }
        this.valeur = valeurApresDecrement;
        System.out.println("La valeur après decrémentation: " + valeur);
    }

}
