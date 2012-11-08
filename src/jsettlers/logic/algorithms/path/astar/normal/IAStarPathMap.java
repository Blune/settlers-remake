package jsettlers.logic.algorithms.path.astar.normal;

import jsettlers.common.Color;
import jsettlers.logic.algorithms.path.IPathCalculateable;

public interface IAStarPathMap {

	boolean isBlocked(IPathCalculateable requester, short x, short y);

	float getCost(short sx, short sy, short tx, short ty);

	/**
	 * only for debugging
	 * 
	 * @param x
	 *            x coordinate
	 * @param y
	 *            y coordinate
	 */
	void markAsOpen(short x, short y);

	/**
	 * only for debugging
	 * 
	 * @param x
	 *            x coordinate
	 * @param y
	 *            y coordinate
	 */
	void markAsClosed(short x, short y);

	void setDebugColor(short x, short y, Color color);

	/**
	 * Gets the id of of the blocked partition of the given coordinates.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	short getBlockedPartition(short x, short y);

}
