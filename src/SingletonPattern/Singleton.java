package SingletonPattern;
//1.如果getInstance的性能要求不是很重要，就简单同步一下吧。
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
//2.如果程序总是要创建并使用单例
/*
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return uniqueInstance;
    }

}
*/
//3.用“双重检查加锁”在getInstance()中减少使用同步
//volatile保证变量在多线程之间的可见性，轻量级同步
/*
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class);
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
        }
    }

}
*/
