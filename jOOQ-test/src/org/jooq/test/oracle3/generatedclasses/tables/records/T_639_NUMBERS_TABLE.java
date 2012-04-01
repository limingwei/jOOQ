/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_639_NUMBERS_TABLE", schema = "TEST")
public class T_639_NUMBERS_TABLE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> {

	private static final long serialVersionUID = -856016348;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setBYTE(java.lang.Byte value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "BYTE", precision = 2)
	public java.lang.Byte getBYTE() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE);
	}

	/**
	 * An uncommented item
	 */
	public void setSHORT(java.lang.Short value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SHORT", precision = 4)
	public java.lang.Short getSHORT() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT);
	}

	/**
	 * An uncommented item
	 */
	public void setINTEGER(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "INTEGER", precision = 7)
	public java.lang.Integer getINTEGER() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER);
	}

	/**
	 * An uncommented item
	 */
	public void setLONG(java.lang.Long value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LONG", precision = 18)
	public java.lang.Long getLONG() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG);
	}

	/**
	 * An uncommented item
	 */
	public void setBYTE_DECIMAL(java.lang.Byte value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	public java.lang.Byte getBYTE_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setSHORT_DECIMAL(java.lang.Short value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	public java.lang.Short getSHORT_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setINTEGER_DECIMAL(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	public java.lang.Integer getINTEGER_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setLONG_DECIMAL(java.lang.Long value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	public java.lang.Long getLONG_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setBIG_INTEGER(java.math.BigInteger value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_INTEGER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 22)
	public java.math.BigInteger getBIG_INTEGER() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_INTEGER);
	}

	/**
	 * An uncommented item
	 */
	public void setBIG_DECIMAL(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	public java.math.BigDecimal getBIG_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_DECIMAL);
	}

	/**
	 * Create a detached T_639_NUMBERS_TABLE
	 */
	public T_639_NUMBERS_TABLE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE);
	}
}