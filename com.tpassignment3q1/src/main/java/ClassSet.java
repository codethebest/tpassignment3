import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2016/03/13.
 */
public class ClassSet {
    Set lista = new HashSet();

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
