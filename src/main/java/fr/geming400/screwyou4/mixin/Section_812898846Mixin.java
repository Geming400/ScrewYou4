package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.BeaconRenderState.Section.class)
public class Section_812898846Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__95727423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95727423L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1583322370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583322370L))
            info.setReturnValue("ftpaM\u5295%38LYD\u45E23q|yUXOj&D\u3DA999WO!X`3,+s>\u563C9 ]\uC162L^Z7,qDK]d%/Wx<H:xB\uCD1D$,F^vB?;%p:Jk* f[Y<dX\uD4AEpWF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1370250936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370250936L))
            info.setReturnValue(-258824838);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_2049549952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049549952L))
            info.setReturnValue(1889216333);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__272449732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272449732L))
            info.setReturnValue(803115046);
    }


}
