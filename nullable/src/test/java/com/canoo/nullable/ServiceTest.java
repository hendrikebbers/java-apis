package com.canoo.nullable;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ServiceTest {

    @Test
    @Ignore
    public void testAddBean() {
        //given:
        Repository repository = new Repository();
        Service service = new Service(repository);
        Bean bean = new Bean();

        //when:
        service.add(bean);

        //then:
        Assert.assertTrue(service.contains(bean));
    }

    @Test
    @Ignore
    public void testFindBean() {
        //given:
        Repository repository = new Repository();
        Service service = new Service(repository);

        Bean bean = new Bean();
        bean.setId(4711L);
        bean.setName("Duke");

        //when:
        service.add(bean);

        //then:
        Bean foundBean = service.findById(4711L);
        Assert.assertEquals("Duke", foundBean.getName());
    }
}
