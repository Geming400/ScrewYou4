package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.LayeringTransform.class)
public class LayeringTransform1199248461Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1969671490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969671490L))
            info.setReturnValue("raGN<^K+|VgI5fp[uI&mN|2]/Q-n9jS\u655FOqD_^%pl@Q%#\u4C13.,jq2uo");
    }

    @Inject(at = @At("HEAD"), method = "getModifier()Ljava/util/function/Consumer;", cancellable = true)
    private void getModifier_523392119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523392119L))
            info.setReturnValue(null);
    }


}
