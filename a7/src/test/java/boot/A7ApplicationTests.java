package boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class A7ApplicationTests {

    @Autowired
    person p;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        System.out.println(p);
    }

    @Test
    public void test(){
        boolean b = applicationContext.containsBean("first");
        System.out.println(b);
    }

}
