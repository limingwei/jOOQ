/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;


/**
 * This class is generated by jOOQ.
 *
 * Leap seconds information for time zones
 */
public class TimeZoneLeapSecond extends TableImpl {

	private static final long serialVersionUID = -2815805651458565043L;

	/**
	 * The singleton instance of time_zone_leap_second
	 */
	public static final TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = new TimeZoneLeapSecond();

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> TRANSITION_TIME = new TableFieldImpl<Integer>("Transition_time", Integer.class, TIME_ZONE_LEAP_SECOND);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> CORRECTION = new TableFieldImpl<Integer>("Correction", Integer.class, TIME_ZONE_LEAP_SECOND);

	/**
	 * No further instances allowed
	 */
	private TimeZoneLeapSecond() {
		super("time_zone_leap_second", Mysql.MYSQL);
	}
}
