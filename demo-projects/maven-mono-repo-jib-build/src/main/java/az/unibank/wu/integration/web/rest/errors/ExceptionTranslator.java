package az.unibank.wu.integration.web.rest.errors;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
@RestController
public class ExceptionTranslator extends DefaultErrorAttributes {

    @ExceptionHandler(WesternUnionResponseFaultException.class)
    public ResponseEntity<Map<String, Object>> handleSoapException(WesternUnionResponseFaultException ex,
                                                                   WebRequest request) {
        return ofType(request, HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, Object>> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
                                                                            WebRequest request) {
        return ofType(request, HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public final ResponseEntity<Map<String, Object>> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException ex,
            WebRequest request) {
        ObjectError fieldError = ex.getBindingResult().getAllErrors().get(0);
        String message = String.format("%s : %s", getFieldName(fieldError), fieldError.getDefaultMessage());
        return ofType(request, HttpStatus.BAD_REQUEST, message);
    }

    @ExceptionHandler(BindException.class)
    public final ResponseEntity<Map<String, Object>> handleMethodArgumentNotValidException(
            BindException ex,
            WebRequest request) {
        ObjectError fieldError = ex.getBindingResult().getAllErrors().get(0);
        String message = String.format("%s : %s", getFieldName(fieldError), fieldError.getDefaultMessage());
        return ofType(request, HttpStatus.BAD_REQUEST, message);
    }

    @ExceptionHandler(IsoCountryNotFound.class)
    public final ResponseEntity<Map<String, Object>> handleException(
            IsoCountryNotFound ex,
            WebRequest request) {
        String message = ex.getMessage();
        return ofType(request, HttpStatus.BAD_REQUEST, message);
    }

    @ExceptionHandler(MexicoStateNotFoundException.class)
    public final ResponseEntity<Map<String, Object>> handleException(
            MexicoStateNotFoundException ex,
            WebRequest request) {
        String message = ex.getMessage();
        return ofType(request, HttpStatus.BAD_REQUEST, message);
    }

    @ExceptionHandler(USStateNotFoundException.class)
    public final ResponseEntity<Map<String, Object>> handleException(
            USStateNotFoundException ex,
            WebRequest request) {
        String message = ex.getMessage();
        return ofType(request, HttpStatus.BAD_REQUEST, message);
    }

    @ExceptionHandler(IllegalCustomerNameException.class)
    public final ResponseEntity<Map<String, Object>> handleException(
            IllegalCustomerNameException ex,
            WebRequest request) {
        String message = ex.getMessage();
        return ofType(request, HttpStatus.BAD_REQUEST, message);
    }

    @ExceptionHandler(InvalidPromocodeException.class)
    public final ResponseEntity<Map<String, Object>> handleException(
            InvalidPromocodeException ex,
            WebRequest request) {
        String message = ex.getMessage();
        return ofType(request, HttpStatus.valueOf(ex.getErrorCode()), message);
    }

    private String getFieldName(ObjectError fieldError) {
        if (fieldError.getArguments() != null && fieldError.getArguments().length != 0) {
            DefaultMessageSourceResolvable argument = (DefaultMessageSourceResolvable) fieldError.getArguments()[0];
            return argument.getDefaultMessage();
        }
        return null;
    }


    private ResponseEntity<Map<String, Object>> ofType(WebRequest request, HttpStatus status, String message) {
        Map<String, Object> attributes = getErrorAttributes(request, ErrorAttributeOptions.defaults());
        attributes.put("status", status.value());
        attributes.put("message", message);
        attributes.put("error", status.getReasonPhrase());
        attributes.put("path", ((ServletWebRequest) request).getRequest().getRequestURI());

        Map<String, Object> subAttributes = new HashMap<>();
        Map<String, Object> exceptionDetails = new HashMap<>();
        exceptionDetails.put("message", message);
        exceptionDetails.put("code", status.value());
        subAttributes.put("error", exceptionDetails);
        attributes.put("data", subAttributes);
        return new ResponseEntity<>(attributes, status);
    }

    private String getConstraintViolationExceptionMessage(ConstraintViolationException ex) {
        return ex.getConstraintViolations()
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toList()).get(0);
    }


}
