package io.poliana.produtos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.poliana.produtos.model.Produto;

public interface ProduroRepository extends JpaRepository<Produto, Long> {

}
