---
title: 'Security scan detected {{ env.VULN_COUNT }} vulnerability(s)'
labels: [ 'security', 'dependencies', 'automated-scan' ]
name: 'Dependency Scan Report'
about: 'Auto-generated security scan report'
---

# 🔍 Dependency Scan Report - Vulnerabilities Found

- **Module:** {{ env.MODULE }}
- **Scan Date:** {{ env.SCAN_DATE }}
- **Vulnerabilities Found:** {{ env.VULN_COUNT }}

📊 **CVE Summary**
{{ env.CVES }}

📝 Check the uploaded artifact for the full report.
