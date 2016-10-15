package ModeloER.modeloER.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class ModeloERCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected ModeloER.modeloER.diagram.part.ModeloERCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected ModeloER.modeloER.diagram.part.ModeloERCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ModeloER.modeloER.diagram.part.Messages.ModeloERCreationWizardTitle);
		setDefaultPageImageDescriptor(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModeloERWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new ModeloER.modeloER.diagram.part.ModeloERCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "modeloer_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(ModeloER.modeloER.diagram.part.Messages.ModeloERCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				ModeloER.modeloER.diagram.part.Messages.ModeloERCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ModeloER.modeloER.diagram.part.ModeloERCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "modeloer") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".modeloer_diagram".length()); //$NON-NLS-1$
					setFileName(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "modeloer")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(ModeloER.modeloER.diagram.part.Messages.ModeloERCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				ModeloER.modeloER.diagram.part.Messages.ModeloERCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = ModeloER.modeloER.diagram.part.ModeloERDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ModeloER.modeloER.diagram.part.ModeloERDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								ModeloER.modeloER.diagram.part.Messages.ModeloERCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						ModeloER.modeloER.diagram.part.Messages.ModeloERCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
