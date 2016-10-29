package modeloER.modeloER.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ModeloERNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ModeloERNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem> result = new ArrayList<modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) {
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup group = (modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) {
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem navigatorItem = (modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {

		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup links = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_Diagrama_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoDerivado_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_ClavePrimaria_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoSimple_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoCompuesto_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup outgoinglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoCompuesto_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_RelacionTipoDebil_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup outgoinglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_RelacionTipoDebil_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_RelacionTipoFuerte_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup outgoinglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_RelacionTipoFuerte_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoMultivaluado_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_ClavePrimariaForanea_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_ClaveForanea_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup outgoinglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_Herencia_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_Herencia_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup outgoinglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadFuerte_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadFuerte_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Node sv = (Node) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup outgoinglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadDebil_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup incominglinks = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadDebil_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoEntidadLink_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoEntidadLink_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_LinkHerenciaHijo_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_LinkHerenciaHijo_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadRelacionFuerte_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadRelacionFuerte_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadRelacionDebil_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_EntidadRelacionDebil_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_LinkASAC_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_LinkASAC_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_RelacionAtributoLink_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_RelacionAtributoLink_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_LinkHerenciaPadre_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_LinkHerenciaPadre_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID: {
			LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem> result = new LinkedList<modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup target = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoDerivadoEntidad_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup source = new modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup(
					modeloER.modeloER.diagram.part.Messages.NavigatorGroupName_AtributoDerivadoEntidad_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
							.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem> result = new ArrayList<modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem) {
			modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem abstractNavigatorItem = (modeloER.modeloER.diagram.navigator.ModeloERAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
