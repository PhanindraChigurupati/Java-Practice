package Interface;

class TestIntraface implements int1 {
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    public static void main(String[] args) {
        TestIntraface  obj = new TestIntraface();
        System.out.println(obj.b);
    }
}

