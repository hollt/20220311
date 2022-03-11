package co.micol.prj.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
	
	
	@Pointcut("execution(public * co.micol..*Impl.*(..))")
	public void publicTarget() {	
	}
	
	@Around("publicTarget()")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = joinPoint.proceed();
		System.out.println("Member Table에 접근 했습니다.====");	
		return result;
	}
}
