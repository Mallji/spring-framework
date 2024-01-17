package mallji.study.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {

	public void doBefore(JoinPoint joinPoint) {
		System.out.println("Before the method: " + joinPoint.getSignature().getName());
	}

	public void doAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("After returning from method: " + joinPoint.getSignature().getName());
	}

	public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("After throwing: " + joinPoint.getSignature().getName() + ", Exception: " + e.getMessage());
	}

	public void doAfter(JoinPoint joinPoint) {
		System.out.println("After finally in method: " + joinPoint.getSignature().getName());
	}

	public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Around before is running for method: " + proceedingJoinPoint.getSignature().getName());
		Object result = proceedingJoinPoint.proceed();
		System.out.println("Around after is running for method: " + proceedingJoinPoint.getSignature().getName());
		return result;
	}
}
