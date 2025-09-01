---
name: Dependency Scan Report
about: Auto-generated security scan report
title: "Security scan detected {{ env.VULN_COUNT }} vulnerability(s)"
labels: [security, dependencies, automated-scan]
---

# 🔍 Dependency Scan Report - Vulnerabilities Found

**Scan Date:** {{ env.SCAN_DATE }}  
**Total Vulnerabilities Found:** {{ env.VULN_COUNT }}

## 📊 CVE Summary
{{ env.CVES }}

## 📝 Details
Please review the uploaded artifact for full vulnerability details.
