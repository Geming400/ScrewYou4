package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityDimensions.class)
public class EntityDimensions1907108908Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1002346129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002346129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_771648933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771648933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1945371650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945371650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale(FF)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void scale__803807451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803807451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale(F)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void scale__260521637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-260521637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixed()Z", cancellable = true)
    private void fixed_1945387491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945387491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixed(FF)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private static void fixed__803807203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803807203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width_1945368271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945368271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeBoundingBox(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void makeBoundingBox_1078377072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078377072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeBoundingBox(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void makeBoundingBox__1426373928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426373928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachments()Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private void attachments_430786792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430786792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEyeHeight(F)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void withEyeHeight__260521637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-260521637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withAttachments(Lnet/minecraft/world/entity/EntityAttachments$Builder;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void withAttachments__1020295957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020295957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scalable(FF)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private static void scalable__803807203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803807203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyeHeight()F", cancellable = true)
    private void eyeHeight_1945368271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945368271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()F", cancellable = true)
    private void height_1945368271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945368271L))
            info.setReturnValue(null);
    }


}
