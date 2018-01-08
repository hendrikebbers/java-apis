package com.canoo.nullable;

import org.junit.Assert;
import org.junit.Test;

public class RepositoryTest {

    @Test
    public void testAddEntity() {
        //given:
        Repository repository = new Repository();
        Entity entity = new Entity();

        //when:
        repository.add(entity);

        //then:
        Assert.assertTrue(repository.contains(entity));
    }

    @Test
    public void testFindEntity() {
        //given:
        Repository repository = new Repository();

        Entity entity = new Entity();
        entity.setId(4711L);
        entity.setName("Duke");

        //when:
        repository.add(entity);

        //then:
        Entity foundEntity = repository.findById(4711L);
        Assert.assertEquals("Duke", foundEntity.getName());
    }

}
