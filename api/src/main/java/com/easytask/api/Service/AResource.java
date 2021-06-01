package com.easytask.api.Service;
import com.easytask.api.Model.AEntity;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Hibernate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.io.Serializable;

@Slf4j
@SuppressWarnings("unchecked")
public abstract class AResource<R extends AEntity, ID extends Serializable> {

    private JpaRepository<R,ID> repository;

    public AResource(JpaRepository<R,ID> repository)
    {
        this.repository = repository;
    }
    
    @CrossOrigin
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public R create(@RequestBody @Valid R resource){
        R createdResource = repository.save(resource);
        log.info("created resource:" + createdResource.getId());

        return (R)Hibernate.unproxy(createdResource);
    }

    @CrossOrigin
    @GetMapping(path="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public R read(@PathVariable("id") ID id)
    {
        R resource = repository.getOne(id);
        log.info("Fetching resource with id:" +resource.getId());
        return (R)Hibernate.unproxy(resource);
    }

    @CrossOrigin
    @PutMapping(path="/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestBody @Valid R resource, @PathVariable("id") ID id)
    {
        repository.save(resource);
        log.info("saved changes for resource: "+ id);
    }

    @CrossOrigin
    @DeleteMapping(path="/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") ID id){
        repository.deleteById(id);
        log.info("deleted resource: "+ id);
    }

}
