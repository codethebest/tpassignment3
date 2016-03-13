import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/13.
 */
public class TestClassMap {


    @Test
    public void testaddlist()
    {
        ClassMap lista = new ClassMap();
        Student student1 = new Student("Liyolo",17);
        Student student2 = new Student("Liyolo",17);
        Student student3 = new Student("Liyolo",17);
        lista.addlist("2",student1);
        lista.addlist("3",student2);
        lista.addlist("4",student3);
        Assert.assertSame(lista,lista);
    }

    @Test
    public void testSize()
    {
        ClassMap lista = new ClassMap();
        Student student = new Student("Leo",18);
        Student student1 = new Student("Leo",18);
        Student student2 = new Student("Leo",18);
        lista.addlist("1",student);
        lista.addlist("2",student1);
        lista.addlist("3",student2);
        Assert.assertEquals(lista.sizelist(),3);
    }

    public void testRemove()
    {
        ClassMap lista = new ClassMap();
        Student student = new Student("Lee",19);
        Student student1 = new Student("Lee",19);
        Student student2 = new Student("Lee",19);
        Student student3 = new Student("Lee",19);
        lista.addlist("1",student);
        lista.addlist("2",student1);
        lista.addlist("3",student2);
        lista.addlist("4",student3);
        lista.removelist(1);
        Assert.assertEquals("Not ",lista.sizelist(),3);


    }

}
