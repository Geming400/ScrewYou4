package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.BanReason.class)
public class BanReason_682761483Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/report/BanReason;", cancellable = true)
    private static void values__1612953443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612953443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/BanReason;", cancellable = true)
    private static void valueOf_1621840676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621840676L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.BanReason.SEXUALLY_INAPPROPRIATE);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/client/multiplayer/chat/report/BanReason;", cancellable = true)
    private static void byId_844133915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844133915L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.BanReason.EXTREME_VIOLENCE_OR_GORE);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__1279733259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1279733259L))
            info.setReturnValue(null);
    }


}
