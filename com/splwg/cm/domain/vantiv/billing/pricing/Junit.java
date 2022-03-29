package junit.com.splwg.cm.domain.vantiv.billing.pricing;

import java.util.Properties;
import com.splwg.base.api.batch.SubmissionParameters;
import com.splwg.base.api.testers.BatchJobTestCase;
import com.splwg.base.domain.batch.batchControl.BatchControl_Id;
import com.splwg.base.domain.batch.batchRun.BatchRun;
import com.splwg.base.support.sql.FunctionReplacerHelper;
public class CmUPCBulkUploadPricingTEST extends BatchJobTestCase {
	
	  
	@Override
	protected SubmissionParameters setupRun(SubmissionParameters arg0) {  
		FunctionReplacerHelper.enableNoDBSpecificFunctionValidation(Boolean.FALSE);
				BatchControl_Id batchCtlId= new BatchControl_Id("CMBLUPLP");				
				arg0.setBatchControlId(batchCtlId);			
				Properties pr= new Properties();
				pr.setProperty("BATCH_NAME", "BULK_UPLD_MID_PRICING_20220328103832061655");//add batchname corresponding to test data created in DEV3
				pr.setProperty("DIVISION", "NPC");
				pr.setProperty("DIST-THD-POOL", "Ksh");
				pr.setProperty("uploadType", "MIDPRICEPROD");
				arg0.setExtraParameters(pr);	
		return arg0;
	}

	@Override
	protected void validateResults(BatchRun arg0) {
				
	}
}
