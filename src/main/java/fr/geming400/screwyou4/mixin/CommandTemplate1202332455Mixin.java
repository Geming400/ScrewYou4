package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.CommandTemplate.class)
public class CommandTemplate1202332455Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_293706187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293706187L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1972755980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972755980L))
            info.setReturnValue("Ah.E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1759684546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759684546L))
            info.setReturnValue(-716055339);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/server/dialog/action/ParsedTemplate;", cancellable = true)
    private void template_978213116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978213116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2026189587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026189587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAction(Ljava/util/Map;)Ljava/util/Optional;", cancellable = true)
    private void createAction_1812319528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1812319528L))
            info.setReturnValue(null);
    }


}
