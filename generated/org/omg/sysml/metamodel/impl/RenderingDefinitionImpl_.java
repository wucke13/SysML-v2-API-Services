package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
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
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RenderingDefinitionImpl.class)
public abstract class RenderingDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<RenderingDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<RenderingDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<RenderingDefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ViewUsage> ownedView;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, RenderingUsage> rendering;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<RenderingDefinitionImpl, String> name;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<RenderingDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<RenderingDefinitionImpl, Element> member;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<RenderingDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Element> ownedElement;
	public static volatile ListAttribute<RenderingDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<RenderingDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<RenderingDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<RenderingDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, PartUsage> ownedPart;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String VARIANT = "variant";
	public static final String OWNED_INDIVIDUAL = "ownedIndividual";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String RENDERING = "rendering";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_STATE = "ownedState";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}
