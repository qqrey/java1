public class data_type_conversion {
    public static void main(String[] args) {
        //前言：java是强型别程式语言
        //这代表每个变数都有明确的资料形态定义
        //变数中存放的资料，需要符合变数宣告时定义的资料形态


        //范围大小的排序
        //浮点数资料形态都是大于整数资料形态的
        //整数：byte<short<int<long
        //浮点数：float<double


        //基本转换规则
        //小范围转为大范围：自动转换
        //byte n1 = 3;
        //int n2 = n1;
        //long n3 = 55555555;
        //float n4 = n3;
        //System.out.println("\t\tn1:" + n1 + "\t\tn2:" + n2 + "\t\tn3:" + n3 + "\t\tn4:" + n4);  //n1:3            n2:3            n3:55555555             n4:5.5555556E7


        //大范围转小范围：会error
        //int n1 =3;
        //byte n2 = n1; //error
        //float n5 = 10.5;  //error    //在代码中写小数点的预设是double,所以这里要把double转成float，就会error


        //强制转换
        //数字失真
        //大范围转小范围：使用(资料形态)强制转换
        //int n1 = 3;
        //byte n2 = (byte)n1;
        //int n3 = 1024;
        //byte n4 = (byte)n3;   //数字与原先的不同，原本是1024，这里变成0
        //double n5 = 3.1415926;
        //float n6 = (float)n5;  //数据失去精准度
        //System.out.println("\t\tn2:" + n2 + "\t\tn4:" + n4 + "\t\tn6:" + n6 );


        //字串：任意文字
        //可以与数字资料形态做转换

        //可以转换为数字的字串
        //String x ="345";
        //String y = "3.14159";

        //不能转换为数字的字串
        //String m = "Hello World";
        //String n = "哈喽，你好";

        //字串转数字
        //不同资料形态，有不同的方法

        //转成int形态：Integer.parseInt("字串")
        //String s = "56";
        //int x = Integer.parseInt(s);

        //转成long形态：Long.parseLong("字串")
        //long x = Long.parseLong("55555");

        //转成float形态：Float.parseFloat("字串")
        //float x = Float.parseFloat("3.14")

        //转成double形态：Double.parseDouble("字串")
        //double x = Double.parseDouble("3.1415");


        //数字转字串
        //可以用同一种方式完成

        //String.valueOf(数字)转换为字串
        int x = 3;
        String s1 = String.valueOf(x);
        String s2 = String.valueOf(1024L);  //long
        String s3 = String.valueOf(3.14F);  //float  没加F就是double
        double y = 3.1415926256;
        String s4 = String.valueOf(y);

        System.out.println("\t\ts1:" + s1 + "\t\ts2:" + s2 + "\t\ts3:" + s3 +"\t\ts4:" + s4);


    }
}
