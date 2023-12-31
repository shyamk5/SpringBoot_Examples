package in.shyam.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e) {
		
		String errMsg = e.getMessage();
		
		ErrorInfo err = new ErrorInfo();
		err.setErrMsg(errMsg);
		err.setErrCode("Err0001");
		err.setErrOccursAt(LocalDateTime.now());
		
		
		return new ResponseEntity<>(err,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUserException(UserNotFoundException e) {
		
		String errMsg = e.getMessage();
		
		ErrorInfo err = new ErrorInfo();
		err.setErrMsg(errMsg);
		err.setErrCode("Err0002");
		err.setErrOccursAt(LocalDateTime.now());
		
		
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	
}
