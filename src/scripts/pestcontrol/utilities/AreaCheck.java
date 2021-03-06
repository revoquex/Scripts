package scripts.pestcontrol.utilities;

import org.tribot.api2007.NPCs;
import org.tribot.api2007.Objects;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSNPC;
import org.tribot.api2007.types.RSObject;
import org.tribot.api2007.types.RSTile;

public class AreaCheck {

	private static RSTile myTile() {
		return Player.getPosition();
	}

	public static boolean shouldGenerateArea() {
		RSNPC[] squire = NPCs.findNearest("Squire");
		RSObject[] rock = Objects.findNearest(25, "Rock");
		if (squire.length > 0 && rock.length > 0) {
			return squire[0].getPosition().distanceTo(rock[0].getPosition()) < 10;
		}
		return false;
	}

	public static boolean areAreasDefined() {
		return Vars.gameBoatArea != null && Vars.gameAroundVoidKnightArea != null
				&& Vars.gameVoidKnightProtectArea != null && Vars.fullGameArea != null;
	}

	public static boolean isInGame() {
		return Vars.fullGameArea.contains(myTile());
	}

	public static boolean isInLobby() {
		return !Vars.lobbyBoat.contains(myTile()) && Vars.lobby.contains(myTile());
	}

	public static boolean isInsideLobbyBoat() {
		return Vars.lobbyBoat.contains(myTile()) && Vars.lobby.contains(myTile());
	}

	public static boolean isInsideGameBoat() {
		return Vars.gameBoatArea.contains(myTile());
	}

	public static boolean isInsideGameVoidKnightArea() {
		return Vars.gameVoidKnightProtectArea.contains(myTile());
	}

	public static boolean isInsideGameAroundVoidKnightArea() {
		return Vars.gameAroundVoidKnightArea.contains(myTile());
	}

}
