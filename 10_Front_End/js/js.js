$(document).ready(function () {

    // Load jobs on page load
    loadJobs();

    // Save Job Button Click
    $('#saveJobBtn').click(function () {
        const jobData = {
            jobTitle: $('#jobTitle').val(),
            company: $('#companyName').val(),
            location: $('#jobLocation').val(),
            type: $('#jobType').val(),
            jobDescription: $('#jobDescription').val(),
            status: "Open"
        };

        $.ajax({
            url: 'http://localhost:8080/api/v1/job/create',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(jobData),
            success: function () {
                alert("Job saved successfully!");
                $('#addJobForm')[0].reset();
                loadJobs();
            },
            error: function (xhr, status, error) {
                console.error("Error:", error);
                alert("Failed to save job.");
            }
        });
    });

    // Function to Load Jobs
    function loadJobs() {
        $.ajax({
            url: 'http://localhost:8080/api/v1/job/getall',
            type: 'GET',
            success: function (jobs) {
                let jobTable = '';
                $.each(jobs, function (index, job) {
                    jobTable += `
                        <tr>
                            <td>${index + 1}</td>
                            <td>${job.jobTitle}</td>
                            <td>${job.company}</td>
                            <td>${job.location}</td>
                            <td>${job.type}</td>
                            <td>${job.status}</td>
                            <td>
                                <button class="btn btn-sm btn-danger">Delete</button>
                                <button 
                                    type="button" 
                                    class="btn btn-warning btn-sm edit-btn"
                                    data-id="${job.id}"
                                    data-title="${job.jobTitle}"
                                    data-company="${job.company}"
                                    data-location="${job.location}"
                                    data-type="${job.type}"
                                    data-description="${job.jobDescription}">
                                    Update
                                </button>
                            </td>
                        </tr>`;
                });
                $('#jobsTableBody').html(jobTable);
            },
            error: function () {
                console.error("Failed to fetch jobs.");
            }
        });
    }

    // Handle Edit Button Click – Open Modal and Fill Data
    $(document).on('click', '.edit-btn', function () {
        $('#editJobId').val($(this).data('id'));
        $('#editJobTitle').val($(this).data('title'));
        $('#editCompanyName').val($(this).data('company'));
        $('#editJobLocation').val($(this).data('location'));
        $('#editJobType').val($(this).data('type'));
        $('#editJobDescription').val($(this).data('description'));
        $('#editJobModal').modal('show');
    });

    // Update Job on Save Click
    $('#updateJobBtn').click(function () {
        const updatedJob = {
            id: $('#editJobId').val(),
            jobTitle: $('#editJobTitle').val(),
            company: $('#editCompanyName').val(),
            location: $('#editJobLocation').val(),
            type: $('#editJobType').val(),
            jobDescription: $('#editJobDescription').val(),
            status: "Open"
        };

        $.ajax({
            url: 'http://localhost:8080/api/v1/job/update',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(updatedJob),
            success: function () {
                alert("Job updated successfully!");
                $('#editJobForm')[0].reset();
                $('#editJobModal').modal('hide');
                loadJobs();
            },
            error: function (xhr, status, error) {
                console.error("Error:", error);
                alert("Failed to update job.");
            }
        });
    });

});
