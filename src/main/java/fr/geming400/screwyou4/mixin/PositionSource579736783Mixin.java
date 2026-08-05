package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSource.class)
public class PositionSource579736783Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSourceType;", cancellable = true)
    private void type_1170253358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170253358L))
            info.setReturnValue(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSourceType.BOUNDING_BOX);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1965249042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965249042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__555723192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555723192L))
            info.setReturnValue("dwZFꨁZV(3Ex :10zPZ8!%NEx嚝篐\"_/麴j5뗏am5\"&&D遜,,X_+醤bl⃤!*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_617999525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617999525L))
            info.setReturnValue(-307392763);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_617996146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617996146L))
            info.setReturnValue(8.469475E8F);
    }

    @Inject(at = @At("HEAD"), method = "offset()F", cancellable = true)
    private void offset_617996146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617996146L))
            info.setReturnValue(8.469475E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCoordinate(DDFLnet/minecraft/util/RandomSource;)D", cancellable = true)
    private void getCoordinate__1514565414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514565414L))
            info.setReturnValue(8.469475001631535E8D);
    }


}
