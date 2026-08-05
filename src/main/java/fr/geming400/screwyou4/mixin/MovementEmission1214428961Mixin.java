package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Entity.MovementEmission.class)
public class MovementEmission1214428961Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Entity$MovementEmission;", cancellable = true)
    private static void values__1064438780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064438780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Entity$MovementEmission;", cancellable = true)
    private static void valueOf_813596161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813596161L))
            info.setReturnValue(net.minecraft.world.entity.Entity.MovementEmission.SOUNDS);
    }

    @Inject(at = @At("HEAD"), method = "emitsEvents()Z", cancellable = true)
    private void emitsEvents_1252707544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252707544L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "emitsAnything()Z", cancellable = true)
    private void emitsAnything_1252707544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252707544L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "emitsSounds()Z", cancellable = true)
    private void emitsSounds_1252707544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252707544L))
            info.setReturnValue(false);
    }


}
