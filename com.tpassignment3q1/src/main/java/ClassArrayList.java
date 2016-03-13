import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/13.
 */
public class ClassArrayList {
    List lista = new ArrayList();

    public void addlist(Student student)
    {
        lista.add(student);
    }

    public int sizelist()
    {
        return lista.size();
    }

    public void removelist(int a)
    {
        lista.remove(a);
    }
}
