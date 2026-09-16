package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ActiveTextCollector.ClickableStyleFinder.class)
public class ClickableStyleFinder_407731423Mixin {
        @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void result__1297281510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297281510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/client/gui/TextAlignment;IILnet/minecraft/client/gui/ActiveTextCollector$Parameters;Lnet/minecraft/util/FormattedCharSequence;)V", cancellable = true)
    private void accept__2061948528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2061948528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acceptScrolling(Lnet/minecraft/network/chat/Component;IIIIILnet/minecraft/client/gui/ActiveTextCollector$Parameters;)V", cancellable = true)
    private void acceptScrolling_1462552510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1462552510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "includeInsertions(Z)Lnet/minecraft/client/gui/ActiveTextCollector$ClickableStyleFinder;", cancellable = true)
    private void includeInsertions_2035525877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035525877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultParameters()Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void defaultParameters_596540671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596540671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultParameters(Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;)V", cancellable = true)
    private void defaultParameters__1548108101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1548108101L))
            info.cancel();
    }


}
