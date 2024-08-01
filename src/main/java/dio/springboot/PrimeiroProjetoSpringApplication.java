/**
 * componentes @Component
 * componentes de servico @Service
 * metodos componentes @Bean
 * configuracao (ex: classe de beans) @Configuration

 * Por padrao, componentes do spring sao singletons
 * Para alterar o escopo dos componentes, utilize o @Scope dessa maneira
 * @Bean
 * @Scope("prototype")
 *  Bean()
 *
 * application.properties podem guardar valores
 * nome=Spring

 * Em uma classe
 * @Value("${nome: (opcional) valor padrao caso nao encontre o nome }")
 * private String nome
 *
 * @ConfigurationProperties
 * associa os atributos da classe aos valores do arquivo .properties
 *
 * @ConfigurationProperties(prefix="remetente")
 * Caso no properties esteja
 * remetente.nome, ou seja , objeto.atributo
 */
package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}

}

