import main.Main;
import org.junit.Assert;
import org.junit.Test;

public class testExe2 {


    @Test
    public void test() {
        Assert.assertEquals(149, main.Exe3.add(125, 24));

    }
    @Test
    public void test2() {

        Assert.assertEquals(101, main.Exe3.sub(125, 24));

    }
    @Test
    public void test3() {

        Assert.assertEquals(3000, main.Exe3.mul(125, 24));

    }
    @Test
    public void test4() {

        Assert.assertEquals(5, main.Exe3.div(125, 24));


    }
    @Test
    public void test5() {

        Assert.assertEquals(5, main.Exe3.mod(125, 24));

    }
}
