package com.ICC.POM;

public class ApprovalLifecycleICC {

	@FindBy(xpath = "(//span[.='Permit Vision'][1]")
    private WebElement permitvision;
    public WebElement getpermitvision()  {
          return permitvision;
    }

	@FindBy(xpath = "(//span[.='Isolation Management']")
    private WebElement isolationmanagement;
    public WebElement getisolationmanagement()  {
          return isolationmanagement;
    }
    @FindBy(xpath = "(//span[.='Request'][1]")
    private WebElement request;
    public WebElement getrequest()  {
          return request;
    }
    @FindBy(xpath = "(//span[.='Permit to Work'])")
    private WebElement permittowork;
    public WebElement getpermittowork()  {
          return permittowork;         
    }
   	@FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[1]")
    private WebElement typelist;
    public WebElement gettypelist()  {
          return typelist;  
    }
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'][1])[2]")
    private WebElement category;
    public WebElement getcategory()  {
          return category;         
    }
    @FindBy(xpath = "(//input[@type='text'][1])[1]")
    private WebElement title;
    public WebElement gettitle()  {
          return title;         
    }
    @FindBy(xpath = "(//textarea[@data-testid='resizable-textarea-input'])")
    private WebElement descriptiondetails;
    public WebElement getdescriptiondetails()  {
          return descriptiondetails;         
    }
    @FindBy(xpath = "(//input[@id='val_LSAInvolved_Yes'])")
    private WebElement workactivityinvolve;
    public WebElement getworkactivityinvolve()  {
          return workactivityinvolve;         
    }
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[1]")
    private WebElement typelist1;
    public WebElement gettypelist1()  {
          return typelist1;         
    }
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[2]")
    private WebElement typelist2;
    public WebElement gettypelist2()  {
          return typelist2;         
    }    		
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[4]")
    private WebElement typelist4;
    public WebElement gettypelist4()  {
          return typelist4;         
    }    		
    @FindBy(xpath = "(//li[@data-value='Critical'])")
    private WebElement critical;
    public WebElement getcritical()  {
          return critical;         
    }
    @FindBy(xpath = "(//li[@data-value='BreakingContainment'])")
    private WebElement breakingcontainment;
    public WebElement getbreakingcontainment()  {
          return breakingcontainment;         
    }
    @FindBy(xpath = "(//span[.='Instrument'])")
    private WebElement instrument;
    public WebElement getinstrument()  {
          return instrument;         
    }
    @FindBy(xpath = "(//div[@class='react-datepicker__day react-datepicker__day--thu'])[4]")
    private WebElement dayselect;
    public WebElement getdayselect()  {
          return dayselect;         
    }
    @FindBy(xpath = "    (//div[@class='react-datepicker__day react-datepicker__day--thu'])[2]")
    private WebElement enddayselect;
    public WebElement getenddayselect()  {
          return enddayselect;         
    }
    @FindBy(xpath = "(//input[@value='LifeSavingActions_BreakingContainment'])")
    private WebElement lifesavingaction;
    public WebElement getlifesavingaction()  {
          return lifesavingaction;         
    }
    @FindBy(xpath = "(//input[@value='SWPDocuments_BreakingContainment'])")
    private WebElement swpchecklist;
    public WebElement getswpchecklist()  {
          return swpchecklist;         
    }
    @FindBy(xpath = "(//input[@type='text'][1])[2]")
    private WebElement startdate;
    public WebElement getstartdate()  {
          return startdate;
    }
    @FindBy(xpath = "(//span[@class='timepicker-cell'][4])[12]")
    private WebElement starttimepicker;
    public WebElement getstarttimepicker()  {
          return starttimepicker;
    }
    @FindBy(xpath = "(//input[@type='text'][1])[3]")
    private WebElement enddate;
    public WebElement getenddate()  {
          return enddate;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-time'][1])")
    private WebElement starttime;
    public WebElement getstarttime()  {
    return starttime;
    }
    @FindBy(xpath = "(//span[.='Select Task Location(s)'])")
    private WebElement tasklocation;
    public WebElement gettasklocation()  {
    return tasklocation;
    }
    @FindBy(xpath = "(//li[@title='CP MOD 103-PT'])")
    private WebElement sitelocation;
    public WebElement getsitelocation()  {
    return sitelocation;
    }
    @FindBy(xpath = "(//li[@title='CP MOD 103 Mezzanines LER-PT'])")
    private WebElement sitelocation2;
    public WebElement getsitelocation2()  {
    return sitelocation2;
    }
    @FindBy(xpath = "(//span[.='Select'])")
    private WebElement buttonselect;
    public WebElement getbuttonselect()  {
    return buttonselect;
    }
    @FindBy(xpath = "(//span[.='Select equipment'])")
    private WebElement selectequipment;
    public WebElement getselectequipment()  {
    return selectequipment;
    }
    @FindBy(xpath = "(//button[@class='eqp-node-expand-btn glyphicon glyphicon-plus'])[1]")
    private WebElement plusclick;
    public WebElement getplusclick()  {
    return plusclick;
    }
    @FindBy(xpath = "(//span[@class='eqp-node-text eqp-node-formatted-text'])[2]")
    private WebElement nodecheck;
    public WebElement getnodecheck()  {
    return nodecheck;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-modal-confirm'])")
    private WebElement clickok;
    public WebElement getclickok()  {
    return clickok;
    }
    @FindBy(xpath = "(//input[@data-testid='numberOfPersonsField'])")
    private WebElement numberofpeople;
    public WebElement getnumberofpeople()  {
    return numberofpeople;
    }
    @FindBy(xpath = "(//input[@id='workOrderNumberField'])")
    private WebElement workordernumber;
    public WebElement getworkordernumber()  {
    return workordernumber;
    }
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn '])")
    private WebElement leaddiscipline;
    public WebElement getleaddiscipline()  {
    return leaddiscipline;
    }
    @FindBy(xpath = "(//input[@name='isolationCertificateRequirement'])[1]")
    private WebElement isolationtype;
    public WebElement getisolationtype()  {
    return isolationtype;
    }
    @FindBy(xpath = "(//span[.='Next'])")
    private WebElement clicknext;
    public WebElement getclicknext()  {
    return clicknext;
    }
    @FindBy(xpath = "(//input[@id='val_JSARequirement_External'])")
    private WebElement jsatype;
    public WebElement getjsatype()  {
    return jsatype;
    }
    @FindBy(xpath = "(//input[@value='PermitPackDocuments_AtmosphericTestRecord'])")
    private WebElement prrmitpackdoc;
    public WebElement getprrmitpackdoc()  {
    return prrmitpackdoc;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary pull-right sign-button sign-button-RequestPermit sign-as-current-user-button']0")
    private WebElement signasloggedin;
    public WebElement getsignasloggedin()  {
    return signasloggedin;
    }
    @FindBy(xpath = "(//span[.='Click here to continue'])")
    private WebElement clickheretocontinue;
    public WebElement getclickheretocontinue()  {
    return clickheretocontinue;
    }
    @FindBy(xpath = "(//span[.='Attachments'])")
    private WebElement attachments;
    public WebElement getattachments()  {
    return attachments;
    }
    @FindBy(xpath = "(//button[@class='btn-link btnAddAttachment file'])")
    private WebElement addtofile;
    public WebElement getaddtofile()  {
    return addtofile;
    }
    @FindBy(xpath = "(//input[@placeholder='Filename'])[1]")
    private WebElement addafilefilename;
    public WebElement getaddafilefilename()  {
          return addafilefilename;
    }
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn '])[1]")
    private WebElement addafiletype;
    public WebElement getaddafiletype()  {
          return addafiletype;
    }
    @FindBy(xpath = "(//span[.='External JSA'])")
    private WebElement ExternalJSA;
    public WebElement getExternalJSA()  {
          return ExternalJSA;
    }
   
    @FindBy(xpath = "(//input[@value='upload'])")
    private WebElement typrofupload;
    public WebElement gettyprofupload()  {
          return typrofupload;
    }
    @FindBy(xpath = "(//span[.='Drag File here.'])")
    private WebElement dragfilehere;
    public WebElement getdragfilehere()  {
          return dragfilehere;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary okButton'])[1]")
    private WebElement addafileok;
    public WebElement getaddafileok()  {
          return addafileok;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement actionpage;
    public WebElement getactionpage()  {
          return actionpage;
    }
    @FindBy(xpath = "(//span[.='Details'])")
    private WebElement details;
    public WebElement getdetails()  {
          return details;
    }
    @FindBy(xpath = "(//button[@id='wizardStep4Button'])")
    private WebElement wizardstep4;
    public WebElement getwizardstep4()  {
          return wizardstep4;
    }

    @FindBy(xpath = "(//span[.='Review Permit by AA/AAF'])")
    private WebElement reviewpermitbyaaaaf;
    public WebElement getreviewpermitbyaaaaf()  {
          return reviewpermitbyaaaaf;
    }
    @FindBy(xpath = "(//span[.='Review Permit by AA/AAF'])")
    private WebElement reviewpermitbyaaaf;
    public WebElement getreviewpermitbyaaaf()  {
          return reviewpermitbyaaaf;
    }
    
    
    @FindBy(xpath = "(//span[.='Sign as logged in'])")
    private WebElement aaaafsignasloggedin;
    public WebElement getaaaafsignasloggedin()  {
          return aaaafsignasloggedin;
    }
    @FindBy(xpath = "(//span[.='Click here to continue'])")
    private WebElement aaaafclickheretocontinue;
    public WebElement getaaaafclickheretocontinue()  {
          return aaaafclickheretocontinue;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement headerimagevalidation;
    public WebElement getheaderimagevalidation()  {
          return headerimagevalidation;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement picactionpage;
    public WebElement getpicactionpage()  {
          return picactionpage;
    }
    @FindBy(xpath = "(//span[.='Endorse Permit by PIC'])")
    private WebElement endorsepermitbypic;
    public WebElement getendorsepermitbypic()  {
          return endorsepermitbypic;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])")
    private WebElement picsignasloggedin;
    public WebElement getpicsignasloggedin()  {
          return picsignasloggedin;
    }
    @FindBy(xpath = "(//span[.='Click here to continue'])")
    private WebElement picclickheretocontinue;
    public WebElement getpicclickheretocontinue()  {
          return picclickheretocontinue;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement imgevalidation;
    public WebElement getimgevalidation()  {
          return imgevalidation;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement aaactionpage;
    public WebElement getaaactionpage()  {
          return aaactionpage;
    }
    @FindBy(xpath = "(//span[.='Authorize Permit by AA'])")
    private WebElement authorizepermitbyaa;
    public WebElement getauthorizepermitbyaa()  {
          return authorizepermitbyaa;
    }
    @FindBy(xpath = "(//span[.='An ICC or RFIC must be attached before proceeding.'])")
    private WebElement beforeproceeding;
    public WebElement getbeforeproceeding()  {
          return beforeproceeding;
    }
    @FindBy(xpath = "(//span[.='Attachments'])")
    private WebElement aaattachments;
    public WebElement getaaattachments()  {
    return aaattachments;
    }    
    @FindBy(xpath = "(//button[@class='btn-link btnAddAttachment isolationCertificate'])")
    private WebElement addisolationCertificate;
    public WebElement getaddisolationCertificate()  {
          return addisolationCertificate;
    }
    @FindBy(xpath = "(//li[@class='certificates-list-item'])[1]")
    private WebElement certificatesitem;
    public WebElement getcertificatesitem()  {
          return certificatesitem;
    }
    @FindBy(xpath = "(//div[@class='menu-btn-icon icon-attachments-isolation-new'])")
    private WebElement newisolation;
    public WebElement getnewisolation()  {
          return newisolation;
    }
    @FindBy(xpath = "(//span[.='New Isolation Certificate'])")
    private WebElement newisolation;
    public WebElement getnewisolation()  {
          return newisolation;
    }
    @FindBy(xpath = "(//button[@id='closeCertificateButton'])")
    private WebElement newisolationcloseCertificate;
    public WebElement getnewisolationcloseCertificate()  {
          return newisolationcloseCertificate;
    }
    @FindBy(xpath = "closeCertificateyes")
    private WebElement closeCertificateyes;
    public WebElement getcloseCertificateyes()  {
          return closeCertificateyes;
    }
    @FindBy(xpath = "(//div[@class='menu-btn-icon icon-attachments-isolation-existing'])")
    private WebElement isolationexisting;
    public WebElement getisolationexisting()  {
          return isolationexisting;
    }
    @FindBy(xpath = "(//li[@class='certificates-list-item'])[2]")
    private WebElement existingcertificates;
    public WebElement getexistingcertificates()  {
          return existingcertificates;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])")
    private WebElement authorizepermitbyaasignaslogin;
    public WebElement getauthorizepermitbyaasignaslogin()  {
          return authorizepermitbyaasignaslogin;
    }
    @FindBy(xpath = "(//span[.='Issue Permit by AO'])")
    private WebElement issuepermitbyao;
    public WebElement getissuepermitbyao()  {
          return issuepermitbyao;
    }
    @FindBy(xpath = "(//li[@class='validation-error validation-error-Rule_AttachedCertificateMustHaveCorrectState'])[1]")
    private WebElement errormessageiccnotrequired;
    public WebElement geterrormessageiccnotrequired()  {
          return errormessageiccnotrequired;
    }
    @FindBy(xpath = "(//span[@class='openCertificateAttachment'])")
    private WebElement openiccanotherwindow;
    public WebElement getopeniccanotherwindow()  {
          return openiccanotherwindow;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement openwindowactionpage;
    public WebElement getopenwindowactionpage()  {
          return openwindowactionpage;
    }
    @FindBy(xpath = "(//button[@id='closeCertificateButton'])")
    private WebElement openiccwindowclose;
    public WebElement getopeniccwindowclose()  {
          return openiccwindowclose;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary pull-right sign-button sign-button-AcceptPermit'])")
    private WebElement issuepermitaosign;
    public WebElement getissuepermitaosign()  {
          return issuepermitaosign;
    }
    @FindBy(xpath = "(//span[.='Isolation in Progress'])")
    private WebElement isolationinProgress;
    public WebElement getisolationinProgress()  {
          return isolationinProgress;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-refresh'])")
    private WebElement isolationrefresh;
    public WebElement getisolationrefresh()  {
          return isolationrefresh;
    }
    @FindBy(xpath = "(//input[@class='form-control'])")
    private WebElement datefrom;
    public WebElement getdatefrom()  {
          return datefrom;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-time'])")
    private WebElement timefrom;
    public WebElement gettimefrom()  {
          return timefrom;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement Iimage;
    public WebElement getIimage()  {
          return Iimage;
    }
    @FindBy(xpath = "(//span[.='Verify Plan by AA/AAF'])")
    private WebElement verifyplanbyAAAAF;
    public WebElement getverifyplanbyAAAAF()  {
          return verifyplanbyAAAAF;
    }
    @FindBy(xpath = "(//span[.='Perform Isolation by AA/AO'])")
    private WebElement performisolationbyaaao;
    public WebElement getperformisolationbyaaao()  {
          return performisolationbyaaao;
    }
    @FindBy(xpath = "(//span[.='Confirm Isolation by AO'])")
    private WebElement confirmisolationbyao;
    public WebElement getconfirmisolationbyao()  {
          return confirmisolationbyao;
    }    
    @FindBy(xpath = "(//span[.='Accept Permit by PH'])")
    private WebElement acceptpermitbyph;
    public WebElement getacceptpermitbyph()  {
          return acceptpermitbyph;
    }
    @FindBy(xpath = "(//span[.='Sign'])[1]")
    private WebElement phsign;
    public WebElement getphsign()  {
          return phsign;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])[1]")
    private WebElement phsignasloggedin;
    public WebElement getphsignasloggedin()  {
          return phsignasloggedin;
    }
    @FindBy(xpath = "(//span[.='Suspend / Suspend for Test by AA/AAF/AO/PH'])")
    private WebElement suspendtestAAAAFAOPH;
    public WebElement getsuspendtestAAAAFAOPH()  {
          return suspendtestAAAAFAOPH;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])[1]")
    private WebElement phsignasloggedin;
    public WebElement getphsignasloggedin()  {
          return phsignasloggedin;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement Simage;
    public WebElement getSimage()  {
          return Simage;
    }
    @FindBy(xpath = "(//span[.='Amend Isolation by IA/AO'])")
    private WebElement ameendisolationbyiaao;
    public WebElement getameendisolationbyiaao()  {
          return ameendisolationbyiaao;
    }
    
    @FindBy(xpath = "(//textarea[@id='remarksfield'])[1]")
    private WebElement remarksfield;
    public WebElement getremarksfield()  {
          return remarksfield;
    }
    @FindBy(xpath = "(//button[@id='printCertificateButton'])[1]")
    private WebElement print;
    public WebElement getprint()  {
          return print;
    }
    @FindBy(xpath = "(//button[@id='printCertificateButton'])[1]")
    private WebElement print;
    public WebElement getprint()  {
          return print;
    }
    @FindBy(xpath = "(//span[.='Reauthorize Permit by AA'])")
    private WebElement permitbyaa;
    public WebElement getpermitbyaa()  {
          return permitbyaa;
    }
    @FindBy(xpath = "(//span[.='Perform De-isolation by AA/AO'])")
    private WebElement deisolationbyaaao;
    public WebElement getdeisolationbyaaao()  {
          return deisolationbyaaao;
    }
    @FindBy(xpath = "(//input[@type='checkbox'])")
    private WebElement allcheckbox;
    public WebElement getallcheckbox()  {
          return allcheckbox;
    }
    @FindBy(xpath = "(//span[.='Attached to certificate(s) in incorrect state.'])")
    private WebElement errormessaged;
    public WebElement geterrormessaged()  {
          return errormessaged;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-remove'])")
    private WebElement closepopup;
    public WebElement getclosepopup()  {
          return closepopup;
    }
    @FindBy(xpath = "(//span[.='Job Complete / Incomplete by PH/AO'])")
    private WebElement jobcompletephao;
    public WebElement getjobcompletephao()  {
          return jobcompletephao;
    }
    @FindBy(xpath = "(//input[@id='val_WorkStatusField_JobComplete'])")
    private WebElement WorkStatusField;
    public WebElement getWorkStatusField()  {
          return WorkStatusField;
    }
    @FindBy(xpath = "(//span[.='PTW Complete by AO'])")
    private WebElement ptwcompletebyao;
    public WebElement getptwcompletebyao()  {
          return ptwcompletebyao;
    }
    @FindBy(xpath = "(//li[@class='validation-error validation-error-Rule_AttachedCertificateMustHaveCorrectState']")
    private WebElement ptwcompletebyaoerror;
    public WebElement getptwcompletebyaoerror()  {
          return ptwcompletebyaoerror;
    }
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement checkboxdeiso;
    public WebElement getcheckboxdeiso()  {
          return checkboxdeiso;
    }
    @FindBy(xpath = "(//span[.='Update Point Position by IA'])")
    private WebElement updatepointia;
    public WebElement getupdatepointia()  {
          return updatepointia;
    }
    @FindBy(xpath = "(//input[@class='form-control'])[1])")
    private WebElement lockno;
    public WebElement getlockno()  {
          return lockno;
    }
    @FindBy(xpath = "(//input[@class='form-control'])[1])")
    private WebElement lockno1;
    public WebElement getlockno1()  {
          return lockno1;
    }
    @FindBy(xpath = "(//span[.='Confirm De-isolation by AO'])")
    private WebElement confirmdeisolationbyao;
    public WebElement getconfirmdeisolationbyao()  {
          return confirmdeisolationbyao;
    }
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private WebElement radiodeisobyao;
    public WebElement getradiodeisobyao()  {
          return radiodeisobyao;
    }
    @FindBy(xpath = "(//button[@class='btn btn-link'])")
    private WebElement refresh;
    public WebElement getrefresh()  {
          return refresh;
    }
    @FindBy(xpath = "(//span[.='PTW Complete by AO'])")
    private WebElement ptwcompletedbyao;
    public WebElement getptwcompletedbyao()  {
          return ptwcompletedbyao;
    }
    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement radioyes;
    public WebElement getradiodeisobyao()  {
          return radioyes;
    }

}
