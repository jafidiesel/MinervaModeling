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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class ClaveForaneaEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2010;

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
	public ClaveForaneaEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new modeloER.modeloER.diagram.edit.policies.ClaveForaneaItemSemanticEditPolicy());
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
		return primaryShape = new ClaveForaneaFigure();
	}

	/**
	* @generated
	*/
	public ClaveForaneaFigure getPrimaryShape() {
		return (ClaveForaneaFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart) {
			((modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureClaveForaneaNombreAtributoFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart) {
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
				.getType(modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ClaveForaneaFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClaveForaneaNombreAtributoFigure;

		/**
		 * @generated
		 */
		public ClaveForaneaFigure() {
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

			Ellipse elipseClaveForanea0 = new Ellipse();

			this.add(elipseClaveForanea0);

			GridLayout layoutElipseClaveForanea0 = new GridLayout();
			layoutElipseClaveForanea0.numColumns = 1;
			layoutElipseClaveForanea0.makeColumnsEqualWidth = true;
			elipseClaveForanea0.setLayoutManager(layoutElipseClaveForanea0);

			fFigureClaveForaneaNombreAtributoFigure = new WrappingLabel();

			fFigureClaveForaneaNombreAtributoFigure.setText("<...>");

			fFigureClaveForaneaNombreAtributoFigure.setFont(FFIGURECLAVEFORANEANOMBREATRIBUTOFIGURE_FONT);

			GridData constraintFFigureClaveForaneaNombreAtributoFigure = new GridData();
			constraintFFigureClaveForaneaNombreAtributoFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureClaveForaneaNombreAtributoFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureClaveForaneaNombreAtributoFigure.horizontalIndent = 0;
			constraintFFigureClaveForaneaNombreAtributoFigure.horizontalSpan = 1;
			constraintFFigureClaveForaneaNombreAtributoFigure.verticalSpan = 1;
			constraintFFigureClaveForaneaNombreAtributoFigure.grabExcessHorizontalSpace = true;
			constraintFFigureClaveForaneaNombreAtributoFigure.grabExcessVerticalSpace = true;
			elipseClaveForanea0.add(fFigureClaveForaneaNombreAtributoFigure,
					constraintFFigureClaveForaneaNombreAtributoFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClaveForaneaNombreAtributoFigure() {
			return fFigureClaveForaneaNombreAtributoFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECLAVEFORANEANOMBREATRIBUTOFIGURE_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.ITALIC);

}