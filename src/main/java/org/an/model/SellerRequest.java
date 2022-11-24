package org.an.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SellerRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private Seller seller;
	private Product product;
}
