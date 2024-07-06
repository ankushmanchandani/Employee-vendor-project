package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepository;

	public Optional<Vendor> getVendorByEmail(String email) {
		return vendorRepository.findByEmail(email);
	}

	public List<Vendor> getAllVendors() {
		return vendorRepository.findAll();
	}

	public Optional<Vendor> getVendorById(Long id) {
		return vendorRepository.findById(id);
	}

	public Vendor createVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	public Vendor updateVendor(Long id, Vendor vendorDetails) {
		return vendorRepository.findById(id).map(vendor -> {
			vendor.setName(vendorDetails.getName());
			vendor.setEmail(vendorDetails.getEmail());
			vendor.setUpi(vendorDetails.getUpi());
			return vendorRepository.save(vendor);
		}).orElseThrow(() -> new ResourceNotFoundException("Vendor not found with id " + id));
	}

	public void deleteVendor(Long id) {
		vendorRepository.deleteById(id);
	}
}