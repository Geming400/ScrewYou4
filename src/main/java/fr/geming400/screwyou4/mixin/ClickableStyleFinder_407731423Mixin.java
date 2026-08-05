package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ActiveTextCollector.ClickableStyleFinder.class)
public class ClickableStyleFinder_407731423Mixin {
        @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void result_98124733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98124733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/client/gui/TextAlignment;IILnet/minecraft/client/gui/ActiveTextCollector$Parameters;Lnet/minecraft/util/FormattedCharSequence;)V", cancellable = true)
    private void accept_1853499016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1853499016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptScrolling(Lnet/minecraft/network/chat/Component;IIIIILnet/minecraft/client/gui/ActiveTextCollector$Parameters;)V", cancellable = true)
    private void acceptScrolling__491099413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-491099413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "includeInsertions(Z)Lnet/minecraft/client/gui/ActiveTextCollector$ClickableStyleFinder;", cancellable = true)
    private void includeInsertions_701271689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701271689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultParameters()Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void defaultParameters_688629802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688629802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultParameters(Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;)V", cancellable = true)
    private void defaultParameters_1306654960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1306654960L))
            info.cancel();
    }


}
