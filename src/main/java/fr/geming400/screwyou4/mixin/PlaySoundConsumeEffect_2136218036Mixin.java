package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.PlaySoundConsumeEffect.class)
public class PlaySoundConsumeEffect_2136218036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1227591767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227591767L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1388325736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388325736L))
            info.setReturnValue("7|7egn\u2589?kY17");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1601397170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601397170L))
            info.setReturnValue(-1343490198);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply_345171416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345171416L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType_1444815771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444815771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound__518527296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-518527296L))
            info.setReturnValue(null);
    }


}
