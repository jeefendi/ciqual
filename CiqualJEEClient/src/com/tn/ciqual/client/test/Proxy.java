package com.tn.ciqual.client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Proxy {

	public static Object getProxy(String jndiName) {
		Object proxy = null;
		try {
			Context context = new InitialContext();
			proxy = context.lookup(jndiName);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proxy;
	}

}
