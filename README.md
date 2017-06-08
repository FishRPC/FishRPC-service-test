# FishRPC-service-test</br>
FishRPC服务Demo</br>
通过在实现类上注解@PRC进行RPC服务注册</br>
例如对AddImpl注册一个RPC服务</br>
@PRC</br>
public class AddImpl implements IAdd{</br>
&nbsp;&nbsp;public int add(int a,int b){</br>
&nbsp;&nbsp;    return a+b;</br>
&nbsp;  }</br>
}</br>
