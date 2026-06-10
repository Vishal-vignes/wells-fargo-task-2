package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<PortfolioSecurity> portfolioSecurities;

    public Portfolio(Client client) {
        this.client = client;
    }

    public long getPortfolioId() { return portfolioId; }
    public Client getClient() { return client; }
    public List<PortfolioSecurity> getPortfolioSecurities() { return portfolioSecurities; }

    public void setClient(Client client) { this.client = client; }
    public void setPortfolioSecurities(List<PortfolioSecurity> portfolioSecurities) {
        this.portfolioSecurities = portfolioSecurities;
    }
}