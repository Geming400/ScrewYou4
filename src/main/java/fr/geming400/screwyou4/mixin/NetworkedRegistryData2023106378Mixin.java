package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryDataLoader.NetworkedRegistryData.class)
public class NetworkedRegistryData2023106378Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__886348659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886348659L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_887646403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887646403L))
            info.setReturnValue(":#1+Fq]E3\uB700!D%ZQ;@_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2061369120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061369120L))
            info.setReturnValue(-1735570702);
    }

    @Inject(at = @At("HEAD"), method = "elements()Ljava/util/List;", cancellable = true)
    private void elements__645524102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645524102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Lnet/minecraft/tags/TagNetworkSerialization$NetworkPayload;", cancellable = true)
    private void tags_1937893700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937893700L))
            info.setReturnValue(null);
    }


}
