// Generated from Small.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface SmallListener extends ParseTreeListener {
	void enterStatement(SmallParser.StatementContext ctx);
	void exitStatement(SmallParser.StatementContext ctx);

	void enterAssignment(SmallParser.AssignmentContext ctx);
	void exitAssignment(SmallParser.AssignmentContext ctx);

	void enterConstant(SmallParser.ConstantContext ctx);
	void exitConstant(SmallParser.ConstantContext ctx);

	void enterDeclaration(SmallParser.DeclarationContext ctx);
	void exitDeclaration(SmallParser.DeclarationContext ctx);

	void enterFile(SmallParser.FileContext ctx);
	void exitFile(SmallParser.FileContext ctx);

	void enterInit(SmallParser.InitContext ctx);
	void exitInit(SmallParser.InitContext ctx);

	void enterBlock(SmallParser.BlockContext ctx);
	void exitBlock(SmallParser.BlockContext ctx);

	void enterExpr(SmallParser.ExprContext ctx);
	void exitExpr(SmallParser.ExprContext ctx);

	void enterExprlist(SmallParser.ExprlistContext ctx);
	void exitExprlist(SmallParser.ExprlistContext ctx);

	void enterType(SmallParser.TypeContext ctx);
	void exitType(SmallParser.TypeContext ctx);

	void enterIdentifier(SmallParser.IdentifierContext ctx);
	void exitIdentifier(SmallParser.IdentifierContext ctx);

	void enterPrint(SmallParser.PrintContext ctx);
	void exitPrint(SmallParser.PrintContext ctx);
}