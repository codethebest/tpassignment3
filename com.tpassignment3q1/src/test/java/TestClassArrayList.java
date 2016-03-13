import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/13.
 */
public class TestClassArrayList {

    @Test
    public void testaddlist()
    {
        ClassArrayList lista = new ClassArrayList();
        Student student1 = new Student("Liyolo",17);
        Student student2 = new Student("Liyolo",17);
        Student student3 = new Student("Liyolo",17);
        lista.addlist(student1);
        lista.addlist(student2);
        lista.addlist(student3);
        Assert.assertSame(lista,lista);
    }

    @Test
    public void testSize()
    {
        ClassArrayList lista = new ClassArrayList();
        Student student = new Student("Leo",18);
        Student student1 = new Student("Leo",18);
        Student student2 = new Student("Leo",18);
        lista.addlist(student);
        lista.addlist(student1);
        lista.addlist(student2);
        Assert.assertEquals(lista.sizelist(),3);
    }

    public void testRemove()
    {
        ClassArrayList lista = new ClassArrayList();
        Student student = new Student("Lee",19);
        Student student1 = new Student("Lee",19);
        Student student2 = new Student("Lee",19);
        Student student3 = new Student("Lee",19);
        lista.addlist(student);
        lista.addlist(student1);
        lista.addlist(student2);
        lista.addlist(student3);
        lista.removelist(1);
        Assert.assertEquals("Not ",lista.sizelist(),3);


    }



}
