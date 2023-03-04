package com.tririga.pub.adapter;

import com.tririga.ws.TririgaWS;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface IConnect {

    void execute(TririgaWS tririgaWS, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
