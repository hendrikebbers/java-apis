package com.canoo.nullable;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void testConvertToBean() {
        //given:
        Converter converter = new Converter();
        Entity entity = new Entity();
        entity.setName("Duke");

        //when:
        Bean bean = converter.toBean(entity);

        //then:
        Assert.assertEquals("Duke", bean.getName());
    }

    @Test
    public void testConvertToEntity() {
        //given:
        Converter converter = new Converter();
        Bean bean = new Bean();
        bean.setName("Duke");

        //when:
        Entity entity = converter.toEntity(bean);

        //then:
        Assert.assertEquals("Duke", entity.getName());
        Assert.assertEquals(new Long(-1L), entity.getId());

    }
}
