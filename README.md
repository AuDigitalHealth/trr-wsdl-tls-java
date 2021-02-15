# TRR WSDL Library

Introduction
============

This library provides the required Transport Response Retrieval artefacts required to support Secure Message Delivery (SMD) specifications.

Setup
=====

-   To build and test the distributable package, an appropriate Java IDE or
    build environment must be installed.

-   WSDL/XSD source files should be used in conjunction with JAX-WS and wsimport
    to build the generated Java classes/source files. These WSDL/XSD files can be
    found at:
    /*

    Generated Java source files can be found in:
    /trr-wsdl-tls-<version>-sources.jar

-   For detailed API documentation, refer to the included Javadoc package.

Solution
========

The package consists of these components:

    -   /trr-wsdl-tls-<version>.jar
        Contains the required classes for SMD
        development, deployment and invocation.

    -   /trr-wsdl-tls-<version>-docs.jar
        Contains Javadoc for generated code.

    -   /trr-wsdl-tls-<version>-sources.jar
        Contains artefact Java and WSDL/XSD source files.

Pre-Requisites
==============

Java Development Kit (JDK)
------------------------------------
1.  Download and install JDK 8 Update 271 or later:
    URL: http://www.oracle.com/technetwork/java/javase/downloads/index.html

2.  Unpack the JDK distribution into a directory of your choice.

    This directory will be your <JDK_HOME>and will be used in this document
    to refer to the root directory of the JDK installation.

    <JRE_HOME> will be used in this document to refer to <JDK_HOME>/jre.

3.  Create a JAVA_HOME environment variable pointing to the <JDK_HOME>
    directory in Step 2.

4.  Add <JDK_HOME>/bin to the system path.


Licensing
=========
Copyright 2012 NEHTA

Copyright 2021 ADHA

Licensed under the NEHTA/ADHA Open Source (Apache) License; you may not use this
file except in compliance with the License. A copy of the License is in the
'LICENSE.txt' file, which should be provided with this work.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations
under the License.
