/*
 * Copyright (c) 2002-2015, Mairie de Paris
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
package fr.paris.lutece.plugins.gru.modules.elastics.util.constants;

/**
 *
 * GRUElasticsConstants
 *
 */
public final class GRUElasticsConstants
{
    // CONSTANTS
    public static final int INVALID_ID_INT = -1;
    public static final int TRUE = 1;
    public static final String SLASH = "/";
    public static final String INVALID_ID = "-1";
    public static final String MEDIA_TYPE_JSON = "application/json";
    public static final String MEDIA_TYPE_XML = "application/xml";
    public static final String PLUGIN_NAME = "elasticsearch/";
    // PATHS
    public static final String PATH_WADL = "wadl";
    public static final String PATH_DATA_FROM_FLUX = "send/data";
    public static final String PATH_ELK_SERVER_DEMAND = "https://dev.lutece.paris.fr/poc/elasticsearch/teleservice/demand/";
    public static final String PATH_ELK_SERVER_USER = "https://dev.lutece.paris.fr/poc/elasticsearch/teleservice/user/";
    public static final String PATH_ELK_SERVER_NOTIFICATION = "https://dev.lutece.paris.fr/poc/elasticsearch/teleservice/notification/";
    public static final String PATH_ELK_SOURCE = "/_source";
    public static final String PATH_ELK_UPDATE = "/_update";

    // PROPERTIES
    public static final String PROPERTY_ENCODING_ENABLE = "crm-rest.encoding.enable";
    public static final String PROPERTY_ENCODING_FROM = "crm-rest.encoding.from";
    public static final String PROPERTY_ENCODING_TO = "crm-rest.encoding.to";
    // Paths
    public static final String PATH_NOTIFICATION = "notification";
    
    //PARAMETERS
    public static final String PARAMETER_NOTIFICATION_DEMAND = "strJson";
    /**
     * Private constructor
     */
    private GRUElasticsConstants(  )
    {
    }
}
