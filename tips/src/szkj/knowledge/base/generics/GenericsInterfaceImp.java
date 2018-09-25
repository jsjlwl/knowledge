package szkj.knowledge.base.generics;

/**
 * @ClassName GenericsInterfaceImp
 * @Description 泛型接口实现类
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 11:19
 * @Version 1.0
 */
public class GenericsInterfaceImp implements GenericsInterface<GenericsObjectA> {
    private GenericsObjectA goA;

    public GenericsInterfaceImp(GenericsObjectA goA) {
        this.goA = goA;
    }

    @Override
    public GenericsObjectA text() {
        return this.goA;
    }
}
