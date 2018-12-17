public class Test {
    static long  factorial(int n){
        if(n==1){//递归头
            return 1;
        }else{//递归体
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();  
        System.out.println("10阶乘的结果是"+factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归费时：%s%n", d2-d1);  //耗时：32ms
    }

}