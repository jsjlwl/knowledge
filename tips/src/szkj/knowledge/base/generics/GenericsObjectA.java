package szkj.knowledge.base.generics;

/**
 * @ClassName GenericsObjectA
 * @Description 泛型对象A
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 10:57
 * @Version 1.0
 */
public class GenericsObjectA {
    protected String aStr;

    public GenericsObjectA(String aStr) {
        this.aStr = aStr;
    }

    @Override
    public String toString() {
        return this.aStr;
    }
}
