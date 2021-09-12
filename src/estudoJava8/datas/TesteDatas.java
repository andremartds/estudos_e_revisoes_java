package estudoJava8.datas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TesteDatas {

	// LocalDateTime

	// LocalDate

	// LocalTime

	public static void main(String[] args) {
		
		// pega o exato instante
		Instant agora = Instant.now();
		System.out.println("agora é o Instante: " + agora);
		System.out.println("******************CLASSE INSTANTE**************************************");

		/**
		 * Para medir a duração entre determinado tempo como por exemplo a
		 * execução de algum algorítimo utilizamos a classe Duração Exemplo
		 * abaixo:
		 */
		Instant inicio = Instant.now();
		int i = 10000;
		int resultado = 0;
		for (int j = 0; j < 1000000000; j++) {
			resultado = resultado + i;
		}
		Instant fim = Instant.now();

		Duration duracao = Duration.between(inicio, fim);
		long duracaoEmMilissegundos = duracao.toMillis();
		System.out.println("a duração foi= " + duracao.toMillis());
		System.out.println("*********************CLASSE DURAÇÃO***********************************");

		// *************************************************************/

		// Temos, por exemplo, a classe LocalDate que representa uma data,
		// ou seja, um período de 24 horas com dia, mês e ano definidos.

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println("*********************CLASSE LOCALDATE***********************************");

		// **************************************************************/

		/**
		 * Para calcularmos a duração entre dois LocalDate, devemos utilizar um
		 * Period, que já trata anos bissextos e outros detalhes.
		 * 
		 */
		LocalDate ano2012 = LocalDate.of(2012, Month.APRIL, 12);
		LocalDate ano2015 = LocalDate.of(2015, Month.MAY, 25);

		Period periodo = Period.between(ano2012, ano2015);

		System.out.println("anos " + periodo.getYears() + "mês " + periodo.getMonths() + " e dias " +  periodo.getDays());
		// 8 anos, 1 mês e 13 dias

		System.out.println("********************CLASSE PERIOD************************************");

		// **************************************************************/
		
		/** 
		 * Para representar um determinado horario podemos utilizar a classe LocalTime
		 * Veja o Exemplo a baixo
		 * */
		LocalTime horarioDeEntrada = LocalTime.of(9, 0);
		System.out.println("Horário de entrada " + horarioDeEntrada);
		
		System.out.println("*********************CLASSE LOCALTIME***********************************");
		
		/**
		 * para pegar a hora e data expecífica
		 * */

		LocalDateTime agoraLocal = LocalDateTime.now();
		System.out.println(agoraLocal); 
		System.out.println("*********************CLASSE LOCALDATETIME***********************************");
		System.out.println("");
		
		/**
		 * ZonedDateTime acrescenta o fusuo horário 
		 * */
		
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
		System.out.println("Horário de Sampa com fuso horário " + agoraEmSaoPaulo);
		System.out.println("*********************CLASSE ZonedDateTime***********************************");
		System.out.println("");
		
		/**
		 * Para representar datas importantes utilizamos a classe MonthDay ou
		 * YearMonth que seria um mês importante do ano
		 * */
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		YearMonth copaDoMundo2014 = YearMonth.of(2014, Month.JUNE);
		
		
		
		/**
		 * Formantando datas com o DateTimeFormatter
		 * */
		LocalDate hojeNovo = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hojeNovo.format(formatador)); //08/04/2014
		System.out.println("********************* CLASSE DATETIMEFORMATTER ***********************************");
		System.out.println("");
		
		
		/**
		 * O enum FormatStyle possui alguns formatos pré-definidos, que podem ser combinados com um Locale.
		 * */

		LocalDateTime agoraNovo = LocalDateTime.now();
		
		DateTimeFormatter formatadorNovo = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
				.withLocale(new Locale("pt", "br"));
		System.out.println(agoraNovo.format(formatadorNovo)); //08/04/14 10:02
		System.out.println("********************* ENUM FormatStyle ***********************************");
		

		/**
		 * para pegar o dia seguinte com LocalDate podemos fazero seguinte
		 * */
		LocalDate hojeNovo1 = LocalDate.now();
		LocalDate amanha = hojeNovo1.plusDays(1);
		
		

		
	}

}

/**
 * Estudo baseado em artigo da Caelum
 * LINK: http://blog.caelum.com.br/conheca-a-nova-api-de-datas-do-java-8/
 * */