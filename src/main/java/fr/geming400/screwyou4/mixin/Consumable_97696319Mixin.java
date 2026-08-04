package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Consumable.class)
public class Consumable_97696319Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1483208577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483208577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1037763657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037763657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_135959060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135959060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private static void builder__412366941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412366941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animation()Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void animation__213401529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213401529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound_1646572090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646572090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void onConsume__2107339428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107339428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeTicks()I", cancellable = true)
    private void consumeTicks_135958564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135958564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startConsuming(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void startConsuming_2015117718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015117718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emitParticlesAndSounds(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void emitParticlesAndSounds__676954923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-676954923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canConsume(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canConsume__399625014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399625014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsumeEffects()Ljava/util/List;", cancellable = true)
    private void onConsumeEffects_1724033134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724033134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasConsumeParticles()Z", cancellable = true)
    private void hasConsumeParticles_135974901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135974901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeSeconds()F", cancellable = true)
    private void consumeSeconds_135955681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135955681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldEmitParticlesAndSounds(I)Z", cancellable = true)
    private void shouldEmitParticlesAndSounds_1311617134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311617134L))
            info.setReturnValue(null);
    }


}
