package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.LevelsSquared.class)
public class LevelsSquared_333710464Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__574915805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574915805L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1104133988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104133988L))
            info.setReturnValue("ZL\u76EBME5q:qP>o8:|P\uC728Rr'zkNXRU,a|WI\uB6D0&\u476AV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_891062554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891062554L))
            info.setReturnValue(-1759816500);
    }

    @Inject(at = @At("HEAD"), method = "added()F", cancellable = true)
    private void added__1372942814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372942814L))
            info.setReturnValue(3.183021E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1400155717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400155717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__2073489791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073489791L))
            info.setReturnValue(3.183021E8F);
    }


}
