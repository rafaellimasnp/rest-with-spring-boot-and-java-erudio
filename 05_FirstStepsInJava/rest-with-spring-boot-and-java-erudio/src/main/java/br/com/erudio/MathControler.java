package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.util;

@RestController
public class MathControler {

	private final AtomicLong counter = new AtomicLong();
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)

	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)  {
		

		if (!util.isNumeric(numberOne) || !util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value !");
		}

		return Operacoes.sum(util.convertToDouble(numberOne), util.convertToDouble(numberTwo));

	}
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	
	public Double sub(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)  {
		
		
		if (!util.isNumeric(numberOne) || !util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value !");
		}
		
		return Operacoes.sub(util.convertToDouble(numberOne), util.convertToDouble(numberTwo));
		
	}
	
	
@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo)  {
		
		
		if (!util.isNumeric(numberOne) || !util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value !");
		}
		
		return Operacoes.mult(util.convertToDouble(numberOne), util.convertToDouble(numberTwo));
		
	}


	

}
