package modeloER.modeloER.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AtributoDerivadoEntidad2EditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4009;

	/**
	* @generated
	*/
	public AtributoDerivadoEntidad2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new modeloER.modeloER.diagram.edit.policies.AtributoDerivadoEntidad2ItemSemanticEditPolicy());
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
		return new AtributoDerivadoEntidadFigure();
	}

	/**
	* @generated
	*/
	public AtributoDerivadoEntidadFigure getPrimaryShape() {
		return (AtributoDerivadoEntidadFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AtributoDerivadoEntidadFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public AtributoDerivadoEntidadFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASH);

		}

	}

}
