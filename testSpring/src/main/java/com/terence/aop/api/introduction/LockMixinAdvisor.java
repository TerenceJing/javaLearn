package com.terence.aop.api.introduction;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class LockMixinAdvisor extends DefaultIntroductionAdvisor {
	private static final long serialVersionUID=-4561987365465646L;

	public LockMixinAdvisor() {
		super(new LockMixin(),Lockable.class);
	}

}
