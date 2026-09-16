package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FontDescription.Resource.class)
public class Resource_1270149769Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_361523500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361523500L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2040573293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040573293L))
            info.setReturnValue("\uD10D't^;0&I(rrla\u05C7\u8A17");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1827501859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827501859L))
            info.setReturnValue(-2055025082);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1322628118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322628118L))
            info.setReturnValue(null);
    }


}
