package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ReplaceBlock.class)
public class ReplaceBlock_851186821Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__57439448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57439448L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1621610345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621610345L))
            info.setReturnValue("`^MS \u9E7A>0!n`)gd!lR)#wKW7\u302CPU88$JH(}\u2BB9\u179Bdye\uB456Kk9LHt\u8DCDj|\u3A09FpCFTnh T&u%K[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1408538911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408538911L))
            info.setReturnValue(-159760782);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_525992817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(525992817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__1800535721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800535721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_1080048361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080048361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void blockState_1220974787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220974787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1917632074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917632074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerGameEvent()Ljava/util/Optional;", cancellable = true)
    private void triggerGameEvent__1084601054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084601054L))
            info.setReturnValue(null);
    }


}
