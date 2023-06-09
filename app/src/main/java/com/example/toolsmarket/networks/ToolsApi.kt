package com.example.toolsmarket.networks

import com.example.toolsmarket.models.ToolRequest
import retrofit2.Response
import retrofit2.http.GET

interface ToolsApi {
    @GET("new_text.json")
    suspend fun getTools(): Response<List<ToolRequest>>
}