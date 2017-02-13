#AnnotationConfigWebApplicationContext 会register @Configuration 的bean到applicationContext
AnnotationConfigWebApplicationContext.loadBeanDefinitions will getConfigLocations then load the class and register it


# 如何解析@Configuration 注解
AnnotationConfigWebApplicationContext.loadBeanDefinitions
  -new AnnotatedBeanDefinitionReader  // 这个构造函数会register ConfigurationClassPostProcessor ，这个负责解析@Configuration 类
   - register bean ConfigurationClassPostProcessor 
   
ConfigurationClassPostProcessor.processConfigBeanDefinitions
  -ConfigurationClassParser.parse  处理了configurationClass 上的各种注解如@ComponentScan @Import @EnableMvc
  
  
@EnableMvc 导入DelegatingWebMvcConfiguration 类，实现spring mvc的各种定制