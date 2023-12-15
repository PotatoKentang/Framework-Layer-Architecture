package StatePattern;

public abstract class State {
	protected boolean isTurnedOff;
	protected boolean lowBatteryState;
	protected boolean normalState;
	protected abstract void playingGame();
	protected abstract void turnOff();
	protected abstract void message();
	protected abstract void charge();
//	normalState
//	lowBatteryState
//	turnedOffState
}
