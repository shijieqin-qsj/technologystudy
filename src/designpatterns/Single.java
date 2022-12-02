package designpatterns;

/**
 * 单例模式
 */
public class Single{

    private Single(){

    }

    private volatile static  Single single;

    public  static  Single dcl(){

        if(single==null){
            synchronized (Single.class){
                if(single==null){
                    single=new Single();
                }
            }

        }
       return  single;
    }




}
