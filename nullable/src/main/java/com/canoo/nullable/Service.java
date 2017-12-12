package com.canoo.nullable;

public class Service {

    private Repository repository;

    private Converter converter;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public Bean findById(long id) {
        Entity e = repository.findById(id);
        return converter.toBean(e);
    }

    public void add(Bean bean) {
        Entity entity = converter.toEntity(bean);
        repository.add(entity);
    }


    public boolean contains(Bean bean) {
        return findById(bean.getId()) != null;
    }
}
