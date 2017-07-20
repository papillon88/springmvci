package com.papillon.dc.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by papillon on 7/19/2017.
 */
@ActiveProfiles("dev")//refers to datasource.xml profile="dev"
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/beanconfigs/dao-context.xml",
        "file:src/main/webapp/WEB-INF/beanconfigs/security-context.xml",//included coz it contains password encoder
        "file:src/test/java/com/papillon/dc/config/datasource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Test
    public void testCreateUser(){
        assertEquals("Dummy test",1,1);
    }
}
