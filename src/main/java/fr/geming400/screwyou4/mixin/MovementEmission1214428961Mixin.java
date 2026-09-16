package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Entity.MovementEmission.class)
public class MovementEmission1214428961Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Entity$MovementEmission;", cancellable = true)
    private static void values_2146699554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146699554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Entity$MovementEmission;", cancellable = true)
    private static void valueOf__2105315543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105315543L))
            info.setReturnValue(net.minecraft.world.entity.Entity.MovementEmission.EVENTS);
    }

    @Inject(at = @At("HEAD"), method = "emitsSounds()Z", cancellable = true)
    private void emitsSounds__1107690764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107690764L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "emitsEvents()Z", cancellable = true)
    private void emitsEvents_1368854591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368854591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "emitsAnything()Z", cancellable = true)
    private void emitsAnything_339793014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339793014L))
            info.setReturnValue(false);
    }


}
