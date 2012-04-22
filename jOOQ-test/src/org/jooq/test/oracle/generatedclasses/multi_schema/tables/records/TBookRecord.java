/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "MULTI_SCHEMA")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> {

	private static final long serialVersionUID = -785867012;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.oracle.generatedclasses.test.enums.TLanguage value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	public org.jooq.test.oracle.generatedclasses.test.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK);
	}
}
