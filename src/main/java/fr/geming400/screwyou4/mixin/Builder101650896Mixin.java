package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Consumable.Builder.class)
public class Builder101650896Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/component/Consumable;", cancellable = true)
    private void build__1282550924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282550924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/item/consume_effects/ConsumeEffect;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void onConsume__1563239174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563239174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundAfterConsume(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void soundAfterConsume_894246092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894246092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void sound_894246092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894246092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeSeconds(F)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void consumeSeconds__846339149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846339149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasConsumeParticles(Z)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void hasConsumeParticles_465691335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465691335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animation(Lnet/minecraft/world/item/ItemUseAnimation;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void animation_1020202457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020202457L))
            info.setReturnValue(null);
    }


}
