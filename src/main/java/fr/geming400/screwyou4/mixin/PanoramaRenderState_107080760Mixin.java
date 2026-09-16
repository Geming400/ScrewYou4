package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.PanoramaRenderState.class)
public class PanoramaRenderState_107080760Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__801545509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801545509L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_877504284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877504284L))
            info.setReturnValue("G/\uD56E$#OkV2*mRi1KObUw7d$f (%'UP!6tin+\u3305S@'q4tR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_664432850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664432850L))
            info.setReturnValue(1310880893);
    }

    @Inject(at = @At("HEAD"), method = "spin()F", cancellable = true)
    private void spin__2079418408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079418408L))
            info.setReturnValue(7.328951E8F);
    }


}
