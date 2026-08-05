package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.DiscoveryService.DiscoverResponse.class)
public class DiscoverResponse_1705781389Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1203673649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203673649L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_570321413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570321413L))
            info.setReturnValue("!}a]=Xz'l0Gm|y;*D4PCFA>水WN:<9&7h䮧(b\",8vgjkLI&3S6V;-#='v-1Gz剙4{}?}YQB/VN?[UZ4<h?4\"⨀핃툞=EkX:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1744044130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744044130L))
            info.setReturnValue(347365987);
    }

    @Inject(at = @At("HEAD"), method = "methods()Ljava/util/List;", cancellable = true)
    private void methods__962849092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962849092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/server/jsonrpc/methods/DiscoveryService$DiscoverComponents;", cancellable = true)
    private void components_1080150979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080150979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jsonRpcProtocolVersion()Ljava/lang/String;", cancellable = true)
    private void jsonRpcProtocolVersion_570320917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570320917L))
            info.setReturnValue("Tc2");
    }

    @Inject(at = @At("HEAD"), method = "discoverInfo()Lnet/minecraft/server/jsonrpc/methods/DiscoveryService$DiscoverInfo;", cancellable = true)
    private void discoverInfo__2103442901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103442901L))
            info.setReturnValue(null);
    }


}
