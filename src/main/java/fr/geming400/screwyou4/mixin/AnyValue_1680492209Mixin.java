package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.AnyValue.class)
public class AnyValue_1680492209Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void type__378761351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378761351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_771865940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771865940L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1844051563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844051563L))
            info.setReturnValue("%t\u1CA0/wBl8dl2n\u5C93 }||,p_Ui@8= (j/MPu\u46E5#|JCX!R<@k 0o#UTcXeZps:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2057122997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057122997L))
            info.setReturnValue(-1538402507);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches_1707306035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707306035L))
            info.setReturnValue(true);
    }


}
