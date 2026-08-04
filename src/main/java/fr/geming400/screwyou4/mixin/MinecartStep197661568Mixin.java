package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior.MinecartStep.class)
public class MinecartStep197661568Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1583173827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583173827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__937798407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937798407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_235924310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235924310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1295391097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295391097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()F", cancellable = true)
    private void weight_235920931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235920931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "movement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void movement_1295391097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295391097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_235920931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235920931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_235920931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235920931L))
            info.setReturnValue(null);
    }


}
