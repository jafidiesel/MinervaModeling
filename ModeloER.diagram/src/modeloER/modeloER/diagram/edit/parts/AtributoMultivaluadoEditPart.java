package modeloER.modeloER.diagram.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
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
public class AtributoMultivaluadoEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2007;

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
	public AtributoMultivaluadoEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new modeloER.modeloER.diagram.edit.policies.AtributoMultivaluadoItemSemanticEditPolicy());
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
		return primaryShape = new AtributoMultivaluadoFigure();
	}

	/**
	* @generated
	*/
	public AtributoMultivaluadoFigure getPrimaryShape() {
		return (AtributoMultivaluadoFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart) {
			((modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAtributoMultivaluadoNombreAtributoFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart) {
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
				.getType(modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AtributoMultivaluadoFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAtributoMultivaluadoNombreAtributoFigure;

		/**
		 * @generated
		 */
		public AtributoMultivaluadoFigure() {
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

			Ellipse elipseAtributoMultivaluado0 = new Ellipse(){
				protected void outlineShape(Graphics graphics) {
					super.outlineShape(graphics);
					double scaleFactor = 0.9;
					Rectangle rect1 = getBounds().getCopy();// Las figuras estan contenidas en un rectangulo
					Rectangle rect = getBounds().getCopy().scale(scaleFactor);
					rect.x = rect1.x + (int) Math.floor(rect1.width * (1 - scaleFactor) / 2);
					rect.y = rect1.y + (int) Math.floor(rect1.height * (1 - scaleFactor) / 2);
					
					graphics.drawOval(rect);
					}
			};

		

			this.add(elipseAtributoMultivaluado0);

			GridLayout layoutElipseAtributoMultivaluado0 = new GridLayout();
			layoutElipseAtributoMultivaluado0.numColumns = 1;
			layoutElipseAtributoMultivaluado0.makeColumnsEqualWidth = true;
			elipseAtributoMultivaluado0.setLayoutManager(layoutElipseAtributoMultivaluado0);

			fFigureAtributoMultivaluadoNombreAtributoFigure = new WrappingLabel();

			fFigureAtributoMultivaluadoNombreAtributoFigure.setText("<...>");

			GridData constraintFFigureAtributoMultivaluadoNombreAtributoFigure = new GridData();
			constraintFFigureAtributoMultivaluadoNombreAtributoFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureAtributoMultivaluadoNombreAtributoFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureAtributoMultivaluadoNombreAtributoFigure.horizontalIndent = 0;
			constraintFFigureAtributoMultivaluadoNombreAtributoFigure.horizontalSpan = 1;
			constraintFFigureAtributoMultivaluadoNombreAtributoFigure.verticalSpan = 1;
			constraintFFigureAtributoMultivaluadoNombreAtributoFigure.grabExcessHorizontalSpace = true;
			constraintFFigureAtributoMultivaluadoNombreAtributoFigure.grabExcessVerticalSpace = true;
			elipseAtributoMultivaluado0.add(fFigureAtributoMultivaluadoNombreAtributoFigure,
					constraintFFigureAtributoMultivaluadoNombreAtributoFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAtributoMultivaluadoNombreAtributoFigure() {
			return fFigureAtributoMultivaluadoNombreAtributoFigure;
		}

	}

}
