import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/14.
 */
public class TestInterface {

    @Test
    public void testImple() {
        Student student = new PostGrad("Liyolo", "Moko", 155);
        Student student1 = new UnderGrad("Liyolo", "Moko", 215,"IT");
        Assert.assertNotSame(student.fee(),student1.fee());
    }

    @Test
    public void testi() {
        Student student = new PostGrad("Leo", "Moko",12);
        Student student1 = new UnderGrad("Liyolo", "Moko", 215,"IT");
        Assert.assertNotEquals(0,student.fee());
    }
}
