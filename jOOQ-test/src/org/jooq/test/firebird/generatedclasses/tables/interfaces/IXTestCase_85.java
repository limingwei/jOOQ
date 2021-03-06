/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_85")
public interface IXTestCase_85 extends java.io.Serializable {

	/**
	 * Setter for <code>X_TEST_CASE_85.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_85.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId();

	/**
	 * Setter for <code>X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public void setXUnusedId(java.lang.Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	@javax.persistence.Column(name = "X_UNUSED_ID", length = 4)
	public java.lang.Integer getXUnusedId();

	/**
	 * Setter for <code>X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public void setXUnusedName(java.lang.String value);

	/**
	 * Getter for <code>X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	@javax.persistence.Column(name = "X_UNUSED_NAME", length = 10)
	@javax.validation.constraints.Size(max = 10)
	public java.lang.String getXUnusedName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_85
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IXTestCase_85 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_85
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IXTestCase_85> E into(E into);
}
