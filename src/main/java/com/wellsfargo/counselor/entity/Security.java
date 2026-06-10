package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String makeName;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private float purchasePrice;

    @OneToMany(mappedBy = "security", cascade = CascadeType.ALL)
    private List<PortfolioSecurity> portfolioSecurities;

    public Security(String name, String category, String makeName,
                    String purchaseDate, float purchasePrice) {
        this.name = name;
        this.category = category;
        this.makeName = makeName;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    public long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getMakeName() { return makeName; }
    public String getPurchaseDate() { return purchaseDate; }
    public float getPurchasePrice() { return purchasePrice; }
    public List<PortfolioSecurity> getPortfolioSecurities() { return portfolioSecurities; }

    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setMakeName(String makeName) { this.makeName = makeName; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; }
    public void setPortfolioSecurities(List<PortfolioSecurity> ps) {
        this.portfolioSecurities = ps;
    }
}