package usrdef;

import java.util.ArrayList;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class RetryingTestExecutionExtension
		implements ExecutionCondition, ParameterResolver, TestExecutionExceptionHandler {
	private int invocation;
	private int maxInvocations;
	private int minSuccess;

	@Override
	public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		int failureCount = getFailures(context).size();
		// Shift -1 because this happens before test
		int successCount = (invocation - 1) - failureCount;
		if ((maxInvocations - failureCount) < minSuccess) {
			// Case when we cannot hit our minimum success
			return ConditionEvaluationResult.disabled("Cannot hit minimum success rate of "
					+ (minSuccess / maxInvocations - failureCount) + " failures already");
		} else if (successCount < minSuccess) {
			// Case when we haven't hit success threshold yet
			return ConditionEvaluationResult
					.enabled("Have not ran " + minSuccess / maxInvocations + " successful executions");
		} else {
			return ConditionEvaluationResult.disabled(
					minSuccess / maxInvocations + " successful runs have already ran. Skipping run " + invocation);
		}
	}

	@SuppressWarnings("unchecked")
	private ArrayList<RetryingTestFailure> getFailures(ExtensionContext context) {
		 ExtensionContext.Namespace namespace = ExtensionContext.Namespace.create(
	                RetryingTestExecutionExtension.class);
	        Store store = context.getParent().get().getStore(namespace);
	        
	       return store.getOrComputeIfAbsent(context.getRequiredTestMethod().getName(),
	        		k->new ArrayList<RetryingTestFailure>(),
	        		ArrayList.class);

	    }

}
