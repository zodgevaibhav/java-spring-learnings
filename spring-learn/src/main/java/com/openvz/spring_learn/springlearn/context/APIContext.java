package com.openvz.spring_learn.springlearn.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class APIContext {
	
	private static ThreadLocal<String> contextRequst = new ThreadLocal<>();

	public static String getContextRequst() {
		return contextRequst.get();
	}

	public static void setContextRequst(String tempContextRequst) {
		contextRequst.set(tempContextRequst);
	}

}
