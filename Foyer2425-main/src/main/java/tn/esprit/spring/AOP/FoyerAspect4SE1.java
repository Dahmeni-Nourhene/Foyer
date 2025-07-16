package tn.esprit.spring.AOP;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class FoyerAspect4SE1 { // La classe : Aspect

    // @After() ==> Après l'exécution
    // @AfterThrowing() ==> Après le déclenchement d'une exception
    // @AfterReturning() ==> Après la bonne exécution
    // @Before() ==> Avant l'exécution
    // @Around() ==> En // avec l'exécution

    @Before("execution(* tn.esprit.spring.Services..*.*(..))")
    public void hello(JoinPoint jp){ // La méthode : Advice
        log.info("Hello from "+jp.getSignature().getName());
    }

    @After("execution(* tn.esprit.spring.Services..*.*(..))")
    public void bye(JoinPoint jp){ // La méthode : Advice
        log.info("Out of method "+jp.getSignature().getName());
    }

    @Around("execution(* tn.esprit.spring.Services..*.*(..))")
    public Object execution(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}
