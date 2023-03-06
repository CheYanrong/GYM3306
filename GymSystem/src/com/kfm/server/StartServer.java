package com.kfm.server;

import java.lang.reflect.Field;
import java.util.Set;

import org.apache.jasper.runtime.TldScanner;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartServer {
	public static void main(String[] args) {
		try {
			Field field;
			field = TldScanner.class.getDeclaredField("systemUris");
			field.setAccessible(true);
			((Set) field.get(null)).clear();
			field.setAccessible(false);
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e1) {
			e1.printStackTrace();
		}

		int port = 80;
		Server server = new Server(port);
		WebAppContext webAppContext = new WebAppContext("WebContent", "/");

		webAppContext.setDescriptor("/WEB-INF/web.xml");
		webAppContext.setResourceBase("WebContent");
		webAppContext.setDisplayName("web");
		webAppContext.setClassLoader(Thread.currentThread()
				.getContextClassLoader());
		webAppContext.setConfigurationDiscovered(true);
		webAppContext.setParentLoaderPriority(true);

		server.setHandler(webAppContext);
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("'服务启动成功在 "+port+" ......");
	}
}