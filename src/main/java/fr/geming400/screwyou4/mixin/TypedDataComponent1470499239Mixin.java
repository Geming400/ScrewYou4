package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.TypedDataComponent.class)
public class TypedDataComponent1470499239Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void type__588754320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588754320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_466978291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466978291L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_561872971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561872971L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2054045028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054045028L))
            info.setReturnValue("{\u5DB5^8.Px\u7B46_Wt[DVJe\u0408VB1k4\u4028(a[yRT\u6DEE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2027851330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027851330L))
            info.setReturnValue(200836260);
    }

    @Inject(at = @At("HEAD"), method = "encodeValue(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encodeValue__1625325049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1625325049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyTo(Lnet/minecraft/core/component/PatchedDataComponentMap;)V", cancellable = true)
    private void applyTo_1600429886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1600429886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createUnchecked(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/TypedDataComponent;", cancellable = true)
    private static void createUnchecked_1439084934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439084934L))
            info.setReturnValue(null);
    }


}
