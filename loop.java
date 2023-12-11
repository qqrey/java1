public class loop {
    public static void main(String[] args) {
        //while
        //满足某个条件，就重复执行，直到条件不满足

        //语法
        //while(布林值){
        //    //如果布林值是true，就执行
        //    //执行后再次回到while重新来
        // }

        //程式范例
        //int x = 1;
        //while (x < 5) {
        // System.out.println(x);
        // x++;
        // }
        
        //等差数列的计算（算1加到4的总和）
        //int total = 0;
        //int n = 1;
        //while (n <= 4) {
        // total += n;
        // n++;
        //}
        //System.out.println(total);
        
        //for
        //基础语法
        //for(初始化程式;布林值;每次轮回的执行程式){
         //如果布林值是true，执行
         //执行完毕后，回到for再来
        //}
        
        //for (int x = 1; x < 5; x++) {    //x=1，当x小于5，x+1
        //    System.out.println(x);
        //}
        
        //while与for的比较
        //印出1,2,3,4,5
        //while
        //int x = 1;
        //while (x <= 5) {
        //    System.out.println(x);
        //    x++;
        // }

        //for
        //for(int i = 1; i <= 5; i++){
        //    System.out.println(i);
        //}

        //迴圈指令
        //continue
        //强制返回迴圈开头，进入下一圈

        //程式范例
        //for (int i = 0; i < 5; i++) {
        //    if(i % 2 == 0){          //能被2整除的就不用print，反之print
        //        continue;    //忽略掉下面的for迴圈代码，回到最上面
        //    }
        //    System.out.println(i);
        //}
        
        //break
        //强制结束迴圈
        
        //程式范例
        //int x = 1;
        //while (x < 5) {
        //    if(x == 3){   //当x=3就断掉迴圈
        //        break;
        //    }
        //    System.out.println(x);
        //    x++;
        //}

        
    }
}
