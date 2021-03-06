/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>DBA</code> 
 * schema
 */
@java.lang.SuppressWarnings("all")
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> IDENTITY_T_IDENTITY_PK = Identities0.IDENTITY_T_IDENTITY_PK;
	public static final org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> IDENTITY_T_IDENTITY = Identities0.IDENTITY_T_IDENTITY;
	public static final org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> IDENTITY_T_TRIGGERS = Identities0.IDENTITY_T_TRIGGERS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord> T_IDENTITY_PK__PK_T_IDENTITY_PK = UniqueKeys0.T_IDENTITY_PK__PK_T_IDENTITY_PK;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord> T_DATES__PK_T_DATES = UniqueKeys0.T_DATES__PK_T_DATES;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> T_BOOLEANS__PK_T_BOOLEANS = UniqueKeys0.T_BOOLEANS__PK_T_BOOLEANS;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> T_TRIGGERS__PK_T_TRIGGERS = UniqueKeys0.T_TRIGGERS__PK_T_TRIGGERS;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord> T_LANGUAGE__PK_T_LANGUAGE = UniqueKeys0.T_LANGUAGE__PK_T_LANGUAGE;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> T_725_LOB_TEST__PK_T_725_LOB_TEST = UniqueKeys0.T_725_LOB_TEST__PK_T_725_LOB_TEST;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord> T_AUTHOR__PK_T_AUTHOR = UniqueKeys0.T_AUTHOR__PK_T_AUTHOR;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> T_BOOK__PK_T_BOOK = UniqueKeys0.T_BOOK__PK_T_BOOK;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> T_BOOK_STORE__UK_T_BOOK_STORE_NAME = UniqueKeys0.T_BOOK_STORE__UK_T_BOOK_STORE_NAME;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord> T_BOOK_TO_BOOK_STORE__PK_B2BS = UniqueKeys0.T_BOOK_TO_BOOK_STORE__PK_B2BS;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_UNUSED__PK_X_UNUSED = UniqueKeys0.X_UNUSED__PK_X_UNUSED;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_UNUSED__UK_X_UNUSED_ID = UniqueKeys0.X_UNUSED__UK_X_UNUSED_ID;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> T_986_1__PK_986 = UniqueKeys0.T_986_1__PK_986;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> T_986_1__UK_986 = UniqueKeys0.T_986_1__UK_986;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> T_986_2__PK_986 = UniqueKeys0.T_986_2__PK_986;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> T_986_2__UK_986 = UniqueKeys0.T_986_2__UK_986;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TExoticTypesRecord> T_EXOTIC_TYPES__PK_T_EXOTIC_TYPES = UniqueKeys0.T_EXOTIC_TYPES__PK_T_EXOTIC_TYPES;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_639NumbersTableRecord> T_639_NUMBERS_TABLE__PK_T_639_NUMBERS_TABLE = UniqueKeys0.T_639_NUMBERS_TABLE__PK_T_639_NUMBERS_TABLE;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69 = UniqueKeys0.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record> X_TEST_CASE_71__PK_X_TEST_CASE_71 = UniqueKeys0.X_TEST_CASE_71__PK_X_TEST_CASE_71;
	public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> X_TEST_CASE_85__PK_X_TEST_CASE_85 = UniqueKeys0.X_TEST_CASE_85__PK_X_TEST_CASE_85;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord> T_BOOK__FK_T_BOOK_AUTHOR_ID = ForeignKeys0.T_BOOK__FK_T_BOOK_AUTHOR_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord> T_BOOK__FK_T_BOOK_CO_AUTHOR_ID = ForeignKeys0.T_BOOK__FK_T_BOOK_CO_AUTHOR_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord> T_BOOK__FK_T_BOOK_LANGUAGE_ID = ForeignKeys0.T_BOOK__FK_T_BOOK_LANGUAGE_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME = ForeignKeys0.T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID = ForeignKeys0.T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_UNUSED__FK_X_UNUSED_SELF = ForeignKeys0.X_UNUSED__FK_X_UNUSED_SELF;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> T_986_1__FK_986 = ForeignKeys0.T_986_1__FK_986;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> T_986_2__FK_986 = ForeignKeys0.T_986_2__FK_986;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A = ForeignKeys0.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B = ForeignKeys0.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> X_TEST_CASE_71__FK_X_TEST_CASE_71 = ForeignKeys0.X_TEST_CASE_71__FK_X_TEST_CASE_71;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_85__FK_X_TEST_CASE_85 = ForeignKeys0.X_TEST_CASE_85__FK_X_TEST_CASE_85;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_1 = ForeignKeys0.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_2 = ForeignKeys0.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_2;
	public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_3 = ForeignKeys0.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_3;

	/**
	 * No further instances allowed
	 */
	private Keys() {}

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> IDENTITY_T_IDENTITY_PK = createIdentity(org.jooq.test.sybase.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.sybase.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
		public static org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> IDENTITY_T_IDENTITY = createIdentity(org.jooq.test.sybase.generatedclasses.tables.TIdentity.T_IDENTITY, org.jooq.test.sybase.generatedclasses.tables.TIdentity.T_IDENTITY.ID);
		public static org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> IDENTITY_T_TRIGGERS = createIdentity(org.jooq.test.sybase.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.sybase.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord> T_IDENTITY_PK__PK_T_IDENTITY_PK = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.sybase.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord> T_DATES__PK_T_DATES = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES, org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> T_BOOLEANS__PK_T_BOOLEANS = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.sybase.generatedclasses.tables.TBooleans.T_BOOLEANS.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TTriggersRecord> T_TRIGGERS__PK_T_TRIGGERS = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.sybase.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord> T_LANGUAGE__PK_T_LANGUAGE = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TLanguage.T_LANGUAGE, org.jooq.test.sybase.generatedclasses.tables.TLanguage.T_LANGUAGE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> T_725_LOB_TEST__PK_T_725_LOB_TEST = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord> T_AUTHOR__PK_T_AUTHOR = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> T_BOOK__PK_T_BOOK = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> T_BOOK_STORE__UK_T_BOOK_STORE_NAME = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord> T_BOOK_TO_BOOK_STORE__PK_B2BS = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_UNUSED__PK_X_UNUSED = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED.ID, org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_UNUSED__UK_X_UNUSED_ID = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> T_986_1__PK_986 = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1, org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> T_986_1__UK_986 = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1, org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> T_986_2__PK_986 = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2, org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2.REF);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record> T_986_2__UK_986 = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2, org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2.REF);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TExoticTypesRecord> T_EXOTIC_TYPES__PK_T_EXOTIC_TYPES = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.sybase.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_639NumbersTableRecord> T_639_NUMBERS_TABLE__PK_T_639_NUMBERS_TABLE = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.sybase.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69 = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record> X_TEST_CASE_71__PK_X_TEST_CASE_71 = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> X_TEST_CASE_85__PK_X_TEST_CASE_85 = createUniqueKey(org.jooq.test.sybase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.sybase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord> T_BOOK__FK_T_BOOK_AUTHOR_ID = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.T_AUTHOR__PK_T_AUTHOR, org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord> T_BOOK__FK_T_BOOK_CO_AUTHOR_ID = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.T_AUTHOR__PK_T_AUTHOR, org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord, org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord> T_BOOK__FK_T_BOOK_LANGUAGE_ID = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.T_LANGUAGE__PK_T_LANGUAGE, org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.T_BOOK_STORE__UK_T_BOOK_STORE_NAME, org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.T_BOOK__PK_T_BOOK, org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sybase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_UNUSED__FK_X_UNUSED_SELF = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__PK_X_UNUSED, org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED.ID_REF, org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> T_986_1__FK_986 = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__UK_X_UNUSED_ID, org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1, org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_2Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> T_986_2__FK_986 = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__UK_X_UNUSED_ID, org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2, org.jooq.test.sybase.generatedclasses.tables.T_986_2.T_986_2.REF);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__UK_X_UNUSED_ID, org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__UK_X_UNUSED_ID, org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> X_TEST_CASE_71__FK_X_TEST_CASE_71 = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69, org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.sybase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_85__FK_X_TEST_CASE_85 = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__PK_X_UNUSED, org.jooq.test.sybase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.sybase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, org.jooq.test.sybase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_1 = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85, org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_71Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_2 = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_71__PK_X_TEST_CASE_71, org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_3 = createForeignKey(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__PK_X_UNUSED, org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID, org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME);
	}
}
