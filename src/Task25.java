public class Task25 {
    public static void main(String[] args) {
        int count=1;
        for (int i = 1000; i < 10000; i++) {
            //System.out.println("Число номер "+(i-1820)+" равно: "+i);
            int a=i/1000;
            int a1=i%1000;
            int b=a1/100;
            int b1=a1%100;
            int c=b1/10;
            int d=b1%10;

            String K= " "+a+b;
            String L= " "+a+c;
            String M= " "+a+d;
            String N= " "+b+a;
            String O= " "+b+c;
            String P= " "+b+d;
            String Q=" "+c+a;
            String R=" "+c+b;
            String S=" "+c+d;
            String T=" "+d+a;
            String U=" "+d+b;
            String V=" "+d+c;
            //добавить комбинацию числа ba  и проверить другие варианты которые забыл
//            System.out.println("ab равно: "+L);
//            System.out.println("cd равно: "+N);
//            System.out.println("ac равно: "+M);
//            System.out.println("ad равно: "+O);
//            System.out.println("bc равно: "+P);
//            System.out.println("bd равно: "+K);

            int k = Integer.parseInt(K.trim());
            int l = Integer.parseInt(L.trim());
            int m = Integer.parseInt(M.trim());
            int n = Integer.parseInt(N.trim());
            int o = Integer.parseInt(O.trim());
            int p = Integer.parseInt(P.trim());
            int q = Integer.parseInt(Q.trim());
            int r = Integer.parseInt(R.trim());
            int s = Integer.parseInt(S.trim());
            int t = Integer.parseInt(T.trim());
            int u = Integer.parseInt(U.trim());
            int v = Integer.parseInt(V.trim());

//            System.out.println("ab равно: "+k);
//            System.out.println("ac равно: "+l);
//            System.out.println("ad равно: "+m);
//            System.out.println("ba равно: "+n);
//            System.out.println("bc равно: "+o);
//            System.out.println("bd равно: "+p);
//            System.out.println("ca равно: "+q);
//            System.out.println("cb равно: "+r);
//            System.out.println("cd равно: "+s);
//            System.out.println("da равно: "+t);
//            System.out.println("db равно: "+u);
//            System.out.println("bc равно: "+v);

            if ((k*s==i)||(n*s==i)||(k*v==i)||(n*v==i)||
            (l*p==i)||(l*u==i)||(q*p==i)||(q*u==i)||
                    (m*o==i)||(m*r==i)||(t*o==i)||(t*r==i)){

                System.out.println("Число вампир №"+count+" равно "+i);
                count++;
            }

        }
    }
}
