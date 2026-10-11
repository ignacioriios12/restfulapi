package com.cursoJaax.restfulapi.controller;

import com.cursoJaax.restfulapi.entity.Local;
import com.cursoJaax.restfulapi.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findLocalByNameWithJPQL/{name}")
    Optional<Local> findLocalByNameWithJPQL(@PathVariable String name){
        return localService.findLocalByNameWithJPQL(name);
    }

    @GetMapping("/findByName/{name}")
    Optional<Local> findByName(@PathVariable String name){
        return localService.findByName(name);
    }

    @GetMapping("/findByNameIgnoreCase/{name}")
    Optional<Local> findByNameIgnoreCase(@PathVariable String name){
        return localService.findByNameIgnoreCase(name);
    }



    @GetMapping("findAllLocals")
    public List<Local> findAllLocals(){return localService.findAllLocals();}


    @PostMapping("/saveeLocal")
    public Local saveLocal(@RequestBody Local local) {
        return localService.saveLocal(local); }

    @PutMapping("/updateLocal(id)")
    public Local updateLocal(@PathVariable Long id, @RequestBody Local local){
        return localService.updateLocal(id, local);
    }


    @DeleteMapping("/deleteLocal/(id)")
    public String deleteLocal(@PathVariable Long id){
        localService.deleteLocoal(id);
        return "Succesfully Delete"; /*Mensaje de que se borro correctamente*/
    }


}