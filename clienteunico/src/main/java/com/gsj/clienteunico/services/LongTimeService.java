package com.gsj.clienteunico.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

@Service
public class LongTimeService {

    private final Map<String, String> processStatus = new ConcurrentHashMap<>();

    @Async
    public void startProcess(String processId) {
        processStatus.put(processId, "In Progress");
        // Simular un proceso largo
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000); // 10 segundos
                processStatus.put(processId, "Running" + String.valueOf(i));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        processStatus.put(processId, "Completed");
    }

    public String getProcessStatus(String processId) {
        return processStatus.getOrDefault(processId, "Not Found");
    }

}
