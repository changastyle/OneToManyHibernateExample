package DAOS;

import model.DetalleVenta;

public class DetalleVentaDAO extends AbstractDAO
{
    public static void insertar(DetalleVenta detalleVenta)
    {
        AbstractDAO.insertar(detalleVenta);
    }
}
