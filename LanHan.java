package singleton;

import java.util.spi.LocaleNameProvider;

//懒汉式单例类,在第一次调用的时候实例化自己
/*

public class LanHan {
    private LanHan(){}
    private static LanHan lanHan=null;

    */
/*
    //静态工厂方法
    //1.线程不安全,并发环境下,可能有多个LanHan实例
    public static LanHan getInstance(){
        if (lanHan==null){
            lanHan=new LanHan();
        }
        return lanHan;
    }
    *//*


    */
/*
    //2.在get方法上加同步
    public static synchronized LanHan getInstance(){
        if (lanHan == null) {
            lanHan=new LanHan();
        }
        return lanHan;
    }
    *//*


    */
/*
    //双重检查锁定
    public static LanHan getInstance(){
        if (lanHan == null) {
            synchronized (LanHan.class){
                if (lanHan == null) {
                    lanHan=new LanHan();
                }
            }
        }
        return lanHan;
    }
    *//*
}
*/
public class LanHan{
    private static class LanHanHolder{
        private static final LanHan instance=new LanHan();
    }
    private LanHan(){}
    public static final LanHan getInstance(){
        return LanHanHolder.instance;
    }
}