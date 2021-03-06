/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FilmCategoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> implements org.jooq.Record3<java.lang.Short, java.lang.Byte, java.sql.Timestamp> {

	private static final long serialVersionUID = 170315584;

	/**
	 * Setter for <code>sakila.film_category.film_id</code>. 
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.film_category.film_id</code>. 
	 */
	public java.lang.Short getFilmId() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>sakila.film_category.category_id</code>. 
	 */
	public void setCategoryId(java.lang.Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.film_category.category_id</code>. 
	 */
	public java.lang.Byte getCategoryId() {
		return (java.lang.Byte) getValue(1);
	}

	/**
	 * Setter for <code>sakila.film_category.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.film_category.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Short, java.lang.Byte> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.Byte, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.Byte, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.FILM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field2() {
		return org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getFilmId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value2() {
		return getCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilmCategoryRecord
	 */
	public FilmCategoryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY);
	}
}
