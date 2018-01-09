﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;

namespace AutoRest.Java.Model
{
    /// <summary>
    /// A container for the types associated for accessing a specific service.
    /// </summary>
    public class Service
    {
        private readonly IEnumerable<ServiceEnum> enums;
        private readonly IEnumerable<ServiceException> exceptions;
        private readonly IEnumerable<XmlSequenceWrapper> xmlSequenceWrappers;

        /// <summary>
        /// Create a new Service with the provided values.
        /// </summary>
        /// <param name="enums">The enum types that are used by the service.</param>
        /// <param name="exceptions">The exception types that are used by the service.</param>
        /// <param name="xmlSequenceWrappers"></param>
        public Service(IEnumerable<ServiceEnum> enums, IEnumerable<ServiceException> exceptions, IEnumerable<XmlSequenceWrapper> xmlSequenceWrappers)
        {
            this.enums = enums;
            this.exceptions = exceptions;
            this.xmlSequenceWrappers = xmlSequenceWrappers;
        }

        /// <summary>
        /// Get the enum types that are used by this service.
        /// </summary>
        public IEnumerable<ServiceEnum> Enums => enums;

        /// <summary>
        /// Get the exception types that are used by this service.
        /// </summary>
        public IEnumerable<ServiceException> Exceptions => exceptions;

        public IEnumerable<XmlSequenceWrapper> XmlSequenceWrappers => xmlSequenceWrappers;
    }
}