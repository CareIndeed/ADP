public class WorkersMainCtr{
    
    public void WorkerMehod(){
        
        Contact con = [SELECT ID,Name,Json__c FROM Contact WHERE ID='0030I00001L7EDP'];
        
        String json = con.Json__c;
        Workers wrk = (Workers)System.JSON.deserialize(json, Workers.class);
        
		for(cls_workers obj : wrk.workers){
			system.debug('wrk-------------'+obj.person);			
		}
    }
    
    public class Workers{
        public cls_workers[] workers;
        public cls_meta meta;
        public cls_confirmMessage confirmMessage;
    }
    class cls_workers {
        public String associateOID;  
        public cls_workerID workerID;
        public cls_person person;
        public cls_workerDates workerDates;
        public cls_workerStatus workerStatus;
        public cls_photos[] photos;
        public cls_businessCommunication businessCommunication;
        public cls_workAssignments[] workAssignments;
        public cls_customFieldGroup customFieldGroup;
        public cls_links[] links;
    }
    class cls_workerID {
        public String idValue;   
        public cls_schemeCode schemeCode;
    }
    class cls_schemeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_person {
        public cls_governmentIDs[] governmentIDs;
        public cls_legalName legalName;
        public cls_legalAddress legalAddress;
        public cls_communication communication;
        public String birthDate;     
        public boolean deceasedIndicator;
        public String deathDate;     
        public cls_genderCode genderCode;
        public cls_genderIdentityCode genderIdentityCode;
        public cls_sexualOrientationCode sexualOrientationCode;
        public cls_religionCode religionCode;
        public cls_maritalStatusCode maritalStatusCode;
        public cls_socialInsurancePrograms[] socialInsurancePrograms;
        public boolean tobaccoUserIndicator;
        public boolean disabilityIdentificationDeclinedIndicator;
        public boolean disabledIndicator;
        public cls_disabilityTypeCodes[] disabilityTypeCodes;
        public Integer disabilityPercentage;     
        public boolean studentIndicator;
        public cls_studentStatusCode studentStatusCode;
        public cls_identityDocuments[] identityDocuments;
        public cls_immigrationDocuments[] immigrationDocuments;
        public cls_passports[] passports;
        public cls_workAuthorizationDocuments[] workAuthorizationDocuments;
        public cls_preferredName preferredName;
        public cls_alternatePreferredNames[] alternatePreferredNames;
        public cls_formerNames[] formerNames;
        public cls_birthName birthName;
        public cls_birthPlace birthPlace;
        public cls_otherPersonalAddresses[] otherPersonalAddresses;
        public cls_ethnicityCode ethnicityCode;
        public cls_ethnicityGroupCode ethnicityGroupCode;
        public cls_raceCode raceCode;
        public cls_citizenshipCountryCodes[] citizenshipCountryCodes;
        public cls_residencyCountryCodes[] residencyCountryCodes;
        public cls_highestEducationLevelCode highestEducationLevelCode;
        public cls_militaryStatusCode militaryStatusCode;
        public String militaryDischargeDate;     
        public cls_militaryClassificationCodes[] militaryClassificationCodes;
        public cls_customFieldGroup customFieldGroup;
        public cls_links[] links;
    }
    class cls_governmentIDs {
        public String idValue;   
        public cls_nameCode nameCode;
        public String countryCode;   
        public cls_statusCode statusCode;
        public String expirationDate;    
        public String itemID;    
    }
    class cls_nameCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_statusCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_legalName {
        public String givenName;     
        public String middleName;    
        public String familyName1;   
        public String familyName2;   
        public String formattedName;     
        public cls_nameCode nameCode;
        public cls_scriptCode scriptCode;
        public cls_preferredSalutations[] preferredSalutations;
        public cls_titlePrefixCodes[] titlePrefixCodes;
        public String nickName;  
        public cls_generationAffixCode generationAffixCode;
        public cls_qualificationAffixCode qualificationAffixCode;
        public cls_titleAffixCodes[] titleAffixCodes;
        public String familyName1Prefix;     
        public String familyName2Prefix;     
        public String initials;  
    }
    class cls_scriptCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_preferredSalutations {
        public cls_salutationCode salutationCode;
        public cls_typeCode typeCode;
        public Integer sequenceNumber;   
    }
    class cls_salutationCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_typeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_titlePrefixCodes {
        public cls_affixCode affixCode;
        public Integer sequenceNumber;   
    }
    class cls_affixCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_generationAffixCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_qualificationAffixCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_titleAffixCodes {
        public cls_affixCode affixCode;
        public Integer sequenceNumber;   
    }
    class cls_legalAddress {
        public cls_scriptCode scriptCode;
        public String lineFour;  
        public String lineFive;  
        public String buildingNumber;    
        public String buildingName;  
        public String blockName;     
        public String streetName;    
        public cls_streetTypeCode streetTypeCode;
        public String unit;  
        public String floor;     
        public String stairCase;     
        public String door;  
        public String postOfficeBox;     
        public String deliveryPoint;     
        public String plotID;    
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2;
        public cls_nameCode nameCode;
        public String attentionOfName;   
        public String careOfName;    
        public String lineOne;   
        public String lineTwo;   
        public String lineThree;     
        public String cityName;  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1;
        public String countryCode;   
        public String postalCode;    
        public cls_geoCoordinate geoCoordinate;
        public boolean sameAsAddressIndicator;
        public cls_sameAsAddressLink sameAsAddressLink;
    }
    class cls_streetTypeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_countrySubdivisionLevel2 {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public String subdivisionType;   
    }
    class cls_countrySubdivisionLevel1 {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public String subdivisionType;   
    }
    class cls_geoCoordinate {
        public Integer latitude;     
        public Integer longitude;    
    }
    class cls_sameAsAddressLink {
        public String href;  
        public String rel;   
        public String canonicalUri;  
        public String title;     
        public String targetSchema;  
        public String mediaType;     
        public String method;    
        public String encType;   
        public String schema;    
        public cls_payLoadArguments[] payLoadArguments;
    }
    class cls_payLoadArguments {
        public String argumentPath;  
        public String argumentValue;     
    }
    class cls_communication {
        public cls_landlines[] landlines;
        public cls_mobiles[] mobiles;
        public cls_emails[] emails;
        public cls_socialNetworks[] socialNetworks;
        public cls_faxes[] faxes;
        public cls_pagers[] pagers;
        public cls_internetAddresses[] internetAddresses;
        public cls_instantMessages[] instantMessages;
    }
    class cls_landlines {
        public cls_nameCode nameCode;
        public String countryDialing;    
        public String areaDialing;   
        public String dialNumber;    
        public String extension;     
        public String access;    
        public String formattedNumber;   
        public String itemID;    
    }
    class cls_mobiles {
        public cls_nameCode nameCode;
        public String countryDialing;    
        public String areaDialing;   
        public String dialNumber;    
        public String extension;     
        public String access;    
        public String formattedNumber;   
        public String itemID;    
    }
    class cls_emails {
        public cls_nameCode nameCode;
        public String emailUri;  
        public String itemID;    
    }
    class cls_socialNetworks {
        public cls_nameCode nameCode;
        public String uri;   
        public String itemID;    
    }
    class cls_faxes {
        public cls_nameCode nameCode;
        public String countryDialing;    
        public String areaDialing;   
        public String dialNumber;    
        public String extension;     
        public String access;    
        public String formattedNumber;   
        public String itemID;    
    }
    class cls_pagers {
        public cls_nameCode nameCode;
        public String countryDialing;    
        public String areaDialing;   
        public String dialNumber;    
        public String extension;     
        public String access;    
        public String formattedNumber;   
        public String itemID;    
    }
    class cls_internetAddresses {
        public cls_nameCode nameCode;
        public String uri;   
        public String itemID;    
    }
    class cls_instantMessages {
        public cls_nameCode nameCode;
        public String uri;   
        public String itemID;    
    }
    class cls_genderCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_genderIdentityCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_sexualOrientationCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_religionCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_maritalStatusCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public String effectiveDate;     
    }
    class cls_socialInsurancePrograms {
        public cls_nameCode nameCode;
        public String countryCode;   
        public boolean coveredIndicator;
        public cls_coveragePeriod coveragePeriod;
        public String itemID;    
    }
    class cls_coveragePeriod {
        public String startDate;     
        public String endDate;   
    }
    class cls_disabilityTypeCodes {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_studentStatusCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public String effectiveDate;     
    }
    class cls_identityDocuments {
        public String documentID;    
        public String countryCode;   
        public cls_typeCode typeCode;
        public cls_issuingParty issuingParty;
        public String issueDate;     
        public String expirationDate;    
        public String itemID;    
    }
    class cls_issuingParty {
        public cls_nameCode nameCode;
        public cls_address address;
    }
    class cls_address {
        public cls_scriptCode scriptCode;
        public String lineFour;  
        public String lineFive;  
        public String buildingNumber;    
        public String buildingName;  
        public String blockName;     
        public String streetName;    
        public cls_streetTypeCode streetTypeCode;
        public String unit;  
        public String floor;     
        public String stairCase;     
        public String door;  
        public String postOfficeBox;     
        public String deliveryPoint;     
        public String plotID;    
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2;
        public cls_nameCode nameCode;
        public String attentionOfName;   
        public String careOfName;    
        public String lineOne;   
        public String lineTwo;   
        public String lineThree;     
        public String cityName;  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1;
        public String countryCode;   
        public String postalCode;    
        public cls_geoCoordinate geoCoordinate;
    }
    class cls_immigrationDocuments {
        public String authorizedStayDuration;    
        public String reentryRequirementDuration;    
        public String documentID;    
        public String countryCode;   
        public cls_typeCode typeCode;
        public cls_issuingParty issuingParty;
        public String issueDate;     
        public String expirationDate;    
        public String itemID;    
    }
    class cls_passports {
        public String documentID;    
        public String countryCode;   
        public cls_typeCode typeCode;
        public cls_issuingParty issuingParty;
        public String issueDate;     
        public String expirationDate;    
        public String itemID;    
    }
    class cls_workAuthorizationDocuments {
        public String documentID;    
        public String countryCode;   
        public cls_typeCode typeCode;
        public cls_issuingParty issuingParty;
        public String issueDate;     
        public String expirationDate;    
        public String itemID;    
    }
    class cls_preferredName {
        public String givenName;     
        public String middleName;    
        public String familyName1;   
        public String familyName2;   
        public String formattedName;     
        public cls_nameCode nameCode;
        public cls_scriptCode scriptCode;
        public cls_preferredSalutations[] preferredSalutations;
        public cls_titlePrefixCodes[] titlePrefixCodes;
        public String nickName;  
        public cls_generationAffixCode generationAffixCode;
        public cls_qualificationAffixCode qualificationAffixCode;
        public cls_titleAffixCodes[] titleAffixCodes;
        public String familyName1Prefix;     
        public String familyName2Prefix;     
        public String initials;  
    }
    class cls_alternatePreferredNames {
        public cls_nameCode nameCode;
        public cls_scriptCode scriptCode;
        public cls_preferredSalutations[] preferredSalutations;
        public cls_titlePrefixCodes[] titlePrefixCodes;
        public String nickName;  
        public cls_generationAffixCode generationAffixCode;
        public cls_qualificationAffixCode qualificationAffixCode;
        public cls_titleAffixCodes[] titleAffixCodes;
        public String familyName1Prefix;     
        public String familyName2Prefix;     
        public String initials;  
        public String givenName;     
        public String middleName;    
        public String familyName1;   
        public String familyName2;   
        public String formattedName;     
        public String itemID;    
        public cls_languageCode languageCode;
    }
    class cls_languageCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_formerNames {
        public cls_nameCode nameCode;
        public cls_scriptCode scriptCode;
        public cls_preferredSalutations[] preferredSalutations;
        public cls_titlePrefixCodes[] titlePrefixCodes;
        public String nickName;  
        public cls_generationAffixCode generationAffixCode;
        public cls_qualificationAffixCode qualificationAffixCode;
        public cls_titleAffixCodes[] titleAffixCodes;
        public String familyName1Prefix;     
        public String familyName2Prefix;     
        public String initials;  
        public String givenName;     
        public String middleName;    
        public String familyName1;   
        public String familyName2;   
        public String formattedName;     
        public String itemID;    
        public cls_typeCode typeCode;
    }
    class cls_birthName {
        public String givenName;     
        public String middleName;    
        public String familyName1;   
        public String familyName2;   
        public String formattedName;     
        public cls_nameCode nameCode;
        public cls_scriptCode scriptCode;
        public cls_preferredSalutations[] preferredSalutations;
        public cls_titlePrefixCodes[] titlePrefixCodes;
        public String nickName;  
        public cls_generationAffixCode generationAffixCode;
        public cls_qualificationAffixCode qualificationAffixCode;
        public cls_titleAffixCodes[] titleAffixCodes;
        public String familyName1Prefix;     
        public String familyName2Prefix;     
        public String initials;  
    }
    class cls_birthPlace {
        public String cityName;  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1;
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2;
        public String postalCode;    
        public String countryCode;   
        public String formattedBirthPlace;   
    }
    class cls_otherPersonalAddresses {
        public boolean sameAsAddressIndicator;
        public cls_sameAsAddressLink sameAsAddressLink;
        public cls_nameCode nameCode;
        public String attentionOfName;   
        public String careOfName;    
        public String lineOne;   
        public String lineTwo;   
        public String lineThree;     
        public String cityName;  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1;
        public String countryCode;   
        public String postalCode;    
        public cls_geoCoordinate geoCoordinate;
        public cls_scriptCode scriptCode;
        public String lineFour;  
        public String lineFive;  
        public String buildingNumber;    
        public String buildingName;  
        public String blockName;     
        public String streetName;    
        public cls_streetTypeCode streetTypeCode;
        public String unit;  
        public String floor;     
        public String stairCase;     
        public String door;  
        public String postOfficeBox;     
        public String deliveryPoint;     
        public String plotID;    
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2;
        public String itemID;    
        public cls_typeCode typeCode;
    }
    class cls_ethnicityCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_ethnicityGroupCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_raceCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public cls_identificationMethodCode identificationMethodCode;
    }
    class cls_identificationMethodCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_citizenshipCountryCodes {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_residencyCountryCodes {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_highestEducationLevelCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_militaryStatusCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public String effectiveDate;     
    }
    class cls_militaryClassificationCodes {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_customFieldGroup {
        public cls_amountFields[] amountFields;
        public cls_codeFields[] codeFields;
        public cls_dateFields[] dateFields;
        public cls_dateTimeFields[] dateTimeFields;
        public cls_indicatorFields[] indicatorFields;
        public cls_numberFields[] numberFields;
        public cls_percentFields[] percentFields;
        public cls_stringFields[] stringFields;
        public cls_telephoneFields[] telephoneFields;
        public cls_links[] links;
    }
    class cls_amountFields {
        public Integer amountValue;  
        public String currencyCode;  
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_categoryCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_codeFields {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_dateFields {
        public String dateValue;     
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_dateTimeFields {
        public String dateTimeValue;     T15:13:00.000Z
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_indicatorFields {
        public boolean indicatorValue;
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_numberFields {
        public Integer numberValue;  
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_percentFields {
        public Integer percentValue;     
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_stringFields {
        public String stringValue;   
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_telephoneFields {
        public String countryDialing;    
        public String areaDialing;   
        public String dialNumber;    
        public String extension;     
        public String access;    
        public String formattedNumber;   
        public cls_nameCode nameCode;
        public cls_categoryCode categoryCode;
        public String itemID;    
    }
    class cls_links {
        public String href;  
        public String rel;   
        public String canonicalUri;  
        public String title;     
        public String targetSchema;  
        public String mediaType;     
        public String method;    
        public String encType;   
        public String schema;    
        public cls_payLoadArguments[] payLoadArguments;
    }
    class cls_workerDates {
        public String originalHireDate;  
        public String rehireDate;    
        public String adjustedServiceDate;   
        public String acquisitionDate;   
        public String retirementDate;    
        public String terminationDate;   
        public String expectedTerminationDate;   
    }
    class cls_workerStatus {
        public cls_statusCode statusCode;
        public cls_reasonCode reasonCode;
        public String effectiveDate;     
    }
    class cls_reasonCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_photos {
        public cls_nameCode nameCode;
        public cls_links[] links;
        public String itemID;    
    }
    class cls_businessCommunication {
        public cls_landlines[] landlines;
        public cls_mobiles[] mobiles;
        public cls_emails[] emails;
        public cls_socialNetworks[] socialNetworks;
        public cls_faxes[] faxes;
        public cls_pagers[] pagers;
        public cls_internetAddresses[] internetAddresses;
        public cls_instantMessages[] instantMessages;
    }
    class cls_workAssignments {
        public boolean primaryIndicator;
        public String offerExtensionDate;    
        public String offerAcceptanceDate;   
        public String hireDate;  
        public String seniorityDate;     
        public String expectedStartDate;     
        public String actualStartDate;   
        public String terminationDate;   
        public String expectedTerminationDate;   
        public cls_assignmentStatus assignmentStatus;
        public cls_assignmentCostCenters[] assignmentCostCenters;
        public boolean workerProbationIndicator;
        public cls_workerProbationPeriod workerProbationPeriod;
        public cls_workerTypeCode workerTypeCode;
        public cls_assignmentTermCode assignmentTermCode;
        public cls_workLevelCode workLevelCode;
        public cls_nationalityContextCode nationalityContextCode;
        public boolean vipIndicator;
        public cls_vipTypeCode vipTypeCode;
        public boolean executiveIndicator;
        public cls_executiveTypeCode executiveTypeCode;
        public boolean officerIndicator;
        public cls_officerTypeCode officerTypeCode;
        public boolean managementPositionIndicator;
        public String legalEntityID;     
        public boolean highlyCompensatedIndicator;
        public cls_highlyCompensatedTypeCode highlyCompensatedTypeCode;
        public boolean stockOwnerIndicator;
        public Integer stockOwnerPercentage;     
        public cls_workerGroups[] workerGroups;
        public cls_jobCode jobCode;
        public String jobTitle;  
        public cls_occupationalClassifications[] occupationalClassifications;
        public cls_industryClassifications[] industryClassifications;
        public cls_wageLawCoverage wageLawCoverage;
        public String positionID;    
        public String positionTitle;     
        public cls_laborUnion laborUnion;
        public cls_bargainingUnit bargainingUnit;
        public cls_workShiftCode workShiftCode;
        public cls_workArrangementCode workArrangementCode;
        public cls_standardHours standardHours;
        public Integer fullTimeEquivalenceRatio;     
        public cls_homeOrganizationalUnits[] homeOrganizationalUnits;
        public cls_assignedOrganizationalUnits[] assignedOrganizationalUnits;
        public cls_homeWorkLocation homeWorkLocation;
        public cls_assignedWorkLocations[] assignedWorkLocations;
        public cls_remunerationBasisCode remunerationBasisCode;
        public cls_payCycleCode payCycleCode;
        public cls_standardPayPeriodHours standardPayPeriodHours;
        public cls_baseRemuneration baseRemuneration;
        public cls_additionalRemunerations[] additionalRemunerations;
        public cls_reportsTo[] reportsTo;
        public cls_payrollProcessingStatusCode payrollProcessingStatusCode;
        public String payrollGroupCode;  
        public String payrollFileNumber;     
        public String payrollRegionCode;     
        public cls_payScaleCode payScaleCode;
        public cls_payGradeCode payGradeCode;
        public cls_payGradePayRange payGradePayRange;
        public Integer compaRatio;   
        public cls_payGradeStepCode payGradeStepCode;
        public cls_payGradeStepPayRate payGradeStepPayRate;
        public String nextPayGradeStepDate;  
        public String minimumPayGradeStepDuration;   
        public cls_geographicPayDifferentialCode geographicPayDifferentialCode;
        public Integer geographicPayDifferentialPercentage;  
        public cls_customFieldGroup customFieldGroup;
        public cls_links[] links;
        public String itemID;    
    }
    class cls_assignmentStatus {
        public cls_statusCode statusCode;
        public cls_reasonCode reasonCode;
        public String effectiveDate;     
    }
    class cls_assignmentCostCenters {
        public String costCenterID;  
        public String costCenterName;    
        public Integer costCenterPercentage;     
    }
    class cls_workerProbationPeriod {
        public String startDate;     
        public String endDate;   
    }
    class cls_workerTypeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_assignmentTermCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_workLevelCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_nationalityContextCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_vipTypeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_executiveTypeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_officerTypeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_highlyCompensatedTypeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_workerGroups {
        public cls_nameCode nameCode;
        public cls_groupCode groupCode;
        public String itemID;    
    }
    class cls_groupCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_jobCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public String effectiveDate;     
    }
    class cls_occupationalClassifications {
        public cls_nameCode nameCode;
        public String itemID;    
    }
    class cls_classificationCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_industryClassifications {
        public cls_nameCode nameCode;
        public cls_classificationCode classificationCode;
        public String itemID;    
    }
    class cls_wageLawCoverage {
        public cls_wageLawNameCode wageLawNameCode;
        public cls_coverageCode coverageCode;
    }
    class cls_wageLawNameCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_coverageCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_laborUnion {
        public cls_laborUnionCode laborUnionCode;
        public String seniorityDate;     
    }
    class cls_laborUnionCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_bargainingUnit {
        public cls_bargainingUnitCode bargainingUnitCode;
        public String seniorityDate;     
    }
    class cls_bargainingUnitCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_workShiftCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_workArrangementCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_standardHours {
        public Integer hoursQuantity;    
        public cls_unitCode unitCode;
    }
    class cls_unitCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_homeOrganizationalUnits {
        public cls_nameCode nameCode;
        public cls_typeCode typeCode;
        public String itemID;    
    }
    class cls_assignedOrganizationalUnits {
        public cls_nameCode nameCode;
        public cls_typeCode typeCode;
        public String itemID;    
    }
    class cls_homeWorkLocation {
        public cls_nameCode nameCode;
        public cls_communication communication;
        public cls_address address;
    }
    class cls_assignedWorkLocations {
        public cls_address address;
        public cls_nameCode nameCode;
        public cls_communication communication;
        public String itemID;    
    }
    class cls_remunerationBasisCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_payCycleCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_standardPayPeriodHours {
        public Integer hoursQuantity;    
        public cls_unitCode unitCode;
    }
    class cls_baseRemuneration {
        public cls_recordingBasisCode recordingBasisCode;
        public cls_hourlyRateAmount hourlyRateAmount;
        public cls_dailyRateAmount dailyRateAmount;
        public cls_weeklyRateAmount weeklyRateAmount;
        public cls_biweeklyRateAmount biweeklyRateAmount;
        public cls_semiMonthlyRateAmount semiMonthlyRateAmount;
        public cls_monthlyRateAmount monthlyRateAmount;
        public cls_annualRateAmount annualRateAmount;
        public cls_payPeriodRateAmount payPeriodRateAmount;
        public cls_commissionRatePercentage commissionRatePercentage;
        public cls_associatedRateQualifiers[] associatedRateQualifiers;
        public String effectiveDate;     
    }
    class cls_recordingBasisCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_hourlyRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_dailyRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_weeklyRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_biweeklyRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_semiMonthlyRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_monthlyRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_annualRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_payPeriodRateAmount {
        public cls_nameCode nameCode;
        public Integer amountValue;  
        public String currencyCode;  
    }
    class cls_commissionRatePercentage {
        public cls_nameCode nameCode;
        public Integer percentageValue;  
        public cls_baseUnitCode baseUnitCode;
    }
    class cls_baseUnitCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_associatedRateQualifiers {
        public cls_qualifierObjectTypeCode qualifierObjectTypeCode;
        public String qualifierObjectID;     
        public String itemID;    
    }
    class cls_qualifierObjectTypeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_additionalRemunerations {
        public cls_typeCode typeCode;
        public cls_intervalCode intervalCode;
        public cls_nameCode nameCode;
        public cls_rate rate;
        public cls_associatedRateQualifiers[] associatedRateQualifiers;
        public String itemID;    
        public String effectiveDate;     
    }
    class cls_intervalCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_rate {
        public Integer amountValue;  
        public String currencyCode;  
        public cls_unitCode unitCode;
        public cls_baseUnitCode baseUnitCode;
        public Integer baseMultiplierValue;  
    }
    class cls_reportsTo {
        public String associateOID;  
        public cls_workerID workerID;
        public cls_reportsToWorkerName reportsToWorkerName;
        public cls_reportsToRelationshipCode reportsToRelationshipCode;
        public String positionID;    
        public String positionTitle;     
        public String itemID;    
    }
    class cls_reportsToWorkerName {
        public String givenName;     
        public String middleName;    
        public String familyName1;   
        public String familyName2;   
        public String formattedName;     
    }
    class cls_reportsToRelationshipCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_payrollProcessingStatusCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
        public String effectiveDate;     
    }
    class cls_payScaleCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_payGradeCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_payGradePayRange {
        public cls_minimumRate minimumRate;
        public cls_medianRate medianRate;
        public cls_maximumRate maximumRate;
    }
    class cls_minimumRate {
        public Integer amountValue;  
        public String currencyCode;  
        public cls_unitCode unitCode;
        public cls_baseUnitCode baseUnitCode;
        public Integer baseMultiplierValue;  
    }
    class cls_medianRate {
        public Integer amountValue;  
        public String currencyCode;  
        public cls_unitCode unitCode;
        public cls_baseUnitCode baseUnitCode;
        public Integer baseMultiplierValue;  
    }
    class cls_maximumRate {
        public Integer amountValue;  
        public String currencyCode;  
        public cls_unitCode unitCode;
        public cls_baseUnitCode baseUnitCode;
        public Integer baseMultiplierValue;  
    }
    class cls_payGradeStepCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_payGradeStepPayRate {
        public Integer amountValue;  
        public String currencyCode;  
        public cls_unitCode unitCode;
        public cls_baseUnitCode baseUnitCode;
        public Integer baseMultiplierValue;  
    }
    class cls_geographicPayDifferentialCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_meta {
        public Integer startSequence;    
        public boolean completeIndicator;
        public Integer totalNumber;  
        public String resourceSetID;     
        public cls_links[] links;
    }
    class cls_confirmMessage {
        public cls_confirmMessageID confirmMessageID;
        public String createDateTime;    T15:13:00.000Z
        public String requestReceiptDateTime;    T15:13:00.000Z
        public cls_protocolStatusCode protocolStatusCode;
        public cls_protocolCode protocolCode;
        public cls_requestID requestID;
        public cls_requestStatusCode requestStatusCode;
        public cls_requestMethodCode requestMethodCode;
        public cls_sessionID sessionID;
        public String requestETag;   
        public cls_requestLink requestLink;
        public cls_processingStatusCode processingStatusCode;
        public cls_processMessages[] processMessages;
        public cls_resourceMessages[] resourceMessages;
    }
    class cls_confirmMessageID {
        public String idValue;   
        public String schemeName;    
        public String schemeAgencyName;  
    }
    class cls_protocolStatusCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_protocolCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_requestID {
        public String idValue;   
        public String schemeName;    
        public String schemeAgencyName;  
    }
    class cls_requestStatusCode {
        public String shortName;     
        public String longName;  
        public String codeValue;     
    }
    class cls_requestMethodCode {
        public String shortName;     
        public String longName;  
        public String codeValue;     
    }
    class cls_sessionID {
        public String idValue;   
        public String schemeName;    
        public String schemeAgencyName;  
    }
    class cls_requestLink {
        public String href;  
        public String rel;   
        public String canonicalUri;  
        public String title;     
        public String targetSchema;  
        public String mediaType;     
        public String method;    
        public String encType;   
        public String schema;    
        public cls_payLoadArguments[] payLoadArguments;
    }
    class cls_processingStatusCode {
        public String shortName;     
        public String longName;  
        public String codeValue;     
    }
    class cls_processMessages {
        public cls_processMessageID processMessageID;
        public cls_messageTypeCode messageTypeCode;
        public String sourceLocationExpression;  
        public cls_expressionLanguageCode expressionLanguageCode;
        public cls_links[] links;
        public cls_userMessage userMessage;
        public cls_developerMessage developerMessage;
        public cls_resourceStatusCode resourceStatusCode;
    }
    class cls_processMessageID {
        public String idValue;   
        public String schemeName;    
        public String schemeAgencyName;  
    }
    class cls_messageTypeCode {
        public String shortName;     
        public String longName;  
        public String codeValue;     
    }
    class cls_expressionLanguageCode {
        public String shortName;     
        public String longName;  
        public String codeValue;     
    }
    class cls_userMessage {
        public String codeValue;     
        public String title;     
        public String messageTxt;    
        public cls_links[] links;
    }
    class cls_developerMessage {
        public String codeValue;     
        public String title;     
        public String messageTxt;    
        public cls_links[] links;
    }
    class cls_resourceMessages {
        public cls_resourceMessageID resourceMessageID;
        public cls_resourceStatusCode resourceStatusCode;
        public cls_resourceLink resourceLink;
        public cls_processMessages[] processMessages;
    }
    class cls_resourceMessageID {
        public String idValue;   
        public String schemeName;    
        public String schemeAgencyName;  
    }
    class cls_resourceStatusCode {
        public String codeValue;     
        public String shortName;     
        public String longName;  
    }
    class cls_resourceLink {
        public String href;  
        public String rel;   
        public String canonicalUri;  
        public String title;     
        public String targetSchema;  
        public String mediaType;     
        public String method;    
        public String encType;   
        public String schema;    
        public cls_payLoadArguments[] payLoadArguments;
    }


}