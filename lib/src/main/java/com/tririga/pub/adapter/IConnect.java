//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tririga.pub.adapter;

import com.tririga.ws.TririgaWS;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IConnect {

    void execute(TririgaWS tririgaWS, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
