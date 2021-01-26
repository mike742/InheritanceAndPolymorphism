
public class Helper {
	private static StackTraceElement[] stacktrace;
	private static StackTraceElement e;// maybe this number needs to be corrected

	public static void log() {
		stacktrace = Thread.currentThread().getStackTrace();
		/*
		 * System.out.println("____________________________________________");
		 * 
		 * for (StackTraceElement ste : stacktrace) {
		 * System.out.println(ste.getClassName() + " " + ste.getMethodName()); }
		 * System.out.println("____________________________________________");
		 */
		e = stacktrace[2];

		System.out.println(e.getClassName() + "->" + e.getMethodName());
	}
}
