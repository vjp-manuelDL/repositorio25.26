package repasot6_07;

/**
 *
 * @author Admin
 */
public interface ControlRemoto {
    void encender();
    void apagar();
    void bajarVolumen();
    void subirVolumen();
    void cambiarCanal(float canal); // ← con parámetro
}
