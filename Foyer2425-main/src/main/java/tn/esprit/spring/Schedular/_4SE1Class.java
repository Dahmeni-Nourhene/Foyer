package tn.esprit.spring.Schedular;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Slf4j
public class _4SE1Class {

    @Scheduled(fixedDelay = 3000)
    public void fixedDelayMethod() {
        log.info("Hello fixedDelay "+ LocalDateTime.now());
    }

    @Scheduled(fixedRate = 3000)
    public void fixedRateMethod() {
       log.error("Hello fixedRate "+ LocalDateTime.now());
    }
}
