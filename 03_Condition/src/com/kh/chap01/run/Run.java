package com.kh.chap01.run;

import com.kh.chap01.condition.ConditionElse;
import com.kh.chap01.condition.ConditionIf; //*계속확인*
import com.kh.chap01.condition.ConditionSwitch;
import com.kh.chap02.loop.LoopFor;

public class Run {

	public static void main(String[] args) {

		ConditionIf ci = new ConditionIf(); //*계속확인*
		
		// ci.method1();
		// ci.quiz();
		
		ConditionElse ce = new ConditionElse();
		
		// ce.method1();
		// ce.method2();
		// ce.ageCheck();
		
		ConditionSwitch cs = new ConditionSwitch();
		
		// cs.method0();
		// cs.findByName();
		// cs.login();
		
		LoopFor lf = new LoopFor();
		
		// lf.method0();
		// lf.method1();
		lf.method2();
		
	}

}
