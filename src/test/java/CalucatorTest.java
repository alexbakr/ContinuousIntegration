import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalucatorTest {
    @Test
    public void setUp(){

    }

    @Test
    void addNum(){
        Assertions.assertEquals(4,Calculator.add(2,2));
    }

    @Test
    void subtractNum(){
        Assertions.assertEquals(10,Calculator.sub(12,2));
    }

    @Test
    void multiplyNum(){
        Assertions.assertEquals(144,Calculator.mult(12,12));
    }
    @Test
    void divideNum(){
        Assertions.assertEquals(2,Calculator.div(24,12));
    }

    @Test
    void subtractNumFail(){
        Assertions.assertEquals(10,Calculator.sub(2,2));
    }
}
