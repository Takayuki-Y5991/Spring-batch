package com.example.baseBatch.listener;

import com.example.baseBatch.domain.TargetAudience;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.stereotype.Component;

@Component
@StepScope
@Slf4j
public class ReadListener implements ItemReadListener<TargetAudience> {
    @Override
    public void beforeRead() {
        // Do nothing
    }

    @Override
    public void afterRead(TargetAudience item) {
        log.debug("AfterRead: {}", item);
    }

    @Override
    public void onReadError(Exception ex) {
        log.error("ReadError: {}", ex.getMessage(), ex);
    }
}
