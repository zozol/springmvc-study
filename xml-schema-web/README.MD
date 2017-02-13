RequestMappingHandlerAdapter 负责参数解析和返回值处理
   -afterPropertiesSet  加载参数解析类和返回值处理类
   -getDefaultArgumentResolvers 加载所有的参数解析类  可以定制
   -getDefaultReturnValueHandlers 加载所有的返回值处理类 可以定制
   
   

ServletInvocableHandlerMethod 调用controller中的方法

InvocableHandlerMethod.getMethodArgumentValues 负责参数解析

HandlerMethodReturnValueHandlerComposite 负责处理返回值
    HandlerMethodReturnValueHandler 处理返回值的接口总共有12种处理返回值的实现
    
    
RequestResponseBodyMethodProcessor 负责处理controller方法中带有@ResponseBody注解的返回值

    1) RequestResponseBodyMethodProcessor 需要注入messageConverters
    
    2) StringHttpMessageConverter 负责处理returnValue为String