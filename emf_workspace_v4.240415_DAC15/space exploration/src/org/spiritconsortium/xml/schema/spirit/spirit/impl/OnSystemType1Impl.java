/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefPortConstraintsType;
import org.spiritconsortium.xml.schema.spirit.spirit.DirectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType1;
import org.spiritconsortium.xml.schema.spirit.spirit.PresenceType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On System Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.OnSystemType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.OnSystemType1Impl#getPresence <em>Presence</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.OnSystemType1Impl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.OnSystemType1Impl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.OnSystemType1Impl#getModeConstraints <em>Mode Constraints</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.OnSystemType1Impl#getMirroredModeConstraints <em>Mirrored Mode Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnSystemType1Impl extends EObjectImpl implements OnSystemType1 {
	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresence() <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresence()
	 * @generated
	 * @ordered
	 */
	protected static final PresenceType PRESENCE_EDEFAULT = PresenceType.OPTIONAL_LITERAL;

	/**
	 * The cached value of the '{@link #getPresence() <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresence()
	 * @generated
	 * @ordered
	 */
	protected PresenceType presence = PRESENCE_EDEFAULT;

	/**
	 * This is true if the Presence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presenceESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.OUT_LITERAL;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The cached value of the '{@link #getModeConstraints() <em>Mode Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeConstraints()
	 * @generated
	 * @ordered
	 */
	protected AbstractionDefPortConstraintsType modeConstraints;

	/**
	 * The cached value of the '{@link #getMirroredModeConstraints() <em>Mirrored Mode Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirroredModeConstraints()
	 * @generated
	 * @ordered
	 */
	protected AbstractionDefPortConstraintsType mirroredModeConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnSystemType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getOnSystemType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceType getPresence() {
		return presence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresence(PresenceType newPresence) {
		PresenceType oldPresence = presence;
		presence = newPresence == null ? PRESENCE_EDEFAULT : newPresence;
		boolean oldPresenceESet = presenceESet;
		presenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__PRESENCE, oldPresence, presence, !oldPresenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresence() {
		PresenceType oldPresence = presence;
		boolean oldPresenceESet = presenceESet;
		presence = PRESENCE_EDEFAULT;
		presenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.ON_SYSTEM_TYPE1__PRESENCE, oldPresence, PRESENCE_EDEFAULT, oldPresenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresence() {
		return presenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BigInteger newWidth) {
		BigInteger oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		DirectionType oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.ON_SYSTEM_TYPE1__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefPortConstraintsType getModeConstraints() {
		return modeConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModeConstraints(AbstractionDefPortConstraintsType newModeConstraints, NotificationChain msgs) {
		AbstractionDefPortConstraintsType oldModeConstraints = modeConstraints;
		modeConstraints = newModeConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS, oldModeConstraints, newModeConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeConstraints(AbstractionDefPortConstraintsType newModeConstraints) {
		if (newModeConstraints != modeConstraints) {
			NotificationChain msgs = null;
			if (modeConstraints != null)
				msgs = ((InternalEObject)modeConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS, null, msgs);
			if (newModeConstraints != null)
				msgs = ((InternalEObject)newModeConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS, null, msgs);
			msgs = basicSetModeConstraints(newModeConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS, newModeConstraints, newModeConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefPortConstraintsType getMirroredModeConstraints() {
		return mirroredModeConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMirroredModeConstraints(AbstractionDefPortConstraintsType newMirroredModeConstraints, NotificationChain msgs) {
		AbstractionDefPortConstraintsType oldMirroredModeConstraints = mirroredModeConstraints;
		mirroredModeConstraints = newMirroredModeConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS, oldMirroredModeConstraints, newMirroredModeConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirroredModeConstraints(AbstractionDefPortConstraintsType newMirroredModeConstraints) {
		if (newMirroredModeConstraints != mirroredModeConstraints) {
			NotificationChain msgs = null;
			if (mirroredModeConstraints != null)
				msgs = ((InternalEObject)mirroredModeConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS, null, msgs);
			if (newMirroredModeConstraints != null)
				msgs = ((InternalEObject)newMirroredModeConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS, null, msgs);
			msgs = basicSetMirroredModeConstraints(newMirroredModeConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS, newMirroredModeConstraints, newMirroredModeConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS:
				return basicSetModeConstraints(null, msgs);
			case _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS:
				return basicSetMirroredModeConstraints(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.ON_SYSTEM_TYPE1__GROUP:
				return getGroup();
			case _1Package.ON_SYSTEM_TYPE1__PRESENCE:
				return getPresence();
			case _1Package.ON_SYSTEM_TYPE1__WIDTH:
				return getWidth();
			case _1Package.ON_SYSTEM_TYPE1__DIRECTION:
				return getDirection();
			case _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS:
				return getModeConstraints();
			case _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS:
				return getMirroredModeConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.ON_SYSTEM_TYPE1__GROUP:
				setGroup((String)newValue);
				return;
			case _1Package.ON_SYSTEM_TYPE1__PRESENCE:
				setPresence((PresenceType)newValue);
				return;
			case _1Package.ON_SYSTEM_TYPE1__WIDTH:
				setWidth((BigInteger)newValue);
				return;
			case _1Package.ON_SYSTEM_TYPE1__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS:
				setModeConstraints((AbstractionDefPortConstraintsType)newValue);
				return;
			case _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS:
				setMirroredModeConstraints((AbstractionDefPortConstraintsType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case _1Package.ON_SYSTEM_TYPE1__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case _1Package.ON_SYSTEM_TYPE1__PRESENCE:
				unsetPresence();
				return;
			case _1Package.ON_SYSTEM_TYPE1__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case _1Package.ON_SYSTEM_TYPE1__DIRECTION:
				unsetDirection();
				return;
			case _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS:
				setModeConstraints((AbstractionDefPortConstraintsType)null);
				return;
			case _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS:
				setMirroredModeConstraints((AbstractionDefPortConstraintsType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _1Package.ON_SYSTEM_TYPE1__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case _1Package.ON_SYSTEM_TYPE1__PRESENCE:
				return isSetPresence();
			case _1Package.ON_SYSTEM_TYPE1__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case _1Package.ON_SYSTEM_TYPE1__DIRECTION:
				return isSetDirection();
			case _1Package.ON_SYSTEM_TYPE1__MODE_CONSTRAINTS:
				return modeConstraints != null;
			case _1Package.ON_SYSTEM_TYPE1__MIRRORED_MODE_CONSTRAINTS:
				return mirroredModeConstraints != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", presence: ");
		if (presenceESet) result.append(presence); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OnSystemType1Impl
