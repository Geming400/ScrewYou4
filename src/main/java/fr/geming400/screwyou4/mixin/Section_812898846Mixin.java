package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.BeaconRenderState.Section.class)
public class Section_812898846Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2096556192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096556192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__322561130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322561130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_851161587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851161587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_851161091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851161091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_851161091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851161091L))
            info.setReturnValue(null);
    }


}
