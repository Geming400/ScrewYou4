package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.WorldClock.class)
public class WorldClock912456602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_3830334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3830334L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1682880127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682880127L))
            info.setReturnValue(";|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1469808693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469808693L))
            info.setReturnValue(1306913973);
    }


}
