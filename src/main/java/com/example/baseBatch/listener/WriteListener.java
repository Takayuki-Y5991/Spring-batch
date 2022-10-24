package com.example.baseBatch.listener;

import com.example.baseBatch.domain.TargetAudience;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class WriteListener implements ItemWriteListener<TargetAudience> {

    @Override
    public void beforeWrite(List<? extends TargetAudience> items) {
        // Do nothing
    }

    @Override
    public void afterWrite(List<? extends TargetAudience> items) {
        log.debug("AfterWrite: count={}", items.size());
    }

    @Override
    public void onWriteError(Exception exception, List<? extends TargetAudience> items) {
        log.error("WriteError: errorMessage={}", exception.getMessage(), exception);
    }
}
