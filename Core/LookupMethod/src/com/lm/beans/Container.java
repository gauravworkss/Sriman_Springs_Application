package com.lm.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class Container /*implements ApplicationContextAware*/ {
	//private ApplicationContext context;

	/*public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.context = arg0;
	}*/

	public void process(String data) {
		/*WorkerThread workerThread = context.getBean("workerThread",
				WorkerThread.class);*/
		WorkerThread workerThread = createWorkerThread();
		workerThread.setData(data);
		workerThread.execute();
	}
	
	// i dont know how to implement so leaving it to spring
	abstract public WorkerThread createWorkerThread();
}
