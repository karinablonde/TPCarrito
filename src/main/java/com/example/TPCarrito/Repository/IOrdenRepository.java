package com.example.TPCarrito.Repository;

import com.example.TPCarrito.Model.Orden;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class IOrdenRepository {
    public Optional<Orden> findById(Integer id) {
        return null;
    }

    public List<Orden> findAll() {
        return null;
    }

    public Orden save(Orden orden) {
        return orden;
    }
}
