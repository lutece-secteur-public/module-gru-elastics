/*
 * Copyright (c) 2002-2016, Mairie de Paris
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
package fr.paris.lutece.plugins.grusupply.business.daemon.demand;

import java.util.List;

import fr.paris.lutece.portal.service.spring.SpringContextService;

/**
 * This class provides instances management methods (create, find, ...) for
 * DemandIndexerActionHome objects
 */
public class DemandIndexerActionHome
{
    // Static variable pointed at the DAO instance
    private static IDemandIndexerActionDAO _dao = SpringContextService.getBean( "grusupply.demandIndexerActionDAO" );

    /**
     * Private constructor
     */
    private DemandIndexerActionHome(  )
    {
    }
    
    /**
     * Creation of an instance of Demand Indexer Action
     * @param demandIndexerAction The instance of the indexer action which contains
     *            the informations to store
     */
    public static synchronized void create( DemandIndexerAction demandIndexerAction )
    {
        _dao.insert( demandIndexerAction );
    }

    /**
     * Removes the demandIndexerAction whose identifier is specified in parameter
     * @param nId The DemandIndexerAction
     */
    public static synchronized void remove( int nId )
    {
        _dao.delete( nId );
    }

    // /////////////////////////////////////////////////////////////////////////
    // Finders

    /**
     * Loads the data of all the DemandIndexerAction who verify the filter and returns
     * them in a list
     * @param filter the filter
     * @return the list which contains the data of all the DemandIndexerAction
     */
    public static List<DemandIndexerAction> getList( DemandIndexerActionFilter filter )
    {
        return _dao.selectList( filter );
    }
}
