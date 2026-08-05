package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.NameReport.Builder.class)
public class Builder886206626Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void build_348323814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348323814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBuildable()Lnet/minecraft/client/multiplayer/chat/report/Report$CannotBuildReason;", cancellable = true)
    private void checkBuildable_1445867358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445867358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasContent()Z", cancellable = true)
    private void hasContent_924485209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924485209L))
            info.setReturnValue(true);
    }


}
