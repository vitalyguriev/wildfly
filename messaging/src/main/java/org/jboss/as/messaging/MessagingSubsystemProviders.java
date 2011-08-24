/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.messaging;

import static org.jboss.as.messaging.CommonAttributes.BINDINGS_DIRECTORY;
import static org.jboss.as.messaging.CommonAttributes.CONNECTION_FACTORY;
import static org.jboss.as.messaging.CommonAttributes.GROUPING_HANDLER;
import static org.jboss.as.messaging.CommonAttributes.JMS_QUEUE;
import static org.jboss.as.messaging.CommonAttributes.JMS_TOPIC;
import static org.jboss.as.messaging.CommonAttributes.JOURNAL_DIRECTORY;
import static org.jboss.as.messaging.CommonAttributes.LARGE_MESSAGES_DIRECTORY;
import static org.jboss.as.messaging.CommonAttributes.PAGING_DIRECTORY;
import static org.jboss.as.messaging.CommonAttributes.POOLED_CONNECTION_FACTORY;
import static org.jboss.as.messaging.CommonAttributes.QUEUE;
import static org.jboss.as.messaging.CommonAttributes.SECURITY_SETTING;
import org.jboss.as.controller.descriptions.DescriptionProvider;
import org.jboss.dmr.ModelNode;

import java.util.Locale;

/**
 * @author Emanuel Muckenhuber
 * @author <a href="mailto:andy.taylor@jboss.com">Andy Taylor</a>
 */
class MessagingSubsystemProviders {

    static final String[] MESSAGING_ROOT_ATTRIBUTES = new String[] {
        CONNECTION_FACTORY, BINDINGS_DIRECTORY,
        GROUPING_HANDLER, JMS_QUEUE, JMS_TOPIC, JOURNAL_DIRECTORY, LARGE_MESSAGES_DIRECTORY,
        PAGING_DIRECTORY, POOLED_CONNECTION_FACTORY, QUEUE, SECURITY_SETTING };

    static final DescriptionProvider ADDRESS_SETTING = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getAddressSetting(locale);
        }
    };

    static final DescriptionProvider ADDRESS_SETTING_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getAddressSettingAdd(locale);
        }
    };

    static final DescriptionProvider ADDRESS_SETTING_REMOVE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getAddressSettingRemove(locale);
        }
    };

    static final DescriptionProvider SUBSYSTEM = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getRootResource(locale);
        }
    };

    static final DescriptionProvider QUEUE_RESOURCE = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getQueueResource(locale);
        }
    };

    public static final DescriptionProvider JMS_QUEUE_RESOURCE = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getJmsQueueResource(locale);
        }

    };

    public static final DescriptionProvider CF = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getConnectionFactory(locale);
        }

    };

    public static final DescriptionProvider CF_ADD = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getConnectionFactoryAdd(locale);
        }
    };

    public static final DescriptionProvider CF_REMOVE = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getConnectionFactoryRemove(locale);
        }
    };

    public static final DescriptionProvider JMS_TOPIC_RESOURCE = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getTopic(locale);
        }
    };

    public static final DescriptionProvider JMS_TOPIC_ADD = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getTopicAdd(locale);
        }
    };

    public static final DescriptionProvider JMS_TOPIC_REMOVE = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getTopicRemove(locale);
        }
    };

    public static final DescriptionProvider ACCEPTOR = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getAcceptor(locale);
        }
    };

    public static final DescriptionProvider ACCEPTOR_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getAcceptorAdd(locale);
        }
    };

    public static final DescriptionProvider ACCEPTOR_REMOVE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getAcceptorRemove(locale);
        }
    };

    public static final DescriptionProvider REMOTE_ACCEPTOR = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getRemoteAcceptor(locale);
        }
    };

    public static final DescriptionProvider REMOTE_ACCEPTOR_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getRemoteAcceptorAdd(locale);
        }
    };

    public static final DescriptionProvider IN_VM_ACCEPTOR = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getInVMAcceptor(locale);
        }
    };

    public static final DescriptionProvider IN_VM_ACCEPTOR_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getInVMAcceptorAdd(locale);
        }
    };

    public static final DescriptionProvider CONNECTOR = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getConnector(locale);
        }
    };

    public static final DescriptionProvider CONNECTOR_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getConnectorAdd(locale);
        }
    };

    public static final DescriptionProvider CONNECTOR_REMOVE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getConnectorRemove(locale);
        }
    };

    public static final DescriptionProvider REMOTE_CONNECTOR = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getRemoteConnector(locale);
        }
    };

    public static final DescriptionProvider REMOTE_CONNECTOR_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getRemoteConnectorAdd(locale);
        }
    };

    public static final DescriptionProvider IN_VM_CONNECTOR = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getInVMConnector(locale);
        }
    };

    public static final DescriptionProvider IN_VM_CONNECTOR_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getInVMConnector(locale);
        }
    };

    public static final DescriptionProvider PARAM = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getParam(locale);
        }
    };

    public static final DescriptionProvider PARAM_ADD = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getParamAdd(locale);
        }
    };

    public static final DescriptionProvider PARAM_REMOVE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getParam(locale);
        }
    };

    public static final DescriptionProvider RA = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getPooledConnectionFactory(locale);
        }
    };

    public static final DescriptionProvider RA_ADD = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getPooledConnectionFactoryAdd(locale);
        }
    };

    public static final DescriptionProvider RA_REMOVE = new DescriptionProvider() {

        public ModelNode getModelDescription(final Locale locale) {
            return MessagingDescriptions.getPooledConnectionFactoryRemove(locale);
        }
    };

    public static final DescriptionProvider DIVERT_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getDivertResource(locale);
        }
    };

    public static final DescriptionProvider BROADCAST_GROUP_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getBroadcastGroupResource(locale);
        }
    };

    public static final DescriptionProvider DISCOVERY_GROUP_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getDiscoveryGroupResource(locale);
        }
    };

    public static final DescriptionProvider GROUPING_HANDLER_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getGroupingHandlerResource(locale);
        }
    };

    public static final DescriptionProvider BRIDGE_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getBridgeResource(locale);
        }
    };

    public static final DescriptionProvider CLUSTER_CONNECTION_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getClusterConnectionResource(locale);
        }
    };

    public static final DescriptionProvider CONNECTOR_SERVICE_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getConnectorServiceResource(locale);
        }
    };

    public static final DescriptionProvider CONNECTOR_SERVICE_PARAM_RESOURCE = new DescriptionProvider() {
        @Override
        public ModelNode getModelDescription(Locale locale) {
            return MessagingDescriptions.getConnectorServiceParamResource(locale);
        }
    };
}
