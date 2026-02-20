package com.nit.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		return "BlueDart courier is ready to deliver " + oid + " order number product";
	}

}
