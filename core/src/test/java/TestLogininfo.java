import com.xmg.p2p.base.service.LogininfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sus
 * @create 2022-05-23 21:26
 */
public class TestLogininfo {

    @Test
    public void testRegister(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        LogininfoService logininfoService = act.getBean(LogininfoService.class);
        logininfoService.register("lisi","123456");
    }

}
