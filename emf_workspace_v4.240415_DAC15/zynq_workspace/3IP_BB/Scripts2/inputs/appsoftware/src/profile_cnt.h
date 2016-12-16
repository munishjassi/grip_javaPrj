/*
 * profile_cnt.h
 *
 *  Created on: Sep 9, 2013
 *      Author: ga73koz
 */

#ifndef PROFILE_CNT_H_
#define PROFILE_CNT_H_

/* Cycle profiling related functions
 */
static inline void EnablePerfCounters()
{
	/* enable user-mode access to the performance counter*/
	  asm ("MCR p15, 0, %0, C9, C14, 0\n\t" :: "r"(1));

	  /* disable counter overflow interrupts (just in case)*/
	  asm ("MCR p15, 0, %0, C9, C14, 2\n\t" :: "r"(0x8000000f));
}

static inline unsigned int get_cyclecount (void)
{
 unsigned int value;
 // Read CCNT Register
 asm volatile ("MRC p15, 0, %0, c9, c13, 0\t\n": "=r"(value));
 return value;
}

static inline void init_perfcounters (unsigned long do_reset, unsigned long enable_divider)
{
 // in general enable all counters (including cycle counter)
	unsigned long value = 1;

 // perform reset:
 if (do_reset)
 {
   value |= 2;     // reset all counters to zero.
   value |= 4;     // reset cycle counter to zero.
 }

 if (enable_divider)
   value |= 8;     // enable "by 64" divider for CCNT.

 value |= 16;

 // program the performance-counter control-register:
 asm volatile ("MCR p15, 0, %0, c9, c12, 0\t\n" :: "r"(value));

 // enable all counters:
 asm volatile ("MCR p15, 0, %0, c9, c12, 1\t\n" :: "r"(0x8000000f));

 // clear overflows:
 asm volatile ("MCR p15, 0, %0, c9, c12, 3\t\n" :: "r"(0x8000000f));
}
#endif /* PROFILE_CNT_H_ */
