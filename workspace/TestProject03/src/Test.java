public class Test {
    static long  factorial(int n){
        if(n==1){//�ݹ�ͷ
            return 1;
        }else{//�ݹ���
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();  
        System.out.println("10�׳˵Ľ����"+factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("�ݹ��ʱ��%s%n", d2-d1);  //��ʱ��32ms
    }

}