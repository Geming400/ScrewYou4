package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ReplaceDisk.class)
public class ReplaceDisk_1938206637Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__971248401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971248401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_802746661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802746661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1976469378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976469378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1116008889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1116008889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_1553808172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553808172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate__2111299238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111299238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__620906936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620906936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void radius_2070286235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070286235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void height_2070286235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070286235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void blockState_5500135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5500135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerGameEvent()Ljava/util/Optional;", cancellable = true)
    private void triggerGameEvent__2111299238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111299238L))
            info.setReturnValue(null);
    }


}
