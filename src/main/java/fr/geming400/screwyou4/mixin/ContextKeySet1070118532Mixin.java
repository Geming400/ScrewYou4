package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextKeySet.class)
public class ContextKeySet1070118532Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__65341939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65341939L))
            info.setReturnValue("XSYgY칰bJb㪆GeWw7Xz}3o䒝衸N]k8j|c<.");
    }

    @Inject(at = @At("HEAD"), method = "allowed()Ljava/util/Set;", cancellable = true)
    private void allowed__758916954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758916954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "required()Ljava/util/Set;", cancellable = true)
    private void required__758916954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758916954L))
            info.setReturnValue(null);
    }


}
