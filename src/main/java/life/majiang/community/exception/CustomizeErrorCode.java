package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "你找的问题不存在，请换一个试试~"),
    TARGET_PARAM_NOT_FOUND(2002, "未选择任何问题或评论进行回复"),
    NO_LOGIN(2003, "当前操作需要登录，请登陆后重试！"),
    SYS_ERROR(2004, "服务冒烟了，稍后再试~"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在~"),
    COMMENT_NOT_FOUND(2006, "你回复的评论不存在，请换一个试试~"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空~"),
    READ_NOTIFICATION_FAIL(2008, "读了别的消息！！！"),
    NOTIFICATION_NOT_FOUND(2009, "消息不见了，可能已被删除"),
    FILE_UPLOAD_FAIL(2010, "图片上传失败~"),
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
