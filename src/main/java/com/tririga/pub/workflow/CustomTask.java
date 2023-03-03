package com.tririga.pub.workflow;

import com.tririga.ws.TririgaWS;

public interface CustomTask {
    boolean execute(Record[] records);
}
