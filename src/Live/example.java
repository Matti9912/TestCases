package Live;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example {	
	public void Excel() throws Throwable
	{FileInputStream fis=new FileInputStream("C:\\selenium\\Book12.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet2");
		int lastrow=sh.getLastRowNum();
		System.out.println(lastrow);
		DataFormatter df=new DataFormatter();
		for(int i=0;i<=lastrow;i++)
		{ Row r= sh.getRow(i);
			int lastcell= r.getLastCellNum();
			for(int j=0;j<=lastcell;j++)
			{
			String bh=df.formatCellValue(r.getCell(j));
			System.out.print(" "+bh);
		    }
			System.out.println( );
		}
		
	}
	       public static void main(String[] args) throws Throwable {
			
			example e= new example();
			e.Excel();
			
	}
		}
	
	
	
	
	

