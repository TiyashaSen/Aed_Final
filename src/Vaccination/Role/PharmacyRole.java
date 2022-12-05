/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Organization;
import Vaccination.Organization.PharmacyOrganization;
import Vaccination.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmacyRole.PharmacyWorkArea;

/**
 *
 * @author abhaydeshpande
 */
public class PharmacyRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PharmacyWorkArea(userProcessContainer, account, (PharmacyOrganization) organization, enterprise, network);

    }
}
