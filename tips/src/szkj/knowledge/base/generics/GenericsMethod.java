package szkj.knowledge.base.generics;

/**
 * @ClassName GenericsMethod
 * @Description 泛型方法类
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 10:37
 * @Version 1.0
 */
public class GenericsMethod {
    /**
     * 获取泛型类的数据
     * @param gc 泛型类实例，使用类型通配符？代替泛型类中具体的类型实参
     * @return 泛型类实例中类型实参对象字符串
     */
    public static String getData(GenericsClass<?> gc) {
        return gc.getData().toString();
    }

    /**
     * 获取泛型类的数据
     * @param gc 泛型类实例，
     *           ? 代替泛型类中具体的类型实参；
     *           extends 指定类型通配符上限,只能为Number类及其子类
     * @return 泛型类实例中类型实参对象字符串
     */
    public static String getDataExtend(GenericsClass<? extends GenericsObjectB> gc) {
        return gc.getData().toString();
    }

    /**
     * 获取泛型类的数据
     * @param gc 泛型类实例，
     *           ? 代替泛型类中具体的类型实参；
     *           super 指定类型通配符下限,只能为Number类及其父类
     * @return 泛型类实例中类型实参对象字符串
     */
    public static String getDataSuper(GenericsClass<? super GenericsObjectB> gc) {
        return gc.getData().toString();
    }

    /**
     * 获取泛型实参对象
     * <T> 指定返回值类型为泛型
     * T 指定返回值类型
     * @param gc 泛型类实例
     *           ? 代替泛型类中具体的类型实参
     * @param <T>
     * @return (T)标识返回类型
     */
    public static <T> T getDataObj(GenericsClass<?> gc) {
        return (T)gc.getData();
    }

    /**
     * 获取泛型实参对象
     * @param gc 泛型类实例
     *           ? 代替泛型类中具体的类型实参
     * @param <T>
     * @return (T)标识返回类型
     */
    public static <T extends GenericsObjectB> T getDataObjExtend(GenericsClass<?> gc) {
        return (T)gc.getData();
    }

}
