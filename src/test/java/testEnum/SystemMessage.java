package testEnum;

public enum SystemMessage {
    SUCCESS_ADD("新增语料成功"),
    STANDARD_QUESTION_EXIT("标准问题已存在"),
    SIMILAR_QUESTION_EXIT("相似问题已存在"),
    SORT_TYPE_EMPTY("请选择语料分类"),
    STANDARD_QUESTION_EMPTY("标准问题不能为空"),
    STANDARD_ANSWER_EMPTY("标准答案不能为空"),
    SIMILAR_QUESTION_EMPTY("相似问题不能为空"),
    SIMILAR_ANSWER_EMPTY("相似答案不能为空"),
    SIMILAR_QUESTION_SAME_WITH_STANDARD("标准问题和相似问题不能相同"),
    ;
    public String message;
    SystemMessage(String message){
        this.message = message;
    }
}
