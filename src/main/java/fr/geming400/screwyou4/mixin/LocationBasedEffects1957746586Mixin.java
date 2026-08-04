package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AllOf.LocationBasedEffects.class)
public class LocationBasedEffects1957746586Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__951708451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951708451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_822286611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822286611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1996009328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996009328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onChangedBlock(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Z)V", cancellable = true)
    private void onChangedBlock_1809445743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1809445743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__601366986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601366986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects__710883894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-710883894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDeactivated(Lnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void onDeactivated_731039510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(731039510L))
            info.cancel();
    }


}
