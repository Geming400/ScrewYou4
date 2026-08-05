package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.MoonBrightnessCheck.class)
public class MoonBrightnessCheck_1572182952Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1337272086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1337272086L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_436722976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436722976L))
            info.setReturnValue("<\u1D84uikE-i\u4FB2?7W/,lx3|\"b\u0F1E8Wz\uFD75j\u6976v\u6F77wn}WfD\uB962,n})',S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1610445693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610445693L))
            info.setReturnValue(815301284);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/variant/SpawnContext;)Z", cancellable = true)
    private void test__1746468036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746468036L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1337143622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1337143622L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "range()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void range_875715589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875715589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__986930621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-986930621L))
            info.setReturnValue(null);
    }


}
