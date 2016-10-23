/**
 */
package flotaVehiculos.provider;

import flotaVehiculos.util.FlotaVehiculosAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlotaVehiculosItemProviderAdapterFactory extends FlotaVehiculosAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotaVehiculosItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Diagrama} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaItemProvider diagramaItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Diagrama}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramaAdapter() {
		if (diagramaItemProvider == null) {
			diagramaItemProvider = new DiagramaItemProvider(this);
		}

		return diagramaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Vehiculo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiculoItemProvider vehiculoItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Vehiculo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVehiculoAdapter() {
		if (vehiculoItemProvider == null) {
			vehiculoItemProvider = new VehiculoItemProvider(this);
		}

		return vehiculoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Automovil} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomovilItemProvider automovilItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Automovil}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAutomovilAdapter() {
		if (automovilItemProvider == null) {
			automovilItemProvider = new AutomovilItemProvider(this);
		}

		return automovilItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.DeSegunda} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeSegundaItemProvider deSegundaItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.DeSegunda}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeSegundaAdapter() {
		if (deSegundaItemProvider == null) {
			deSegundaItemProvider = new DeSegundaItemProvider(this);
		}

		return deSegundaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Conductor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductorItemProvider conductorItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Conductor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConductorAdapter() {
		if (conductorItemProvider == null) {
			conductorItemProvider = new ConductorItemProvider(this);
		}

		return conductorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.DePrimera} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DePrimeraItemProvider dePrimeraItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.DePrimera}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDePrimeraAdapter() {
		if (dePrimeraItemProvider == null) {
			dePrimeraItemProvider = new DePrimeraItemProvider(this);
		}

		return dePrimeraItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Pesado} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PesadoItemProvider pesadoItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Pesado}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPesadoAdapter() {
		if (pesadoItemProvider == null) {
			pesadoItemProvider = new PesadoItemProvider(this);
		}

		return pesadoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Camion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamionItemProvider camionItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Camion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCamionAdapter() {
		if (camionItemProvider == null) {
			camionItemProvider = new CamionItemProvider(this);
		}

		return camionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Camioneta} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamionetaItemProvider camionetaItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Camioneta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCamionetaAdapter() {
		if (camionetaItemProvider == null) {
			camionetaItemProvider = new CamionetaItemProvider(this);
		}

		return camionetaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.Omnibus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OmnibusItemProvider omnibusItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.Omnibus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOmnibusAdapter() {
		if (omnibusItemProvider == null) {
			omnibusItemProvider = new OmnibusItemProvider(this);
		}

		return omnibusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link flotaVehiculos.AsignacionDiaria} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsignacionDiariaItemProvider asignacionDiariaItemProvider;

	/**
	 * This creates an adapter for a {@link flotaVehiculos.AsignacionDiaria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAsignacionDiariaAdapter() {
		if (asignacionDiariaItemProvider == null) {
			asignacionDiariaItemProvider = new AsignacionDiariaItemProvider(this);
		}

		return asignacionDiariaItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (diagramaItemProvider != null) diagramaItemProvider.dispose();
		if (vehiculoItemProvider != null) vehiculoItemProvider.dispose();
		if (automovilItemProvider != null) automovilItemProvider.dispose();
		if (deSegundaItemProvider != null) deSegundaItemProvider.dispose();
		if (conductorItemProvider != null) conductorItemProvider.dispose();
		if (dePrimeraItemProvider != null) dePrimeraItemProvider.dispose();
		if (pesadoItemProvider != null) pesadoItemProvider.dispose();
		if (camionItemProvider != null) camionItemProvider.dispose();
		if (camionetaItemProvider != null) camionetaItemProvider.dispose();
		if (omnibusItemProvider != null) omnibusItemProvider.dispose();
		if (asignacionDiariaItemProvider != null) asignacionDiariaItemProvider.dispose();
	}

}
