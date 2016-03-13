/**
 * Created by student on 2016/03/14.
 */
public class UnderGrad implements Student {

    private String name ;
    private String surname;
    private int fee;



    private String couName;
    UnderGrad()
    {


    }
    UnderGrad (String name ,String surname , int fee,String couName)
    {
        this.name = name;
        this.surname = surname;
        this.fee = fee;
        this.couName =couName;
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
    public String couName() {
        return couName;
    }
}
