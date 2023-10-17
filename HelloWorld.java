/* 
public class 类别名称{     类别名称一定要与档案名称一样
	public static void main(String[]args){
		程式进入点
	}
}
*/

/*
public class HelloWorld{
	public static void main(String[]args){
		System.out.println("HelloWorld");
	}
}
*/

//单行注解
/*多行注解 */

//data type
/*
 整数    byte,short,int,long
			byte:-128 ~ 127
			short:-32768 ~ 32767
			int:-2147483648 ~ 2147483647
			long:-9223372036854775808 ~ 9223372036854775807

 浮点数  float,double
			float:精准至小数点下7位数
			double:精准至小数点下15位数

 布林值  boolean
			true,false

 字元    char    单一文字
			char:用单引号包住一个字

 字串    String  零至多个字元
			String:用双引号包住一串文字	
 */

 //变数
 /*
  宣告变数
	语法
		资料形态 变数名称;
			范例      		与python不同的是，java的变量都一定要宣告资料形态
				int x;
				double y;
				boolean z;
				char c;
				String s;

  指定资料
	宣告变数，同时指定资料
		资料形态 变数名称 = 资料:

	先宣告变数，尔后指定资料
		资料形态 变数名称:
		变数名称 = 资料;
	
	范例
		宣告变数，同时指定资料
			int x=3;

		先宣告变数，尔后指定资料
			double y;
			y=3.5;

  使用变数
在终端机印出资料
	System.out.println(任意资料);
	没有使用变数的范例
		System.out.println(3);
		System.out.println(true);
	使用变数的范例
		int x = 3;
		System.out.println(x);

		boolean y;
		y = true;
		System.out.println(y);
*/

/* 
public class HelloWorld{
	public static void main(String[] args){
		//整数，预设是int形态
		int x;
		x=3;
		System.out.println(x);
		System.out.println(120);
		//长整数，数字后面要加L（数字太大没法作为int处理，所以要变成长整数，数字不能大于20位数，最大19位（详情看上面的范围））(似乎也是大小写都可以)
		long y = 1200000000000000000L;
		System.out.println(1200000000000000000L);
		System.out.println(y);
		//浮点数，预设为double形态
		double m = 3.14159268;
		System.out.println(3.14159268);
		System.out.println(m);
		//单精度浮点数，数字后面加f（大小写都可以）
		float n = 3.14159268F;    //如果没放f就会出错，因为会是让浮点数n印出double，两者资料形态匹配不上
		System.out.println(3.14159268F);   //因为是单精度，所以只会到小数点之后的7位数，所以会变成3.1415927
		System.out.println(n);
		//布林值
		Boolean b = true;      //要注意java有别于python，true的t在java是小写的，但在python是大写的
		System.out.println(false);
		System.out.println(b);
		//字元
		char c = 'i';    //要注意字元char对应的是''而不是""，在python两者可以随便用，但在java有明确的差别，要区分
		System.out.println('a');     //因为是字元，所以''内只能有一个资料，'aa'这个就算两个资料，所以就会出错
		System.out.println(c);
		//字串:包含0或多个字元
		String s = "hello java";
		System.out.println("hello world");
		System.out.println(s);
	}
}
*/