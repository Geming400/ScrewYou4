package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.LookAt.LookAtPosition.class)
public class LookAtPosition_1109166953Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1800288085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800288085L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__26293023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26293023L))
            info.setReturnValue("xC\uC172eeyVoi>$Y|#\u39C2Xs;\u6754N'@0BqVx m\u1F90Z>=vt");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1147429694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147429694L))
            info.setReturnValue(-1453719723);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__2088070815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088070815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "perform(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void perform_2021926514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021926514L))
            info.cancel();
    }


}
