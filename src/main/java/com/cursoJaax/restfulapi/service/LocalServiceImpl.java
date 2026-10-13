package com.cursoJaax.restfulapi.service;

import com.cursoJaax.restfulapi.entity.Local;
import com.cursoJaax.restfulapi.error.LocalNotFoundException;
import com.cursoJaax.restfulapi.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class LocalServiceImpl implements LocalService{

    @Autowired
    LocalRepository localRepository;


    @Override
    public List<Local> findAllLocals() {
        return localRepository.findAll();
    }

    @Override
    public Local saveLocal(Local local) {
        Local save = localRepository.save(local);
        return save;
    }

    @Override
    public Local updateLocal(Long id, Local local) {
        Local localdb= localRepository.findById(id).get();
        if(Objects.nonNull(local.getCode()) && !"".equalsIgnoreCase(local.getCode())){
            localdb.setCode(local.getCode());
        }
        if(Objects.nonNull(local.getFloor()) && !"".equalsIgnoreCase(local.getFloor())){
            localdb.setFloor(local.getFloor());
        }
        if(Objects.nonNull(local.getName()) && !"".equalsIgnoreCase(local.getName())){
            localdb.setName(local.getName());
        }


        Local save = localRepository.save(localdb);
        return save;
    }

    @Override
    public void deleteLocoal(Long id) {
        localRepository.deleteById(id);

    }

    @Override
    public Optional<Local> findLocalByNameWithJPQL(String name) {
        return LocalRepository.findLocalByNameWithJPQL(name);
    }

    @Override
    public Optional<Local> findByName(String name) {
        return LocalRepository.findByName(name);
    }

    @Override
    public Optional<Local> findByNameIgnoreCase(String name) {
        return Optional.empty();
    }

    @Override
    public Local findLocalById(Long id) throws LocalNotFoundException {
        Optional <Local> local = localRepository.findById(id);
        if (!local.isPresent()){
            throw new LocalNotFoundException("Local is not available");
        }

        return local.get();
    }


}
