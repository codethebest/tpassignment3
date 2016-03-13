/**
 * Created by student on 2016/03/14.
 */
public class PostGrad implements Student{

    private String name ;
    private String surname;
    private int fee;

    PostGrad()
    {


    }
    PostGrad (String name , String surname , int fee)
    {
        this.name = name;
        this.surname = surname;
        this.fee = fee;
    }
    public String name()
    {
        return name;
    }
    public String surname()
    {
        return surname;
    }
    public int fee()
    {
        return fee;
    }
}
