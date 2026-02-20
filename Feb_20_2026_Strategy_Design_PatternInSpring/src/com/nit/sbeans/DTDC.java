package com.nit.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public class DTDC implements ICourier {

	@Override
	public String deliver(int oid) {
		return "DTDC courier is ready to deliver " + oid + " order number product";
	}

}
