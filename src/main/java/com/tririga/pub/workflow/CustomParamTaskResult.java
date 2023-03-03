package com.tririga.pub.workflow;

import java.util.Map;

public interface CustomParamTaskResult {

    boolean getExecutionWasSuccessful();

    Map getReturnParameters();
}

