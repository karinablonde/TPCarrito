package com.example.TPCarrito.Repository;

import com.example.TPCarrito.Model.DetalleOrden;
import org.springframework.stereotype.Repository;

@Repository
public class IDetalleOrdenRepository {

    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOrden;
    }
}