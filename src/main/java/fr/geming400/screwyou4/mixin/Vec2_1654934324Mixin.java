package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.Vec2.class)
public class Vec2_1654934324Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_746307559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746307559L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "length()F", cancellable = true)
    private void length__1054033232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054033232L))
            info.setReturnValue(5.688346E8F);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2082681378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082681378L))
            info.setReturnValue(-1744358927);
    }

    @Inject(at = @At("HEAD"), method = "scale(F)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void scale__1320234867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320234867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void add__1249050149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249050149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(F)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void add__1232428956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1232428956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dot(Lnet/minecraft/world/phys/Vec2;)F", cancellable = true)
    private void dot_370720780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370720780L))
            info.setReturnValue(5.688346E8F);
    }

    @Inject(at = @At("HEAD"), method = "rotate(D)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void rotate__809488228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809488228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalized()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void normalized__589267338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589267338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "negated()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void negated__964644885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964644885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/Vec2;)F", cancellable = true)
    private void distanceToSqr__2071322713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071322713L))
            info.setReturnValue(5.688346E8F);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared()F", cancellable = true)
    private void lengthSquared_1307928917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307928917L))
            info.setReturnValue(5.688346E8F);
    }


}
