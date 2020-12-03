package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepareTestData {
    public Map<String, List<String>> similarMap;

    public PrepareTestData(){
        this.similarMap = initSimilarList();
    }

    private Map<String, List<String>> initSimilarList(){
        List<String> similarQuestionListHasNull = new ArrayList<>();
        similarQuestionListHasNull.add("测试新增相似问题1");
        similarQuestionListHasNull.add(" ");
        List<String> similarQuestionListNormal = new ArrayList<>();
        similarQuestionListNormal.add("测试新增相似问题2");
        similarQuestionListNormal.add("测试新增相似问题3");
        List<String> similarQuestionListHasSameWithSelf = new ArrayList<>();
        similarQuestionListHasSameWithSelf.add("测试新增相似问题4");
        similarQuestionListHasSameWithSelf.add("测试新增相似问题4");
        List<String> similarQuestionListHasSameWithStandard = new ArrayList<>();
        similarQuestionListHasSameWithStandard.add("测试新增相似问题5");
        similarQuestionListHasSameWithStandard.add("测试新增标准问题1");
        List<String> similarAnswerListHasNull = new ArrayList<>();
        similarAnswerListHasNull.add("测试新增相似答案1");
        similarAnswerListHasNull.add(" ");
        List<String> similarAnswerListNormal = new ArrayList<>();
        similarAnswerListNormal.add("测试新增相似答案2");
        similarAnswerListNormal.add("测试新增相似答案3");
        similarMap = new HashMap<>();
        similarMap.put("similarQuestionListHasNull", similarQuestionListHasNull);
        similarMap.put("similarQuestionListNormal", similarQuestionListNormal);
        similarMap.put("similarQuestionListHasSameWithSelf", similarQuestionListHasSameWithSelf);
        similarMap.put("similarQuestionListHasSameWithStandard", similarQuestionListHasSameWithStandard);
        similarMap.put("similarAnswerListHasNull", similarAnswerListHasNull);
        similarMap.put("similarAnswerListNormal", similarAnswerListNormal);
        return similarMap;
    }
}
