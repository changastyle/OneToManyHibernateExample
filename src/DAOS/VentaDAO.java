
package DAOS;

import java.util.Date;
import model.Venta;

public class VentaDAO extends AbstractDAO
{
    public static void insertar(Venta venta)
    {
        AbstractDAO.insertar(venta);
    }
}
