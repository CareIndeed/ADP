public class Jobapplication {
	public void Jobapplication(){
		String json='';
		Meta metalist = (Meta)System.deserialize(json, Meta.class)
		return (JSON2Apex) System.JSON.deserialize(json, Jobapplication.class);
	}
}
	public class Meta {
		public Integer startSequence;
		public Boolean completeIndicator;
		public Integer totalNumber;
		public String resourceSetID;
		public List<AttachmentLink> links;
		public AttachmentLink applicationQuestionnaire_navigationLink;
		public AttachmentLink employmentHistory_navigationLink;
		public AttachmentLink competencies_navigationLink;
		public AttachmentLink educationalDegrees_navigationLink;
		public AttachmentLink certifications_navigationLink;
		public AttachmentLink languages_navigationLink;
		public AttachmentLink licenses_navigationLink;
		public AttachmentLink memberships_navigationLink;
		public AttachmentLink recognitions_navigationLink;
		public AttachmentLink comments_navigationLink;
		public AttachmentLink attestations_navigationLink;
		public AttachmentLink attachments_navigationLink;
	}

	public class RaceCode {
		public String codeValue;
		public String shortName;
		public String longName;
		public RelationshipTypeCode identificationMethodCode;
	}

	public class BirthPlace {
		public String cityName;
		public CountrySubdivisionLevel2 countrySubdivisionLevel1;
		public CountrySubdivisionLevel2 countrySubdivisionLevel2;
		public String postalCode;
		public String countryCode;
	}

	public class Questionnaire {
		public String questionnaireID;
		public String questionnaireTitle;
		public List<QuestionAnswers> questionAnswers;
	}

	public class Address {
		public RelationshipTypeCode scriptCode;
		public String lineFour;
		public String lineFive;
		public String buildingNumber;
		public String buildingName;
		public String blockName;
		public String streetName;
		public RelationshipTypeCode streetTypeCode;
		public String unit;
		public String floor;
		public String stairCase;
		public String door;
		public String postOfficeBox;
		public String deliveryPoint;
		public String plotID;
		public CountrySubdivisionLevel2 countrySubdivisionLevel2;
		public RelationshipTypeCode nameCode;
		public String attentionOfName;
		public String careOfName;
		public String lineOne;
		public String lineTwo;
		public String lineThree;
		public String cityName;
		public CountrySubdivisionLevel2 countrySubdivisionLevel1;
		public String countryCode;
		public String postalCode;
		public GeoCoordinate geoCoordinate;
		public Boolean sameAsAddressIndicator;
		public AttachmentLink sameAsAddressLink;
	}

	public class StringFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String stringValue;
	}

	public class JobApplications {
		public Boolean applicantReferralIndicator;
		public ApplicantReferredBy applicantReferredBy;
		public RelationshipTypeCode referralSourceCode;
		public RequestedPayRate requestedPayRate;
		public List<Attachments> attachments;
		public String itemID;
		public RelationshipTypeCode _languageCode;
		public JobRequisitionReference jobRequisitionReference;
		public JobOfferReference jobOfferReference;
		public RequisitionStatusCode applicationStatusCode;
		public ApplicationSource applicationSource;
		public Applicant applicant;
		public List<Attestations> attestations;
		public Questionnaire questionnaire;
		public List<Comments> comments;
		public List<AttachmentLink> links;
	}

	public class Licenses {
		public LicenseID licenseID;
		public RelationshipTypeCode licenseNameCode;
		public String licenseDescription;
		public RelationshipTypeCode categoryCode;
		public RequisitionStatusCode statusCode;
		public RelationshipTypeCode issuingPartyNameCode;
		public String firstIssueDate;
		public String lastIssueDate;
		public String expirationDate;
	}

	public class EducationalDegrees {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode typeCode;
		public RequisitionStatusCode statusCode;
		public String startDate;
		public String expectedCompletionDate;
		public String actualCompletionDate;
		public String completionDuration;
		public RelationshipTypeCode academicCreditTypeCode;
		public String academicCreditsCompleted;
		public EducationalInstitution educationalInstitution;
		public Boolean degreeIssuedIndicator;
		public String issueDate;
		public SelfAssessedProficiencyScore academicScore;
		public List<RelationshipTypeCode> majorProgramNameCodes;
		public List<RelationshipTypeCode> minorProgramNameCodes;
		public List<RelationshipTypeCode> honorsProgramNameCodes;
	}

	public class Languages {
		public RelationshipTypeCode languageCode;
		public Boolean nativeLanguageIndicator;
		public String acquisitionDate;
		public String lastUsedDate;
		public String experienceDuration;
		public SelfAssessedProficiencyScore selfAssessedProficiencyScore;
	}

	public class Landlines {
		public RelationshipTypeCode nameCode;
		public String countryDialing;
		public String areaDialing;
		public String dialNumber;
		public String extension;
		public String access;
		public String formattedNumber;
		public String itemID;
	}

	public class BaseRemuneration {
		public RelationshipTypeCode recordingBasisCode;
		public HourlyRateAmount hourlyRateAmount;
		public HourlyRateAmount dailyRateAmount;
		public HourlyRateAmount weeklyRateAmount;
		public HourlyRateAmount biweeklyRateAmount;
		public HourlyRateAmount semiMonthlyRateAmount;
		public HourlyRateAmount monthlyRateAmount;
		public HourlyRateAmount annualRateAmount;
		public HourlyRateAmount payPeriodRateAmount;
		public CommissionRatePercentage commissionRatePercentage;
	}

	public class PositionHistory {
		public String positionTitle;
		public String positionStartDate;
		public String positionEndDate;
		public Address_Z positionLocation;
		public StartingPayRate startingPayRate;
		public StartingPayRate endingPayRate;
		public PersonName reportsToName;
		public List<Responsibilities> responsibilities;
		public String reasonForLeaving;
		public String itemID;
		public Comment comment;
		public List<AttachmentLink> links;
	}

	public class HourlyRateAmount {
		public RelationshipTypeCode nameCode;
		public Integer amountValue;
		public String currencyCode;
	}

	public class RequestedPayRate {
		public HourlyRateAmount hourlyRateAmount;
		public HourlyRateAmount dailyRateAmount;
		public HourlyRateAmount weeklyRateAmount;
		public HourlyRateAmount monthlyRateAmount;
		public HourlyRateAmount annualRateAmount;
		public CommissionRatePercentage commissionRatePercentage;
		public RelationshipTypeCode remunerationBasisCode;
	}

	public class ApplicationSource {
		public SubmittedBy submittedBy;
		public String submittedDate;
		public String initiatedDateTime;
		public String postingChannelID;
		public RelationshipTypeCode postingChannelNameCode;
	}

	public class EmploymentHistory {
		public String employmentStartDate;
		public String employmentEndDate;
		public String employerName;
		public Address_Z employerAddress;
		public Communication employerCommunication;
		public Boolean allowContactEmployerIndicator;
		public Boolean currentEmployerIndicator;
		public List<PositionHistory> positionHistory;
		public List<AttachmentLink> links;
		public String itemID;
	}

	public class Compensation {
		public RelationshipTypeCode remunerationBasisCode;
		public RelationshipTypeCode payCycleCode;
		public BaseRemuneration baseRemuneration;
		public List<AdditionalRemunerations> additionalRemunerations;
		public RelationshipTypeCode recordingBasisCode;
		public String compensationSummary;
	}

	public class PayLoadArguments {
		public String argumentPath;
		public String argumentValue;
	}

	public class Emails {
		public RelationshipTypeCode nameCode;
		public String emailUri;
		public String itemID;
	}

	public class RequisitionStatusCode {
		public String codeValue;
		public String shortName;
		public String longName;
		public String effectiveDate;
	}

	public class DateFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String dateValue;
	}

	public class QuestionAnswers {
		public String questionID;
		public List<Answers> answers;
	}

	public class Rate {
		public Integer amountValue;
		public String currencyCode;
		public RelationshipTypeCode unitCode;
		public RelationshipTypeCode baseUnitCode;
		public Integer baseMultiplierValue;
	}

	public class FormerNames {
		public String givenName;
		public String middleName;
		public String familyName1;
		public String familyName2;
		public String formattedName;
		public RelationshipTypeCode typeCode;
	}

	public class ProcessMessages {
		public WorkerID processMessageID;
		public RelationshipTypeCode messageTypeCode;
		public String sourceLocationExpression;
		public RelationshipTypeCode expressionLanguageCode;
		public List<AttachmentLink> links;
		public UserMessage userMessage;
		public UserMessage developerMessage;
	}

	public class AttachmentLink {
		public String href;
		public String rel;
		public String canonicalUri;
		public String title;
		public String targetSchema;
		public String mediaType;
		public String method;
		public String encType;
		public String schema;
		public List<PayLoadArguments> payLoadArguments;
	}

	public class GovernmentIDs {
		public String idValue;
		public RelationshipTypeCode nameCode;
		public String countryCode;
		public RequisitionStatusCode statusCode;
		public String expirationDate;
		public String itemID;
	}

	public class AssociatedRateQualifiers {
		public RelationshipTypeCode qualifierObjectTypeCode;
		public String qualifierObjectID;
		public String itemID;
	}

	public class SubmittedBy {
		public PersonName personName;
		public RelationshipTypeCode relationshipTypeCode;
		public Communication communication;
		public String personOID;
		public String associateOID;
	}

	public class CustomFieldGroup {
		public List<AmountFields> amountFields;
		public List<String> codeFields;
		public List<DateFields> dateFields;
		public List<DateTimeFields> dateTimeFields;
		public List<IndicatorFields> indicatorFields;
		public List<NumberFields> numberFields;
		public List<PercentFields> percentFields;
		public List<StringFields> stringFields;
		public List<TelephoneFields> telephoneFields;
	}

	public class ApplicantReferredBy {
		public PersonName personName;
		public RelationshipTypeCode relationshipTypeCode;
		public Communication communication;
		public String personOID;
		public String associateOID;
		public WorkerID workerID;
		public String workAssignmentID;
	}

	public class AcceptedIndicator {
		public Boolean indicatorValue;
		public String effectiveDate;
	}

	public class ConfirmMessage {
		public WorkerID confirmMessageID;
		public String createDateTime;
		public String requestReceiptDateTime;
		public RelationshipTypeCode protocolStatusCode;
		public RelationshipTypeCode protocolCode;
		public WorkerID requestID;
		public RelationshipTypeCode requestStatusCode;
		public RelationshipTypeCode requestMethodCode;
		public WorkerID sessionID;
		public String requestETag;
		public AttachmentLink requestLink;
		public RelationshipTypeCode processingStatusCode;
		public List<ProcessMessages> processMessages;
		public List<ResourceMessages> resourceMessages;
	}

	public class LicenseID {
		public String idValue;
		public RelationshipTypeCode schemeCode;
	}

	public class Author {
		public String associateOID;
		public RelationshipTypeCode roleCode;
		public String formattedName;
	}

	public class ESignatureSignedBy {
		public String associateOID;
		public RelationshipTypeCode roleCode;
		public String formattedName;
		public String formattedSignature;
	}

	public class CodeFields {
		public String codeValue;
		public String shortName;
		public String longName;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class SocialNetworks {
		public RelationshipTypeCode nameCode;
		public String uri;
		public String itemID;
	}

	public class Person {
		public Address address;
		public PersonName preferredName;
		public List<FormerNames> formerNames;
		public List<GovernmentIDs> governmentIDs;
		public PersonName birthName;
		public BirthPlace birthPlace;
		public Boolean studentIndicator;
		public List<RelationshipTypeCode> citizenshipCountryCodes;
		public List<RelationshipTypeCode> residencyCountryCodes;
		public RelationshipTypeCode highestEducationLevelCode;
		public RelationshipTypeCode militaryStatusCode;
		public String militaryDischargeDate;
		public List<RelationshipTypeCode> militaryClassificationCodes;
		public Boolean selfIdentificationDeclinedIndicator;
		public String birthDate;
		public RelationshipTypeCode genderCode;
		public RelationshipTypeCode religionCode;
		public RelationshipTypeCode ethnicityCode;
		public RelationshipTypeCode ethnicityGroupCode;
		public RaceCode raceCode;
		public RelationshipTypeCode maritalStatusCode;
		public Boolean disabilityIdentificationDeclinedIndicator;
		public Boolean disabledIndicator;
		public List<RelationshipTypeCode> disabilityTypeCodes;
		public PersonName personName;
		public RelationshipTypeCode relationshipTypeCode;
		public Communication communication;
		public String personOID;
		public CustomFieldGroup customFieldGroup;
	}

	public class Address_Z {
		public RelationshipTypeCode scriptCode;
		public String lineFour;
		public String lineFive;
		public String buildingNumber;
		public String buildingName;
		public String blockName;
		public String streetName;
		public RelationshipTypeCode streetTypeCode;
		public String unit;
		public String floor;
		public String stairCase;
		public String door;
		public String postOfficeBox;
		public String deliveryPoint;
		public String plotID;
		public CountrySubdivisionLevel2 countrySubdivisionLevel2;
		public RelationshipTypeCode nameCode;
		public String attentionOfName;
		public String careOfName;
		public String lineOne;
		public String lineTwo;
		public String lineThree;
		public String cityName;
		public CountrySubdivisionLevel2 countrySubdivisionLevel1;
		public String countryCode;
		public String postalCode;
		public GeoCoordinate geoCoordinate;
	}

	public class Applicant {
		public Person person;
		public List<Competencies> competencies;
		public List<EducationalDegrees> educationalDegrees;
		public List<Certifications> certifications;
		public List<Languages> languages;
		public List<Licenses> licenses;
		public List<Memberships> memberships;
		public List<Recognitions> recognitions;
		public List<EmploymentHistory> employmentHistory;
		public List<References> references;
		public String personOID;
		public String associateOID;
		public Boolean internalApplicantIndicator;
		public Boolean workAuthorizationIndicator;
	}

	public class Memberships {
		public RelationshipTypeCode membershipOrganizationNameCode;
		public String membershipOrganizationChapterID;
		public LicenseID membershipID;
		public RelationshipTypeCode typeCode;
		public String memberTitle;
		public String membershipDescription;
		public String memberSinceDate;
		public String expirationDate;
	}

	public class JSON2Apex {
		public List<JobApplications> jobApplications;
		public Meta meta;
		public ConfirmMessage confirmMessage;
	}

	public class SelfAssessedProficiencyScore {
		public RelationshipTypeCode unitCode;
		public String scoreValue;
		public RelationshipTypeCode scoreCode;
	}

	public class Certifications {
		public RelationshipTypeCode certificationNameCode;
		public String certificationDescription;
		public RelationshipTypeCode categoryCode;
		public RequisitionStatusCode statusCode;
		public RelationshipTypeCode issuingPartyNameCode;
		public String firstIssueDate;
		public String lastIssueDate;
		public String expirationDate;
	}

	public class DateTimeFields_Z {
		public String dateTimeValue;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class StartingPayRate {
		public HourlyRateAmount hourlyRateAmount;
		public HourlyRateAmount dailyRateAmount;
		public HourlyRateAmount weeklyRateAmount;
		public HourlyRateAmount monthlyRateAmount;
		public HourlyRateAmount annualRateAmount;
		public CommissionRatePercentage commissionRatePercentage;
	}

	public class Competencies {
		public RelationshipTypeCode competencyNameCode;
		public String competencyDescription;
		public RelationshipTypeCode categoryCode;
		public String acquisitionDate;
		public String lastUsedDate;
		public String experienceDuration;
		public SelfAssessedProficiencyScore selfAssessedProficiencyScore;
	}

	public class DateTimeFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String dateTimeValue;
	}

	public class Recognitions {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode typeCode;
		public EducationalInstitution issuingParty;
		public String issueDate;
		public CustomFieldGroup_Z customFieldGroup;
	}

	public class Responsibilities {
		public RelationshipTypeCode nameCode;
		public String responsibilityDescription;
	}

	public class AmountFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public Integer amountValue;
		public String currencyCode;
	}

	public class GeoCoordinate {
		public Integer latitude;
		public Integer longitude;
	}

	public class UserMessage {
		public String codeValue;
		public String title;
		public String messageTxt;
		public List<AttachmentLink> links;
	}

	public class IndicatorFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public Boolean indicatorValue;
	}

	public class WorkerID {
		public String idValue;
		public String schemeName;
		public String schemeAgencyName;
	}

	public class Attachments {
		public RelationshipTypeCode nameCode;
		public AttachmentLink attachmentLink;
		public String textValue;
	}

	public class JobOfferReference {
		public String offerAcceptanceDate;
		public OfferTerms offerTerms;
		public RequisitionStatusCode offerAcceptanceStatusCode;
		public ESignatureSignedBy eSignatureSignedBy;
		public RelationshipTypeCode eSignatureStatusCode;
		public String eSignatureSignedDate;
		public String offerExtensionDate;
		public String offerExpirationtDate;
		public RequisitionStatusCode offerStatusCode;
		public String jobOfferID;
		public List<Comments> comments;
	}

	public class NumberFields_Z {
		public Integer numberValue;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class TelephoneFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String countryDialing;
		public String areaDialing;
		public String dialNumber;
		public String extension;
		public String access;
		public String formattedNumber;
	}

	public class IndicatorFields_Z {
		public Boolean indicatorValue;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class AdditionalRemunerations {
		public RelationshipTypeCode typeCode;
		public RelationshipTypeCode intervalCode;
		public RelationshipTypeCode nameCode;
		public Rate rate;
		public List<AssociatedRateQualifiers> associatedRateQualifiers;
		public String itemID;
	}

	public class TelephoneFields_Z {
		public String countryDialing;
		public String areaDialing;
		public String dialNumber;
		public String extension;
		public String access;
		public String formattedNumber;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class Attestations {
		public String messageTxt;
		public List<AttachmentLink> links;
		public String itemID;
		public RelationshipTypeCode nameCode;
		public AcceptedIndicator acceptedIndicator;
	}

	public class EducationalInstitution {
		public RelationshipTypeCode nameCode;
		public Address_Z address;
	}

	public class JobRequisitionReference {
		public String requisitionID;
		public String requisitionTitle;
		public String clientRequisitionID;
		public RequisitionStatusCode requisitionStatusCode;
		public String requisitionDescription;
		public String postDate;
		public RelationshipTypeCode jobFamilyCode;
		public List<AttachmentLink> links;
	}

	public class DateFields_Z {
		public String dateValue;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class AmountFields_Z {
		public Integer amountValue;
		public String currencyCode;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class Communication {
		public List<Landlines> landlines;
		public List<Landlines> mobiles;
		public List<Emails> emails;
		public List<SocialNetworks> socialNetworks;
		public List<Landlines> faxes;
		public List<Landlines> pagers;
		public List<SocialNetworks> internetAddresses;
		public List<SocialNetworks> instantMessages;
	}

	public class Comment {
		public String textValue;
		public RelationshipTypeCode commentCode;
	}

	public class PersonName {
		public String givenName;
		public String middleName;
		public String familyName1;
		public String familyName2;
		public String formattedName;
	}

	public class Answers {
		public String answerID;
		public String answerValue;
		public Boolean answerIndicator;
	}

	public class ResourceMessages {
		public WorkerID resourceMessageID;
		public RelationshipTypeCode resourceStatusCode;
		public AttachmentLink resourceLink;
		public List<ProcessMessages_Z> processMessages;
	}

	public class Comments {
		public RelationshipTypeCode commentCode;
		public String textValue;
		public String entryDateTime;
		public Author author;
	}

	public class NumberFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public Integer numberValue;
	}

	public class StringFields_Z {
		public String stringValue;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	public class CountrySubdivisionLevel2 {
		public String codeValue;
		public String shortName;
		public String longName;
		public String subdivisionType;
	}

	public class CustomFieldGroup_Z {
		public List<AmountFields_Z> amountFields;
		public List<CodeFields> codeFields;
		public List<DateFields_Z> dateFields;
		public List<DateTimeFields_Z> dateTimeFields;
		public List<IndicatorFields_Z> indicatorFields;
		public List<NumberFields_Z> numberFields;
		public List<PercentFields_Z> percentFields;
		public List<StringFields_Z> stringFields;
		public List<TelephoneFields_Z> telephoneFields;
		public List<AttachmentLink> links;
	}

	public class CommissionRatePercentage {
		public RelationshipTypeCode nameCode;
		public Integer percentageValue;
		public RelationshipTypeCode baseUnitCode;
	}

	public class ProcessMessages_Z {
		public WorkerID processMessageID;
		public RelationshipTypeCode messageTypeCode;
		public String sourceLocationExpression;
		public RelationshipTypeCode expressionLanguageCode;
		public List<AttachmentLink> links;
		public UserMessage userMessage;
		public UserMessage developerMessage;
		public RelationshipTypeCode resourceStatusCode;
	}

	public class RelationshipTypeCode {
		public String codeValue;
		public String shortName;
		public String longName;
	}

	public class References {
		public PersonName personName;
		public RelationshipTypeCode relationshipTypeCode;
		public Communication communication;
	}

	public class OfferTerms {
		public String expectedStartDate;
		public Compensation compensation;
	}

	public class PercentFields {
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public Integer percentValue;
	}

	public class PercentFields_Z {
		public Integer percentValue;
		public RelationshipTypeCode nameCode;
		public RelationshipTypeCode categoryCode;
		public String itemID;
	}

	
