package szkj.knowledge.base.generics;

/**
 * @ClassName GenericsObjectC
 * @Description 泛型对象C
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 11:01
 * @Version 1.0
 */
public class GenericsObjectC extends GenericsObjectB {
    private String cStr;
    public GenericsObjectC(String aStr, String bStr, String cStr) {
        super(aStr, bStr);
        this.cStr = cStr;
    }

    @Override
    public String toString() {
        return this.aStr+","+this.bStr + "," + this.cStr;
    }
}
