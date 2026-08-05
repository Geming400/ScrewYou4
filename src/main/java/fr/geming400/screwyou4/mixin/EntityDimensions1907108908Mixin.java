package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityDimensions.class)
public class EntityDimensions1907108908Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_998482640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998482640L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1617434863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617434863L))
            info.setReturnValue("dXp\u92C8'Bxzs.r\u4B41ry[;\u95FD2^G\u61C6nL<\uB03Cy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1830506297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830506297L))
            info.setReturnValue(309162725);
    }

    @Inject(at = @At("HEAD"), method = "scale(FF)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void scale__423766629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-423766629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale(F)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void scale_444474405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444474405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixed()Z", cancellable = true)
    private void fixed__732962065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732962065L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fixed(FF)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private static void fixed_486181929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486181929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width_266958025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266958025L))
            info.setReturnValue(8.117465E8F);
    }

    @Inject(at = @At("HEAD"), method = "withEyeHeight(F)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void withEyeHeight_1033078125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033078125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withAttachments(Lnet/minecraft/world/entity/EntityAttachments$Builder;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void withAttachments__1535495519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535495519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachments()Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private void attachments_723306648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723306648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeBoundingBox(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void makeBoundingBox_653991633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653991633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeBoundingBox(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void makeBoundingBox_1593136873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593136873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyeHeight()F", cancellable = true)
    private void eyeHeight_1978239767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978239767L))
            info.setReturnValue(8.132598E8F);
    }

    @Inject(at = @At("HEAD"), method = "height()F", cancellable = true)
    private void height_821757448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821757448L))
            info.setReturnValue(8.132598E8F);
    }

    @Inject(at = @At("HEAD"), method = "scalable(FF)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private static void scalable__467223640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467223640L))
            info.setReturnValue(null);
    }


}
