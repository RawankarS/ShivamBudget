import java.util.function.Function;
class Test
{
public static void main(String[] args)
{
Function<Integer,Integer> f=i->i*i;
System.out.println("value of 4: "+f.apply(4));

}
}