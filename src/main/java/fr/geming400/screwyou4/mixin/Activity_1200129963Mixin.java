package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.schedule.Activity.class)
public class Activity_1200129963Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_64669491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64669491L))
            info.setReturnValue(")?^");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1709325571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709325571L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_64669491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64669491L))
            info.setReturnValue(")?^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1238392208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238392208L))
            info.setReturnValue(-661359379);
    }


}
