package org.omg.sysml.metamodel.impl;

import org.omg.sysml.metamodel.*;

import org.omg.sysml.metamodel.Package;
import org.omg.sysml.metamodel.Class;

import jackson.MofObjectSerializer;
import jackson.MofObjectDeserializer;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.FetchMode;

// import info.archinnov.achilles.annotations.UDT;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.EnumType;
import javax.persistence.ElementCollection;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.FetchType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;
import javax.persistence.SecondaryTable;
import javax.persistence.CollectionTable;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

@Entity(name = "SuccessionItemFlowImpl")
@SecondaryTable(name = "SuccessionItemFlow")
@org.hibernate.annotations.Table(appliesTo = "SuccessionItemFlow", fetch = FetchMode.SELECT, optional = false)
// @info.archinnov.achilles.annotations.Table(table = "SuccessionItemFlow")
@DiscriminatorValue(value = "SuccessionItemFlow")
@JsonTypeName(value = "SuccessionItemFlow")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class SuccessionItemFlowImpl extends MofObjectImpl implements SuccessionItemFlow {
    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("association")
    private Collection<Association> association;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "AssociationMetaDef", metaColumn = @javax.persistence.Column(name = "associationType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_association",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "associationId"))
    public Collection<Association> getAssociation() {
        if (association == null) {
            association = new ArrayList<>();
        }
        return association;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = AssociationImpl.class)
    public void setAssociation(Collection<Association> association) {
        this.association = association;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedFeatureMembership")
    private List<FeatureMembership> ownedFeatureMembership;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMembershipMetaDef", metaColumn = @javax.persistence.Column(name = "ownedFeatureMembershipType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedFeatureMembership",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedFeatureMembershipId"))
    public List<FeatureMembership> getOwnedFeatureMembership() {
        if (ownedFeatureMembership == null) {
            ownedFeatureMembership = new ArrayList<>();
        }
        return ownedFeatureMembership;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureMembershipImpl.class)
    public void setOwnedFeatureMembership(List<FeatureMembership> ownedFeatureMembership) {
        this.ownedFeatureMembership = ownedFeatureMembership;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("itemFeature")
    private Collection<ItemFeature> itemFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ItemFeatureMetaDef", metaColumn = @javax.persistence.Column(name = "itemFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_itemFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "itemFeatureId"))
    public Collection<ItemFeature> getItemFeature() {
        if (itemFeature == null) {
            itemFeature = new ArrayList<>();
        }
        return itemFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ItemFeatureImpl.class)
    public void setItemFeature(Collection<ItemFeature> itemFeature) {
        this.itemFeature = itemFeature;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("referencedType")
    private Collection<Type> referencedType;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "TypeMetaDef", metaColumn = @javax.persistence.Column(name = "referencedTypeType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_referencedType",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "referencedTypeId"))
    public Collection<Type> getReferencedType() {
        if (referencedType == null) {
            referencedType = new ArrayList<>();
        }
        return referencedType;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = TypeImpl.class)
    public void setReferencedType(Collection<Type> referencedType) {
        this.referencedType = referencedType;
    }



    // @info.archinnov.achilles.annotations.Column("isSufficient")
    private Boolean isSufficient;

    @JsonGetter
    @javax.persistence.Column(name = "isSufficient", table = "SuccessionItemFlow")
    public Boolean getIsSufficient() {
        return isSufficient;
    }

    @JsonSetter
    public void setIsSufficient(Boolean isSufficient) {
        this.isSufficient = isSufficient;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("importedMembership")
    private List<Membership> importedMembership;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "MembershipMetaDef", metaColumn = @javax.persistence.Column(name = "importedMembershipType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_importedMembership",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "importedMembershipId"))
    public List<Membership> getImportedMembership() {
        if (importedMembership == null) {
            importedMembership = new ArrayList<>();
        }
        return importedMembership;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = MembershipImpl.class)
    public void setImportedMembership(List<Membership> importedMembership) {
        this.importedMembership = importedMembership;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("itemFlowFeature")
    private Collection<ItemFlowFeature> itemFlowFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ItemFlowFeatureMetaDef", metaColumn = @javax.persistence.Column(name = "itemFlowFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_itemFlowFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "itemFlowFeatureId"))
    public Collection<ItemFlowFeature> getItemFlowFeature() {
        if (itemFlowFeature == null) {
            itemFlowFeature = new ArrayList<>();
        }
        return itemFlowFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ItemFlowFeatureImpl.class)
    public void setItemFlowFeature(Collection<ItemFlowFeature> itemFlowFeature) {
        this.itemFlowFeature = itemFlowFeature;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("endFeature")
    private Collection<Feature> endFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "endFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_endFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "endFeatureId"))
    public Collection<Feature> getEndFeature() {
        if (endFeature == null) {
            endFeature = new ArrayList<>();
        }
        return endFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setEndFeature(Collection<Feature> endFeature) {
        this.endFeature = endFeature;
    }



    // @info.archinnov.achilles.annotations.Column("owningRelationship")
    private Relationship owningRelationship;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    @Any(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelationshipType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelationshipId", table = "SuccessionItemFlow")
    public Relationship getOwningRelationship() {
        return owningRelationship;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = RelationshipImpl.class)
    public void setOwningRelationship(Relationship owningRelationship) {
        this.owningRelationship = owningRelationship;
    }



    // @info.archinnov.achilles.annotations.Column("isUnique")
    private Boolean isUnique;

    @JsonGetter
    @javax.persistence.Column(name = "isUnique", table = "SuccessionItemFlow")
    public Boolean getIsUnique() {
        return isUnique;
    }

    @JsonSetter
    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedEndFeature")
    private Collection<Feature> ownedEndFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "ownedEndFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedEndFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedEndFeatureId"))
    public Collection<Feature> getOwnedEndFeature() {
        if (ownedEndFeature == null) {
            ownedEndFeature = new ArrayList<>();
        }
        return ownedEndFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setOwnedEndFeature(Collection<Feature> ownedEndFeature) {
        this.ownedEndFeature = ownedEndFeature;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("relatedFeature")
    private Collection<Feature> relatedFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "relatedFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_relatedFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "relatedFeatureId"))
    public Collection<Feature> getRelatedFeature() {
        if (relatedFeature == null) {
            relatedFeature = new ArrayList<>();
        }
        return relatedFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setRelatedFeature(Collection<Feature> relatedFeature) {
        this.relatedFeature = relatedFeature;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("valuation")
    private FeatureValue valuation;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "FeatureValueMetaDef", metaColumn = @javax.persistence.Column(name = "valuationType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "valuationId", table = "SuccessionItemFlow")
    public FeatureValue getValuation() {
        return valuation;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = FeatureValueImpl.class)
    public void setValuation(FeatureValue valuation) {
        this.valuation = valuation;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("name")
    private String name;

    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "name", table = "SuccessionItemFlow")
    public String getName() {
        return name;
    }

    @JsonSetter
    public void setName(String name) {
        this.name = name;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedElement")
    private Collection<Element> ownedElement;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "ownedElementType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedElement",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedElementId"))
    public Collection<Element> getOwnedElement() {
        if (ownedElement == null) {
            ownedElement = new ArrayList<>();
        }
        return ownedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setOwnedElement(Collection<Element> ownedElement) {
        this.ownedElement = ownedElement;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owner")
    private Element owner;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "ownerType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "ownerId", table = "SuccessionItemFlow")
    public Element getOwner() {
        return owner;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = ElementImpl.class)
    public void setOwner(Element owner) {
        this.owner = owner;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedType")
    private Collection<Type> ownedType;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "TypeMetaDef", metaColumn = @javax.persistence.Column(name = "ownedTypeType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedType",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedTypeId"))
    public Collection<Type> getOwnedType() {
        if (ownedType == null) {
            ownedType = new ArrayList<>();
        }
        return ownedType;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = TypeImpl.class)
    public void setOwnedType(Collection<Type> ownedType) {
        this.ownedType = ownedType;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("multiplicity")
    private Multiplicity multiplicity;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "MultiplicityMetaDef", metaColumn = @javax.persistence.Column(name = "multiplicityType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "multiplicityId", table = "SuccessionItemFlow")
    public Multiplicity getMultiplicity() {
        return multiplicity;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = MultiplicityImpl.class)
    public void setMultiplicity(Multiplicity multiplicity) {
        this.multiplicity = multiplicity;
    }



    // @info.archinnov.achilles.annotations.Column("isDirected")
    private Boolean isDirected;

    @JsonGetter
    @javax.persistence.Column(name = "isDirected", table = "SuccessionItemFlow")
    public Boolean getIsDirected() {
        return isDirected;
    }

    @JsonSetter
    public void setIsDirected(Boolean isDirected) {
        this.isDirected = isDirected;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("output")
    private Collection<Feature> output;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "outputType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_output",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "outputId"))
    public Collection<Feature> getOutput() {
        if (output == null) {
            output = new ArrayList<>();
        }
        return output;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setOutput(Collection<Feature> output) {
        this.output = output;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("itemFlowEnd")
    private Collection<ItemFlowEnd> itemFlowEnd;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ItemFlowEndMetaDef", metaColumn = @javax.persistence.Column(name = "itemFlowEndType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_itemFlowEnd",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "itemFlowEndId"))
    public Collection<ItemFlowEnd> getItemFlowEnd() {
        if (itemFlowEnd == null) {
            itemFlowEnd = new ArrayList<>();
        }
        return itemFlowEnd;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ItemFlowEndImpl.class)
    public void setItemFlowEnd(Collection<ItemFlowEnd> itemFlowEnd) {
        this.itemFlowEnd = itemFlowEnd;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningNamespace")
    private Package owningNamespace;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "PackageMetaDef", metaColumn = @javax.persistence.Column(name = "owningNamespaceType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningNamespaceId", table = "SuccessionItemFlow")
    public Package getOwningNamespace() {
        return owningNamespace;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = PackageImpl.class)
    public void setOwningNamespace(Package owningNamespace) {
        this.owningNamespace = owningNamespace;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("input")
    private Collection<Feature> input;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "inputType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_input",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "inputId"))
    public Collection<Feature> getInput() {
        if (input == null) {
            input = new ArrayList<>();
        }
        return input;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setInput(Collection<Feature> input) {
        this.input = input;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("connectorEnd")
    private Collection<Feature> connectorEnd;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "connectorEndType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_connectorEnd",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "connectorEndId"))
    public Collection<Feature> getConnectorEnd() {
        if (connectorEnd == null) {
            connectorEnd = new ArrayList<>();
        }
        return connectorEnd;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setConnectorEnd(Collection<Feature> connectorEnd) {
        this.connectorEnd = connectorEnd;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("membership")
    private List<Membership> membership;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "MembershipMetaDef", metaColumn = @javax.persistence.Column(name = "membershipType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_membership",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "membershipId"))
    public List<Membership> getMembership() {
        if (membership == null) {
            membership = new ArrayList<>();
        }
        return membership;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = MembershipImpl.class)
    public void setMembership(List<Membership> membership) {
        this.membership = membership;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("type")
    private Collection<Type> type;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "TypeMetaDef", metaColumn = @javax.persistence.Column(name = "typeType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_type",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "typeId"))
    public Collection<Type> getType() {
        if (type == null) {
            type = new ArrayList<>();
        }
        return type;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = TypeImpl.class)
    public void setType(Collection<Type> type) {
        this.type = type;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedMembership")
    private List<Membership> ownedMembership;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "MembershipMetaDef", metaColumn = @javax.persistence.Column(name = "ownedMembershipType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedMembership",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedMembershipId"))
    public List<Membership> getOwnedMembership() {
        if (ownedMembership == null) {
            ownedMembership = new ArrayList<>();
        }
        return ownedMembership;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = MembershipImpl.class)
    public void setOwnedMembership(List<Membership> ownedMembership) {
        this.ownedMembership = ownedMembership;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("endOwningType")
    private Type endOwningType;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "TypeMetaDef", metaColumn = @javax.persistence.Column(name = "endOwningTypeType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "endOwningTypeId", table = "SuccessionItemFlow")
    public Type getEndOwningType() {
        return endOwningType;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = TypeImpl.class)
    public void setEndOwningType(Type endOwningType) {
        this.endOwningType = endOwningType;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("isComposite")
    private Boolean isComposite;

    @JsonGetter
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "isComposite", table = "SuccessionItemFlow")
    public Boolean getIsComposite() {
        return isComposite;
    }

    @JsonSetter
    public void setIsComposite(Boolean isComposite) {
        this.isComposite = isComposite;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedSubsetting")
    private Collection<Subsetting> ownedSubsetting;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "SubsettingMetaDef", metaColumn = @javax.persistence.Column(name = "ownedSubsettingType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedSubsetting",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedSubsettingId"))
    public Collection<Subsetting> getOwnedSubsetting() {
        if (ownedSubsetting == null) {
            ownedSubsetting = new ArrayList<>();
        }
        return ownedSubsetting;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = SubsettingImpl.class)
    public void setOwnedSubsetting(Collection<Subsetting> ownedSubsetting) {
        this.ownedSubsetting = ownedSubsetting;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("feature")
    private Collection<Feature> feature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "featureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_feature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "featureId"))
    public Collection<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<>();
        }
        return feature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setFeature(Collection<Feature> feature) {
        this.feature = feature;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedImport")
    private List<Import> ownedImport;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ImportMetaDef", metaColumn = @javax.persistence.Column(name = "ownedImportType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedImport",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedImportId"))
    public List<Import> getOwnedImport() {
        if (ownedImport == null) {
            ownedImport = new ArrayList<>();
        }
        return ownedImport;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ImportImpl.class)
    public void setOwnedImport(List<Import> ownedImport) {
        this.ownedImport = ownedImport;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedGeneralization")
    private List<Generalization> ownedGeneralization;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "GeneralizationMetaDef", metaColumn = @javax.persistence.Column(name = "ownedGeneralizationType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedGeneralization",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedGeneralizationId"))
    public List<Generalization> getOwnedGeneralization() {
        if (ownedGeneralization == null) {
            ownedGeneralization = new ArrayList<>();
        }
        return ownedGeneralization;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = GeneralizationImpl.class)
    public void setOwnedGeneralization(List<Generalization> ownedGeneralization) {
        this.ownedGeneralization = ownedGeneralization;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedAssociationType")
    private Collection<Association> ownedAssociationType;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "AssociationMetaDef", metaColumn = @javax.persistence.Column(name = "ownedAssociationTypeType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedAssociationType",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedAssociationTypeId"))
    public Collection<Association> getOwnedAssociationType() {
        if (ownedAssociationType == null) {
            ownedAssociationType = new ArrayList<>();
        }
        return ownedAssociationType;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = AssociationImpl.class)
    public void setOwnedAssociationType(Collection<Association> ownedAssociationType) {
        this.ownedAssociationType = ownedAssociationType;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("sourceOutputFeature")
    private List<Feature> sourceOutputFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "sourceOutputFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_sourceOutputFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "sourceOutputFeatureId"))
    public List<Feature> getSourceOutputFeature() {
        if (sourceOutputFeature == null) {
            sourceOutputFeature = new ArrayList<>();
        }
        return sourceOutputFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setSourceOutputFeature(List<Feature> sourceOutputFeature) {
        this.sourceOutputFeature = sourceOutputFeature;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningFeatureMembership")
    private FeatureMembership owningFeatureMembership;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "FeatureMembershipMetaDef", metaColumn = @javax.persistence.Column(name = "owningFeatureMembershipType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningFeatureMembershipId", table = "SuccessionItemFlow")
    public FeatureMembership getOwningFeatureMembership() {
        return owningFeatureMembership;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = FeatureMembershipImpl.class)
    public void setOwningFeatureMembership(FeatureMembership owningFeatureMembership) {
        this.owningFeatureMembership = owningFeatureMembership;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("behavior")
    private Collection<Behavior> behavior;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "BehaviorMetaDef", metaColumn = @javax.persistence.Column(name = "behaviorType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_behavior",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "behaviorId"))
    public Collection<Behavior> getBehavior() {
        if (behavior == null) {
            behavior = new ArrayList<>();
        }
        return behavior;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = BehaviorImpl.class)
    public void setBehavior(Collection<Behavior> behavior) {
        this.behavior = behavior;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedFeature")
    private Collection<Feature> ownedFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "ownedFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedFeatureId"))
    public Collection<Feature> getOwnedFeature() {
        if (ownedFeature == null) {
            ownedFeature = new ArrayList<>();
        }
        return ownedFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setOwnedFeature(Collection<Feature> ownedFeature) {
        this.ownedFeature = ownedFeature;
    }



    // @info.archinnov.achilles.annotations.Column("target")
    private Collection<Element> target;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "targetType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_target",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "targetId"))
    public Collection<Element> getTarget() {
        if (target == null) {
            target = new ArrayList<>();
        }
        return target;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setTarget(Collection<Element> target) {
        this.target = target;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedMember")
    private List<Element> ownedMember;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "ownedMemberType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedMember",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedMemberId"))
    public List<Element> getOwnedMember() {
        if (ownedMember == null) {
            ownedMember = new ArrayList<>();
        }
        return ownedMember;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setOwnedMember(List<Element> ownedMember) {
        this.ownedMember = ownedMember;
    }



    // @info.archinnov.achilles.annotations.Column("isAbstract")
    private Boolean isAbstract;

    @JsonGetter
    @javax.persistence.Column(name = "isAbstract", table = "SuccessionItemFlow")
    public Boolean getIsAbstract() {
        return isAbstract;
    }

    @JsonSetter
    public void setIsAbstract(Boolean isAbstract) {
        this.isAbstract = isAbstract;
    }



    // @info.archinnov.achilles.annotations.Column("ownedRelationship")
    private Collection<Relationship> ownedRelationship;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    @ManyToAny(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "ownedRelationshipType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedRelationship",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedRelationshipId"))
    public Collection<Relationship> getOwnedRelationship() {
        if (ownedRelationship == null) {
            ownedRelationship = new ArrayList<>();
        }
        return ownedRelationship;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = RelationshipImpl.class)
    public void setOwnedRelationship(Collection<Relationship> ownedRelationship) {
        this.ownedRelationship = ownedRelationship;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningType")
    private Type owningType;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "TypeMetaDef", metaColumn = @javax.persistence.Column(name = "owningTypeType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningTypeId", table = "SuccessionItemFlow")
    public Type getOwningType() {
        return owningType;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = TypeImpl.class)
    public void setOwningType(Type owningType) {
        this.owningType = owningType;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("isEnd")
    private Boolean isEnd;

    @JsonGetter
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "isEnd", table = "SuccessionItemFlow")
    public Boolean getIsEnd() {
        return isEnd;
    }

    @JsonSetter
    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }



    // @info.archinnov.achilles.annotations.Column("owningRelatedElement")
    private Element owningRelatedElement;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelatedElementType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelatedElementId", table = "SuccessionItemFlow")
    public Element getOwningRelatedElement() {
        return owningRelatedElement;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = ElementImpl.class)
    public void setOwningRelatedElement(Element owningRelatedElement) {
        this.owningRelatedElement = owningRelatedElement;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("relatedElement")
    private Collection<Element> relatedElement;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "relatedElementType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_relatedElement",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "relatedElementId"))
    public Collection<Element> getRelatedElement() {
        if (relatedElement == null) {
            relatedElement = new ArrayList<>();
        }
        return relatedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setRelatedElement(Collection<Element> relatedElement) {
        this.relatedElement = relatedElement;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("isNonunique")
    private Boolean isNonunique;

    @JsonGetter
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "isNonunique", table = "SuccessionItemFlow")
    public Boolean getIsNonunique() {
        return isNonunique;
    }

    @JsonSetter
    public void setIsNonunique(Boolean isNonunique) {
        this.isNonunique = isNonunique;
    }



    // @info.archinnov.achilles.annotations.Column("identifier")
    private java.util.UUID identifier;

    @JsonGetter
    public java.util.UUID getIdentifier() {
        return identifier;
    }

    @JsonSetter
    public void setIdentifier(java.util.UUID identifier) {
        this.identifier = identifier;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("targetInputFeature")
    private List<Feature> targetInputFeature;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "FeatureMetaDef", metaColumn = @javax.persistence.Column(name = "targetInputFeatureType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_targetInputFeature",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "targetInputFeatureId"))
    public List<Feature> getTargetInputFeature() {
        if (targetInputFeature == null) {
            targetInputFeature = new ArrayList<>();
        }
        return targetInputFeature;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureImpl.class)
    public void setTargetInputFeature(List<Feature> targetInputFeature) {
        this.targetInputFeature = targetInputFeature;
    }



    // @info.archinnov.achilles.annotations.Column("isOrdered")
    private Boolean isOrdered;

    @JsonGetter
    @javax.persistence.Column(name = "isOrdered", table = "SuccessionItemFlow")
    public Boolean getIsOrdered() {
        return isOrdered;
    }

    @JsonSetter
    public void setIsOrdered(Boolean isOrdered) {
        this.isOrdered = isOrdered;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningMembership")
    private Membership owningMembership;

    @JsonGetter
    @JsonSerialize(using = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "MembershipMetaDef", metaColumn = @javax.persistence.Column(name = "owningMembershipType"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningMembershipId", table = "SuccessionItemFlow")
    public Membership getOwningMembership() {
        return owningMembership;
    }

    @JsonSetter
    @JsonDeserialize(using = MofObjectDeserializer.class, as = MembershipImpl.class)
    public void setOwningMembership(Membership owningMembership) {
        this.owningMembership = owningMembership;
    }



    // @info.archinnov.achilles.annotations.Column("ownedRelatedElement")
    private Collection<Element> ownedRelatedElement;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "ownedRelatedElementType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedRelatedElement",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedRelatedElementId"))
    public Collection<Element> getOwnedRelatedElement() {
        if (ownedRelatedElement == null) {
            ownedRelatedElement = new ArrayList<>();
        }
        return ownedRelatedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setOwnedRelatedElement(Collection<Element> ownedRelatedElement) {
        this.ownedRelatedElement = ownedRelatedElement;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("itemType")
    private List<Classifier> itemType;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ClassifierMetaDef", metaColumn = @javax.persistence.Column(name = "itemTypeType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_itemType",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "itemTypeId"))
    public List<Classifier> getItemType() {
        if (itemType == null) {
            itemType = new ArrayList<>();
        }
        return itemType;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ClassifierImpl.class)
    public void setItemType(List<Classifier> itemType) {
        this.itemType = itemType;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("inheritedMembership")
    private List<Membership> inheritedMembership;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "MembershipMetaDef", metaColumn = @javax.persistence.Column(name = "inheritedMembershipType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_inheritedMembership",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "inheritedMembershipId"))
    public List<Membership> getInheritedMembership() {
        if (inheritedMembership == null) {
            inheritedMembership = new ArrayList<>();
        }
        return inheritedMembership;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = MembershipImpl.class)
    public void setInheritedMembership(List<Membership> inheritedMembership) {
        this.inheritedMembership = inheritedMembership;
    }



    // @info.archinnov.achilles.annotations.Column("typing")
    private Collection<FeatureTyping> typing;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    @ManyToAny(metaDef = "FeatureTypingMetaDef", metaColumn = @javax.persistence.Column(name = "typingType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_typing",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "typingId"))
    public Collection<FeatureTyping> getTyping() {
        if (typing == null) {
            typing = new ArrayList<>();
        }
        return typing;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = FeatureTypingImpl.class)
    public void setTyping(Collection<FeatureTyping> typing) {
        this.typing = typing;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("member")
    private List<Element> member;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "memberType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_member",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "memberId"))
    public List<Element> getMember() {
        if (member == null) {
            member = new ArrayList<>();
        }
        return member;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setMember(List<Element> member) {
        this.member = member;
    }



    // @info.archinnov.achilles.annotations.Column("source")
    private Collection<Element> source;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "sourceType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_source",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "sourceId"))
    public Collection<Element> getSource() {
        if (source == null) {
            source = new ArrayList<>();
        }
        return source;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = ElementImpl.class)
    public void setSource(Collection<Element> source) {
        this.source = source;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedRedefinition")
    private Collection<Redefinition> ownedRedefinition;

    @JsonGetter
    @JsonSerialize(contentUsing = MofObjectSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "RedefinitionMetaDef", metaColumn = @javax.persistence.Column(name = "ownedRedefinitionType"), fetch = FetchType.LAZY)
    @JoinTable(name = "SuccessionItemFlow_ownedRedefinition",
            joinColumns = @JoinColumn(name = "SuccessionItemFlowId"),
            inverseJoinColumns = @JoinColumn(name = "ownedRedefinitionId"))
    public Collection<Redefinition> getOwnedRedefinition() {
        if (ownedRedefinition == null) {
            ownedRedefinition = new ArrayList<>();
        }
        return ownedRedefinition;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = MofObjectDeserializer.class, contentAs = RedefinitionImpl.class)
    public void setOwnedRedefinition(Collection<Redefinition> ownedRedefinition) {
        this.ownedRedefinition = ownedRedefinition;
    }



}