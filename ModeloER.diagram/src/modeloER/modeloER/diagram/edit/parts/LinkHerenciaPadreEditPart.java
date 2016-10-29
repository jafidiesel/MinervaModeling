package modeloER.modeloER.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LinkHerenciaPadreEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4007;

	/**
	* @generated
	*/
	public LinkHerenciaPadreEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new modeloER.modeloER.diagram.edit.policies.LinkHerenciaPadreItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new LinkHerenciaPadreFigure();
	}

	/**
	* @generated
	*/
	public LinkHerenciaPadreFigure getPrimaryShape() {
		return (LinkHerenciaPadreFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHerenciaPadreFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public LinkHerenciaPadreFigure() {
			this.setLineWidth(2);

		}

	}

}
