/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "game", schema = "PUBLIC", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"host_year", "event_code", "athlete_code"})
})
public class GameRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.cubrid.demodb.tables.records.GameRecord> {

	private static final long serialVersionUID = 1953882323;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setHostYear(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.HOST_YEAR, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "host_year", nullable = false)
	public java.lang.Integer getHostYear() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.HOST_YEAR);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT game__fk_game_event_code
	 * FOREIGN KEY (event_code)
	 * REFERENCES PUBLIC.event (code)
	 * </pre></code>
	 */
	public void setEventCode(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.EVENT_CODE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT game__fk_game_event_code
	 * FOREIGN KEY (event_code)
	 * REFERENCES PUBLIC.event (code)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "event_code", nullable = false)
	public java.lang.Integer getEventCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.EVENT_CODE);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT game__fk_game_event_code
	 * FOREIGN KEY (event_code)
	 * REFERENCES PUBLIC.event (code)
	 * </pre></code>
	 */
	public org.jooq.examples.cubrid.demodb.tables.records.EventRecord fetchEvent() {
		return create()
			.selectFrom(org.jooq.examples.cubrid.demodb.tables.Event.EVENT)
			.where(org.jooq.examples.cubrid.demodb.tables.Event.EVENT.CODE.equal(getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.EVENT_CODE)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT game__fk_game_athlete_code
	 * FOREIGN KEY (athlete_code)
	 * REFERENCES PUBLIC.athlete (code)
	 * </pre></code>
	 */
	public void setAthleteCode(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.ATHLETE_CODE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT game__fk_game_athlete_code
	 * FOREIGN KEY (athlete_code)
	 * REFERENCES PUBLIC.athlete (code)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "athlete_code", nullable = false)
	public java.lang.Integer getAthleteCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.ATHLETE_CODE);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT game__fk_game_athlete_code
	 * FOREIGN KEY (athlete_code)
	 * REFERENCES PUBLIC.athlete (code)
	 * </pre></code>
	 */
	public org.jooq.examples.cubrid.demodb.tables.records.AthleteRecord fetchAthlete() {
		return create()
			.selectFrom(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE)
			.where(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.CODE.equal(getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.ATHLETE_CODE)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setStadiumCode(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.STADIUM_CODE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "stadium_code", nullable = false)
	public java.lang.Integer getStadiumCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.STADIUM_CODE);
	}

	/**
	 * An uncommented item
	 */
	public void setNationCode(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.NATION_CODE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "nation_code", length = 3)
	public java.lang.String getNationCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.NATION_CODE);
	}

	/**
	 * An uncommented item
	 */
	public void setMedal(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.MEDAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "medal", length = 1)
	public java.lang.String getMedal() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.MEDAL);
	}

	/**
	 * An uncommented item
	 */
	public void setGameDate(java.sql.Date value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.GAME_DATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "game_date")
	public java.sql.Date getGameDate() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Game.GAME.GAME_DATE);
	}

	/**
	 * Create a detached GameRecord
	 */
	public GameRecord() {
		super(org.jooq.examples.cubrid.demodb.tables.Game.GAME);
	}
}