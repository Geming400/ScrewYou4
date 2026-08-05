package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.BanReason.class)
public class BanReason_682761483Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/report/BanReason;", cancellable = true)
    private static void values__639503745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639503745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/BanReason;", cancellable = true)
    private static void valueOf_1783838204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783838204L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.BanReason.NUDITY_OR_PORNOGRAPHY);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__1494147683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494147683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/client/multiplayer/chat/report/BanReason;", cancellable = true)
    private static void byId_1457086637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457086637L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.BanReason.GENERIC_VIOLATION);
    }


}
