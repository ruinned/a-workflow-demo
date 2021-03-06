/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcBswRunnableMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swc Bsw Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl#getRunnableMapping <em>Runnable Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl#getSwcBehavior <em>Swc Behavior</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwcBswMappingImpl#getBswBehavior <em>Bsw Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcBswMappingImpl extends ArElementImpl implements SwcBswMapping {
	/**
	 * The cached value of the '{@link #getRunnableMapping() <em>Runnable Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcBswRunnableMapping> runnableMapping;

	/**
	 * The cached value of the '{@link #getSwcBehavior() <em>Swc Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcBehavior()
	 * @generated
	 * @ordered
	 */
	protected SwcInternalBehavior swcBehavior;

	/**
	 * The cached value of the '{@link #getBswBehavior() <em>Bsw Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswBehavior()
	 * @generated
	 * @ordered
	 */
	protected BswInternalBehavior bswBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcBswMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SWC_BSW_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcBswRunnableMapping> getRunnableMapping() {
		if (runnableMapping == null) {
			runnableMapping = new EObjectContainmentEList<SwcBswRunnableMapping>(SwcBswRunnableMapping.class, this, M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING);
		}
		return runnableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehavior getSwcBehavior() {
		if (swcBehavior != null && ((EObject)swcBehavior).eIsProxy()) {
			InternalEObject oldSwcBehavior = (InternalEObject)swcBehavior;
			swcBehavior = (SwcInternalBehavior)eResolveProxy(oldSwcBehavior);
			if (swcBehavior != oldSwcBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR, oldSwcBehavior, swcBehavior));
			}
		}
		return swcBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehavior basicGetSwcBehavior() {
		return swcBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwcBehavior(SwcInternalBehavior newSwcBehavior) {
		SwcInternalBehavior oldSwcBehavior = swcBehavior;
		swcBehavior = newSwcBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR, oldSwcBehavior, swcBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior getBswBehavior() {
		if (bswBehavior != null && ((EObject)bswBehavior).eIsProxy()) {
			InternalEObject oldBswBehavior = (InternalEObject)bswBehavior;
			bswBehavior = (BswInternalBehavior)eResolveProxy(oldBswBehavior);
			if (bswBehavior != oldBswBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR, oldBswBehavior, bswBehavior));
			}
		}
		return bswBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior basicGetBswBehavior() {
		return bswBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBswBehavior(BswInternalBehavior newBswBehavior) {
		BswInternalBehavior oldBswBehavior = bswBehavior;
		bswBehavior = newBswBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR, oldBswBehavior, bswBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				return ((InternalEList<?>)getRunnableMapping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				return getRunnableMapping();
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				if (resolve) return getSwcBehavior();
				return basicGetSwcBehavior();
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				if (resolve) return getBswBehavior();
				return basicGetBswBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				getRunnableMapping().clear();
				getRunnableMapping().addAll((Collection<? extends SwcBswRunnableMapping>)newValue);
				return;
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				setSwcBehavior((SwcInternalBehavior)newValue);
				return;
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				setBswBehavior((BswInternalBehavior)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				getRunnableMapping().clear();
				return;
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				setSwcBehavior((SwcInternalBehavior)null);
				return;
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				setBswBehavior((BswInternalBehavior)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case M2Package.SWC_BSW_MAPPING__RUNNABLE_MAPPING:
				return runnableMapping != null && !runnableMapping.isEmpty();
			case M2Package.SWC_BSW_MAPPING__SWC_BEHAVIOR:
				return swcBehavior != null;
			case M2Package.SWC_BSW_MAPPING__BSW_BEHAVIOR:
				return bswBehavior != null;
		}
		return super.eIsSet(featureID);
	}

} //SwcBswMappingImpl
