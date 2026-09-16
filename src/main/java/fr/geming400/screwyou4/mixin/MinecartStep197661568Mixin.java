package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior.MinecartStep.class)
public class MinecartStep197661568Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__710964700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-710964700L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_968085093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968085093L))
            info.setReturnValue("G1S>:},pIQ&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_755013659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755013659L))
            info.setReturnValue(-341312825);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_775219120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775219120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_508464709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508464709L))
            info.setReturnValue(6.037004E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__1979048124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979048124L))
            info.setReturnValue(6.037004E8F);
    }

    @Inject(at = @At("HEAD"), method = "weight()F", cancellable = true)
    private void weight__2072156501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072156501L))
            info.setReturnValue(6.037004E8F);
    }

    @Inject(at = @At("HEAD"), method = "movement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void movement_1767613034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1767613034L))
            info.setReturnValue(null);
    }


}
