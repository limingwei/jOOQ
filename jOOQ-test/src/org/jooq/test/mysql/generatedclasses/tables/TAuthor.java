/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings("all")
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -1198112698;

	/**
	 * The singleton instance of <code>test.t_author</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.mysql.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>test.t_author.ID</code>. The author ID
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>test.t_author.FIRST_NAME</code>. The author's first name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>test.t_author.LAST_NAME</code>. The author's last name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>test.t_author.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * The column <code>test.t_author.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>test.t_author.ADDRESS</code>. The author's address
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(200), T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("t_author", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_AUTHOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_AUTHOR_PRIMARY);
	}
}
