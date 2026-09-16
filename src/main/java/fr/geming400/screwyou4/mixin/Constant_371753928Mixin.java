package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Constant.class)
public class Constant_371753928Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value__1932919911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932919911L))
            info.setReturnValue(3.485767E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__536872341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536872341L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1142177452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142177452L))
            info.setReturnValue("vMT0\u84E7G[{0O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_929106018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929106018L))
            info.setReturnValue(1890863327);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1438199181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438199181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__2035446327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035446327L))
            info.setReturnValue(3.485767E8F);
    }


}
