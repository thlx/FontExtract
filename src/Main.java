import java.io.File;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int argLength = args.length;
		if(argLength!=1){
			System.out.println("�������������������Ҫ��ȡ���ı�·���б�");
			System.exit(0);
		}

		String fileListString =args[0];
		File file = new File(fileListString);
		if(!file.exists()){
			System.out.println("�ı�·���б�����"+file.toString());
			System.exit(0);
		}
		if(!file.isFile()){
			System.out.println("�ı�·���б����ļ�"+file.toString());
			System.exit(0);
		}
		
		
		StringBuffer strBuf = new StringBuffer();
		List<String> filePathList =ExtractionOperationUtil.ExtractStringListFromFile(file);
		for(String filePath :filePathList)
		{
			File f = new File(filePath);	
			if(!f.exists() ||!f.isFile()){
				System.out.println("�ı������ڻ�����Ч"+f.toString());
				continue;
			}
			strBuf.append(ExtractionOperationUtil.ExtractStringFromFile(f));
		}
		
		ExtractResult result =ExtractionOperationUtil.ExtractUnrepeatedWordsFromString(strBuf.toString());
		ExtractionOperationUtil.WriteStr2File(result.chineseCharString,new File(System.getProperty("user.dir")+"\\ChineseOutPut.txt"),"UTF-8");
		ExtractionOperationUtil.WriteStr2File(result.unChineseCharString,new File(System.getProperty("user.dir")+"\\unChineseOutPut.txt"),"UTF-8");
		
		System.out.println("��ȡ���");
//		ExtractResult result =ExtractionOperationUtil.ExtractUnrepeatedWordsFromString("��������");
//		System.out.println("��ȡ���");
		
	}
}



