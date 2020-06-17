package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DefinitionImpl.class)
public abstract class DefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<DefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<DefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<DefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<DefinitionImpl, StateUsage> ownedState;
	public static volatile CollectionAttribute<DefinitionImpl, Usage> usage;
	public static volatile ListAttribute<DefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<DefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<DefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile CollectionAttribute<DefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> output;
	public static volatile SingularAttribute<DefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> feature;
	public static volatile ListAttribute<DefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<DefinitionImpl, Element> member;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> ownedEndFeature;
	public static volatile CollectionAttribute<DefinitionImpl, Usage> variant;
	public static volatile ListAttribute<DefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<DefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<DefinitionImpl, ItemUsage> ownedItem;
	public static volatile CollectionAttribute<DefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile SingularAttribute<DefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<DefinitionImpl, Usage> flow;
	public static volatile SingularAttribute<DefinitionImpl, UUID> identifier;
	public static volatile ListAttribute<DefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<DefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<DefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<DefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<DefinitionImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<DefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<DefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<DefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<DefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<DefinitionImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<DefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<DefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<DefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<DefinitionImpl, String> name;
	public static volatile CollectionAttribute<DefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<DefinitionImpl, Usage> ownedUsage;
	public static volatile CollectionAttribute<DefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile ListAttribute<DefinitionImpl, Element> ownedMember;
	public static volatile CollectionAttribute<DefinitionImpl, PartUsage> ownedPart;
	public static volatile ListAttribute<DefinitionImpl, Membership> ownedMembership;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_STATE = "ownedState";
	public static final String USAGE = "usage";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String VARIANT = "variant";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_INDIVIDUAL = "ownedIndividual";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String FLOW = "flow";
	public static final String IDENTIFIER = "identifier";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_PART = "ownedPart";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

