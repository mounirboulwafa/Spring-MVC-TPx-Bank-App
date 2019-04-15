package com.mounirboulwafa.springmvctpxbankapp.metier;


import java.util.List;

import com.mounirboulwafa.springmvctpxbankapp.entities.Compte;
import com.mounirboulwafa.springmvctpxbankapp.entities.Operation;
import org.springframework.data.domain.Page;

public interface IBanqueMetier {

    public Compte getCompte(String codeCompte);

    public void versement(String codeCompte, double montant);

    public void retrait(String codeCompte, double montant);

    public void virement(String codeCompteRetrait, String codeCompteVersement, double montant);


    public Page<Operation> listOperationsCompte(String codeCompte, int page, int sizePage);
	/* 
	 public List<Operation> listOperationsCompte(String codeCompte);
	*/
}
