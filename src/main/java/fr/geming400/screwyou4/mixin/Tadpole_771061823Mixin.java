package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.Tadpole.class)
public class Tadpole_771061823Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1892607907(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1892607907L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldDropExperience()Z", cancellable = true)
    private void shouldDropExperience_1983900457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983900457L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_585159896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585159896L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_2146163812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146163812L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPickupSound_1280928707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280928707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAgeLocked()Z", cancellable = true)
    private void isAgeLocked__695459210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695459210L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1514749946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514749946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromBucket()Z", cancellable = true)
    private void fromBucket__1295783871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1295783871L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag_1947239614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1947239614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFromBucket(Z)V", cancellable = true)
    private void setFromBucket__1856382287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1856382287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadFromBucketTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void loadFromBucketTag__1412999812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1412999812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_975410583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975410583L))
            info.setReturnValue(null);
    }


}
