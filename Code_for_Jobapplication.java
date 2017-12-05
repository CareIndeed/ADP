public class Jobapplication {
	public void Jobapplication(){
		String json='';
		Meta metalist = (Meta)System.deserialize(json, Meta.class)
		return metalist;
	}
}
	public class Meta {
		public Integer startSequence{get;set;}
		public Boolean completeIndicator{get;set;}
		public Integer totalNumber{get;set;}
		public String resourceSetID{get;set;}
		public List<AttachmentLink> links{get;set;}
		public AttachmentLink applicationQuestionnaire_navigationLink{get;set;}
		public AttachmentLink employmentHistory_navigationLink{get;set;}
		public AttachmentLink competencies_navigationLink{get;set;}
		public AttachmentLink educationalDegrees_navigationLink{get;set;}
		public AttachmentLink certifications_navigationLink{get;set;}
		public AttachmentLink languages_navigationLink{get;set;}
		public AttachmentLink licenses_navigationLink{get;set;}
		public AttachmentLink memberships_navigationLink{get;set;}
		public AttachmentLink recognitions_navigationLink{get;set;}
		public AttachmentLink comments_navigationLink{get;set;}
		public AttachmentLink attestations_navigationLink{get;set;}
		public AttachmentLink attachments_navigationLink{get;set;}
	}

	public class RaceCode {
		public String codeValue{get;set;}
		public String shortName{get;set;}
		public String longName{get;set;}
		public RelationshipTypeCode identificationMethodCode{get;set;}
	}

	public class BirthPlace {
		public String cityName{get;set;}
		public CountrySubdivisionLevel2 countrySubdivisionLevel1{get;set;}
		public CountrySubdivisionLevel2 countrySubdivisionLevel2{get;set;}
		public String postalCode{get;set;}
		public String countryCode{get;set;}
	}

	public class Questionnaire {
		public String questionnaireID{get;set;}
		public String questionnaireTitle{get;set;}
		public List<QuestionAnswers> questionAnswers{get;set;}
	}

	public class Address {
		public RelationshipTypeCode scriptCode{get;set;}
		public String lineFour{get;set;}
		public String lineFive{get;set;}
		public String buildingNumber{get;set;}
		public String buildingName{get;set;}
		public String blockName{get;set;}
		public String streetName{get;set;}
		public RelationshipTypeCode streetTypeCode{get;set;}
		public String unit{get;set;}
		public String floor{get;set;}
		public String stairCase{get;set;}
		public String door{get;set;}
		public String postOfficeBox{get;set;}
		public String deliveryPoint{get;set;}
		public String plotID{get;set;}
		public CountrySubdivisionLevel2 countrySubdivisionLevel2{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public String attentionOfName{get;set;}
		public String careOfName{get;set;}
		public String lineOne{get;set;}
		public String lineTwo{get;set;}
		public String lineThree{get;set;}
		public String cityName{get;set;}
		public CountrySubdivisionLevel2 countrySubdivisionLevel1{get;set;}
		public String countryCode{get;set;}
		public String postalCode{get;set;}
		public GeoCoordinate geoCoordinate{get;set;}
		public Boolean sameAsAddressIndicator{get;set;}
		public AttachmentLink sameAsAddressLink{get;set;}
	}

	public class StringFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String stringValue{get;set;}
	}

	public class JobApplications {
		public Boolean applicantReferralIndicator{get;set;}
		public ApplicantReferredBy applicantReferredBy{get;set;}
		public RelationshipTypeCode referralSourceCode{get;set;}
		public RequestedPayRate requestedPayRate{get;set;}
		public List<Attachments> attachments{get;set;}
		public String itemID{get;set;}
		public RelationshipTypeCode _languageCode{get;set;}
		public JobRequisitionReference jobRequisitionReference{get;set;}
		public JobOfferReference jobOfferReference{get;set;}
		public RequisitionStatusCode applicationStatusCode{get;set;}
		public ApplicationSource applicationSource{get;set;}
		public Applicant applicant{get;set;}
		public List<Attestations> attestations{get;set;}
		public Questionnaire questionnaire{get;set;}
		public List<Comments> comments{get;set;}
		public List<AttachmentLink> links{get;set;}
	}

	public class Licenses {
		public LicenseID licenseID{get;set;}
		public RelationshipTypeCode licenseNameCode{get;set;}
		public String licenseDescription{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public RequisitionStatusCode statusCode{get;set;}
		public RelationshipTypeCode issuingPartyNameCode{get;set;}
		public String firstIssueDate{get;set;}
		public String lastIssueDate{get;set;}
		public String expirationDate{get;set;}
	}

	public class EducationalDegrees {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode typeCode{get;set;}
		public RequisitionStatusCode statusCode{get;set;}
		public String startDate{get;set;}
		public String expectedCompletionDate{get;set;}
		public String actualCompletionDate{get;set;}
		public String completionDuration{get;set;}
		public RelationshipTypeCode academicCreditTypeCode{get;set;}
		public String academicCreditsCompleted{get;set;}
		public EducationalInstitution educationalInstitution{get;set;}
		public Boolean degreeIssuedIndicator{get;set;}
		public String issueDate{get;set;}
		public SelfAssessedProficiencyScore academicScore{get;set;}
		public List<RelationshipTypeCode> majorProgramNameCodes{get;set;}
		public List<RelationshipTypeCode> minorProgramNameCodes{get;set;}
		public List<RelationshipTypeCode> honorsProgramNameCodes{get;set;}
	}

	public class Languages {
		public RelationshipTypeCode languageCode{get;set;}
		public Boolean nativeLanguageIndicator{get;set;}
		public String acquisitionDate{get;set;}
		public String lastUsedDate{get;set;}
		public String experienceDuration{get;set;}
		public SelfAssessedProficiencyScore selfAssessedProficiencyScore{get;set;}
	}

	public class Landlines {
		public RelationshipTypeCode nameCode{get;set;}
		public String countryDialing{get;set;}
		public String areaDialing{get;set;}
		public String dialNumber{get;set;}
		public String extension{get;set;}
		public String access{get;set;}
		public String formattedNumber{get;set;}
		public String itemID{get;set;}
	}

	public class BaseRemuneration {
		public RelationshipTypeCode recordingBasisCode{get;set;}
		public HourlyRateAmount hourlyRateAmount{get;set;}
		public HourlyRateAmount dailyRateAmount{get;set;}
		public HourlyRateAmount weeklyRateAmount{get;set;}
		public HourlyRateAmount biweeklyRateAmount{get;set;}
		public HourlyRateAmount semiMonthlyRateAmount{get;set;}
		public HourlyRateAmount monthlyRateAmount{get;set;}
		public HourlyRateAmount annualRateAmount{get;set;}
		public HourlyRateAmount payPeriodRateAmount{get;set;}
		public CommissionRatePercentage commissionRatePercentage{get;set;}
	}

	public class PositionHistory {
		public String positionTitle{get;set;}
		public String positionStartDate{get;set;}
		public String positionEndDate{get;set;}
		public Address_Z positionLocation{get;set;}
		public StartingPayRate startingPayRate{get;set;}
		public StartingPayRate endingPayRate{get;set;}
		public PersonName reportsToName{get;set;}
		public List<Responsibilities> responsibilities{get;set;}
		public String reasonForLeaving{get;set;}
		public String itemID{get;set;}
		public Comment comment{get;set;}
		public List<AttachmentLink> links{get;set;}
	}

	public class HourlyRateAmount {
		public RelationshipTypeCode nameCode{get;set;}
		public Integer amountValue{get;set;}
		public String currencyCode{get;set;}
	}

	public class RequestedPayRate {
		public HourlyRateAmount hourlyRateAmount{get;set;}
		public HourlyRateAmount dailyRateAmount{get;set;}
		public HourlyRateAmount weeklyRateAmount{get;set;}
		public HourlyRateAmount monthlyRateAmount{get;set;}
		public HourlyRateAmount annualRateAmount{get;set;}
		public CommissionRatePercentage commissionRatePercentage{get;set;}
		public RelationshipTypeCode remunerationBasisCode{get;set;}
	}

	public class ApplicationSource {
		public SubmittedBy submittedBy{get;set;}
		public String submittedDate{get;set;}
		public String initiatedDateTime{get;set;}
		public String postingChannelID{get;set;}
		public RelationshipTypeCode postingChannelNameCode{get;set;}
	}

	public class EmploymentHistory {
		public String employmentStartDate{get;set;}
		public String employmentEndDate{get;set;}
		public String employerName{get;set;}
		public Address_Z employerAddress{get;set;}
		public Communication employerCommunication{get;set;}
		public Boolean allowContactEmployerIndicator{get;set;}
		public Boolean currentEmployerIndicator{get;set;}
		public List<PositionHistory> positionHistory{get;set;}
		public List<AttachmentLink> links{get;set;}
		public String itemID{get;set;}
	}

	public class Compensation {
		public RelationshipTypeCode remunerationBasisCode{get;set;}
		public RelationshipTypeCode payCycleCode{get;set;}
		public BaseRemuneration baseRemuneration{get;set;}
		public List<AdditionalRemunerations> additionalRemunerations{get;set;}
		public RelationshipTypeCode recordingBasisCode{get;set;}
		public String compensationSummary{get;set;}
	}

	public class PayLoadArguments {
		public String argumentPath{get;set;}
		public String argumentValue{get;set;}
	}

	public class Emails {
		public RelationshipTypeCode nameCode{get;set;}
		public String emailUri{get;set;}
		public String itemID{get;set;}
	}

	public class RequisitionStatusCode {
		public String codeValue{get;set;}
		public String shortName{get;set;}
		public String longName{get;set;}
		public String effectiveDate{get;set;}
	}

	public class DateFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String dateValue{get;set;}
	}

	public class QuestionAnswers {
		public String questionID{get;set;}
		public List<Answers> answers{get;set;}
	}

	public class Rate {
		public Integer amountValue{get;set;}
		public String currencyCode{get;set;}
		public RelationshipTypeCode unitCode{get;set;}
		public RelationshipTypeCode baseUnitCode{get;set;}
		public Integer baseMultiplierValue{get;set;}
	}

	public class FormerNames {
		public String givenName{get;set;}
		public String middleName{get;set;}
		public String familyName1{get;set;}
		public String familyName2{get;set;}
		public String formattedName{get;set;}
		public RelationshipTypeCode typeCode{get;set;}
	}

	public class ProcessMessages {
		public WorkerID processMessageID{get;set;}
		public RelationshipTypeCode messageTypeCode{get;set;}
		public String sourceLocationExpression{get;set;}
		public RelationshipTypeCode expressionLanguageCode{get;set;}
		public List<AttachmentLink> links{get;set;}
		public UserMessage userMessage{get;set;}
		public UserMessage developerMessage{get;set;}
	}

	public class AttachmentLink {
		public String href{get;set;}
		public String rel{get;set;}
		public String canonicalUri{get;set;}
		public String title{get;set;}
		public String targetSchema{get;set;}
		public String mediaType{get;set;}
		public String method{get;set;}
		public String encType{get;set;}
		public String schema{get;set;}
		public List<PayLoadArguments> payLoadArguments{get;set;}
	}

	public class GovernmentIDs {
		public String idValue{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public String countryCode{get;set;}
		public RequisitionStatusCode statusCode{get;set;}
		public String expirationDate{get;set;}
		public String itemID{get;set;}
	}

	public class AssociatedRateQualifiers {
		public RelationshipTypeCode qualifierObjectTypeCode{get;set;}
		public String qualifierObjectID{get;set;}
		public String itemID{get;set;}
	}

	public class SubmittedBy {
		public PersonName personName{get;set;}
		public RelationshipTypeCode relationshipTypeCode{get;set;}
		public Communication communication{get;set;}
		public String personOID{get;set;}
		public String associateOID{get;set;}
	}

	public class CustomFieldGroup {
		public List<AmountFields> amountFields{get;set;}
		public List<String> codeFields{get;set;}
		public List<DateFields> dateFields{get;set;}
		public List<DateTimeFields> dateTimeFields{get;set;}
		public List<IndicatorFields> indicatorFields{get;set;}
		public List<NumberFields> numberFields{get;set;}
		public List<PercentFields> percentFields{get;set;}
		public List<StringFields> stringFields{get;set;}
		public List<TelephoneFields> telephoneFields{get;set;}
	}

	public class ApplicantReferredBy {
		public PersonName personName{get;set;}
		public RelationshipTypeCode relationshipTypeCode{get;set;}
		public Communication communication{get;set;}
		public String personOID{get;set;}
		public String associateOID{get;set;}
		public WorkerID workerID{get;set;}
		public String workAssignmentID{get;set;}
	}

	public class AcceptedIndicator {
		public Boolean indicatorValue{get;set;}
		public String effectiveDate{get;set;}
	}

	public class ConfirmMessage {
		public WorkerID confirmMessageID{get;set;}
		public String createDateTime{get;set;}
		public String requestReceiptDateTime{get;set;}
		public RelationshipTypeCode protocolStatusCode{get;set;}
		public RelationshipTypeCode protocolCode{get;set;}
		public WorkerID requestID{get;set;}
		public RelationshipTypeCode requestStatusCode{get;set;}
		public RelationshipTypeCode requestMethodCode{get;set;}
		public WorkerID sessionID{get;set;}
		public String requestETag{get;set;}
		public AttachmentLink requestLink{get;set;}
		public RelationshipTypeCode processingStatusCode{get;set;}
		public List<ProcessMessages> processMessages{get;set;}
		public List<ResourceMessages> resourceMessages{get;set;}
	}

	public class LicenseID {
		public String idValue{get;set;}
		public RelationshipTypeCode schemeCode{get;set;}
	}

	public class Author {
		public String associateOID{get;set;}
		public RelationshipTypeCode roleCode{get;set;}
		public String formattedName{get;set;}
	}

	public class ESignatureSignedBy {
		public String associateOID{get;set;}
		public RelationshipTypeCode roleCode{get;set;}
		public String formattedName{get;set;}
		public String formattedSignature{get;set;}
	}

	public class CodeFields {
		public String codeValue{get;set;}
		public String shortName{get;set;}
		public String longName{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class SocialNetworks {
		public RelationshipTypeCode nameCode{get;set;}
		public String uri{get;set;}
		public String itemID{get;set;}
	}

	public class Person {
		public Address address{get;set;}
		public PersonName preferredName{get;set;}
		public List<FormerNames> formerNames{get;set;}
		public List<GovernmentIDs> governmentIDs{get;set;}
		public PersonName birthName{get;set;}
		public BirthPlace birthPlace{get;set;}
		public Boolean studentIndicator{get;set;}
		public List<RelationshipTypeCode> citizenshipCountryCodes{get;set;}
		public List<RelationshipTypeCode> residencyCountryCodes{get;set;}
		public RelationshipTypeCode highestEducationLevelCode{get;set;}
		public RelationshipTypeCode militaryStatusCode{get;set;}
		public String militaryDischargeDate{get;set;}
		public List<RelationshipTypeCode> militaryClassificationCodes{get;set;}
		public Boolean selfIdentificationDeclinedIndicator{get;set;}
		public String birthDate{get;set;}
		public RelationshipTypeCode genderCode{get;set;}
		public RelationshipTypeCode religionCode{get;set;}
		public RelationshipTypeCode ethnicityCode{get;set;}
		public RelationshipTypeCode ethnicityGroupCode{get;set;}
		public RaceCode raceCode{get;set;}
		public RelationshipTypeCode maritalStatusCode{get;set;}
		public Boolean disabilityIdentificationDeclinedIndicator{get;set;}
		public Boolean disabledIndicator{get;set;}
		public List<RelationshipTypeCode> disabilityTypeCodes{get;set;}
		public PersonName personName{get;set;}
		public RelationshipTypeCode relationshipTypeCode{get;set;}
		public Communication communication{get;set;}
		public String personOID{get;set;}
		public CustomFieldGroup customFieldGroup{get;set;}
	}

	public class Address_Z {
		public RelationshipTypeCode scriptCode{get;set;}
		public String lineFour{get;set;}
		public String lineFive{get;set;}
		public String buildingNumber{get;set;}
		public String buildingName{get;set;}
		public String blockName{get;set;}
		public String streetName{get;set;}
		public RelationshipTypeCode streetTypeCode{get;set;}
		public String unit{get;set;}
		public String floor{get;set;}
		public String stairCase{get;set;}
		public String door{get;set;}
		public String postOfficeBox{get;set;}
		public String deliveryPoint{get;set;}
		public String plotID{get;set;}
		public CountrySubdivisionLevel2 countrySubdivisionLevel2{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public String attentionOfName{get;set;}
		public String careOfName{get;set;}
		public String lineOne{get;set;}
		public String lineTwo{get;set;}
		public String lineThree{get;set;}
		public String cityName{get;set;}
		public CountrySubdivisionLevel2 countrySubdivisionLevel1{get;set;}
		public String countryCode{get;set;}
		public String postalCode{get;set;}
		public GeoCoordinate geoCoordinate{get;set;}
	}

	public class Applicant {
		public Person person{get;set;}
		public List<Competencies> competencies{get;set;}
		public List<EducationalDegrees> educationalDegrees{get;set;}
		public List<Certifications> certifications{get;set;}
		public List<Languages> languages{get;set;}
		public List<Licenses> licenses{get;set;}
		public List<Memberships> memberships{get;set;}
		public List<Recognitions> recognitions{get;set;}
		public List<EmploymentHistory> employmentHistory{get;set;}
		public List<References> references{get;set;}
		public String personOID{get;set;}
		public String associateOID{get;set;}
		public Boolean internalApplicantIndicator{get;set;}
		public Boolean workAuthorizationIndicator{get;set;}
	}

	public class Memberships {
		public RelationshipTypeCode membershipOrganizationNameCode{get;set;}
		public String membershipOrganizationChapterID{get;set;}
		public LicenseID membershipID{get;set;}
		public RelationshipTypeCode typeCode{get;set;}
		public String memberTitle{get;set;}
		public String membershipDescription{get;set;}
		public String memberSinceDate{get;set;}
		public String expirationDate{get;set;}
	}

	public class JSON2Apex {
		public List<JobApplications> jobApplications{get;set;}
		public Meta meta{get;set;}
		public ConfirmMessage confirmMessage{get;set;}
	}

	public class SelfAssessedProficiencyScore {
		public RelationshipTypeCode unitCode{get;set;}
		public String scoreValue{get;set;}
		public RelationshipTypeCode scoreCode{get;set;}
	}

	public class Certifications {
		public RelationshipTypeCode certificationNameCode{get;set;}
		public String certificationDescription{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public RequisitionStatusCode statusCode{get;set;}
		public RelationshipTypeCode issuingPartyNameCode{get;set;}
		public String firstIssueDate{get;set;}
		public String lastIssueDate{get;set;}
		public String expirationDate{get;set;}
	}

	public class DateTimeFields_Z {
		public String dateTimeValue{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class StartingPayRate {
		public HourlyRateAmount hourlyRateAmount{get;set;}
		public HourlyRateAmount dailyRateAmount{get;set;}
		public HourlyRateAmount weeklyRateAmount{get;set;}
		public HourlyRateAmount monthlyRateAmount{get;set;}
		public HourlyRateAmount annualRateAmount{get;set;}
		public CommissionRatePercentage commissionRatePercentage{get;set;}
	}

	public class Competencies {
		public RelationshipTypeCode competencyNameCode{get;set;}
		public String competencyDescription{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String acquisitionDate{get;set;}
		public String lastUsedDate{get;set;}
		public String experienceDuration{get;set;}
		public SelfAssessedProficiencyScore selfAssessedProficiencyScore{get;set;}
	}

	public class DateTimeFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String dateTimeValue{get;set;}
	}

	public class Recognitions {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode typeCode{get;set;}
		public EducationalInstitution issuingParty{get;set;}
		public String issueDate{get;set;}
		public CustomFieldGroup_Z customFieldGroup{get;set;}
	}

	public class Responsibilities {
		public RelationshipTypeCode nameCode{get;set;}
		public String responsibilityDescription{get;set;}
	}

	public class AmountFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public Integer amountValue{get;set;}
		public String currencyCode{get;set;}
	}

	public class GeoCoordinate {
		public Integer latitude{get;set;}
		public Integer longitude{get;set;}
	}

	public class UserMessage {
		public String codeValue{get;set;}
		public String title{get;set;}
		public String messageTxt{get;set;}
		public List<AttachmentLink> links{get;set;}
	}

	public class IndicatorFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public Boolean indicatorValue{get;set;}
	}

	public class WorkerID {
		public String idValue{get;set;}
		public String schemeName{get;set;}
		public String schemeAgencyName{get;set;}
	}

	public class Attachments {
		public RelationshipTypeCode nameCode{get;set;}
		public AttachmentLink attachmentLink{get;set;}
		public String textValue{get;set;}
	}

	public class JobOfferReference {
		public String offerAcceptanceDate{get;set;}
		public OfferTerms offerTerms{get;set;}
		public RequisitionStatusCode offerAcceptanceStatusCode{get;set;}
		public ESignatureSignedBy eSignatureSignedBy{get;set;}
		public RelationshipTypeCode eSignatureStatusCode{get;set;}
		public String eSignatureSignedDate{get;set;}
		public String offerExtensionDate{get;set;}
		public String offerExpirationtDate{get;set;}
		public RequisitionStatusCode offerStatusCode{get;set;}
		public String jobOfferID{get;set;}
		public List<Comments> comments{get;set;}
	}

	public class NumberFields_Z {
		public Integer numberValue{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class TelephoneFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String countryDialing{get;set;}
		public String areaDialing{get;set;}
		public String dialNumber{get;set;}
		public String extension{get;set;}
		public String access{get;set;}
		public String formattedNumber{get;set;}
	}

	public class IndicatorFields_Z {
		public Boolean indicatorValue{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class AdditionalRemunerations {
		public RelationshipTypeCode typeCode{get;set;}
		public RelationshipTypeCode intervalCode{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public Rate rate{get;set;}
		public List<AssociatedRateQualifiers> associatedRateQualifiers{get;set;}
		public String itemID{get;set;}
	}

	public class TelephoneFields_Z {
		public String countryDialing{get;set;}
		public String areaDialing{get;set;}
		public String dialNumber{get;set;}
		public String extension{get;set;}
		public String access{get;set;}
		public String formattedNumber{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class Attestations {
		public String messageTxt{get;set;}
		public List<AttachmentLink> links{get;set;}
		public String itemID{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public AcceptedIndicator acceptedIndicator{get;set;}
	}

	public class EducationalInstitution {
		public RelationshipTypeCode nameCode{get;set;}
		public Address_Z address{get;set;}
	}

	public class JobRequisitionReference {
		public String requisitionID{get;set;}
		public String requisitionTitle{get;set;}
		public String clientRequisitionID{get;set;}
		public RequisitionStatusCode requisitionStatusCode{get;set;}
		public String requisitionDescription{get;set;}
		public String postDate{get;set;}
		public RelationshipTypeCode jobFamilyCode{get;set;}
		public List<AttachmentLink> links{get;set;}
	}

	public class DateFields_Z {
		public String dateValue{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class AmountFields_Z {
		public Integer amountValue{get;set;}
		public String currencyCode{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class Communication {
		public List<Landlines> landlines{get;set;}
		public List<Landlines> mobiles{get;set;}
		public List<Emails> emails{get;set;}
		public List<SocialNetworks> socialNetworks{get;set;}
		public List<Landlines> faxes{get;set;}
		public List<Landlines> pagers{get;set;}
		public List<SocialNetworks> internetAddresses{get;set;}
		public List<SocialNetworks> instantMessages{get;set;}
	}

	public class Comment {
		public String textValue{get;set;}
		public RelationshipTypeCode commentCode{get;set;}
	}

	public class PersonName {
		public String givenName{get;set;}
		public String middleName{get;set;}
		public String familyName1{get;set;}
		public String familyName2{get;set;}
		public String formattedName{get;set;}
	}

	public class Answers {
		public String answerID{get;set;}
		public String answerValue{get;set;}
		public Boolean answerIndicator{get;set;}
	}

	public class ResourceMessages {
		public WorkerID resourceMessageID{get;set;}
		public RelationshipTypeCode resourceStatusCode{get;set;}
		public AttachmentLink resourceLink{get;set;}
		public List<ProcessMessages_Z> processMessages{get;set;}
	}

	public class Comments {
		public RelationshipTypeCode commentCode{get;set;}
		public String textValue{get;set;}
		public String entryDateTime{get;set;}
		public Author author{get;set;}
	}

	public class NumberFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public Integer numberValue{get;set;}
	}

	public class StringFields_Z {
		public String stringValue{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	public class CountrySubdivisionLevel2 {
		public String codeValue{get;set;}
		public String shortName{get;set;}
		public String longName{get;set;}
		public String subdivisionType{get;set;}
	}

	public class CustomFieldGroup_Z {
		public List<AmountFields_Z> amountFields{get;set;}
		public List<CodeFields> codeFields{get;set;}
		public List<DateFields_Z> dateFields{get;set;}
		public List<DateTimeFields_Z> dateTimeFields{get;set;}
		public List<IndicatorFields_Z> indicatorFields{get;set;}
		public List<NumberFields_Z> numberFields{get;set;}
		public List<PercentFields_Z> percentFields{get;set;}
		public List<StringFields_Z> stringFields{get;set;}
		public List<TelephoneFields_Z> telephoneFields{get;set;}
		public List<AttachmentLink> links{get;set;}
	}

	public class CommissionRatePercentage {
		public RelationshipTypeCode nameCode{get;set;}
		public Integer percentageValue{get;set;}
		public RelationshipTypeCode baseUnitCode{get;set;}
	}

	public class ProcessMessages_Z {
		public WorkerID processMessageID{get;set;}
		public RelationshipTypeCode messageTypeCode{get;set;}
		public String sourceLocationExpression{get;set;}
		public RelationshipTypeCode expressionLanguageCode{get;set;}
		public List<AttachmentLink> links{get;set;}
		public UserMessage userMessage{get;set;}
		public UserMessage developerMessage{get;set;}
		public RelationshipTypeCode resourceStatusCode{get;set;}
	}

	public class RelationshipTypeCode {
		public String codeValue{get;set;}
		public String shortName{get;set;}
		public String longName{get;set;}
	}

	public class References {
		public PersonName personName{get;set;}
		public RelationshipTypeCode relationshipTypeCode{get;set;}
		public Communication communication{get;set;}
	}

	public class OfferTerms {
		public String expectedStartDate{get;set;}
		public Compensation compensation{get;set;}
	}

	public class PercentFields {
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public Integer percentValue{get;set;}
	}

	public class PercentFields_Z {
		public Integer percentValue{get;set;}
		public RelationshipTypeCode nameCode{get;set;}
		public RelationshipTypeCode categoryCode{get;set;}
		public String itemID{get;set;}
	}

	
