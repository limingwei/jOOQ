/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_identity_pk", schema = "test2")
public class TIdentityPk implements java.io.Serializable {

	private static final long serialVersionUID = -6452580;

	private java.lang.Integer id;
	private java.lang.Integer val;

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "val")
	public java.lang.Integer getVal() {
		return this.val;
	}

	public void setVal(java.lang.Integer val) {
		this.val = val;
	}
}