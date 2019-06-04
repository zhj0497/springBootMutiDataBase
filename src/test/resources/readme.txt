annotationConfigApplicationContext
搭配上 @Configuration 和 @Bean 注解

自定义扫描
useDefaultFilters

@Configuration
//可以通过Bean("Id名") 指定你想要的Id ，默认bean的id为方法名
@Bean
    public Person person01(){ //Person 的id为:person01
        return new Person("lisi",20);
    }


备注
// includeFilters 只包含
//excludeFilters 排除
// FilterType.ANNOTATION 通过注解排除
@ComponentScan(value = “com.myspring”,excludeFilters ={
@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Service.class})
})

要使用includeFilters 时需添加useDfaultFilters = false;


组件注册-自定义TypeFilter指定过滤规则
4.1 FilterType.ANNOTATION 按照注解方式
4.2 FilterType.ASSIGNABLE_TYPE 按照给定的类型
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class})
4.3 FilterType.ASPECTJ 按照ASPECTJ表达式
4.4 FilterType.REGEX 按照正则表达
4.5 FilterType.CUSTOM 按照自定义规则

@Scope-设置组件作用域 在初始化的时候创建,不是在使用的时候创建
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person person() {
        System.out.println("创建 Person 实例");
        return new Person("zhangsan", 28);
    }

为了中使用的时候创建使用@Lazy
 @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Lazy
    public Person person() {
        System.out.println("创建 Person 实例");
        return new Person("zhangsan", 28);
     }

@Conditional-按照条件注册bean
可以实现Condition来判断


@Import-给容器中快速导入一个组件
包扫描+组建标注注解（@Controller、@Service、@Repository、@Component）【有局限，不是自己写的就无法注入】
@Bean【导入第三方包里面的组建】
@Import【快速的给容器中导入一个组件】

组件注册-@Import-使用ImportSelector 实现ImportSelector
@Import-使用ImportBeanDefinitionRegistrar 实现ImportBeanDefinitionRegistrar
比如:
@Import({MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class xx


使用FactoryBean注册组件
实现FactoryBean接口，但是得到bean是他的调用,生产的bean


@Bean指定初始化和销毁方法
 @Bean(initMethod = "init",destroyMethod = "destory")

 初始化之后执行： @PostConstruct > InitializingBean > init-method
 销毁之前执行：@preDestroy > DisposableBean > destoryMethod
