import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;

import robocode.WinEvent;
import static robocode.util.Utils.normalRelativeAngleDegrees;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * RoboUgurcan - a robot by (your name here)
 */
public class RoboUgurcan extends AdvancedRobot
{
	/**
	 * SpinBot's run method - Circle
	 */


	public void run() {

		// Loop forever
		while (true) {
			// Tell the game that when we take move,
			// we'll also want to turn right... a lot.
			setTurnLeft(1500);
			// Limit our speed to 5
			setMaxVelocity(6);
			// Start moving (and turning)
			ahead(1500);
			// Repeat.
			
		}
	}

	/**
	 * onScannedRobot: Fire hard!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);
	}


	/**
	 * onHitRobot:  If it's our fault, we'll stop turning and moving,
	 * so we need to turn again to keep spinning.
	 */
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}
	}
}
