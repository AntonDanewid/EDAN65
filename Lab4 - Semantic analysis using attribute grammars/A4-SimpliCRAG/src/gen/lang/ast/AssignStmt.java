/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.9 */
package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/calc.ast:19
 * @production AssignStmt : {@link Stmt} ::= <span class="component">{@link IdUseExpr}</span> <span class="component">{@link Expr}</span>;

 */
public class AssignStmt extends Stmt implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/PrettyPrint.jrag:82
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("\n" + ind + getIdUseExpr().prettyString()  + " = " + getExpr().prettyString() + ";");
	}
  /**
   * @declaredat ASTNode:1
   */
  public AssignStmt() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public AssignStmt(IdUseExpr p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    compatibleTypes_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:39
   */
  public AssignStmt clone() throws CloneNotSupportedException {
    AssignStmt node = (AssignStmt) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public AssignStmt copy() {
    try {
      AssignStmt node = (AssignStmt) clone();
      node.parent = null;
      if(children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:65
   */
  public AssignStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public AssignStmt treeCopyNoTransform() {
    AssignStmt tree = (AssignStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if(child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:94
   */
  public AssignStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:101
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) ;    
  }
  /**
   * Replaces the IdUseExpr child.
   * @param node The new node to replace the IdUseExpr child.
   * @apilevel high-level
   */
  public void setIdUseExpr(IdUseExpr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdUseExpr child.
   * @return The current node used as the IdUseExpr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdUseExpr")
  public IdUseExpr getIdUseExpr() {
    return (IdUseExpr) getChild(0);
  }
  /**
   * Retrieves the IdUseExpr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdUseExpr child.
   * @apilevel low-level
   */
  public IdUseExpr getIdUseExprNoTransform() {
    return (IdUseExpr) getChildNoTransform(0);
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  /**
   * @apilevel internal
   */
  protected boolean compatibleTypes_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleTypes_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean compatibleTypes_value;
/**
 * @apilevel internal
 */
private void compatibleTypes_reset() {
  compatibleTypes_computed = false;
  compatibleTypes_visited = false;
}  
  @ASTNodeAnnotation.Attribute
  public boolean compatibleTypes() {
    if(compatibleTypes_computed) {
      return compatibleTypes_value;
    }
    if (compatibleTypes_visited) {
      throw new RuntimeException("Circular definition of attr: compatibleTypes in class: org.jastadd.ast.AST.SynDecl");
    }
    compatibleTypes_visited = true;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    compatibleTypes_value = getIdUseExpr().type().isUnknownType() 	||
    			getExpr().type().isUnknownType()		||
    			getIdUseExpr().type().getType().equals(getExpr().type().getType());
    if (true) {
      compatibleTypes_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    compatibleTypes_visited = false;
    return compatibleTypes_value;
  }
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect ErrorContributions
   * @declaredat /home/kuba/workspace43/A4-SimpliCRAG/src/jastadd/Errors.jrag:58
   */
    if (!compatibleTypes()) {
      {
        Program ref = (Program) (program());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
    super.collect_contributors_Program_errors();
  }
  protected void contributeTo_Program_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_Program_errors(collection);
    if (!compatibleTypes())
      collection.add(error("Assignment to '" + getIdUseExpr().type().getType() + " " + getIdUseExpr().getID() + "' is incompatible with type '" + getExpr().type().getType() + "'"));
  }

}
