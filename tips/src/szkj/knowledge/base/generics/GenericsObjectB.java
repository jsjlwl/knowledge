package szkj.knowledge.base.generics;

/**
 * @ClassName GenericsObjectB
 * @Description 泛型对象B
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 10:59
 * @Version 1.0
 */
public class GenericsObjectB extends GenericsObjectA {
    protected String bStr;

    public GenericsObjectB(String aStr, String bStr) {
        super(aStr);
        this.bStr = bStr;
    }

    @Override
    public String toString() {
        return this.aStr+","+this.bStr;
    }
}
