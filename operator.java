public class operator {
    public static void main(String[] args) {
        //运算符号
        //用来对资料做特定的操作

        //算数运算
        //加减乘除
        //加 +
        //减 -
        //乘 *
        //除 /
        //余数 %

        //使用范例
        //注意资料形态

        //加减乘除
        //int x = 5 + 2;
        //int y = 5 - 2;
        //int m = 5 * 2:
        //int n = 5 / 2;    //整数除法   //因为两边都是整数，所以哪怕我们知道答案是2.5，但系统最终只会出2
        //double o = 5 / 2.0;  //浮点数除法  //这里会以double形态出2.5

        //取余数
        //int x = 5 % 2:  //整数余数     5除2取余数1
        //double y = 5 % 3.5;  //浮点数余数  5除3.5余数1.5
        
        //指定运算
        //把资料存放给变量

        //基本指定运算
        //=

        //搭配算数运算更新变量自身的资料
        // +=
        // -=
        // *=
        // /=
        // %=

        //使用范例
        //透过指定运算才能更新变数的资料

        //基本的指定运算
        //int x = 3;
        //x = x + 1;
        //System.out.println(x);   // 4

        //搭配算数运算更新变量自身的资料
        //int x = 3;
        //x += 1;
        //x *= 2;
        //System.out.println(x);  // 8

        //比较运算
        //拿来比较资料大小，或者是否相等

        //大小的比较
        // >
        // <
        // >=
        // <=

        //是否相等的比较  //布林值的形态返回
        // ==
        // !=

        //使用范例
        //比较运算的结果是布林值形态

        //大小比较
        //boolean x = 5 > 2;     // true
        //boolean y = 5 <= 5 ;  // true
        //boolean m = 5 < 5;    // false
        //boolean n = 2 >= 5;  // false
        
        //是否相等
        //boolean x = 5 == 2;  // false
        //boolean y = 5!= 2;   // true

        //单元运算
        //主要针对单一资料操作

        //针对单一变量做加一或减一
        // ++
        // --

        //针对布林值做反转
        // ！

        //使用范例
        //针对单一变量做加一减一
        //int x = 3;
        //x++; // x += 1; // x = x + 1;
        //x--; // x-= 1;// x = x - 1;

        //针对布林值做反转
        //boolean x =!true;
        //x =! x;
        //System.out.println(x);  //true

        //逻辑运算
        //针对两个布林值进行操作

        //且，and
        //两个布林值都要是true，结果才是true，只要有其中一个不一样，就会是false，就是and gate
        // &&

        //或，or
        //两个布林值，只要其中一个是true，结果就是true
        // ||

        //使用范例
        //两个布林值只有四种组合

        //且，and
        //boolean x = true && true;    // true
        //boolean y = true && false;   // false
        //boolean m = false && true;   // false
        //boolean n = false && false;  // false

        //或，or
        //boolean x = true || true;    // true
        //boolean y = true || false;   // true
        //boolean m = false || true;   // true
        //boolean n = false || false;  // false
    }
}
