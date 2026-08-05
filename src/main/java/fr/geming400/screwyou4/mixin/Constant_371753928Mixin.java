package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Constant.class)
public class Constant_371753928Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value_410013290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410013290L))
            info.setReturnValue(6.300139E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1757266186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757266186L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__763706048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763706048L))
            info.setReturnValue("P\uBAB3S9FD^IAr\u0FB8[9Bl\uBFFFYs&bTrl07;B\"`[<K_Z)\u91B6\"npkBH|b\uB0C8RF\u5987\uBA79]M\u5EEDh|T'\u4AC2eP@M9J&Ly6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_410016669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410016669L))
            info.setReturnValue(324590702);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2107607651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107607651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate_1585655523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1585655523L))
            info.setReturnValue(6.300139E8F);
    }


}
