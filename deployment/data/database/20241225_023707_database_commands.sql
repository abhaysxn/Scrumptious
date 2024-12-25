ALTER TABLE "mendixsystem$association" ADD "storage_format" SMALLINT NULL;
UPDATE "mendixsystem$version" SET "preanalysismigrationversionnumber" = '4.4.0';
