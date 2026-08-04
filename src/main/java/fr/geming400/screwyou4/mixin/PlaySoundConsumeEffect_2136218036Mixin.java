package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.PlaySoundConsumeEffect.class)
public class PlaySoundConsumeEffect_2136218036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__773237002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773237002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1000758060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000758060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2120486519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120486519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply_2128905222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128905222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType_1543480651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543480651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound__609873489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609873489L))
            info.setReturnValue(null);
    }


}
