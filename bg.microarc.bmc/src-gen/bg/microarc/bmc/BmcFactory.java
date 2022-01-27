/**
 */
package bg.microarc.bmc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bg.microarc.bmc.BmcPackage
 * @generated
 */
public interface BmcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BmcFactory eINSTANCE = bg.microarc.bmc.impl.BmcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BMC Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BMC Model</em>'.
	 * @generated
	 */
	BMCModel createBMCModel();

	/**
	 * Returns a new object of class '<em>Key Activities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Activities</em>'.
	 * @generated
	 */
	KeyActivities createKeyActivities();

	/**
	 * Returns a new object of class '<em>Key Partners</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Partners</em>'.
	 * @generated
	 */
	KeyPartners createKeyPartners();

	/**
	 * Returns a new object of class '<em>Key Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Resources</em>'.
	 * @generated
	 */
	KeyResources createKeyResources();

	/**
	 * Returns a new object of class '<em>Customer Segments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Segments</em>'.
	 * @generated
	 */
	CustomerSegments createCustomerSegments();

	/**
	 * Returns a new object of class '<em>Customer Relationships</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Relationships</em>'.
	 * @generated
	 */
	CustomerRelationships createCustomerRelationships();

	/**
	 * Returns a new object of class '<em>Channels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channels</em>'.
	 * @generated
	 */
	Channels createChannels();

	/**
	 * Returns a new object of class '<em>Value Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Proposition</em>'.
	 * @generated
	 */
	ValueProposition createValueProposition();

	/**
	 * Returns a new object of class '<em>Cost Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost Structure</em>'.
	 * @generated
	 */
	CostStructure createCostStructure();

	/**
	 * Returns a new object of class '<em>Revenue Streams</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revenue Streams</em>'.
	 * @generated
	 */
	RevenueStreams createRevenueStreams();

	/**
	 * Returns a new object of class '<em>BMC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BMC</em>'.
	 * @generated
	 */
	BMC createBMC();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BmcPackage getBmcPackage();

} //BmcFactory
