package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.NameReport.Builder.class)
public class Builder886206626Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void build__433187884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433187884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBuildable()Lnet/minecraft/client/multiplayer/chat/report/Report$CannotBuildReason;", cancellable = true)
    private void checkBuildable_761508542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761508542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasContent()Z", cancellable = true)
    private void hasContent__1475214022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475214022L))
            info.setReturnValue(false);
    }


}
