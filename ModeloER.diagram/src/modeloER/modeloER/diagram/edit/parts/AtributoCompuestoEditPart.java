package modeloER.modeloER.diagram.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class AtributoCompuestoEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2004;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AtributoCompuestoEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new modeloER.modeloER.diagram.edit.policies.AtributoCompuestoItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AtributoSimpleFigure();
	}

	/**
	* @generated
	*/
	public AtributoSimpleFigure getPrimaryShape() {
		return (AtributoSimpleFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart) {
			((modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAtributoSimpleNombreAtributoFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
				.getType(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AtributoSimpleFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAtributoSimpleNombreAtributoFigure;

		/**
		 * @generated
		 */
		public AtributoSimpleFigure() {
			this.setLayoutManager(new StackLayout());
			this.setFill(false);
			this.setOutline(false);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(70), getMapMode().DPtoLP(45)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Ellipse elipseSimple0 = new Ellipse();

			this.add(elipseSimple0);

			GridLayout layoutElipseSimple0 = new GridLayout();
			layoutElipseSimple0.numColumns = 1;
			layoutElipseSimple0.makeColumnsEqualWidth = true;
			elipseSimple0.setLayoutManager(layoutElipseSimple0);

			fFigureAtributoSimpleNombreAtributoFigure = new WrappingLabel();

			fFigureAtributoSimpleNombreAtributoFigure.setText("<...>");

			GridData constraintFFigureAtributoSimpleNombreAtributoFigure = new GridData();
			constraintFFigureAtributoSimpleNombreAtributoFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureAtributoSimpleNombreAtributoFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureAtributoSimpleNombreAtributoFigure.horizontalIndent = 0;
			constraintFFigureAtributoSimpleNombreAtributoFigure.horizontalSpan = 1;
			constraintFFigureAtributoSimpleNombreAtributoFigure.verticalSpan = 1;
			constraintFFigureAtributoSimpleNombreAtributoFigure.grabExcessHorizontalSpace = true;
			constraintFFigureAtributoSimpleNombreAtributoFigure.grabExcessVerticalSpace = true;
			elipseSimple0.add(fFigureAtributoSimpleNombreAtributoFigure,
					constraintFFigureAtributoSimpleNombreAtributoFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAtributoSimpleNombreAtributoFigure() {
			return fFigureAtributoSimpleNombreAtributoFigure;
		}

	}

}
