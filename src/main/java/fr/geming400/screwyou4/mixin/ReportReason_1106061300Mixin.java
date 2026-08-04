package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportReason.class)
public class ReportReason_1106061300Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/report/ReportReason;", cancellable = true)
    private static void values__1762314923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762314923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/ReportReason;", cancellable = true)
    private static void valueOf__2087590728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087590728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__1070847866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070847866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__1070847866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070847866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIncompatibleCategories(Lnet/minecraft/client/multiplayer/chat/report/ReportType;)Ljava/util/List;", cancellable = true)
    private static void getIncompatibleCategories_2095970875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095970875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backendName()Ljava/lang/String;", cancellable = true)
    private void backendName__29399172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-29399172L))
            info.setReturnValue(null);
    }


}
