/*
 * Copyright (c) 2002-2013, Mairie de Paris
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.grusupply.business;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


/**
 * This is the business class for the object Demand
 */
@JsonPropertyOrder({"utilisateur","demand_id","demand_id_type","demand_max_step","demand_user_current_step","demand_state","notification_type","date_demande","crm_status_id","reference","suggest"})
public class Demand
{
    // Variables declarations 
    private int _nUserCid;
    private int _nDemandId;
    private int _nDemandIdType;
    private int _nDemandMaxStep;
    private int _nDemandUserCurrentStep;
    private int _nDemandState;
    private String _strNotifType;
    private String _strDateDemand;
    private int _nCRMStatus;
    private String _strReference;
    private Suggest _oSuggest;

    /**
     * Returns the UserGuid
     * @return The UserGuid
     */
    @JsonProperty( "utilisateur" )
    public int getUserCid(  )
    {
        return _nUserCid;
    }

    /**
     * Sets the UserGuid
     * @param UserGuid The UserGuid
     */
    public void setUserCid( int nUserGuid )
    {
        _nUserCid = nUserGuid;
    }

    /**
     * Returns the DemandId
     * @return The DemandId
     */
    @JsonProperty( "demand_id" )
    public int getDemandId(  )
    {
        return _nDemandId;
    }

    /**
     * Sets the DemandId
     * @param nDemandId The DemandId
     */
    public void setDemandId( int nDemandId )
    {
        _nDemandId = nDemandId;
    }

    /**
     * Returns the DemandIdType
     * @return The DemandIdType
     */
    @JsonProperty( "demand_id_type" )
    public int getDemandIdType(  )
    {
        return _nDemandIdType;
    }

    /**
     * Sets the DemandIdType
     * @param nDemandIdType The DemandIdType
     */
    public void setDemandIdType( int nDemandIdType )
    {
        _nDemandIdType = nDemandIdType;
    }

    /**
     * Returns the DemandMaxStep
     * @return The DemandMaxStep
     */
    @JsonProperty( "demand_max_step" )
    public int getDemandMaxStep(  )
    {
        return _nDemandMaxStep;
    }

    /**
     * Sets the DemandMaxStep
     * @param nDemandMaxStep The DemandMaxStep
     */
    public void setDemandMaxStep( int nDemandMaxStep )
    {
        _nDemandMaxStep = nDemandMaxStep;
    }

    /**
     * Returns the DemandUserCurrentStep
     * @return The DemandUserCurrentStep
     */
    @JsonProperty( "demand_user_max_step" )
    public int getDemandUserCurrentStep(  )
    {
        return _nDemandUserCurrentStep;
    }

    /**
     * Sets the DemandUserCurrentStep
     * @param nDemandUserCurrentStep The DemandUserCurrentStep
     */
    public void setDemandUserCurrentStep( int nDemandUserCurrentStep )
    {
        _nDemandUserCurrentStep = nDemandUserCurrentStep;
    }

    /**
     * Returns the DemandState
     * @return The DemandState
     */
    @JsonProperty( "demand_state" )
    public int getDemandState(  )
    {
        return _nDemandState;
    }

    /**
     * Sets the DemandState
     * @param nDemandState The DemandState
     */
    public void setDemandState( int nDemandState )
    {
        _nDemandState = nDemandState;
    }

    /**
     * Returns the NotifType
     * @return The NotifType
     */
    @JsonProperty( "notification_type" )
    public String getNotifType(  )
    {
        return _strNotifType;
    }

    /**
     * Sets the NotifType
     * @param strNotifType The NotifType
     */
    public void setNotifType( String strNotifType )
    {
        _strNotifType = strNotifType;
    }

    /**
     * Returns the DateDemand
     * @return The DateDemand
     */
    @JsonProperty( "date_demand" )
    public String getDateDemand(  )
    {
        return _strDateDemand;
    }

    /**
     * Sets the DateDemand
     * @param strDateDemand The DateDemand
     */
    public void setDateDemand( String strDateDemand )
    {
        _strDateDemand = strDateDemand;
    }

    /**
     * Returns the CRMStatus
     * @return The CRMStatus
     */
    @JsonProperty( "crm_status_id" )
    public int getCRMStatus(  )
    {
        return _nCRMStatus;
    }

    /**
     * Sets the CRMStatus
     * @param nCRMStatus The CRMStatus
     */
    public void setCRMStatus( int nCRMStatus )
    {
        _nCRMStatus = nCRMStatus;
    }

    /**
     * Returns the Reference
     * @return The Reference
     */
    @JsonProperty( "reference" )
    public String getReference(  )
    {
        return _strReference;
    }

    /**
     * Sets the Reference
     * @param strReference The Reference
     */
    public void setReference( String strReference )
    {
        _strReference = strReference;
    }
    /**
     * Return the Suggest
     * @return The suggest
     */
    @JsonProperty( "suggest" )
	public Suggest getSuggest() {
		return _oSuggest;
	}
	/**
	 * Sets the suggest
	 */
	public void setSuggest(Customer user) 
	{
		Suggest s = new Suggest( );
		String[ ] input = { _strReference };
		s.setInput(input);
		s.setOutput(user.getName()+" "+user.getFirstName());
		
    	ArrayList<String> retour = new ArrayList<String>();
    	retour.add(String.valueOf(user.getCustomerId()));
    	retour.add(user.getBirthday());
    	retour.add(user.getTelephoneNumber());
    	retour.add(user.getEmail());
    	retour.add(_strReference);
    	s.setPayload(retour);
    	this._oSuggest = s;
	}
    
}
