package aop.schema.advice.biz;

/**
 * Created by zhanghe on 2017/3/12.
 * 5.2 配置切面aspect
 * 业务类
 */
public class AspectBiz {
    public void biz(){
        System.out.println("AspectBiz biz");
        //throw new RuntimeException(); // 强行抛出异常，为了测试afterThrowing
    }

    //Advice parameters
    //bizName:业务名称，times:相应的使用次数
    public void init(String bizName, int times){
        System.out.println("AspectBiz:" + bizName + " " + times);
    }
}
