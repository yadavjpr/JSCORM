INSERT INTO Activity(id, packageID, organizationID, parentID, title, identifierRef, resourceParameters, hideLMSUI, visible, objectivesGlobalToSystem, sharedDataGlobalToSystem, masteryScore, maxTimeAllowed)
VALUES (:e.id, :packageID, :e.organizationID, :parentID, :e.title, :identifierRef, :resourceParameters, :hideLMSUI, :e.visible, :objectivesGlobalToSystem, :sharedDataGlobalToSystem, :masteryScore, :maxTimeAllowed)