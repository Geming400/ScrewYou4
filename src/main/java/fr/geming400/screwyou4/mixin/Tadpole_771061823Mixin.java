package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.Tadpole.class)
public class Tadpole_771061823Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_809336561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(809336561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1930928616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930928616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_70843377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(70843377L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "shouldDropExperience()Z", cancellable = true)
    private void shouldDropExperience_809340405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809340405L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAgeLocked()Z", cancellable = true)
    private void isAgeLocked_809340405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809340405L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1907079632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1907079632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPickupSound_1861274720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861274720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_1294480482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294480482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFromBucketTag(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void loadFromBucketTag_1331970044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1331970044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFromBucket(Z)V", cancellable = true)
    private void setFromBucket_2000678651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2000678651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag__1789374186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1789374186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromBucket()Z", cancellable = true)
    private void fromBucket_809340405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809340405L))
            info.setReturnValue(false);
    }


}
