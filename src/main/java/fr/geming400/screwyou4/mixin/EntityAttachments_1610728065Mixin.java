package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityAttachments.class)
public class EntityAttachments_1610728065Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EntityAttachment;IF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void get__1376882910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376882910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale(FFF)Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private void scale_1964481724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964481724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/entity/EntityAttachments$Builder;", cancellable = true)
    private static void builder_1882897112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882897112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAverage(Lnet/minecraft/world/entity/EntityAttachment;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getAverage__1584178474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584178474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClamped(Lnet/minecraft/world/entity/EntityAttachment;IF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getClamped__532891984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532891984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(FF)Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private static void createDefault__767853927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767853927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNullable(Lnet/minecraft/world/entity/EntityAttachment;IF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getNullable_686544483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686544483L))
            info.setReturnValue(null);
    }


}
