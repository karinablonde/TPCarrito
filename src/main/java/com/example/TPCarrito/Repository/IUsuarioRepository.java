package com.example.TPCarrito.Repository;

import com.example.TPCarrito.Model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class IUsuarioRepository {
    public Optional<Usuario> findById(Integer id) {
        return null;
    }
}
