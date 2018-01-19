package automation;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Sudhakar on 19/01/2018.
 */
public class JUnitAnnotations {


    @Before
    public void beforeclass(){
        System.out.println("this is Beforeclass");
    }
    @Test
    public void test(){
        System.out.println("this is test");
    }
    @Before
    public void afterclass(){
        System.out.println("this is Afterclass");
    }
}
