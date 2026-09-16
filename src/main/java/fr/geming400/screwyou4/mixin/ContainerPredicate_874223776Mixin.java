package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.ContainerPredicate.class)
public class ContainerPredicate_874223776Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__34402493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34402493L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1644647300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644647300L))
            info.setReturnValue("m'\uB961<a\uC006*n(\u0AEES'Ue\uD10ASIQ\u698C*Rrw:&B\u7CDF>W\uFB2An2)ax");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1431575866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431575866L))
            info.setReturnValue(752436943);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1704228987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704228987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__593913569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593913569L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/ItemContainerContents;)Z", cancellable = true)
    private void matches__1289774809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289774809L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items_460304909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460304909L))
            info.setReturnValue(null);
    }


}
