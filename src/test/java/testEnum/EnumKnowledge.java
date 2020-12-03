package testEnum;


import utils.PrepareTestData;

import java.util.List;

public enum EnumKnowledge {
    NORMAL("测试新增知识标准问题1", "测试新增知识标准答案"),
    SIMILAR_STANDARD("测试新增知识标准问题2", "similarQuestionListNormal",
            "测试新增知识标准答案", "similarAnswerListNormal"),
    ENUM_KNOWLEDGE_SIMILAR_QUESTION_STANDARD("测试新增知识标准问题3", "similarQuestionListNormal", "测试新增知识标准答案1"),
    SIMILAR_ANSWER_STANDARD("测试新增知识标准问题4", "similarAnswerListNormal", "测试新增知识标准答案1"),
    SIMILAR_ANSWER_NULL("测试新增知识标准问题5", "similarAnswerListHasNull", "测试新增知识标准答案1"),
    SIMILAR_QUESTION_SAME_WITH_SELF("测试新增知识标准问题6", "similarQuestionListHasSameWithSelf", "测试新增知识标准答案1"),
    SIMILAR_QUESTION_SAME_WITH_STANDARD("测试新增知识标准问题7", "similarQuestionListHasSameWithStandard", "测试新增知识标准答案1"),
    SIMILAR_QUESTION_HAS_NULL("测试新增知识标准问题8", "similarQuestionListHasNull", "测试新增知识标准答案1"),
    STANDART_QUESTION_EXITS("测试新增知识标准问题1", "测试新增知识标准答案"),
    STANDART_QUESTIOM_NULL(" ", "测试新增知识标准答案"),
    STANDART_ANSWER_NULL("测试新增知识标准问题9", " "),

    ;
    public String question;
    public String answer;
    public List<String> similarQuestion;
    public List<String> similarAnswer;
    EnumKnowledge(String question, String similarQuestion, String answer, String similarAnswer){
        this.question = question;
        this.answer = answer;
        this.similarQuestion = new PrepareTestData().similarMap.get(similarQuestion);
        this.similarAnswer = new PrepareTestData().similarMap.get(similarAnswer);
    }

    EnumKnowledge(String question, String similarList, String answer){
        this.question = question;
        if(similarList.contains("Answer")){
            this.similarAnswer = new PrepareTestData().similarMap.get(similarList);
        }else {
            this.similarQuestion = new PrepareTestData().similarMap.get(similarList);
        }
        this.answer = answer;

    }

    EnumKnowledge(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

}
