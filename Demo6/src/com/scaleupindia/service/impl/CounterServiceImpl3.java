package com.scaleupindia.service.impl;

import java.util.concurrent.locks.Lock;

import com.scaleupindia.service.CounterService;

/**
 * @author abhishekvermaa10
 *
 */
public class CounterServiceImpl3 implements CounterService {
	private int count;
	private Lock lock;

	public CounterServiceImpl3(Lock lock) {
		super();
		this.lock = lock;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void incrementCount() {
		lock.lock();
		++count;
		lock.unlock();
	}
}
