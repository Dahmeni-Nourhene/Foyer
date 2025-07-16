package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.DAO.Entities.Etudiant;

import java.time.LocalDate;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    // Afficher la liste des étudiants avec le nom passé en paramétre
    List<Etudiant> findByNomEt(String nom);
    // JPQL (Les noms des entités, les nom des attributs)
    @Query("select e from Etudiant e where e.nomEt=?1")
    List<Etudiant> selectJPQL(String nom);
    //SQL (Les noms des tables, les nom des colonnes)
    @Query(value = "SELECT * FROM t_etudiant WHERE nom_et=:nom",nativeQuery = true)
    List<Etudiant> selectSQL(@Param("nom") String nom);

    // Afficher la liste des étudiants avec le nom et le prenom passé en paramétre
    List<Etudiant> findByNomEtAndPrenomEt(String nom, String prenom);
    // JPQL (Les noms des entités, les nom des attributs)
    @Query("select e from Etudiant e where e.nomEt=:nom and e.prenomEt=:prenom")
    List<Etudiant> select2JPQL(@Param("nom") String nom,@Param("prenom") String prenom);
    //SQL (Les noms des tables, les nom des colonnes)
    @Query(value = "SELECT * FROM t_etudiant WHERE nom_et=?2 AND prenom_et=?1",nativeQuery = true)
    List<Etudiant> select2SQL(String prenom, String nom);









    Etudiant getByNomEtAndPrenomEt(String nom, String prenom);


    // select e from Etudiant e where e.nomEt = ... Or e.prenomEt=...
    List<Etudiant> findByNomEtOrPrenomEt(String nom, String prenom);

    // select e from Etudiant e where e.idEtudiant > ...
    List<Etudiant> findByIdEtudiantGreaterThan(long min);

    // select e from Etudiant e where e.idEtudiant < ...
    List<Etudiant> findByIdEtudiantLessThan(long min);

    // select e from Etudiant e where e.dateNaissance betwenn ... and ...
    List<Etudiant> getByDateNaissanceBetween(LocalDate d1, LocalDate d2);

    // select e from Etudiant e where e.nomEt like ...
    List<Etudiant> getByNomEtLike(String nomEt);

    List<Etudiant> getByNomEtContaining(String nomEt);

    List<Etudiant> getByNomEtContains(String nomEt);

    List<Etudiant> getByNomEtIgnoreCase(String nom);

    List<Etudiant> getByNomEtNotNull();

    //select * from Etudiant where cin=...
    Etudiant findByCin(long cin);

    // select * from Etudiant where nomEt like ...
    List<Etudiant> findByNomEtLike(String nom);

    List<Etudiant> findByNomEtContains(String nom);

    List<Etudiant> findByNomEtContaining(String nom);

    @Query(value = "select e from t_etudiant e " +
            "           join t_reservation_etudiants re on e.id_etudiant=re.etudiants_id_etudiant" +
            "           join t_reservation r on r.id_reservation= re.reservations_id_reservation" +
            "           where r.est_valide=?1 ", nativeQuery = true)
    List<Etudiant> e5erMethodeSQL(boolean estValide);

    @Query("update Etudiant e set e.ecole =?1 where e.idEtudiant<?2 ")
    @Modifying
    void update(String nomE, long id);

    @Query(value = "update t_etudiant set ecole=:nom where id_etudiant <:id ", nativeQuery = true)
    @Modifying
    void updatesql(@Param("nom") String nom, @Param("id") long id);

}



