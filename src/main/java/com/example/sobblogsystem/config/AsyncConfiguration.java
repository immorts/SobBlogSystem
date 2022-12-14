package com.example.sobblogsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 12:43 AM 2022/6/6 2022
 * @Modified By:
 */

@Configuration
@EnableAsync
public class AsyncConfiguration {

    public Executor asyncExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(10);
        executor.setThreadNamePrefix("sob_blog_task_worker-");
        executor.setQueueCapacity(30);
        executor.initialize();
        return executor;

    }

}
