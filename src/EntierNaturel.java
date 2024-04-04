public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("La valeur ne peut pas être négative", val);
        }
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("La valeur ne peut pas être négative", val);
        }
        this.val = val;
    }

    public void decrementer() throws NombreNegatifException {
        if (val == 0) {
            throw new NombreNegatifException("La valeur est déjà à zéro", val);
        }
        val--;
    }

    public static void main(String[] args) {
        // Contenu de la méthode main pour tester la classe EntierNaturel
        try {
            EntierNaturel entier1 = new EntierNaturel(10);
            System.out.println("Valeur initiale : " + entier1.getVal());

            // Test setter
            entier1.setVal(5);
            System.out.println("Nouvelle valeur : " + entier1.getVal());

            // Test decrementer
            entier1.decrementer();
            System.out.println("Après décrémenter : " + entier1.getVal());

            // Test decrementer sur 0
            entier1.decrementer();
        } catch (NombreNegatifException e) {
            System.out.println("Erreur: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }
    }
}
