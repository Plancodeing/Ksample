package com.example.ksample;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class Model2 implements Serializable {
    private Data data;

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data implements Serializable {
        private List<? extends Project_Management_Process_project_creation> Project_Management_Process_project_creation;

        public List<? extends Project_Management_Process_project_creation> getProject_Management_Process_project_creation() {
            return this.Project_Management_Process_project_creation;
        }

        public void setProject_Management_Process_project_creation(List<? extends Project_Management_Process_project_creation> Project_Management_Process_project_creation) {
            this.Project_Management_Process_project_creation = Project_Management_Process_project_creation;
        }

        public static class Project_Management_Process_project_creation implements Serializable {
            private String planned_hrs;

            private List<? extends Allocation_projects> allocation_projects;

            private String delivery_date;

            private Daily_reports_aggregate daily_reports_aggregate;

            private List<? extends Daily_reports> daily_reports;

            private String project_code;

            private String project_name;

            private String create_date;

            private String status;

            public String getPlanned_hrs() {
                return this.planned_hrs;
            }

            public void setPlanned_hrs(String planned_hrs) {
                this.planned_hrs = planned_hrs;
            }

            public List<? extends Allocation_projects> getAllocation_projects() {
                return this.allocation_projects;
            }

            public void setAllocation_projects(List<? extends Allocation_projects> allocation_projects) {
                this.allocation_projects = allocation_projects;
            }

            public String getDelivery_date() {
                return this.delivery_date;
            }

            public void setDelivery_date(String delivery_date) {
                this.delivery_date = delivery_date;
            }

            public Daily_reports_aggregate getDaily_reports_aggregate() {
                return this.daily_reports_aggregate;
            }

            public void setDaily_reports_aggregate(Daily_reports_aggregate daily_reports_aggregate) {
                this.daily_reports_aggregate = daily_reports_aggregate;
            }

            public List<? extends Daily_reports> getDaily_reports() {
                return this.daily_reports;
            }

            public void setDaily_reports(List<? extends Daily_reports> daily_reports) {
                this.daily_reports = daily_reports;
            }

            public String getProject_code() {
                return this.project_code;
            }

            public void setProject_code(String project_code) {
                this.project_code = project_code;
            }

            public String getProject_name() {
                return this.project_name;
            }

            public void setProject_name(String project_name) {
                this.project_name = project_name;
            }

            public String getCreate_date() {
                return this.create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public String getStatus() {
                return this.status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public static class Allocation_projects implements Serializable {
                private String planned_hrs;

                private Team_creation team_creation;

                public String getPlanned_hrs() {
                    return this.planned_hrs;
                }

                public void setPlanned_hrs(String planned_hrs) {
                    this.planned_hrs = planned_hrs;
                }

                public Team_creation getTeam_creation() {
                    return this.team_creation;
                }

                public void setTeam_creation(Team_creation team_creation) {
                    this.team_creation = team_creation;
                }

                public static class Team_creation implements Serializable {
                    private String team_name;

                    public String getTeam_name() {
                        return this.team_name;
                    }

                    public void setTeam_name(String team_name) {
                        this.team_name = team_name;
                    }
                }
            }

            public static class Daily_reports_aggregate implements Serializable {
                private Aggregate aggregate;

                public Aggregate getAggregate() {
                    return this.aggregate;
                }

                public void setAggregate(Aggregate aggregate) {
                    this.aggregate = aggregate;
                }

                public static class Aggregate implements Serializable {
                    private Sum sum;

                    public Sum getSum() {
                        return this.sum;
                    }

                    public void setSum(Sum sum) {
                        this.sum = sum;
                    }

                    public static class Sum implements Serializable {
                        private Integer spent_hrs;

                        public Integer getSpent_hrs() {
                            return this.spent_hrs;
                        }

                        public void setSpent_hrs(Integer spent_hrs) {
                            this.spent_hrs = spent_hrs;
                        }
                    }
                }
            }

            public static class Daily_reports implements Serializable {
                private Integer spent_hrs;

                private Allocation_projects.Team_creation team_creation;

                public Integer getSpent_hrs() {
                    return this.spent_hrs;
                }

                public void setSpent_hrs(Integer spent_hrs) {
                    this.spent_hrs = spent_hrs;
                }

                public Allocation_projects.Team_creation getTeam_creation() {
                    return this.team_creation;
                }

                public void setTeam_creation(Allocation_projects.Team_creation team_creation) {
                    this.team_creation = team_creation;
                }
            }
        }
    }
}
