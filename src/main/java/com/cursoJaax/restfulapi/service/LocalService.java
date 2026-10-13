package com.cursoJaax.restfulapi.service;

import com.cursoJaax.restfulapi.entity.Local;
import com.cursoJaax.restfulapi.error.LocalNotFoundException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface LocalService {
    List<Local> findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocoal(Long id);
    Optional<Local> findLocalByNameWithJPQL (String name);
    Optional<Local> findByName(String name);
    Optional<Local> findByNameIgnoreCase(String name);
    Local findLocalById(Long id) throws LocalNotFoundException;


}


