//import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //array 阵列
        //资料形态的一种，用来存放多个同形态的资料

        //基本资料形态
        //int,long,double,boolean,char,String

        //阵列资料形态
        //int[],long[],double[],boolean[],char[],String[]

        //宣告阵列变量
        //注意变量资料形态
        //阵列也是一种资料形态

        //宣告变量的语法
        //资料形态 变量名称;

        //范例
        //int[] x;
        //double[] y;
        //boolean[] z;
        //char[] c;
        //String[] s;

        //阵列资料的操作
        //初始化阵列
        //初始化时，决定阵列的长度

        //初始化阵列资料的语法
        //new 资料形态[阵列长度];

        //范例
        //int[] x = new int[3];
        //double[] y = new double[10];
        //String[] s;
        //s = new String[5];

        //阵列的长度
        //阵列可以存放的资料数量

        //取得阵列长度的语法
        //阵列变量名称.length

        //范例
        //int[] x = new int[3];
        //System.out.println(x.length);  // 3

        //阵列中的资料
        //存取阵列中资料的语法
        //阵列变量名称[资料编号];

        //范例
        //int[] x = new int[3];
        //x[0];  //第一笔资料
        //x[1];  //第二笔资料
        //x[2];  //第三笔资料
        //阵列长度3，最大编号为2
        //x[3];  //error

        //将资料存放至阵列中
        
        //范例
        //初始化int阵列，资料预设为0
        //int[] x = new int[3];
        //System.out.println(Arrays.toString(x));    //要放Arrays.toString()才能印出阵列    //[0, 0, 0]
        //更改阵列内资料（把资料覆盖进去原本的0）
        //x[0] = 10;
        //x[2] = 5;
        //System.out.println(Arrays.toString(x));  //[10, 0, 5]

        //初始化阵列的同时，给定资料
        //初始化阵列的同时，决定阵列长度与内部资料

        //初始化阵列，同时给定资料的语法
        //new 资料形态[]{资料，资料，资料，。。。}

        //范例
        //int[] x = new int[]{2,8,5};

        //阵列与迴圈
        //逐一取得阵列资料

        //范例
        //int[] x = new int[]{2,8,5};
        //for(int i = 0; i < x.length; i++){
        //    System.out.println(x[i]);
        //}
    }
}
