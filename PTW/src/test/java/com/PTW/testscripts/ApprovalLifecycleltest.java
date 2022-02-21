package com.PTW.testscripts;

public class ApprovalLifecycleltest {
	public void testApproval{
		ApprovalLifecycleICC alicc = new ApprovalLifecycleICC{driver};
		SoftAssert sat = new SoftAssert();
		Select select = new Select(WebElement webelement)
		Thread.sleep(2000);
		alicc.getpermitvision().Click();
		alicc.getpermittowork().Click();
		
		alicc.gettypelist1().Click();
		alicc.getcritical().Click();
		alicc.gettypelist2().Click();
		alicc.getbreakingcontainment().Click();
		alicc.gettitle().sendKeys("QA TEST Containment");
		alicc.getdescriptiondetails().sendKeys("QA TEST 534");
		alicc.getworkactivityinvolve().Click();
		alicc.getlifesavingaction().Click();
		alicc.getswpchecklist().Click();
		alicc.gettypelist3().Click();
		alicc.getstartdate().Click();
		alicc.getdayselect().Click();
		alicc.getenddate().Click();
		alicc.getenddayselect().Click();
		alicc.getstartdate().Click();
		alicc.getstarttimepicker().Click();
		alicc.gettasklocation().Click();
		alicc.getsitelocation().Click();
		alicc.getsitelocation2().Click();
		alicc.getbuttonselect().Click();
		alicc.getselectequipment().Click();
		alicc.getplusclick().Click();
		alicc.getnodecheck().Click();
		alicc.getclickok().Click();
		alicc.getnumberofpeople().sendKeys("2");
		alicc.getworkordernumber().sendKeys("WSO 34552");
		alicc.gettypelist4().Click();
		alicc.getinstrument().Click();
		alicc.getisolationtype().Click();
		alicc.getclicknext().Click();
		Thread.sleep(2000);
		alicc.getjsatype().Click();
		alicc.getprrmitpackdoc().Click();
		alicc.getsignasloggedin().Click();
		alicc.getclickheretocontinue().Click();
		Thread.sleep(2000);
		alicc.getattachments().Click();
		Thread.sleep(2000);
		alicc.getaddtofile().Click();
		alicc.getaddafilefilename().sendKeys("External JSA");
		alicc.getaddafiletype().Click();
		alicc.getExternalJSA().Click();
		alicc.gettyprofupload().Click();
		
		Thread.sleep(2000);
		alicc.getdragfilehere().Click();
		alicc.getaddafileok().Click();
		Thread.sleep(2000);
		alicc.getactionpage().Click();
		alicc.getreviewpermitbyaaaaf().Click();
		alicc.getaaaafsignasloggedin().Click();
		alicc.getclickheretocontinue().Click();
		
		Thread.sleep(2000);
		alicc.getheaderimagevalidation().Click();
		
		Thread.sleep(2000);
		alicc.getactionpage().Click();
		alicc.getendorsepermitbypic().Click();
		alicc.getpicsignasloggedin().Click();
		alicc.getclickheretocontinue().Click();
		Thread.sleep(2000);
		alicc.getimgevalidation().Click();
		
		alicc.getactionpage().Click();
		alicc.getauthorizepermitbyaa().Click();
		
		alicc.getbeforeproceeding().Click();
		Thread.sleep(2000);
		alicc.getimgevalidation().Click();
		
		alicc.getaaattachments().Click();
		/*alicc.getaddisolationCertificate().Click();
		alicc.getnewisolation().Click();
		
		alicc.getnewisolation().Click();
		
		alicc.getnewisolationcloseCertificate().Click();
		alicc.getcloseCertificateyes().Click();*/
		
		alicc.getaddisolationCertificate().Click();
		alicc.getisolationexisting().Click();
		
		alicc.getexistingcertificates().Click();

		alicc.getactionpage().Click();
		alicc.getissuepermitbyao().Click();
		
		alicc.geterrormessageiccnotrequired().Click();
				
		alicc.getaaattachments().Click();
		Thread.sleep(2000);
		alicc.getopeniccanotherwindow().Click();
		
		alicc.getopenwindowactionpage().Click();
		Thread.sleep(2000);
		alicc.getverifyplanbyAAAAF().Click();
		alicc.getpicsignasloggedin().Click();
		
		Thread.sleep(2000);
		alicc.getactionpage().Click();
		alicc.getperformisolationbyaaao().Click();
		
		Thread.sleep(2000);
		alicc.getallcheckbox().Click();
		alicc.getphsignasloggedin().Click();
		
		Thread.sleep(2000);
		alicc.getupdatepointia().Click();
		alicc.getallcheckbox().Click();
		alicc.getlockno().sendKeys("1");
		alicc.getlockno1().sendKeys("2");
		alicc.getphsignasloggedin().Click();
		Thread.sleep(2000);
		
		alicc.getconfirmisolationbyao().Click();
		
		alicc.getradiodeisobyao().Click();
		alicc.getphsignasloggedin().Click();
		Thread.sleep(2000);
		/* errpr validation and close the windows*/
		
		
		alicc.getdetails().Click();
		alicc.getwizardstep4().Click();
		
		/* add LL3 test*/
		alicc.getactionpage().Click();
		alicc.getconfirmisolationbyao().Click();
		alicc.getallcheckbox().Click();
		alicc.getphsignasloggedin().Click();
		/* Add save */
		Thread.sleep(2000);
		alicc.getclosepopup().Click();
		alicc.getisolationrefresh().Click();
		Thread.sleep(2000);
		
		alicc.getactionpage().Click();
		alicc.getissuepermitbyao().Click();
		alicc.getissuepermitaosign().Click();
		Thread.sleep(2000);
		
		alicc.getdatefrom().sendKeys("02/20/2022");
		
		/* if need add time */
		
		alicc.getphsignasloggedin().Click();
		alicc.getclickheretocontinue().Click();
		Thread.sleep(2000);
		alicc.getimgevalidation().Click();
		
		alicc.getactionpage().Click();
		
		alicc.getacceptpermitbyph().Click();
		alicc.getphsign().Click();
		
		alicc.getphsignasloggedin().Click();
		Thread.sleep(2000);
		alicc.getclickheretocontinue().Click();
		Thread.sleep(2000);
		
		alicc.getimgevalidation().Click();
		
		alicc.getactionpage().Click();		
		alicc.getjobcompletephao().Click();
		alicc.getWorkStatusField().Click();
		/* doubt*/
		alicc.getphsign().Click();
		alicc.getradiodeisobyao().Click();
		alicc.getphsignasloggedin().Click();
		
		Thread.sleep(2000);
        alicc.getclickheretocontinue().Click();
		
		alicc.getimgevalidation().Click();
		
		alicc.getactionpage().Click();
		alicc.getptwcompletebyao().Click();
		
		alicc.getptwcompletebyaoerror().Click();/* validation error message */
		Thread.sleep(2000);
		
		alicc.getaaattachments().Click();
		alicc.getopeniccanotherwindow().Click();		
		
		/* new window */
		
		alicc.getactionpage().Click();
		alicc.getperformisolationbyaaao().Click();		
		alicc.getallcheckbox().Click();
		alicc.getphsignasloggedin().Click();
		Thread.sleep(2000);
		
		alicc.getupdatepointia().Click();
		alicc.getallcheckbox().Click();
		alicc.getphsignasloggedin().Click();
		
		alicc.getconfirmdeisolationbyao().Click();
		alicc.getradiodeisobyao().Click();
		alicc.getphsignasloggedin().Click();
	
		alicc.getnewisolationcloseCertificate().Click();
		Thread.sleep(2000);
		
		alicc.getrefresh().Click();
		alicc.getactionpage().Click();
		
		alicc.getptwcompletedbyao().Click();
		
		
		alicc.getradiodeisobyao().Click();
		alicc.getphsign().Click();/* yet to check this */
		alicc.getradiodeisobyao().Click();
		alicc.getphsignasloggedin().Click();
		
		Thread.sleep(2000);
		alicc.getimgevalidation().Click();
		
		
		
		
	}
	
}
