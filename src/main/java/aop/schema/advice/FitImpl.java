package aop.schema.advice;

/**
 * Created by zhanghe on 2017/3/13.
 * 5.6 Introductions应用（简介）
 */
public class FitImpl implements Fit{
    public void filter() {
        System.out.println("FitImpl filter");
    }
}
