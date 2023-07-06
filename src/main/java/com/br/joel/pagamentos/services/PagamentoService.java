package com.br.joel.pagamentos.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.br.joel.pagamentos.DTO.PagamentoDTO;
import com.br.joel.pagamentos.Repository.PagamentoRepository;
import com.br.joel.pagamentos.model.Pagamento;
import com.br.joel.pagamentos.model.Status;

@Service
public class PagamentoService {

    @Autowired
    private  PagamentoRepository pagamentoRepository;

    @Autowired
    private  ModelMapper modelMapper;




    public Page<PagamentoDTO> findAll(Pageable pageable) {
        Page<PagamentoDTO> pagamentoDTO = pagamentoRepository.findAll(pageable).map(pagamento -> modelMapper.map(pagamento, PagamentoDTO.class));
        return pagamentoDTO;
    }

    public PagamentoDTO findById(Long id) {
        PagamentoDTO pagamentoDTO = modelMapper.map(pagamentoRepository.findById(id).get(), PagamentoDTO.class);
        return pagamentoDTO;
    
    }

    public PagamentoDTO save(PagamentoDTO pagamentoDTO) {
        Pagamento pagamentoDTO1 = modelMapper.map(pagamentoDTO, Pagamento.class);
        pagamentoDTO1.setStatus(Status.CRIADO);
        pagamentoRepository.save(pagamentoDTO1);

        return modelMapper.map(pagamentoDTO, PagamentoDTO.class );
    
    }


    public PagamentoDTO update(Long id, PagamentoDTO pagamentoDTO) {
        Pagamento pagamentoDTO1 = modelMapper.map(pagamentoDTO, Pagamento.class);
        pagamentoDTO1.setId(id);
        
        pagamentoRepository.save(pagamentoDTO1);

        return modelMapper.map(pagamentoDTO1, PagamentoDTO.class );
    
    }


    public void deleteById(Long id) {
        pagamentoRepository.deleteById(id);
    

    }



}






    

