package modelado_pss;

/**
 *
 * @author Oye MacDonald
 */
public class P_Principal {
    public static void main(String[] args) {
       Atributos_P atributos = new Atributos_P("Tierra", 6000, 5.97, 1.08, 12742, 1496, 0, true);
       atributos.Imprimir();
       Atributos_P atributos1 = new Atributos_P("Marte", 5, 6.39, 1.63, 6779, 2279, 0, true);
       atributos1.Imprimir();
    }
}
