package config;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.tool.consultants.model.Consultant;

public class ConsultantExcelRowMapper implements RowMapper<Consultant> {

	@Override
	public Consultant mapRow(RowSet rs) throws Exception {
		Consultant consultant = new Consultant();
		consultant.setConsultantName(rs.getColumnValue(0));
		consultant.setMonth(rs.getColumnValue(1));
		consultant.setAmount(rs.getColumnValue(2));
		return consultant;
	}

}
