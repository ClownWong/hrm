package cn.itsource.util;

/**
 * ajax请求结果封装的工具类
 */
public class AjaxResult {

    private Boolean success=true;

    private String message="操作成功";

    private Object resultBack;

    private AjaxResult() { }


    public static AjaxResult me(){
        return new AjaxResult();
    }


    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getmessage() {
        return message;
    }

    public AjaxResult setmessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultBack() {
        return resultBack;
    }

    public AjaxResult setResultBack(Object resultBack) {
        this.resultBack = resultBack;
        return  this;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }
}
