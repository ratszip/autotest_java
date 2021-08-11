package usrdef;

public class RetryInfo {
	int invocation;
	int maxInvocations;
	public int getInvocation() {
		return invocation;
	}
	public void setInvocation(int invocation) {
		this.invocation = invocation;
	}
	public int getMaxInvocations() {
		return maxInvocations;
	}
	public void setMaxInvocations(int maxInvocations) {
		this.maxInvocations = maxInvocations;
	}
	public RetryInfo(int invocation, int maxInvocations) {
		super();
		this.invocation = invocation;
		this.maxInvocations = maxInvocations;
	}
	
}
