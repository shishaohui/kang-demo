package kang.demo.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 日期时间常用展示
 * 常用和不常用两个
 * 不常用的两个看看即可知道能做这些事情
 */
public class DateTimeTest {

	public static void main(String[] args) {
		DateTimeTest dateTimeTest = new DateTimeTest();
		dateTimeTest.commonUse();
		dateTimeTest.unCommonUse();
	}

	/**
	 * 日期的几种常用方法
	 * 获取当前日期
	 * 日期的加减
	 * 日期的前后比较
	 */
	private void commonUse() {
		//当前时间
		LocalDate localDate = LocalDate.now();
		System.out.println("当前时间(yyyy-mm-dd)" + localDate);

		LocalDate plusDays = localDate.plusDays(2);
		System.out.println("当前日期加2天"+ plusDays);

		LocalDate minusDays = localDate.minusDays(3);
		System.out.println("当前日期减3天"+ minusDays);

		System.out.println("判断两个日期的前后,plusDays在minusDays之前为"+plusDays.isBefore(minusDays));
		System.out.println("判断两个日期的前后,plusDays在minusDays之后为"+plusDays.isAfter(minusDays));

		System.out.println("两个日期时间的间隔"+ (plusDays.toEpochDay()-minusDays.toEpochDay()));
		System.out.println("两个日期时间的间隔"+ (plusDays.until(minusDays, ChronoUnit.DAYS)));

		/**
		 * LocalDateTime 和 LocalDate方法几乎相同 只是时间格式不同
		 * 有获取时分秒的方法  敲get可以自己看看
		 */
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("当前时间为" + dateTime);
		System.out.println("yyyy-mm-dd HH:mm:ss 格式化日期"+dateTime.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss")));
	}

	/**
	 * 不是很常用的 对localDate .下看看有很多方法的
	 * 有时间可以了解，实际开发中遇到特殊需求再查看也行
	 */
	private void unCommonUse(){
		//当前时间
		LocalDate localDate = LocalDate.now();
		//年
		localDate.getYear();
		//月
		localDate.getMonthValue();
		//日(当年的第几天)
		localDate.getDayOfYear();
		//当月的第几天
		localDate.getDayOfMonth();

		System.out.println("当前时间(yyyy-mm-dd)" + localDate);
		LocalDate plusDays = localDate.plusDays(20);
		LocalDate minusDays = localDate.minusDays(30);

		/**
		 * LocalDate 计算时间间隔
		 */
		System.out.println("两个日期时间的间隔 天"+ (plusDays.toEpochDay()-minusDays.toEpochDay()));
		System.out.println("两个日期时间的间隔 天"+ (plusDays.until(minusDays, ChronoUnit.DAYS)));

		LocalDateTime dateTime = LocalDateTime.now();
		//时间的加减可以加分钟、秒、小时都有对应方法
		LocalDateTime plusMinutesDateTIme = dateTime.plusMinutes(36000);

		//Duration计算两个localDateTime相差多少天、秒、小时等等
		long days = Duration.between(plusMinutesDateTIme, dateTime).toDays();
		System.out.println(String.format("String.format使用 %s和%s相差%d",dateTime.toString(),dateTime.plusMinutes(36000).toString(),days));
		System.out.println(dateTime.plusMinutes(36000)+"和"+dateTime+"相差"+ days);
	}
}
