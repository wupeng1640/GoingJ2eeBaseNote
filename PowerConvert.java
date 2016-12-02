/**
 * Created by going on 2016/12/2.
 */
public class PowerConvert {
    public static void main(String[] args) {
        double a=-1e200;
        float b=(float)a;//double类型的a转换成float类型的b，由于表示长度不够展示无限大（Infinity）
        System.out.println(b);
        byte c1=67,c2=61;
        byte c3=(byte)(c1+c2);//c1+c2结果是整型，强制转换为byte类型会直接砍掉后面三个字节
        System.out.println(c3);
        double d=1.8923;
        int f=(int)d;//浮点型转换为整型，直接砍掉小数点后内容，不会操作四舍五入
        System.out.println(f);
    }
}
