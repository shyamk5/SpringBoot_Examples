package in.shyam.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {
	
	private String errCode;
	private String errMsg;
	private LocalDateTime errOccursAt;
	
}
