public  abstract class concept {
    abstract void main();
}
class Reading extends concept
{
    void main()
    {

        System.out.println("Read the text");
    }
}
abstract class Write extends concept
{
    abstract void main();
}
abstract class Detail
{
    private int age;
}
class CocetAbstract {
    public static void main(String args[]) {
        Reading s=new Reading();
        s.main();
    }
}