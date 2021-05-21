class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
    static int add (int a,int b,int c,int d){return a+b+c+d;}
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,12));
        System.out.println(Adder.add(5,10,15));
        System.out.println(Adder.add(2,2,2,2));
    }}