package main;

import javax.jws.WebService;

@WebService(targetNamespace = "http://main/", portName = "SubstractionPort", serviceName = "SubstractionService")
public class Substraction {
	public int substract(int x, int y)
	{
		return x-y;
	}

}
