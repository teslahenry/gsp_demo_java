
package demos.dlineage.dataflow.model;

import gudusoft.gsqlparser.nodes.TObjectName;
import gudusoft.gsqlparser.nodes.TParseTreeNode;

public class FunctionResultColumn extends ResultColumn {

	public FunctionResultColumn(ResultSet resultSet, TObjectName columnObject) {
		super(resultSet, columnObject);
	}
	
	public FunctionResultColumn(ResultSet resultSet, TParseTreeNode columnObject) {
		super(resultSet, columnObject);
		this.name = "case-when";
		this.fullName = "case-when";
	}
}
