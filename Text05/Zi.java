package com.hqyj.mc.Text05;
/*重写：
* 1、在重写方法上加上@Override注解可以检测方法是否重写成功。(这个注解就算不写，只要满足要求，也是正确的方法覆盖重写)
* 2、子类方法的返回值必须【小于等于】父类方法的返回值范围。(小扩展提示: java.lang.Object类是所有类的公共最高父类（祖宗类
* 3、子类方法的权限必须【大于等于】父类方法的权限修饰符。
* 4、必须保证父子类之间方法的名称相同，参数列表也相同。
* 5、重写(Override〉和重载（Overload )
* */
public class Zi extends Fu {
    //实验权限修饰符
    public void method(){
        super.method();
        System.out.println("这是一个子类");
    }
    //实验返回值范围
    public Integer methodB(){
        return 1;
    }
    //试验方法参数和方法名
 /*   @Override
    public void methodC(int i ){
        //参数列表不同，不能重写
    }*/
  /*  @Override
    public void methodD(){
        //方法名不同，不能重写
    }*/
}
