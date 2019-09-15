// Generated from main/mc/parser/MC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#manydecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManydecls(MCParser.ManydeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MCParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#variable_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl(MCParser.Variable_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(MCParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#many_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMany_variables(MCParser.Many_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(MCParser.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(MCParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MCParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#parameter_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_tail(MCParser.Parameter_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#parameter_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_decl(MCParser.Parameter_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#var_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt_list(MCParser.Var_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#var_stmt_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt_tail(MCParser.Var_stmt_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#var_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt(MCParser.Var_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MCParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#array_pointer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_pointer_type(MCParser.Array_pointer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#input_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_para(MCParser.Input_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#output_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_para(MCParser.Output_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(MCParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(MCParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(MCParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr4(MCParser.Expr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr5(MCParser.Expr5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr6(MCParser.Expr6Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr7(MCParser.Expr7Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr8(MCParser.Expr8Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr9(MCParser.Expr9Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#operands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperands(MCParser.OperandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MCParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_element(MCParser.Array_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(MCParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(MCParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#exprtail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprtail(MCParser.ExprtailContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MCParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(MCParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#if_no_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_no_else(MCParser.If_no_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#dowhile_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_stmt(MCParser.Dowhile_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(MCParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(MCParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(MCParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MCParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(MCParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(MCParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(MCParser.Main_functionContext ctx);
}