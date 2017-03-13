package config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.tool.consultants.model.Consultant;

@Configuration
public class ExcelFileToDatabaseJobConfig {

	@Bean
    ItemReader<Consultant> excelReader() {
        PoiItemReader<Consultant> reader = new PoiItemReader<>();
        reader.setResource(new ClassPathResource("data/consultants.xlsx"));
        reader.setRowMapper(excelRowMapper());
        return reader;
    }
	
	private RowMapper<Consultant> excelRowMapper() {
        return new ConsultantExcelRowMapper();
    }
}
