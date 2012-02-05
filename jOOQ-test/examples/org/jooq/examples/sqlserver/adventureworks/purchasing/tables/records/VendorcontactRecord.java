/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VendorcontactRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord> {

	private static final long serialVersionUID = 656534333;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.VendorID]
	 * REFERENCES Vendor [Purchasing.Vendor.VendorID]
	 * </pre></code>
	 */
	public void setVendorid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.VENDORID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.VendorID]
	 * REFERENCES Vendor [Purchasing.Vendor.VendorID]
	 * </pre></code>
	 */
	public java.lang.Integer getVendorid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.VENDORID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.VendorID]
	 * REFERENCES Vendor [Purchasing.Vendor.VendorID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord fetchVendor() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor.VENDOR)
			.where(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor.VENDOR.VENDORID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.VENDORID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.ContactID]
	 * REFERENCES Contact [Person.Contact.ContactID]
	 * </pre></code>
	 */
	public void setContactid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.CONTACTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.ContactID]
	 * REFERENCES Contact [Person.Contact.ContactID]
	 * </pre></code>
	 */
	public java.lang.Integer getContactid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.CONTACTID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.ContactID]
	 * REFERENCES Contact [Person.Contact.ContactID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord fetchContact() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT)
			.where(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT.CONTACTID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.CONTACTID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.ContactTypeID]
	 * REFERENCES ContactType [Person.ContactType.ContactTypeID]
	 * </pre></code>
	 */
	public void setContacttypeid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.CONTACTTYPEID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.ContactTypeID]
	 * REFERENCES ContactType [Person.ContactType.ContactTypeID]
	 * </pre></code>
	 */
	public java.lang.Integer getContacttypeid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.CONTACTTYPEID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.VendorContact.ContactTypeID]
	 * REFERENCES ContactType [Person.ContactType.ContactTypeID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord fetchContacttype() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype.CONTACTTYPE)
			.where(org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype.CONTACTTYPE.CONTACTTYPEID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.CONTACTTYPEID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT.MODIFIEDDATE);
	}

	/**
	 * Create a detached VendorcontactRecord
	 */
	public VendorcontactRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT);
	}
}