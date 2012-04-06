package net.java.amateras.db.dialect;

import java.sql.Types;

import net.java.amateras.db.Messages;
import net.java.amateras.db.visual.model.ColumnModel;
import net.java.amateras.db.visual.model.RootModel;
import net.java.amateras.db.visual.model.TableModel;

/**
 *
 * @since 1.0.8
 */
public class MSSQLDialect extends AbstractDialect {

	private static final IColumnType[] COLUMN_TYPES = {
		new ColumnType("BIT", Messages.getResourceString("type.bit"), true, Types.BIT),
		new ColumnType("INT", Messages.getResourceString("type.integer"), true, Types.INTEGER),
		new ColumnType("BIGINT", Messages.getResourceString("type.integer"), true, Types.BIGINT),
		new ColumnType("SMALLINT", Messages.getResourceString("type.integer"), true, Types.SMALLINT),
		new ColumnType("TINYINT", Messages.getResourceString("type.integer"), true, Types.TINYINT),
		new ColumnType("NUMERIC", Messages.getResourceString("type.numeric"), true, Types.NUMERIC),
		new ColumnType("DOUBLE PRECISION", Messages.getResourceString("type.real"), false, Types.DOUBLE),
		new ColumnType("FLOAT", Messages.getResourceString("type.real"), false, Types.FLOAT),
		//new ColumnType("NVARCHAR", Messages.getResourceString("type.string"),true, Types.NVARCHAR),
		new ColumnType("VARCHAR", Messages.getResourceString("type.string"),true, Types.VARCHAR),
		new ColumnType("VARCHAR", Messages.getResourceString("type.string"),true, Types.CLOB),
		//new ColumnType("NVARCHAR", Messages.getResourceString("type.string"),true, Types.NCLOB),
		new ColumnType("CHAR", Messages.getResourceString("type.char"),true, Types.CHAR),
		//new ColumnType("NCHAR", Messages.getResourceString("type.char"),true, Types.NCHAR),
		new ColumnType("DATETIME", Messages.getResourceString("type.date"), false, Types.DATE),
		new ColumnType("TIMESTAMP", Messages.getResourceString("type.date"), true, Types.TIMESTAMP),
		new ColumnType("VARBINARY", Messages.getResourceString("type.binary"), true, Types.BLOB)
	};

	public MSSQLDialect() {
		super(COLUMN_TYPES, "go");
	}

	@Override
	protected String createColumnDDL(RootModel root, TableModel tableModel,
			ColumnModel columnModel, boolean schema, boolean alterTable, StringBuilder additions) {
		String ddl = super.createColumnDDL(root, tableModel, columnModel, schema, alterTable, additions);
		if(columnModel.isAutoIncrement()){
			ddl += " IDENTITY";
		}
		return ddl;
	}

	@Override
	public String getColumnMetadataSQL(String tableName) {
		return "SELECT TOP 1 * FROM " + tableName  ;
	}


}
