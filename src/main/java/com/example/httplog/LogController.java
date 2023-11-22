package com.example.httplog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @PostMapping("/logs")
    public ResponseEntity<String> receiveLogs(@RequestBody String logData) {
        // 处理日志数据
        processLogData(logData);
        return ResponseEntity.ok("Log received");
    }

    private void processLogData(String logData) {
        // 实现日志分析逻辑
        System.out.println("Received log: \n" + logData);
        // TODO: 分析 token 使用
    }
}
