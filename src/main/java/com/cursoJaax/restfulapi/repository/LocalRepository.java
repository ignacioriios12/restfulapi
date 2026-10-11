package com.cursoJaax.restfulapi.repository;

import com.cursoJaax.restfulapi.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LocalRepository extends JpaRepository <Local,Long>{

    // consulta con JPQL
    @Query("SELECT l FROM Local l WHERE l.name = :name")
    static Optional<Local> findLocalByNameWithJPQL(String name) {
        return null;
    }

    // consulta con inversion de control
    static Optional<Local> findByName(String name) {
        return null;
    }

    static Optional<Local> findByNameIgnoreCase(String name) {
        return null;
    }


}
