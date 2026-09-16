package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSource.class)
public class PositionSource579736783Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSourceType;", cancellable = true)
    private void type__964857624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964857624L))
            info.setReturnValue(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSourceType.BOUNDING_BOX);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__328889485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328889485L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1350160308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350160308L))
            info.setReturnValue(".\u428AA/w\u21A8LpM_5X>ISj}*;F/>9(aX4yj{TBH'ZWI\uA101R['S\uAEA858.>o\uAB2A\uA1A29.2`htVU%K\u2614V\u675Co\u6B2B8\u4DBD\uAC3C4}\u5F3Fcptx\u02B2Tl\uCD876to\u6D443}_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1137088874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137088874L))
            info.setReturnValue(1647522432);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__1843981208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843981208L))
            info.setReturnValue(4.720509E8F);
    }

    @Inject(at = @At("HEAD"), method = "offset()F", cancellable = true)
    private void offset_1802854079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802854079L))
            info.setReturnValue(4.720509E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCoordinate(DDFLnet/minecraft/util/RandomSource;)D", cancellable = true)
    private void getCoordinate__1292839124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292839124L))
            info.setReturnValue(4.720509000536214E8D);
    }


}
