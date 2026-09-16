package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.LookAt.LookAtPosition.class)
public class LookAtPosition_1109166953Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_200540684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200540684L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1879590477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879590477L))
            info.setReturnValue("&\uC259\u66DAFy\"dli^5D9U\u00E6-{_gx\u2389i\u4179 (,)\uA911&CwT{\u2FBDPO2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1666519043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666519043L))
            info.setReturnValue(1319824600);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1686724504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686724504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "perform(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void perform_2017829233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2017829233L))
            info.cancel();
    }


}
