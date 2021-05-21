interface printable{
    void print();
}

class lalith implements printable{
    public void print(){System.out.println("Hello");}

    public static void main(String args[]){
        lalith obj = new lalith();
        obj.print();
    }
}  