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
public class EntidadRelacionDebilEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4004;

	/**
	* @generated
	*/
	public EntidadRelacionDebilEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new modeloER.modeloER.diagram.edit.policies.EntidadRelacionDebilItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart) {
			((modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEntidadRelacionDebilLimiteInferiorERFigure());
			return true;
		}
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteSuperiorEREditPart) {
			((modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteSuperiorEREditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEntidadRelacionDebilLimiteSuperiorERFigure());
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
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart) {
			return true;
		}
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteSuperiorEREditPart) {
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
		return new EntidadRelacionDebilFigure();
	}

	/**
	* @generated
	*/
	public EntidadRelacionDebilFigure getPrimaryShape() {
		return (EntidadRelacionDebilFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EntidadRelacionDebilFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntidadRelacionDebilLimiteInferiorERFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntidadRelacionDebilLimiteSuperiorERFigure;

		/**
		 * @generated
		 */
		public EntidadRelacionDebilFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEntidadRelacionDebilLimiteInferiorERFigure = new WrappingLabel();

			fFigureEntidadRelacionDebilLimiteInferiorERFigure.setText("<...>");

			this.add(fFigureEntidadRelacionDebilLimiteInferiorERFigure);

			fFigureEntidadRelacionDebilLimiteSuperiorERFigure = new WrappingLabel();

			fFigureEntidadRelacionDebilLimiteSuperiorERFigure.setText("<...>");

			this.add(fFigureEntidadRelacionDebilLimiteSuperiorERFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntidadRelacionDebilLimiteInferiorERFigure() {
			return fFigureEntidadRelacionDebilLimiteInferiorERFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntidadRelacionDebilLimiteSuperiorERFigure() {
			return fFigureEntidadRelacionDebilLimiteSuperiorERFigure;
		}

	}

}
