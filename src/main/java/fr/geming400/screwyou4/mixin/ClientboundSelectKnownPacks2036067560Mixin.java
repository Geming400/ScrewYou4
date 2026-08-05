package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundSelectKnownPacks.class)
public class ClientboundSelectKnownPacks2036067560Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_357042472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(357042472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__873387477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873387477L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_900607585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900607585L))
            info.setReturnValue("g?%j衣U뜖gSu2G6C娟ozw틃.5@_峤}v5$TIyぜOU<T媫PC鴄qC7kj$1핐뮗^塈g촻`+⬻p8G+#!Cg&g6d穑b GW]MQusJ킋m.7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2074330302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074330302L))
            info.setReturnValue(-673440805);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1580830823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1580830823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle_1022941374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1022941374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "knownPacks()Ljava/util/List;", cancellable = true)
    private void knownPacks__632562920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632562920L))
            info.setReturnValue(null);
    }


}
