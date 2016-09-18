Spring Bean 初始化过程图：
---------------------
![Alt Text](https://github.com/Json-Liu/hello-spring/blob/master/bean%20init.jpg)
文字描述 ：
---------------------
>* Spring 对 bean 进行实例化
>* Spring 将值和 bean 的引用注入到 bean 对应的属性中
>* 如果 bean 实现了 BeanNameAware 接口， Spring 将 bean 的 ID 传递给 setBeanName() 方法
>* 如果 bean 实现了 BeanFactoryAware 接口，Spring 将调用 setBeanFactory() 方法，将 BeanFactory 容器实例传入
>* 如果 bean 实现了 ApplicaitonContextAware 接口，Spring 将调用 setApplicationContext() 方法，将 bean 所在的应用上下文的引用传入进来
>* 如果 bean 实现了 BeanPostProccessor 接口，Spring 将调用它们的 postProcessorBeforeInitiazation() 方法
>* 如果 bean 实现了 InitializingBean 接口，Spring 将调用它们的 afterPropertiesSet() 方法，类似地，如果 bean 使用了 init-method 声明了初始方法，该方法也会被调用
>* 如果 bean 实现了 BeanPostProcessor 接口，Spring 将调用它们的 postProcessorAfterInitiazation() 方法
>* 此时， bean 已经准备就绪，可以被应用程序使用了，它们将一直驻留在应用上下文中，直到该应用上下文被销毁。
>* 如果 bean 实现了 DisposableBean 接口，Spring 将调用它的 destory() 方法。同样，如果 bean 使用了 destory-method 声明了销毁方法，该方法也会被调用