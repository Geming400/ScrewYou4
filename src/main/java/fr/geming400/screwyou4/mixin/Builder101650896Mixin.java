package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Consumable.Builder.class)
public class Builder101650896Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/component/Consumable;", cancellable = true)
    private void build_1082827334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082827334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void sound_1816864923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816864923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/item/consume_effects/ConsumeEffect;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void onConsume__1250908995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250908995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animation(Lnet/minecraft/world/item/ItemUseAnimation;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void animation__574142883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574142883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundAfterConsume(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void soundAfterConsume_374146235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374146235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasConsumeParticles(Z)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void hasConsumeParticles_2018364690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018364690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeSeconds(F)Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private void consumeSeconds_675997718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675997718L))
            info.setReturnValue(null);
    }


}
