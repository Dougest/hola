package com.hola.componentDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Dougest 2017年5月2日    下午10:42:20
 *
 */
@Component
public class AsyncTaskDemo {
/*protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Async("mySimpleAsync")
	public Future<String> doTask1() throws InterruptedException{
		logger.info("Task1 started.");
		long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        
        logger.info("Task1 finished, time elapsed: {} ms.", end-start);
        
        return new AsyncResult<>("Task1 accomplished!");
	}
	
	@Async("myAsync")
	public Future<String> doTask2() throws InterruptedException{
		logger.info("Task2 started.");
		long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        
        logger.info("Task2 finished, time elapsed: {} ms.", end-start);
        
        return new AsyncResult<>("Task2 accomplished!");
	}
*/
}
