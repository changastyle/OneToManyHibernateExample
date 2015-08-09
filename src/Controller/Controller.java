package Controller;

import DAOS.DetalleVentaDAO;
import DAOS.VentaDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.DetalleVenta;
import model.Venta;

public class Controller
{
    public static void crearVenta()
    {
        Date date = new Date();
        Venta venta = new Venta();
        venta.setFecha(date);
        
        List <DetalleVenta> arr = new ArrayList<DetalleVenta>();
        for(int i = 0 ; i < 3 ; i++)
        {
            DetalleVenta  detalleVenta = new DetalleVenta();
            detalleVenta.setCantidad(3);
            detalleVenta.setFkProducto(4);
            arr.add(detalleVenta);
        }
        venta.setDetallesVenta(arr);
        VentaDAO.insertar(venta);
    }
    /*private static DetalleVenta crearDetalleVenta(int fkVenta)
    {
        DetalleVenta  detalleVenta = new DetalleVenta();
        detalleVenta.setCantidad(3);
        detalleVenta.setFkProducto(4);
        detalleVenta.setFkVenta(fkVenta);
        
        DetalleVentaDAO.insertar(detalleVenta);
        return detalleVenta;
    }*/
}
