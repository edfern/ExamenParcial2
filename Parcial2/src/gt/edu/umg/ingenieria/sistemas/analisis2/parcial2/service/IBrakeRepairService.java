package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import java.util.*;

public interface IBrakeRepairService {
    public void batteyReview(ServiceOrderEntity order);
    public void interiorlights(ServiceOrderEntity order);
    public void tireRotation(ServiceOrderEntity order);

}