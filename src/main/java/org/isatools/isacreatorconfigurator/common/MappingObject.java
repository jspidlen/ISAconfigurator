/**
 ISAconfigurator is a component of the ISA software suite (http://www.isa-tools.org)

 License:
 ISAconfigurator is licensed under the Common Public Attribution License version 1.0 (CPAL)

 EXHIBIT A. CPAL version 1.0
 �The contents of this file are subject to the CPAL version 1.0 (the �License�); you may not use this file except
 in compliance with the License. You may obtain a copy of the License at http://isa-tools.org/licenses/ISAconfigurator-license.html.
 The License is based on the Mozilla Public License version 1.1 but Sections 14 and 15 have been added to cover use of software over
 a computer network and provide for limited attribution for the Original Developer. In addition, Exhibit A has been modified to be
 consistent with Exhibit B.

 Software distributed under the License is distributed on an �AS IS� basis, WITHOUT WARRANTY OF ANY KIND, either express
 or implied. See the License for the specific language governing rights and limitations under the License.

 The Original Code is ISAconfigurator.
 The Original Developer is the Initial Developer. The Initial Developer of the Original Code is the ISA Team
 (Eamonn Maguire, eamonnmag@gmail.com; Philippe Rocca-Serra, proccaserra@gmail.com; Susanna-Assunta Sansone,
 sa.sanson@gmail.com; http://www.isa-tools.org). All portions of the code written by the ISA Team are
 Copyright (c) 2007-2011 ISA Team. All Rights Reserved.

 EXHIBIT B. Attribution Information
 Attribution Copyright Notice: Copyright (c) 2008-2011 ISA Team
 Attribution Phrase: Developed by the ISA Team
 Attribution URL: http://www.isa-tools.org
 Graphic Image provided in the Covered Code as file: http://isa-tools.org/licenses/icons/poweredByISAtools.png
 Display of Attribution Information is required in Larger Works which are defined in the CPAL as a work which combines
 Covered Code or portions thereof with code not governed by the terms of the CPAL.

 Sponsors:
 The ISA Team and the ISA software suite have been funded by the EU Carcinogenomics project (http://www.carcinogenomics.eu),
 the UK BBSRC (http://www.bbsrc.ac.uk), the UK NERC-NEBC (http://nebc.nerc.ac.uk) and in part by the EU NuGO consortium
 (http://www.nugo.org/everyone).
 */

package org.isatools.isacreatorconfigurator.common;

import org.isatools.isacreatorconfigurator.configdefinition.AssayTypes;
import org.isatools.isacreatorconfigurator.configdefinition.DispatchTargets;

import java.io.Serializable;


/**
 * @author Eamonn Maguire
 */
public class MappingObject implements Serializable {
    private String measurementType;
    private String measurementSource;
    private String measurementAccession;

    private String technologyType;
    private String technologySource;
    private String technologyAccession;

    private String refName;
    private String tableType;

    private String dispatchTarget;
    private String assayType;


    public MappingObject(String tableType, String measurementType, String measurementSource, String measurementAccession,
                         String technologyType, String technologySource, String technologyAccession, String refName) {
        this.tableType = tableType;
        this.measurementType = measurementType;
        this.measurementSource = measurementSource;
        this.measurementAccession = measurementAccession;

        this.technologyType = technologyType;
        this.technologySource = technologySource;
        this.technologyAccession = technologyAccession;

        this.refName = refName;
    }

    public String getAssayName() {
        return refName;
    }

    public String getMeasurementEndpointType() {
        return measurementType == null ? "" : measurementType;
    }

    public String getTableType() {
        return tableType;
    }

    public String getTechnologyType() {
        return technologyType == null ? "" : technologyType;
    }

    public void setMeasurementEndpointType(String measurementEndpointType) {
        this.measurementType = measurementEndpointType;
    }

    public String getMeasurementSource() {
        return measurementSource == null || measurementSource.equals("e.g. OBI") ? "" : measurementSource;
    }

    public String getMeasurementAccession() {
        return measurementAccession == null || measurementAccession.equals("e.g. 12345") ? "" : measurementAccession;
    }

    public String getTechnologySource() {
        return technologySource == null || technologySource.equals("e.g. OBI") ? "" : technologySource;
    }

    public String getTechnologyAccession() {
        return technologyAccession == null || technologyAccession.equals("e.g. 12345") ? "" : technologyAccession;
    }

    public void setTechnologyType(String technologyType) {
        this.technologyType = technologyType;
    }

    public String getDispatchTarget() {
        return dispatchTarget == null ? measurementType.equals("[Sample]") ? "" : DispatchTargets.GENERIC.toString() : dispatchTarget;
    }

    public void setDispatchTarget(String dispatchTarget) {
        this.dispatchTarget = dispatchTarget;
    }

    public String getAssayType() {
        return assayType == null ? measurementType.equals("[Sample]") ? "" : AssayTypes.GENERIC.toString() : assayType;
    }

    public void setAssayType(String assayType) {
        this.assayType = assayType;
    }

    public String toString() {
        return refName;
    }
}