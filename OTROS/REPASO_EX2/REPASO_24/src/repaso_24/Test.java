package repaso_24;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        PRefrigerado ref = new PRefrigerado("10/03/2024", 004, 77717271);
        ref.mostrarInfo();

        PCongelado cong = new PCongelado("12/03/2005", 0006, -12);
        cong.mostrarInfo();

        PFresco fres = new PFresco("10/09/2025", 003, "10/05/2024", "España");
        fres.mostrarInfo();

    }
}
