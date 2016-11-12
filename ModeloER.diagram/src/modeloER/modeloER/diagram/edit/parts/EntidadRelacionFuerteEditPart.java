package modeloER.modeloER.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntidadRelacionFuerteEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4003;

	/**
	* @generated
	*/
	public EntidadRelacionFuerteEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new modeloER.modeloER.diagram.edit.policies.EntidadRelacionFuerteItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart) {
			((modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEntidadRelacionFuerteLimiteInferiorERFigure());
			return true;
		}
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteSuperiorEREditPart) {
			((modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteSuperiorEREditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEntidadRelacionFuerteLimiteSuperiorERFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart) {
			return true;
		}
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteSuperiorEREditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
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
		return new EntidadRelacionFuerteFigure();
	}

	/**
	* @generated
	*/
	public EntidadRelacionFuerteFigure getPrimaryShape() {
		return (EntidadRelacionFuerteFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EntidadRelacionFuerteFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntidadRelacionFuerteLimiteInferiorERFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntidadRelacionFuerteLimiteSuperiorERFigure;

		/**
		 * @generated
		 */
		public EntidadRelacionFuerteFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEntidadRelacionFuerteLimiteInferiorERFigure = new WrappingLabel();

			fFigureEntidadRelacionFuerteLimiteInferiorERFigure.setText("<...>");

			this.add(fFigureEntidadRelacionFuerteLimiteInferiorERFigure);

			fFigureEntidadRelacionFuerteLimiteSuperiorERFigure = new WrappingLabel();

			fFigureEntidadRelacionFuerteLimiteSuperiorERFigure.setText("<...>");

			this.add(fFigureEntidadRelacionFuerteLimiteSuperiorERFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntidadRelacionFuerteLimiteInferiorERFigure() {
			return fFigureEntidadRelacionFuerteLimiteInferiorERFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntidadRelacionFuerteLimiteSuperiorERFigure() {
			return fFigureEntidadRelacionFuerteLimiteSuperiorERFigure;
		}

	}

}
