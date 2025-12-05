package repaso_3;

/**
 *
 * @author alumno
 */
public class Rueda {
    private String material;
    private int pulgadas;
  
    public String getMaterial(){
        return material;
    }
    
    public int getPulgadas(){
        return pulgadas;
    }

    public void setMaterial(String m) {
        material = m;
    }

    public void setPulgadas(int p) {
        pulgadas = p;
    }
      @Override
    public String toString() {
        return material + pulgadas;
    }
}
