package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.SkinReport.Builder.class)
public class Builder_2024491116Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void build_1486608303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486608303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasContent()Z", cancellable = true)
    private void hasContent_2062769698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062769698L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkBuildable()Lnet/minecraft/client/multiplayer/chat/report/Report$CannotBuildReason;", cancellable = true)
    private void checkBuildable__1710815449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710815449L))
            info.setReturnValue(null);
    }


}
