package com.cursoJaax.restfulapi.service;

import com.cursoJaax.restfulapi.entity.Local;

import java.util.List;

public interface LocalService {
    List<Local> findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocoal(Long id);





}


