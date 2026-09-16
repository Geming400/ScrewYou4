package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.DiscoveryService.DiscoverResponse.class)
public class DiscoverResponse_1705781389Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_797155120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797155120L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1818762383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818762383L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2031833817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031833817L))
            info.setReturnValue(-557512308);
    }

    @Inject(at = @At("HEAD"), method = "methods()Ljava/util/List;", cancellable = true)
    private void methods__1881696914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881696914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/server/jsonrpc/methods/DiscoveryService$DiscoverComponents;", cancellable = true)
    private void components_738230361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738230361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jsonRpcProtocolVersion()Ljava/lang/String;", cancellable = true)
    private void jsonRpcProtocolVersion_1421456728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421456728L))
            info.setReturnValue("Rkzprx-vX75Uu*b{G\uA69B$NRdI2oK9[&\u6E80Dn\uA267gY\u4C13_\uD7C1Ms!$\"R[9[");
    }

    @Inject(at = @At("HEAD"), method = "discoverInfo()Lnet/minecraft/server/jsonrpc/methods/DiscoveryService$DiscoverInfo;", cancellable = true)
    private void discoverInfo__1002055838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002055838L))
            info.setReturnValue(null);
    }


}
