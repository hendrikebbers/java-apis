package com.canoo.nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Logger;

public class Repository {

    private final static Logger LOG = Logger.getLogger(Repository.class.getName());

    private final List<Entity> database;

    public Repository() {
        this.database = new ArrayList<>();

        final Entity e1 = new Entity();
        e1.setId(1L);
        e1.setName("Banana");
        e1.setActive(true);
        database.add(e1);

        final Entity e2 = new Entity();
        e2.setId(2L);
        e2.setName("Apple");
        e2.setActive(true);
        database.add(e2);

        final Entity e3 = new Entity();
        e3.setName("Cherry");
        database.add(e3);
    }

    public void add(Entity e) {
        Objects.requireNonNull(e, "e should not be null");

        long id = Optional.ofNullable(e.getId()).orElse(-1L);

        LOG.info("Adding entity " + id +" to database");
        database.add(e);
    }

    public Optional<Entity> findByIdOptional(Long id) {
        return Optional.ofNullable(findById(id));
    }

    public Entity findById(Long id) {
        return database.stream().
                filter(e -> Objects.equals(id, e.getId())).findAny().
                orElse(null);
    }

    public boolean contains(Entity entity) {
        return findById(entity.getId()) != null;
    }
}
