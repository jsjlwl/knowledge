package szkj.knowledge.base.generics;

/**
 * /**
 *
 * @InterfaceName GenericsInterface
 * @Description 泛型接口类
 * extends 指定泛型对象上线
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 11:18
 * @Version 1.0
 */
public interface GenericsInterface<T extends GenericsObjectA> {
    T text();
}
