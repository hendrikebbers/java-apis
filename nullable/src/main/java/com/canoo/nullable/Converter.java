package com.canoo.nullable;

public class Converter {

    public Bean toBean(Entity entity) {
        Bean bean = new Bean();
        bean.setId(entity.getId());
        bean.setName(entity.getName());
        bean.setActive(entity.getActive());
        return bean;
    }

    public Entity toEntity(Bean bean) {
        Entity entity = new Entity();
        entity.setId(bean.getId());
        entity.setName(bean.getName());
        entity.setActive(bean.isActive());
        return entity;
    }

}
