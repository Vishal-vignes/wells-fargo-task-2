package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioSecurityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    public PortfolioSecurity(Portfolio portfolio, Security security) {
        this.portfolio = portfolio;
        this.security = security;
    }

    public long getPortfolioSecurityId() { return portfolioSecurityId; }
    public Portfolio getPortfolio() { return portfolio; }
    public Security getSecurity() { return security; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    public void setSecurity(Security security) { this.security = security; }
}