/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book_to_book_store", schema = "test2", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"book_store_name", "book_id"})
})
public class TBookToBookStore implements java.io.Serializable {

	private static final long serialVersionUID = 814257435;

	private java.lang.String  bookStoreName;
	private java.lang.Integer bookId;
	private java.lang.Integer stock;

	@javax.persistence.Column(name = "book_store_name", nullable = false, length = 400)
	public java.lang.String getBookStoreName() {
		return this.bookStoreName;
	}

	public void setBookStoreName(java.lang.String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	@javax.persistence.Column(name = "book_id", nullable = false, precision = 10)
	public java.lang.Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(java.lang.Integer bookId) {
		this.bookId = bookId;
	}

	@javax.persistence.Column(name = "stock", precision = 10)
	public java.lang.Integer getStock() {
		return this.stock;
	}

	public void setStock(java.lang.Integer stock) {
		this.stock = stock;
	}
}
