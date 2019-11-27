package cn.zzh.springboot.main;

public class ComputerFactory {
    public static Computer createComputer(String type){
        Computer mcomputor=null;
        switch (type){
            case "lenovo":
            mcomputor=new LenovoComputer();
            break;
            case "hp" :
                mcomputor=new HpComputer();
                break;
            case "asus":
                mcomputor=new AsusComputer();
                break;
        }
        return mcomputor;
    }
}
