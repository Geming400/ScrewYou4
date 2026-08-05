package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextKeySet.class)
public class ContextKeySet1070118532Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1840541561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840541561L))
            info.setReturnValue("glN!T&6\uD269vk \u47BD{\u4A5B.Gd-VvFt$\u9471Q\u247C8 n\u7C33Xdr$?CD\uAF85nxqII\u79D9,(.\u6EA6-'e<7d\"d");
    }

    @Inject(at = @At("HEAD"), method = "allowed()Ljava/util/Set;", cancellable = true)
    private void allowed__1033837058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033837058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "required()Ljava/util/Set;", cancellable = true)
    private void required_1662579367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662579367L))
            info.setReturnValue(null);
    }


}
