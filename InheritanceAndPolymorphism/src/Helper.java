
public class Helper {
	private static StackTraceElement[] stacktrace;
	private static StackTraceElement e;

	public static void log() {
		stacktrace = Thread.currentThread().getStackTrace();
		e = stacktrace[2];
		System.out.println(e.getClassName() + " -> " + e.getMethodName() + "() called" );
	}
}
