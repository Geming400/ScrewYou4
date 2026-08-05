package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.SkinReport.Builder.class)
public class Builder_2024491116Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void build_705096605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705096605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasContent()Z", cancellable = true)
    private void hasContent__336929533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-336929533L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkBuildable()Lnet/minecraft/client/multiplayer/chat/report/Report$CannotBuildReason;", cancellable = true)
    private void checkBuildable_1899793031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899793031L))
            info.setReturnValue(null);
    }


}
