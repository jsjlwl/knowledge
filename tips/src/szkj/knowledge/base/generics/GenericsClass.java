package szkj.knowledge.base.generics;

import org.junit.Test;

/**
 * @ClassName GenericsClass
 * @Description 泛型类
 * T表示泛型形参
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 10:17
 * @Version 1.0
 */
public class GenericsClass<T> {
    private T data;
    public GenericsClass() {
    }

    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}
