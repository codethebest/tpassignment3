import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/03/13.
 */
public class ClassMap {

    Map lista = new HashMap();

    public void addlist(String key , Student student)
    {
        lista.put(key,student);
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
