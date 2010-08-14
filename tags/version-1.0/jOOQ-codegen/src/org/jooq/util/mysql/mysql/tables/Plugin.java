/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;


/**
 * This class is generated by jOOQ.
 *
 * MySQL plugins
 */
public class Plugin extends TableImpl {

	private static final long serialVersionUID = -4255074889600924118L;

	/**
	 * The singleton instance of plugin
	 */
	public static final Plugin PLUGIN = new Plugin();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> NAME = new TableFieldImpl<String>("name", String.class, PLUGIN);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DL = new TableFieldImpl<String>("dl", String.class, PLUGIN);

	/**
	 * No further instances allowed
	 */
	private Plugin() {
		super("plugin", Mysql.MYSQL);
	}
}
