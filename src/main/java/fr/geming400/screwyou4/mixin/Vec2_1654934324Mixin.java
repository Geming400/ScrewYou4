package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.Vec2.class)
public class Vec2_1654934324Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1254521210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254521210L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "length()F", cancellable = true)
    private void length_1693193686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693193686L))
            info.setReturnValue(7.494187E8F);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1693196569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693196569L))
            info.setReturnValue(1596626243);
    }

    @Inject(at = @At("HEAD"), method = "scale(F)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void scale__614915005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614915005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void add_1394259322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394259322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(F)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void add__614915005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614915005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dot(Lnet/minecraft/world/phys/Vec2;)F", cancellable = true)
    private void dot_1994025795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994025795L))
            info.setReturnValue(7.494187E8F);
    }

    @Inject(at = @At("HEAD"), method = "rotate(D)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void rotate_229090497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229090497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalized()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void normalized__1542333235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542333235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "negated()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void negated__1542333235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542333235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared()F", cancellable = true)
    private void lengthSquared_1693193686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693193686L))
            info.setReturnValue(7.494187E8F);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/Vec2;)F", cancellable = true)
    private void distanceToSqr_1994025795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994025795L))
            info.setReturnValue(7.494187E8F);
    }


}
