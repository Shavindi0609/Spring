$(document).ready(function () {

    let currentPage = 1;
    const pageSize = 5; // jobs per page

    // Load jobs initially
    loadJobs(currentPage);

    // Save Job
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
                loadJobs(currentPage);
            },
            error: function (xhr, status, error) {
                console.error("Error:", error);
                alert("Failed to save job.");
            }
        });
    });

    // Load Jobs with Pagination
    function loadJobs(page = 1) {
        currentPage = page;
        $.ajax({
            url: `http://localhost:8080/api/v1/job/paginated?page=${page}&size=${pageSize}`,
            type: 'GET',
            success: function (response) {
                const jobs = response.content;
                const totalPages = response.totalPages;

                let jobTable = '';
                $.each(jobs, function (index, job) {
                    jobTable += `
                        <tr>
                            <td>${(page - 1) * pageSize + index + 1}</td>
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
                renderPagination(totalPages, page);
            },
            error: function () {
                console.error("Failed to fetch jobs.");
            }
        });
    }

    // Render Pagination Buttons
    function renderPagination(totalPages, currentPage) {
        let paginationHTML = '';

        // Previous button
        paginationHTML += `
            <li class="page-item ${currentPage === 1 ? 'disabled' : ''}">
                <a class="page-link" href="#" onclick="loadJobs(${currentPage - 1})">Previous</a>
            </li>
        `;

        // Page numbers
        for (let i = 1; i <= totalPages; i++) {
            paginationHTML += `
                <li class="page-item ${currentPage === i ? 'active' : ''}">
                    <a class="page-link" href="#" onclick="loadJobs(${i})">${i}</a>
                </li>
            `;
        }

        // Next button
        paginationHTML += `
            <li class="page-item ${currentPage === totalPages ? 'disabled' : ''}">
                <a class="page-link" href="#" onclick="loadJobs(${currentPage + 1})">Next</a>
            </li>
        `;

        $('#pagination').html(paginationHTML);
    }

    // Edit Job
    $(document).on('click', '.edit-btn', function () {
        $('#editJobId').val($(this).data('id'));
        $('#editJobTitle').val($(this).data('title'));
        $('#editCompanyName').val($(this).data('company'));
        $('#editJobLocation').val($(this).data('location'));
        $('#editJobType').val($(this).data('type'));
        $('#editJobDescription').val($(this).data('description'));
        $('#editJobModal').modal('show');
    });

    // Update Job
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
                loadJobs(currentPage);
            },
            error: function (xhr, status, error) {
                console.error("Error:", error);
                alert("Failed to update job.");
            }
        });
    });

    // Delete Job
    $(document).on('click', '.btn-danger', function () {
        if (confirm("Are you sure you want to delete this job?")) {
            const row = $(this).closest('tr');
            const jobId = row.find('.edit-btn').data('id');

            $.ajax({
                url: 'http://localhost:8080/api/v1/job/delete/' + jobId,
                type: 'DELETE',
                success: function () {
                    alert("Job deleted successfully!");
                    loadJobs(currentPage);
                },
                error: function (xhr, status, error) {
                    console.error("Error:", error);
                    alert("Failed to delete job.");
                }
            });
        }
    });

    // Search with pagination reset
    $('#searchInput').on('input', function () {
        const keyword = $(this).val().trim();

        if (keyword === "") {
            loadJobs(1);
        } else {
            $.ajax({
                url: 'http://localhost:8080/api/v1/job/search/' + encodeURIComponent(keyword),
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
                    $('#pagination').html(''); // remove pagination on search
                },
                error: function () {
                    console.error("Failed to search jobs.");
                    $('#jobsTableBody').html('<tr><td colspan="7">No jobs found.</td></tr>');
                    $('#pagination').html('');
                }
            });
        }
    });

    // Expose loadJobs to global scope for pagination links
    window.loadJobs = loadJobs;

});
