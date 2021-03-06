package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Sinalizacao;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sinalizacao")
public class SinalizacaoResource extends GumgaAPI<Sinalizacao, String> {
    @Autowired
    public SinalizacaoResource(@Qualifier("sinalizacaoService") GumgaService<Sinalizacao, String> service) {
        super(service);
    }
}
