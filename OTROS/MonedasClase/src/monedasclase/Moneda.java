package monedasclase;

// clase moneda
public class Moneda {
    private float valorMoneda;
    private String paisMoneda;
    private String materialMoneda;

    // para instanciar la moneda con los valores
    public Moneda(float valor, String pais, String mat) {
        this.valorMoneda = valor;
        this.paisMoneda = pais;
        this.materialMoneda = mat;
    }
 // getters y setter con "insert code"
    public float getValorMoneda() {
        return valorMoneda;
    }

    public void setValorMoneda(float valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    public String getPaisMoneda() {
        return paisMoneda;
    }

    public void setPaisMoneda(String paisMoneda) {
        this.paisMoneda = paisMoneda;
    }

    public String getMaterialMoneda() {
        return materialMoneda;
    }

    public void setMaterialMoneda(String materialMoneda) {
        this.materialMoneda = materialMoneda;
    }
    
    
    
    
}
