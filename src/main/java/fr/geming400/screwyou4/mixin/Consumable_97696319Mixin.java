package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Consumable.class)
public class Consumable_97696319Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__810929950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810929950L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_868119843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868119843L))
            info.setReturnValue("t?s/\u7E35=*X\uD484'D:\u25EE<#yL4wpt2Uql)\u0DC0gX\uA1A6FE\u3F3CBGH1a]dQH(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_655048409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655048409L))
            info.setReturnValue(767361052);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private static void builder__755852504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755852504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound_1737918283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737918283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldEmitParticlesAndSounds(I)Z", cancellable = true)
    private void shouldEmitParticlesAndSounds__987600382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987600382L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void onConsume_1939953337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939953337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emitParticlesAndSounds(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void emitParticlesAndSounds_1052996950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1052996950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "consumeTicks()I", cancellable = true)
    private void consumeTicks_644535434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644535434L))
            info.setReturnValue(-72282217);
    }

    @Inject(at = @At("HEAD"), method = "startConsuming(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void startConsuming_469771647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469771647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animation()Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void animation__1127564221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127564221L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "canConsume(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canConsume__430205994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430205994L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onConsumeEffects()Ljava/util/List;", cancellable = true)
    private void onConsumeEffects__156816109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156816109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasConsumeParticles()Z", cancellable = true)
    private void hasConsumeParticles__1875545590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875545590L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "consumeSeconds()F", cancellable = true)
    private void consumeSeconds_805251038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805251038L))
            info.setReturnValue(5.619993E8F);
    }


}
