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
        public cls_workers[] workers{get;set;}
        public cls_meta meta{get;set;}
        public cls_confirmMessage confirmMessage{get;set;}
    }
    class cls_workers {
        public String associateOID{get;set;}  
        public cls_workerID workerID{get;set;}
        public cls_person person{get;set;}
        public cls_workerDates workerDates{get;set;}
        public cls_workerStatus workerStatus{get;set;}
        public cls_photos[] photos{get;set;}
        public cls_businessCommunication businessCommunication{get;set;}
        public cls_workAssignments[] workAssignments{get;set;}
        public cls_customFieldGroup customFieldGroup{get;set;}
        public cls_links[] links{get;set;}
    }
    class cls_workerID {
        public String idValue{get;set;}   
        public cls_schemeCode schemeCode{get;set;}
    }
    class cls_schemeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_person {
        public cls_governmentIDs[] governmentIDs{get;set;}
        public cls_legalName legalName{get;set;}
        public cls_legalAddress legalAddress{get;set;}
        public cls_communication communication{get;set;}
        public String birthDate{get;set;}     
        public boolean deceasedIndicator{get;set;}
        public String deathDate{get;set;}     
        public cls_genderCode genderCode{get;set;}
        public cls_genderIdentityCode genderIdentityCode{get;set;}
        public cls_sexualOrientationCode sexualOrientationCode{get;set;}
        public cls_religionCode religionCode{get;set;}
        public cls_maritalStatusCode maritalStatusCode{get;set;}
        public cls_socialInsurancePrograms[] socialInsurancePrograms{get;set;}
        public boolean tobaccoUserIndicator{get;set;}
        public boolean disabilityIdentificationDeclinedIndicator{get;set;}
        public boolean disabledIndicator{get;set;}
        public cls_disabilityTypeCodes[] disabilityTypeCodes{get;set;}
        public Integer disabilityPercentage{get;set;}     
        public boolean studentIndicator{get;set;}
        public cls_studentStatusCode studentStatusCode{get;set;}
        public cls_identityDocuments[] identityDocuments{get;set;}
        public cls_immigrationDocuments[] immigrationDocuments{get;set;}
        public cls_passports[] passports{get;set;}
        public cls_workAuthorizationDocuments[] workAuthorizationDocuments{get;set;}
        public cls_preferredName preferredName{get;set;}
        public cls_alternatePreferredNames[] alternatePreferredNames{get;set;}
        public cls_formerNames[] formerNames{get;set;}
        public cls_birthName birthName{get;set;}
        public cls_birthPlace birthPlace{get;set;}
        public cls_otherPersonalAddresses[] otherPersonalAddresses{get;set;}
        public cls_ethnicityCode ethnicityCode{get;set;}
        public cls_ethnicityGroupCode ethnicityGroupCode{get;set;}
        public cls_raceCode raceCode{get;set;}
        public cls_citizenshipCountryCodes[] citizenshipCountryCodes{get;set;}
        public cls_residencyCountryCodes[] residencyCountryCodes{get;set;}
        public cls_highestEducationLevelCode highestEducationLevelCode{get;set;}
        public cls_militaryStatusCode militaryStatusCode{get;set;}
        public String militaryDischargeDate{get;set;}     
        public cls_militaryClassificationCodes[] militaryClassificationCodes{get;set;}
        public cls_customFieldGroup customFieldGroup{get;set;}
        public cls_links[] links{get;set;}
    }
    class cls_governmentIDs {
        public String idValue{get;set;}   
        public cls_nameCode nameCode{get;set;}
        public String countryCode{get;set;}   
        public cls_statusCode statusCode{get;set;}
        public String expirationDate{get;set;}    
        public String itemID{get;set;}    
    }
    class cls_nameCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_statusCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_legalName {
        public String givenName{get;set;}     
        public String middleName{get;set;}    
        public String familyName1{get;set;}   
        public String familyName2{get;set;}   
        public String formattedName{get;set;}     
        public cls_nameCode nameCode{get;set;}
        public cls_scriptCode scriptCode{get;set;}
        public cls_preferredSalutations[] preferredSalutations{get;set;}
        public cls_titlePrefixCodes[] titlePrefixCodes{get;set;}
        public String nickName{get;set;}  
        public cls_generationAffixCode generationAffixCode{get;set;}
        public cls_qualificationAffixCode qualificationAffixCode{get;set;}
        public cls_titleAffixCodes[] titleAffixCodes{get;set;}
        public String familyName1Prefix{get;set;}     
        public String familyName2Prefix{get;set;}     
        public String initials{get;set;}  
    }
    class cls_scriptCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_preferredSalutations {
        public cls_salutationCode salutationCode{get;set;}
        public cls_typeCode typeCode{get;set;}
        public Integer sequenceNumber{get;set;}   
    }
    class cls_salutationCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_typeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_titlePrefixCodes {
        public cls_affixCode affixCode{get;set;}
        public Integer sequenceNumber{get;set;}   
    }
    class cls_affixCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_generationAffixCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_qualificationAffixCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_titleAffixCodes {
        public cls_affixCode affixCode{get;set;}
        public Integer sequenceNumber{get;set;}   
    }
    class cls_legalAddress {
        public cls_scriptCode scriptCode{get;set;}
        public String lineFour{get;set;}  
        public String lineFive{get;set;}  
        public String buildingNumber{get;set;}    
        public String buildingName{get;set;}  
        public String blockName{get;set;}     
        public String streetName{get;set;}    
        public cls_streetTypeCode streetTypeCode{get;set;}
        public String unit{get;set;}  
        public String floor{get;set;}     
        public String stairCase{get;set;}     
        public String door{get;set;}  
        public String postOfficeBox{get;set;}     
        public String deliveryPoint{get;set;}     
        public String plotID{get;set;}    
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2{get;set;}
        public cls_nameCode nameCode{get;set;}
        public String attentionOfName{get;set;}   
        public String careOfName{get;set;}    
        public String lineOne{get;set;}   
        public String lineTwo{get;set;}   
        public String lineThree{get;set;}     
        public String cityName{get;set;}  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1{get;set;}
        public String countryCode{get;set;}   
        public String postalCode{get;set;}    
        public cls_geoCoordinate geoCoordinate{get;set;}
        public boolean sameAsAddressIndicator{get;set;}
        public cls_sameAsAddressLink sameAsAddressLink{get;set;}
    }
    class cls_streetTypeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_countrySubdivisionLevel2 {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String subdivisionType{get;set;}   
    }
    class cls_countrySubdivisionLevel1 {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String subdivisionType{get;set;}   
    }
    class cls_geoCoordinate {
        public Integer latitude{get;set;}     
        public Integer longitude{get;set;}    
    }
    class cls_sameAsAddressLink {
        public String href{get;set;}  
        public String rel{get;set;}   
        public String canonicalUri{get;set;}  
        public String title{get;set;}     
        public String targetSchema{get;set;}  
        public String mediaType{get;set;}     
        public String method{get;set;}    
        public String encType{get;set;}   
        public String schema{get;set;}    
        public cls_payLoadArguments[] payLoadArguments{get;set;}
    }
    class cls_payLoadArguments {
        public String argumentPath{get;set;}  
        public String argumentValue{get;set;}     
    }
    class cls_communication {
        public cls_landlines[] landlines{get;set;}
        public cls_mobiles[] mobiles{get;set;}
        public cls_emails[] emails{get;set;}
        public cls_socialNetworks[] socialNetworks{get;set;}
        public cls_faxes[] faxes{get;set;}
        public cls_pagers[] pagers{get;set;}
        public cls_internetAddresses[] internetAddresses{get;set;}
        public cls_instantMessages[] instantMessages{get;set;}
    }
    class cls_landlines {
        public cls_nameCode nameCode{get;set;}
        public String countryDialing{get;set;}    
        public String areaDialing{get;set;}   
        public String dialNumber{get;set;}    
        public String extension{get;set;}     
        public String access{get;set;}    
        public String formattedNumber{get;set;}   
        public String itemID{get;set;}    
    }
    class cls_mobiles {
        public cls_nameCode nameCode{get;set;}
        public String countryDialing{get;set;}    
        public String areaDialing{get;set;}   
        public String dialNumber{get;set;}    
        public String extension{get;set;}     
        public String access{get;set;}    
        public String formattedNumber{get;set;}   
        public String itemID{get;set;}    
    }
    class cls_emails {
        public cls_nameCode nameCode{get;set;}
        public String emailUri{get;set;}  
        public String itemID{get;set;}    
    }
    class cls_socialNetworks {
        public cls_nameCode nameCode{get;set;}
        public String uri{get;set;}   
        public String itemID{get;set;}    
    }
    class cls_faxes {
        public cls_nameCode nameCode{get;set;}
        public String countryDialing{get;set;}    
        public String areaDialing{get;set;}   
        public String dialNumber{get;set;}    
        public String extension{get;set;}     
        public String access{get;set;}    
        public String formattedNumber{get;set;}   
        public String itemID{get;set;}    
    }
    class cls_pagers {
        public cls_nameCode nameCode{get;set;}
        public String countryDialing{get;set;}    
        public String areaDialing{get;set;}   
        public String dialNumber{get;set;}    
        public String extension{get;set;}     
        public String access{get;set;}    
        public String formattedNumber{get;set;}   
        public String itemID{get;set;}    
    }
    class cls_internetAddresses {
        public cls_nameCode nameCode{get;set;}
        public String uri{get;set;}   
        public String itemID{get;set;}    
    }
    class cls_instantMessages {
        public cls_nameCode nameCode{get;set;}
        public String uri{get;set;}   
        public String itemID{get;set;}    
    }
    class cls_genderCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_genderIdentityCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_sexualOrientationCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_religionCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_maritalStatusCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String effectiveDate{get;set;}     
    }
    class cls_socialInsurancePrograms {
        public cls_nameCode nameCode{get;set;}
        public String countryCode{get;set;}   
        public boolean coveredIndicator{get;set;}
        public cls_coveragePeriod coveragePeriod{get;set;}
        public String itemID{get;set;}    
    }
    class cls_coveragePeriod {
        public String startDate{get;set;}     
        public String endDate{get;set;}   
    }
    class cls_disabilityTypeCodes {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_studentStatusCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String effectiveDate{get;set;}     
    }
    class cls_identityDocuments {
        public String documentID{get;set;}    
        public String countryCode{get;set;}   
        public cls_typeCode typeCode{get;set;}
        public cls_issuingParty issuingParty{get;set;}
        public String issueDate{get;set;}     
        public String expirationDate{get;set;}    
        public String itemID{get;set;}    
    }
    class cls_issuingParty {
        public cls_nameCode nameCode{get;set;}
        public cls_address address{get;set;}
    }
    class cls_address {
        public cls_scriptCode scriptCode{get;set;}
        public String lineFour{get;set;}  
        public String lineFive{get;set;}  
        public String buildingNumber{get;set;}    
        public String buildingName{get;set;}  
        public String blockName{get;set;}     
        public String streetName{get;set;}    
        public cls_streetTypeCode streetTypeCode{get;set;}
        public String unit{get;set;}  
        public String floor{get;set;}     
        public String stairCase{get;set;}     
        public String door{get;set;}  
        public String postOfficeBox{get;set;}     
        public String deliveryPoint{get;set;}     
        public String plotID{get;set;}    
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2{get;set;}
        public cls_nameCode nameCode{get;set;}
        public String attentionOfName{get;set;}   
        public String careOfName{get;set;}    
        public String lineOne{get;set;}   
        public String lineTwo{get;set;}   
        public String lineThree{get;set;}     
        public String cityName{get;set;}  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1{get;set;}
        public String countryCode{get;set;}   
        public String postalCode{get;set;}    
        public cls_geoCoordinate geoCoordinate{get;set;}
    }
    class cls_immigrationDocuments {
        public String authorizedStayDuration{get;set;}    
        public String reentryRequirementDuration{get;set;}    
        public String documentID{get;set;}    
        public String countryCode{get;set;}   
        public cls_typeCode typeCode{get;set;}
        public cls_issuingParty issuingParty{get;set;}
        public String issueDate{get;set;}     
        public String expirationDate{get;set;}    
        public String itemID{get;set;}    
    }
    class cls_passports {
        public String documentID{get;set;}    
        public String countryCode{get;set;}   
        public cls_typeCode typeCode{get;set;}
        public cls_issuingParty issuingParty{get;set;}
        public String issueDate{get;set;}     
        public String expirationDate{get;set;}    
        public String itemID{get;set;}    
    }
    class cls_workAuthorizationDocuments {
        public String documentID{get;set;}    
        public String countryCode{get;set;}   
        public cls_typeCode typeCode{get;set;}
        public cls_issuingParty issuingParty{get;set;}
        public String issueDate{get;set;}     
        public String expirationDate{get;set;}    
        public String itemID{get;set;}    
    }
    class cls_preferredName {
        public String givenName{get;set;}     
        public String middleName{get;set;}    
        public String familyName1{get;set;}   
        public String familyName2{get;set;}   
        public String formattedName{get;set;}     
        public cls_nameCode nameCode{get;set;}
        public cls_scriptCode scriptCode{get;set;}
        public cls_preferredSalutations[] preferredSalutations{get;set;}
        public cls_titlePrefixCodes[] titlePrefixCodes{get;set;}
        public String nickName{get;set;}  
        public cls_generationAffixCode generationAffixCode{get;set;}
        public cls_qualificationAffixCode qualificationAffixCode{get;set;}
        public cls_titleAffixCodes[] titleAffixCodes{get;set;}
        public String familyName1Prefix{get;set;}     
        public String familyName2Prefix{get;set;}     
        public String initials{get;set;}  
    }
    class cls_alternatePreferredNames {
        public cls_nameCode nameCode{get;set;}
        public cls_scriptCode scriptCode{get;set;}
        public cls_preferredSalutations[] preferredSalutations{get;set;}
        public cls_titlePrefixCodes[] titlePrefixCodes{get;set;}
        public String nickName{get;set;}  
        public cls_generationAffixCode generationAffixCode{get;set;}
        public cls_qualificationAffixCode qualificationAffixCode{get;set;}
        public cls_titleAffixCodes[] titleAffixCodes{get;set;}
        public String familyName1Prefix{get;set;}     
        public String familyName2Prefix{get;set;}     
        public String initials{get;set;}  
        public String givenName{get;set;}     
        public String middleName{get;set;}    
        public String familyName1{get;set;}   
        public String familyName2{get;set;}   
        public String formattedName{get;set;}     
        public String itemID{get;set;}    
        public cls_languageCode languageCode{get;set;}
    }
    class cls_languageCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_formerNames {
        public cls_nameCode nameCode{get;set;}
        public cls_scriptCode scriptCode{get;set;}
        public cls_preferredSalutations[] preferredSalutations{get;set;}
        public cls_titlePrefixCodes[] titlePrefixCodes{get;set;}
        public String nickName{get;set;}  
        public cls_generationAffixCode generationAffixCode{get;set;}
        public cls_qualificationAffixCode qualificationAffixCode{get;set;}
        public cls_titleAffixCodes[] titleAffixCodes{get;set;}
        public String familyName1Prefix{get;set;}     
        public String familyName2Prefix{get;set;}     
        public String initials{get;set;}  
        public String givenName{get;set;}     
        public String middleName{get;set;}    
        public String familyName1{get;set;}   
        public String familyName2{get;set;}   
        public String formattedName{get;set;}     
        public String itemID{get;set;}    
        public cls_typeCode typeCode{get;set;}
    }
    class cls_birthName {
        public String givenName{get;set;}     
        public String middleName{get;set;}    
        public String familyName1{get;set;}   
        public String familyName2{get;set;}   
        public String formattedName{get;set;}     
        public cls_nameCode nameCode{get;set;}
        public cls_scriptCode scriptCode{get;set;}
        public cls_preferredSalutations[] preferredSalutations{get;set;}
        public cls_titlePrefixCodes[] titlePrefixCodes{get;set;}
        public String nickName{get;set;}  
        public cls_generationAffixCode generationAffixCode{get;set;}
        public cls_qualificationAffixCode qualificationAffixCode{get;set;}
        public cls_titleAffixCodes[] titleAffixCodes{get;set;}
        public String familyName1Prefix{get;set;}     
        public String familyName2Prefix{get;set;}     
        public String initials{get;set;}  
    }
    class cls_birthPlace {
        public String cityName{get;set;}  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1{get;set;}
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2{get;set;}
        public String postalCode{get;set;}    
        public String countryCode{get;set;}   
        public String formattedBirthPlace{get;set;}   
    }
    class cls_otherPersonalAddresses {
        public boolean sameAsAddressIndicator{get;set;}
        public cls_sameAsAddressLink sameAsAddressLink{get;set;}
        public cls_nameCode nameCode{get;set;}
        public String attentionOfName{get;set;}   
        public String careOfName{get;set;}    
        public String lineOne{get;set;}   
        public String lineTwo{get;set;}   
        public String lineThree{get;set;}     
        public String cityName{get;set;}  
        public cls_countrySubdivisionLevel1 countrySubdivisionLevel1{get;set;}
        public String countryCode{get;set;}   
        public String postalCode{get;set;}    
        public cls_geoCoordinate geoCoordinate{get;set;}
        public cls_scriptCode scriptCode{get;set;}
        public String lineFour{get;set;}  
        public String lineFive{get;set;}  
        public String buildingNumber{get;set;}    
        public String buildingName{get;set;}  
        public String blockName{get;set;}     
        public String streetName{get;set;}    
        public cls_streetTypeCode streetTypeCode{get;set;}
        public String unit{get;set;}  
        public String floor{get;set;}     
        public String stairCase{get;set;}     
        public String door{get;set;}  
        public String postOfficeBox{get;set;}     
        public String deliveryPoint{get;set;}     
        public String plotID{get;set;}    
        public cls_countrySubdivisionLevel2 countrySubdivisionLevel2{get;set;}
        public String itemID{get;set;}    
        public cls_typeCode typeCode{get;set;}
    }
    class cls_ethnicityCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_ethnicityGroupCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_raceCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public cls_identificationMethodCode identificationMethodCode{get;set;}
    }
    class cls_identificationMethodCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_citizenshipCountryCodes {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_residencyCountryCodes {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_highestEducationLevelCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_militaryStatusCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String effectiveDate{get;set;}     
    }
    class cls_militaryClassificationCodes {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_customFieldGroup {
        public cls_amountFields[] amountFields{get;set;}
        public cls_codeFields[] codeFields{get;set;}
        public cls_dateFields[] dateFields{get;set;}
        public cls_dateTimeFields[] dateTimeFields{get;set;}
        public cls_indicatorFields[] indicatorFields{get;set;}
        public cls_numberFields[] numberFields{get;set;}
        public cls_percentFields[] percentFields{get;set;}
        public cls_stringFields[] stringFields{get;set;}
        public cls_telephoneFields[] telephoneFields{get;set;}
        public cls_links[] links{get;set;}
    }
    class cls_amountFields {
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_categoryCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_codeFields {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_dateFields {
        public String dateValue{get;set;}     
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_dateTimeFields {
        public String dateTimeValue{get;set;}    
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_indicatorFields {
        public boolean indicatorValue{get;set;}
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_numberFields {
        public Integer numberValue{get;set;}  
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_percentFields {
        public Integer percentValue{get;set;}     
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_stringFields {
        public String stringValue{get;set;}   
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_telephoneFields {
        public String countryDialing{get;set;}    
        public String areaDialing{get;set;}   
        public String dialNumber{get;set;}    
        public String extension{get;set;}     
        public String access{get;set;}    
        public String formattedNumber{get;set;}   
        public cls_nameCode nameCode{get;set;}
        public cls_categoryCode categoryCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_links {
        public String href{get;set;}  
        public String rel{get;set;}   
        public String canonicalUri{get;set;}  
        public String title{get;set;}     
        public String targetSchema{get;set;}  
        public String mediaType{get;set;}     
        public String method{get;set;}    
        public String encType{get;set;}   
        public String schema{get;set;}    
        public cls_payLoadArguments[] payLoadArguments{get;set;}
    }
    class cls_workerDates {
        public String originalHireDate{get;set;}  
        public String rehireDate{get;set;}    
        public String adjustedServiceDate{get;set;}   
        public String acquisitionDate{get;set;}   
        public String retirementDate{get;set;}    
        public String terminationDate{get;set;}   
        public String expectedTerminationDate{get;set;}   
    }
    class cls_workerStatus {
        public cls_statusCode statusCode{get;set;}
        public cls_reasonCode reasonCode{get;set;}
        public String effectiveDate{get;set;}     
    }
    class cls_reasonCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_photos {
        public cls_nameCode nameCode{get;set;}
        public cls_links[] links{get;set;}
        public String itemID{get;set;}    
    }
    class cls_businessCommunication {
        public cls_landlines[] landlines{get;set;}
        public cls_mobiles[] mobiles{get;set;}
        public cls_emails[] emails{get;set;}
        public cls_socialNetworks[] socialNetworks{get;set;}
        public cls_faxes[] faxes{get;set;}
        public cls_pagers[] pagers{get;set;}
        public cls_internetAddresses[] internetAddresses{get;set;}
        public cls_instantMessages[] instantMessages{get;set;}
    }
    class cls_workAssignments {
        public boolean primaryIndicator{get;set;}
        public String offerExtensionDate{get;set;}    
        public String offerAcceptanceDate{get;set;}   
        public String hireDate{get;set;}  
        public String seniorityDate{get;set;}     
        public String expectedStartDate{get;set;}     
        public String actualStartDate{get;set;}   
        public String terminationDate{get;set;}   
        public String expectedTerminationDate{get;set;}   
        public cls_assignmentStatus assignmentStatus{get;set;}
        public cls_assignmentCostCenters[] assignmentCostCenters{get;set;}
        public boolean workerProbationIndicator{get;set;}
        public cls_workerProbationPeriod workerProbationPeriod{get;set;}
        public cls_workerTypeCode workerTypeCode{get;set;}
        public cls_assignmentTermCode assignmentTermCode{get;set;}
        public cls_workLevelCode workLevelCode{get;set;}
        public cls_nationalityContextCode nationalityContextCode{get;set;}
        public boolean vipIndicator{get;set;}
        public cls_vipTypeCode vipTypeCode{get;set;}
        public boolean executiveIndicator{get;set;}
        public cls_executiveTypeCode executiveTypeCode{get;set;}
        public boolean officerIndicator{get;set;}
        public cls_officerTypeCode officerTypeCode{get;set;}
        public boolean managementPositionIndicator{get;set;}
        public String legalEntityID{get;set;}     
        public boolean highlyCompensatedIndicator{get;set;}
        public cls_highlyCompensatedTypeCode highlyCompensatedTypeCode{get;set;}
        public boolean stockOwnerIndicator{get;set;}
        public Integer stockOwnerPercentage{get;set;}     
        public cls_workerGroups[] workerGroups{get;set;}
        public cls_jobCode jobCode{get;set;}
        public String jobTitle{get;set;}  
        public cls_occupationalClassifications[] occupationalClassifications{get;set;}
        public cls_industryClassifications[] industryClassifications{get;set;}
        public cls_wageLawCoverage wageLawCoverage{get;set;}
        public String positionID{get;set;}    
        public String positionTitle{get;set;}     
        public cls_laborUnion laborUnion{get;set;}
        public cls_bargainingUnit bargainingUnit{get;set;}
        public cls_workShiftCode workShiftCode{get;set;}
        public cls_workArrangementCode workArrangementCode{get;set;}
        public cls_standardHours standardHours{get;set;}
        public Integer fullTimeEquivalenceRatio{get;set;}     
        public cls_homeOrganizationalUnits[] homeOrganizationalUnits{get;set;}
        public cls_assignedOrganizationalUnits[] assignedOrganizationalUnits{get;set;}
        public cls_homeWorkLocation homeWorkLocation{get;set;}
        public cls_assignedWorkLocations[] assignedWorkLocations{get;set;}
        public cls_remunerationBasisCode remunerationBasisCode{get;set;}
        public cls_payCycleCode payCycleCode{get;set;}
        public cls_standardPayPeriodHours standardPayPeriodHours{get;set;}
        public cls_baseRemuneration baseRemuneration{get;set;}
        public cls_additionalRemunerations[] additionalRemunerations{get;set;}
        public cls_reportsTo[] reportsTo{get;set;}
        public cls_payrollProcessingStatusCode payrollProcessingStatusCode{get;set;}
        public String payrollGroupCode{get;set;}  
        public String payrollFileNumber{get;set;}     
        public String payrollRegionCode{get;set;}     
        public cls_payScaleCode payScaleCode{get;set;}
        public cls_payGradeCode payGradeCode{get;set;}
        public cls_payGradePayRange payGradePayRange{get;set;}
        public Integer compaRatio{get;set;}   
        public cls_payGradeStepCode payGradeStepCode{get;set;}
        public cls_payGradeStepPayRate payGradeStepPayRate{get;set;}
        public String nextPayGradeStepDate{get;set;}  
        public String minimumPayGradeStepDuration{get;set;}   
        public cls_geographicPayDifferentialCode geographicPayDifferentialCode{get;set;}
        public Integer geographicPayDifferentialPercentage{get;set;}  
        public cls_customFieldGroup customFieldGroup{get;set;}
        public cls_links[] links{get;set;}
        public String itemID{get;set;}    
    }
    class cls_assignmentStatus {
        public cls_statusCode statusCode{get;set;}
        public cls_reasonCode reasonCode{get;set;}
        public String effectiveDate{get;set;}     
    }
    class cls_assignmentCostCenters {
        public String costCenterID{get;set;}  
        public String costCenterName{get;set;}    
        public Integer costCenterPercentage{get;set;}     
    }
    class cls_workerProbationPeriod {
        public String startDate{get;set;}     
        public String endDate{get;set;}   
    }
    class cls_workerTypeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_assignmentTermCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_workLevelCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_nationalityContextCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_vipTypeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_executiveTypeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_officerTypeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_highlyCompensatedTypeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_workerGroups {
        public cls_nameCode nameCode{get;set;}
        public cls_groupCode groupCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_groupCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_jobCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String effectiveDate{get;set;}     
    }
    class cls_occupationalClassifications {
        public cls_nameCode nameCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_classificationCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_industryClassifications {
        public cls_nameCode nameCode{get;set;}
        public cls_classificationCode classificationCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_wageLawCoverage {
        public cls_wageLawNameCode wageLawNameCode{get;set;}
        public cls_coverageCode coverageCode{get;set;}
    }
    class cls_wageLawNameCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_coverageCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_laborUnion {
        public cls_laborUnionCode laborUnionCode{get;set;}
        public String seniorityDate{get;set;}     
    }
    class cls_laborUnionCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_bargainingUnit {
        public cls_bargainingUnitCode bargainingUnitCode{get;set;}
        public String seniorityDate{get;set;}     
    }
    class cls_bargainingUnitCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_workShiftCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_workArrangementCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_standardHours {
        public Integer hoursQuantity{get;set;}    
        public cls_unitCode unitCode{get;set;}
    }
    class cls_unitCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_homeOrganizationalUnits {
        public cls_nameCode nameCode{get;set;}
        public cls_typeCode typeCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_assignedOrganizationalUnits {
        public cls_nameCode nameCode{get;set;}
        public cls_typeCode typeCode{get;set;}
        public String itemID{get;set;}    
    }
    class cls_homeWorkLocation {
        public cls_nameCode nameCode{get;set;}
        public cls_communication communication{get;set;}
        public cls_address address{get;set;}
    }
    class cls_assignedWorkLocations {
        public cls_address address{get;set;}
        public cls_nameCode nameCode{get;set;}
        public cls_communication communication{get;set;}
        public String itemID{get;set;}    
    }
    class cls_remunerationBasisCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_payCycleCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_standardPayPeriodHours {
        public Integer hoursQuantity{get;set;}    
        public cls_unitCode unitCode{get;set;}
    }
    class cls_baseRemuneration {
        public cls_recordingBasisCode recordingBasisCode{get;set;}
        public cls_hourlyRateAmount hourlyRateAmount{get;set;}
        public cls_dailyRateAmount dailyRateAmount{get;set;}
        public cls_weeklyRateAmount weeklyRateAmount{get;set;}
        public cls_biweeklyRateAmount biweeklyRateAmount{get;set;}
        public cls_semiMonthlyRateAmount semiMonthlyRateAmount{get;set;}
        public cls_monthlyRateAmount monthlyRateAmount{get;set;}
        public cls_annualRateAmount annualRateAmount{get;set;}
        public cls_payPeriodRateAmount payPeriodRateAmount{get;set;}
        public cls_commissionRatePercentage commissionRatePercentage{get;set;}
        public cls_associatedRateQualifiers[] associatedRateQualifiers{get;set;}
        public String effectiveDate{get;set;}     
    }
    class cls_recordingBasisCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_hourlyRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_dailyRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_weeklyRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_biweeklyRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_semiMonthlyRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_monthlyRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_annualRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_payPeriodRateAmount {
        public cls_nameCode nameCode{get;set;}
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
    }
    class cls_commissionRatePercentage {
        public cls_nameCode nameCode{get;set;}
        public Integer percentageValue{get;set;}  
        public cls_baseUnitCode baseUnitCode{get;set;}
    }
    class cls_baseUnitCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_associatedRateQualifiers {
        public cls_qualifierObjectTypeCode qualifierObjectTypeCode{get;set;}
        public String qualifierObjectID{get;set;}     
        public String itemID{get;set;}    
    }
    class cls_qualifierObjectTypeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_additionalRemunerations {
        public cls_typeCode typeCode{get;set;}
        public cls_intervalCode intervalCode{get;set;}
        public cls_nameCode nameCode{get;set;}
        public cls_rate rate{get;set;}
        public cls_associatedRateQualifiers[] associatedRateQualifiers{get;set;}
        public String itemID{get;set;}    
        public String effectiveDate{get;set;}     
    }
    class cls_intervalCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_rate {
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
        public cls_unitCode unitCode{get;set;}
        public cls_baseUnitCode baseUnitCode{get;set;}
        public Integer baseMultiplierValue{get;set;}  
    }
    class cls_reportsTo {
        public String associateOID{get;set;}  
        public cls_workerID workerID{get;set;}
        public cls_reportsToWorkerName reportsToWorkerName{get;set;}
        public cls_reportsToRelationshipCode reportsToRelationshipCode{get;set;}
        public String positionID{get;set;}    
        public String positionTitle{get;set;}     
        public String itemID{get;set;}    
    }
    class cls_reportsToWorkerName {
        public String givenName{get;set;}     
        public String middleName{get;set;}    
        public String familyName1{get;set;}   
        public String familyName2{get;set;}   
        public String formattedName{get;set;}     
    }
    class cls_reportsToRelationshipCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_payrollProcessingStatusCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String effectiveDate{get;set;}     
    }
    class cls_payScaleCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_payGradeCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_payGradePayRange {
        public cls_minimumRate minimumRate{get;set;}
        public cls_medianRate medianRate{get;set;}
        public cls_maximumRate maximumRate{get;set;}
    }
    class cls_minimumRate {
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
        public cls_unitCode unitCode{get;set;}
        public cls_baseUnitCode baseUnitCode{get;set;}
        public Integer baseMultiplierValue{get;set;}  
    }
    class cls_medianRate {
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
        public cls_unitCode unitCode{get;set;}
        public cls_baseUnitCode baseUnitCode{get;set;}
        public Integer baseMultiplierValue{get;set;}  
    }
    class cls_maximumRate {
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
        public cls_unitCode unitCode{get;set;}
        public cls_baseUnitCode baseUnitCode{get;set;}
        public Integer baseMultiplierValue{get;set;}  
    }
    class cls_payGradeStepCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_payGradeStepPayRate {
        public Integer amountValue{get;set;}  
        public String currencyCode{get;set;}  
        public cls_unitCode unitCode{get;set;}
        public cls_baseUnitCode baseUnitCode{get;set;}
        public Integer baseMultiplierValue{get;set;}  
    }
    class cls_geographicPayDifferentialCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_meta {
        public Integer startSequence{get;set;}    
        public boolean completeIndicator{get;set;}
        public Integer totalNumber{get;set;}  
        public String resourceSetID{get;set;}     
        public cls_links[] links{get;set;}
    }
    class cls_confirmMessage {
        public cls_confirmMessageID confirmMessageID{get;set;}
        public String createDateTime{get;set;}    
        public String requestReceiptDateTime{get;set;}    
        public cls_protocolStatusCode protocolStatusCode{get;set;}
        public cls_protocolCode protocolCode{get;set;}
        public cls_requestID requestID{get;set;}
        public cls_requestStatusCode requestStatusCode{get;set;}
        public cls_requestMethodCode requestMethodCode{get;set;}
        public cls_sessionID sessionID{get;set;}
        public String requestETag{get;set;}   
        public cls_requestLink requestLink{get;set;}
        public cls_processingStatusCode processingStatusCode{get;set;}
        public cls_processMessages[] processMessages{get;set;}
        public cls_resourceMessages[] resourceMessages{get;set;}
    }
    class cls_confirmMessageID {
        public String idValue{get;set;}   
        public String schemeName{get;set;}    
        public String schemeAgencyName{get;set;}  
    }
    class cls_protocolStatusCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_protocolCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_requestID {
        public String idValue{get;set;}   
        public String schemeName{get;set;}    
        public String schemeAgencyName{get;set;}  
    }
    class cls_requestStatusCode {
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String codeValue{get;set;}     
    }
    class cls_requestMethodCode {
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String codeValue{get;set;}     
    }
    class cls_sessionID {
        public String idValue{get;set;}   
        public String schemeName{get;set;}    
        public String schemeAgencyName{get;set;}  
    }
    class cls_requestLink {
        public String href{get;set;}  
        public String rel{get;set;}   
        public String canonicalUri{get;set;}  
        public String title{get;set;}     
        public String targetSchema{get;set;}  
        public String mediaType{get;set;}     
        public String method{get;set;}    
        public String encType{get;set;}   
        public String schema{get;set;}    
        public cls_payLoadArguments[] payLoadArguments{get;set;}
    }
    class cls_processingStatusCode {
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String codeValue{get;set;}     
    }
    class cls_processMessages {
        public cls_processMessageID processMessageID{get;set;}
        public cls_messageTypeCode messageTypeCode{get;set;}
        public String sourceLocationExpression{get;set;}  
        public cls_expressionLanguageCode expressionLanguageCode{get;set;}
        public cls_links[] links{get;set;}
        public cls_userMessage userMessage{get;set;}
        public cls_developerMessage developerMessage{get;set;}
        public cls_resourceStatusCode resourceStatusCode{get;set;}
    }
    class cls_processMessageID {
        public String idValue{get;set;}   
        public String schemeName{get;set;}    
        public String schemeAgencyName{get;set;}  
    }
    class cls_messageTypeCode {
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String codeValue{get;set;}     
    }
    class cls_expressionLanguageCode {
        public String shortName{get;set;}     
        public String longName{get;set;}  
        public String codeValue{get;set;}     
    }
    class cls_userMessage {
        public String codeValue{get;set;}     
        public String title{get;set;}     
        public String messageTxt{get;set;}    
        public cls_links[] links{get;set;}
    }
    class cls_developerMessage {
        public String codeValue{get;set;}     
        public String title{get;set;}     
        public String messageTxt{get;set;}    
        public cls_links[] links{get;set;}
    }
    class cls_resourceMessages {
        public cls_resourceMessageID resourceMessageID{get;set;}
        public cls_resourceStatusCode resourceStatusCode{get;set;}
        public cls_resourceLink resourceLink{get;set;}
        public cls_processMessages[] processMessages{get;set;}
    }
    class cls_resourceMessageID {
        public String idValue{get;set;}   
        public String schemeName{get;set;}    
        public String schemeAgencyName{get;set;}  
    }
    class cls_resourceStatusCode {
        public String codeValue{get;set;}     
        public String shortName{get;set;}     
        public String longName{get;set;}  
    }
    class cls_resourceLink {
        public String href{get;set;}  
        public String rel{get;set;}   
        public String canonicalUri{get;set;}  
        public String title{get;set;}     
        public String targetSchema{get;set;}  
        public String mediaType{get;set;}     
        public String method{get;set;}    
        public String encType{get;set;}   
        public String schema{get;set;}    
        public cls_payLoadArguments[] payLoadArguments{get;set;}
    }


}