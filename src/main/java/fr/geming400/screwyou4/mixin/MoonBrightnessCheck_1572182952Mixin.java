package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.MoonBrightnessCheck.class)
public class MoonBrightnessCheck_1572182952Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_663556683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663556683L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1952360820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952360820L))
            info.setReturnValue("\u943BtVV6+Xb=FpsOm?S\u0306.:[yMId,\u090D\u8D45\"oZ2wuE.;wB@H5w,4[KL\u93AF0L/g?\u6485/6>H\uA3D3v=Tg6Jn<c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2129535042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129535042L))
            info.setReturnValue(-412782124);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/variant/SpawnContext;)Z", cancellable = true)
    private void test__1940199858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940199858L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__164788760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164788760L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "range()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void range__1023529662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023529662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1656339091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656339091L))
            info.setReturnValue(null);
    }


}
