INSERT INTO BidangUnit (bidangUnitName) VALUES
('Bidang A'),
('Bidang B'),
('Bidang C');


INSERT INTO RunWorkflow (lastStatus) VALUES
('Status A'),
('Status B'),
('Status C');


INSERT INTO HistRunWorkflow (lastStatus) VALUES
('Historical Status 1'),
('Historical Status 2'),
('Historical Status 3');

INSERT INTO Complaint (reportNumber, run_work_flow_id, hist_run_workflow_id) VALUES
('Report 001', 1, 1),
('Report 002', 2, 2),
('Report 003', 3, 3);

INSERT INTO BidangExplain (reportNumber, complaint_id, bidang_unit_id) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3);
