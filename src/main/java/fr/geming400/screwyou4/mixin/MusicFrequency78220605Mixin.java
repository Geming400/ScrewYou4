package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.MusicManager.MusicFrequency.class)
public class MusicFrequency78220605Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/sounds/MusicManager$MusicFrequency;", cancellable = true)
    private static void values_1184930858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184930858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/sounds/MusicManager$MusicFrequency;", cancellable = true)
    private static void valueOf__1615666557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615666557L))
            info.setReturnValue(net.minecraft.client.sounds.MusicManager.MusicFrequency.CONSTANT);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_487745590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487745590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_166429227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166429227L))
            info.setReturnValue("t/\u1C11\u54AFf+J{\uD20B\uC587\u9D2A;'D\u5880aiF+%\u1F9Ej0Afe$Z\uCCCBUB;r?ud\u4621S.},56GR[{74J1:a_:rmp?iEcs_3loIQ`b8X?\u04DEYl.@u(s1Bia<n$jt=");
    }


}
