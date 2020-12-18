//Nickolaus Lunz N01027509
package lab4;
public class FileLog implements LogInterface{
	FileLogger logger;
	@Override
	public boolean LogMessage(String msg) {
		if(msg == "some html"){
			logger = new HTMLFileLogger();
			logger.log(msg);
			return true;
		}else if (msg == "encrypt this"){
			logger = new EncFileLogger();
			logger.log(msg);
			return true;
		}else{
			return false;
		}
	}
}