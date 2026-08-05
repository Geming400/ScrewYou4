package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.TypedDataComponent.class)
public class TypedDataComponent1470499239Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void type__1556149194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556149194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__965275838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965275838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1438955798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438955798L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_335038768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335038768L))
            info.setReturnValue("o$5H'AzC8N$F}=%!8GwEFtfGs:.M\u1BDF}G\u62C8o:cHp1 /sk@jdBhqkA8\uBB1Ep%Bjf\u02C8L[{\u7756\uC51Bp\u01A2)qUr\uCDCEQu\u3322Y+\uB22C|\u8DEBXvtKCQS/:\uB54F\uA106A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1508761981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508761981L))
            info.setReturnValue(-2076345808);
    }

    @Inject(at = @At("HEAD"), method = "encodeValue(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encodeValue_1363471436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363471436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyTo(Lnet/minecraft/core/component/PatchedDataComponentMap;)V", cancellable = true)
    private void applyTo_954168167(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(954168167L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createUnchecked(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/TypedDataComponent;", cancellable = true)
    private static void createUnchecked__1069817064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069817064L))
            info.setReturnValue(null);
    }


}
