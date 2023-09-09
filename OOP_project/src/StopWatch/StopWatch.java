package StopWatch;

public class StopWatch {
	private long startTime;
	private long endTime;
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	public void end() {
		this.endTime = System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}