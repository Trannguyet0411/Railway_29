package entity;

public class Position {
	public int PositionID;

	public void setPositionID(int positionID) {
		PositionID = positionID;
	}

	public enum PositionName {
		DEV, TEST, SCRUM_MASTER, PM;
	}

	public int getPositionID() {
		return PositionID;
	}

	@Override
	public String toString() {
		return "Position [PositionID=" + PositionID + "]";
	}
}