package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.LayeringTransform.class)
public class LayeringTransform1199248461Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_63787990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63787990L))
            info.setReturnValue("X,I.%KM3i?uY靜'v3@&Wi@'");
    }

    @Inject(at = @At("HEAD"), method = "getModifier()Ljava/util/function/Consumer;", cancellable = true)
    private void getModifier_361142052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361142052L))
            info.setReturnValue(null);
    }


}
