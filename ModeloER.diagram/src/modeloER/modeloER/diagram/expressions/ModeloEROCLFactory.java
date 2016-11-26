package modeloER.modeloER.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class ModeloEROCLFactory {

	/**
	* @generated
	*/
	private final modeloER.modeloER.diagram.expressions.ModeloERAbstractExpression[] expressions;

	/**
	* @generated
	*/
	private final String[] expressionBodies;

	/**
	* @generated
	*/
	protected ModeloEROCLFactory() {
		this.expressions = new modeloER.modeloER.diagram.expressions.ModeloERAbstractExpression[16];
		this.expressionBodies = new String[] { "self.nombreAtributo <> null and self.nombreAtributo <> \'\'", //$NON-NLS-1$
				"LinkASAC.allInstances()-> forAll( atributoCS: LinkASAC, atributoCS2: LinkASAC|atributoCS<>atributoCS2 implies atributoCS.atributosimpleDestino <> atributoCS2.atributosimpleDestino)", //$NON-NLS-1$
				"self.nuloAtributo = false", //$NON-NLS-1$
				"self.atributosEntidad->isUnique(nombreAtributo)", //$NON-NLS-1$
				"self.nombreEntidad<>null and self.nombreEntidad<>\'\'", //$NON-NLS-1$
				"Entidad::allInstances()->isUnique(nombreEntidad)", //$NON-NLS-1$
				"self.atributosEntidad->exists(ae|ae.oclIsKindOf(ClavePrimaria))", //$NON-NLS-1$
				"self.limiteInferiorER<>\'\' and self.limiteInferiorER<>null and self.limiteInferiorER = \'*\' or (not(self.limiteInferiorER.toInteger().oclIsInvalid())) and self.limiteSuperiorER<>\'\' and self.limiteSuperiorER<>null and self.limiteSuperiorER = \'*\' or (not(self.limiteSuperiorER.toInteger().oclIsInvalid()))", //$NON-NLS-1$
				"entidadERLink.oclIsTypeOf(EntidadDebil) and relacionERLink.oclIsTypeOf(RelacionTipoDebil)", //$NON-NLS-1$
				"entidadERLink.oclIsTypeOf(EntidadFuerte) and relacionERLink.oclIsKindOf(Relacion)", //$NON-NLS-1$
				"self.nombreRelacion<>null and self.nombreRelacion<>\'\'", //$NON-NLS-1$
				"self.atributosRelacion->forAll(r|r.oclIsKindOf(AtributoSimple))", //$NON-NLS-1$
				"entidadAtributoLinkOrigen.oclIsKindOf(Entidad) implies ( atributoEntidadLinkDestino.oclIsTypeOf(ClavePrimaria) or atributoEntidadLinkDestino.oclIsTypeOf(AtributoSimple) or atributoEntidadLinkDestino.oclIsTypeOf(AtributoCompuesto) or atributoEntidadLinkDestino.oclIsTypeOf(AtributoMultivaluado))", //$NON-NLS-1$
				"AtributoEntidadLink.allInstances()->forAll( atributoE: AtributoEntidadLink, atributoE2: AtributoEntidadLink|atributoE <> atributoE2 implies ((atributoE.atributoEntidadLinkDestino <> atributoE2.atributoEntidadLinkDestino) and  (atributoE.entidadAtributoLinkOrigen.atributosEntidad ->includes(atributoE.atributoEntidadLinkDestino))))\n", //$NON-NLS-1$
				"AtributoDerivadoEntidad.allInstances() -> forAll(atributoD1:AtributoDerivadoEntidad, atributoD2: AtributoDerivadoEntidad| atributoD1 <> atributoD2 implies ((atributoD1.atributoderivadoDestino <> atributoD2.atributoderivadoDestino) and (atributoD1.entidadAtributoDerivadoOrigen.atributosEntidad -> includes(atributoD1.atributoderivadoDestino))))", //$NON-NLS-1$
				"LinkHerenciaHijo.allInstances()->forAll(hijo: LinkHerenciaHijo|self.linkHerenciaPadreHerenciaDestino = hijo.herenciaHijoHerenciaDestino implies self.herenciaPadreEntidadOrigen <> hijo.herenciaHijoEntidadOrigen)", //$NON-NLS-1$
		};
	}

	/**
	* @generated
	*/
	private static ModeloEROCLFactory getInstance() {
		ModeloEROCLFactory instance = modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
				.getModeloEROCLFactory();
		if (instance == null) {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.setModeloEROCLFactory(instance = new ModeloEROCLFactory());
		}
		return instance;
	}

	/**
	* @generated
	*/
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	* @generated
	*/
	public static modeloER.modeloER.diagram.expressions.ModeloERAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		ModeloEROCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(cached.expressionBodies[index], context,
					environment == null ? Collections.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	* This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	* @generated
	*/
	public static modeloER.modeloER.diagram.expressions.ModeloERAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	* This method will become private in the next release
	* @generated
	*/
	public static modeloER.modeloER.diagram.expressions.ModeloERAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier> emptyMap());
	}

	/**
	* @generated
	*/
	private static class Expression extends modeloER.modeloER.diagram.expressions.ModeloERAbstractExpression {

		/**
		* @generated
		*/
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		* @generated
		*/
		private OCLExpression oclExpression;

		/**
		* @generated
		*/
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		* @generated
		*/
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		* @generated
		*/
		private static void initCustomEnv(Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv, ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		* @generated
		*/
		private static Variable createVar(Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
