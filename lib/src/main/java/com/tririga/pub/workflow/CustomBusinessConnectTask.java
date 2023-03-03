package com.tririga.pub.workflow;

import com.tririga.ws.TririgaWS;

public interface CustomBusinessConnectTask {

    boolean execute(TririgaWS tririgaWS, long userId, Record[] records);
}
