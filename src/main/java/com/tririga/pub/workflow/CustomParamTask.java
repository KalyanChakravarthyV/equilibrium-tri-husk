package com.tririga.pub.workflow;

import java.util.Map;

public interface CustomParamTask {

    CustomParamTaskResult execute(Map var1, long userId, Record[] records);

}
