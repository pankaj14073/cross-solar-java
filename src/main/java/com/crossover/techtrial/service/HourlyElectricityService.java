package com.crossover.techtrial.service;

import com.crossover.techtrial.model.HourlyElectricity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * HourlyElectricityService interface for all services realted to HourlyElectricity.
 * @author Crossover
 *
 */
public interface HourlyElectricityService
{
  HourlyElectricity save(HourlyElectricity hourlyElectricity);
  List<HourlyElectricity> getAllHourlyElectricityByPanelId(Long panelId);
  Page<HourlyElectricity> getAllHourlyElectricityByPanelId(Long panelId, Pageable pageable);
}
