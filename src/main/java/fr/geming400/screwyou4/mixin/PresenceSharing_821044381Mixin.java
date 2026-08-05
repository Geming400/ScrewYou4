package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PresenceSharing.class)
public class PresenceSharing_821044381Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/PresenceSharing;", cancellable = true)
    private static void values_851263434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851263434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/PresenceSharing;", cancellable = true)
    private static void valueOf_142235783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142235783L))
            info.setReturnValue(net.minecraft.client.PresenceSharing.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getTooltip()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTooltip__1355864785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355864785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTranslation()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTranslation__1355864785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355864785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__314416091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314416091L))
            info.setReturnValue("?MV<KajAQ*1}Z;nI0j䕽䧡ii71䴀[=gxXSPR.=");
    }


}
