package ch.hevs.cloudio.cloud.serialization

import ch.hevs.cloudio.cloud.model.Attribute
import ch.hevs.cloudio.cloud.model.CloudioObject
import ch.hevs.cloudio.cloud.model.Endpoint
import ch.hevs.cloudio.cloud.model.Node

interface SerializationFormat {
    fun detect(data: ByteArray): Boolean

    //fun serializeEndpoint(endpoint: Endpoint): Array<Byte>
    fun deserializeEndpoint(endpoint: Endpoint, data: ByteArray)
    //fun serializeNode(node: Node): ByteArray
    fun deserializeNode(node: Node, data: ByteArray)
    //fun serializeObject(obj: CloudioObject): ByteArray
    fun deserializeObject(obj: CloudioObject, data: ByteArray)
    fun serializeAttribute(attribute: Attribute): ByteArray
    fun deserializeAttribute(attribute: Attribute, data: ByteArray)
}
