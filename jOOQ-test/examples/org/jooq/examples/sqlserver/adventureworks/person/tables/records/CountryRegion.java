/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "CountryRegion", schema = "Person")
public class CountryRegion extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion> {

	private static final long serialVersionUID = -275902232;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setCountryRegionCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.CountryRegionCode, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "CountryRegionCode", unique = true, nullable = false)
	public java.lang.String getCountryRegionCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.CountryRegionCode);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.Name, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name", nullable = false)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.Name);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.ModifiedDate);
	}

	/**
	 * Create a detached CountryRegion
	 */
	public CountryRegion() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion);
	}
}