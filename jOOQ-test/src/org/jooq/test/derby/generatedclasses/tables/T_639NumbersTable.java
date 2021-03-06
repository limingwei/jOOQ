/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_639NumbersTable extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = -1930711163;

	/**
	 * The singleton instance of <code>TEST.T_639_NUMBERS_TABLE</code>
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.derby.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord.class;
	}

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.LONG</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(22), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL.precision(22, 5), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.FLOAT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Float> FLOAT = createField("FLOAT", org.jooq.impl.SQLDataType.REAL, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>TEST.T_639_NUMBERS_TABLE.DOUBLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> DOUBLE = createField("DOUBLE", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE);

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable() {
		super("T_639_NUMBERS_TABLE", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord> getPrimaryKey() {
		return org.jooq.test.derby.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.derby.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}
}
