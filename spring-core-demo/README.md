# 本模块演示spring最基本的玩法
>使用POJO开发企业应用，提供一致的编程模型，强调对接口编程。降低应用的负载和框架的侵入性。
## 一、spring IoC容器
* 依赖控制反转:
应用控制反转后，当对象被创建时，有一个调控系统内的所有对象的外界实体将其所以来的对象的引用传递给它，即依赖被注入到对象中。所以，控制反转是关于一个对象如何获取到他所依赖的对象的引用，在这里，反转指的是责任的反转。

* IoC容器系列的设计与实现:
  1. BeanFactory接口
      
      定义了IoC容器最基本的形式，并且提供了IoC容器所应该遵守的最基本的服务契约。但没有给出容器的具体实现
  2. ApplicationContext
    
      应用比较广泛的一种容器，可以看成是最基本容器附加了某种功能的具体实现。
  
 BeanFactory和FactoryBean?
     
 BeanFactory 是对象工厂，spring中所有的bean都有BeanFactory管理。FactoryBean是一个产生或者修饰对象生产的工厂Bean。
 
 * BeanFactory容器的设计原理
  
                                                                                                                                                                                
## 二、AOP