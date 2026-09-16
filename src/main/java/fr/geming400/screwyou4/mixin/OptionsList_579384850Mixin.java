package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.OptionsList.class)
public class OptionsList_579384850Mixin {
        @Inject(at = @At("HEAD"), method = "findOption(Lnet/minecraft/client/OptionInstance;)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void findOption__615400583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615400583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyUnsavedChanges()V", cancellable = true)
    private void applyUnsavedChanges_429401153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429401153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetOption(Lnet/minecraft/client/OptionInstance;)V", cancellable = true)
    private void resetOption_605256357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(605256357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth__1213836363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213836363L))
            info.setReturnValue(-2136456745);
    }

    @Inject(at = @At("HEAD"), method = "addHeader(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void addHeader_1228582538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228582538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall(Lnet/minecraft/client/gui/components/AbstractWidget;Lnet/minecraft/client/OptionInstance;Lnet/minecraft/client/gui/components/AbstractWidget;)V", cancellable = true)
    private void addSmall__1977144729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1977144729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall(Ljava/util/List;)V", cancellable = true)
    private void addSmall_2091059791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091059791L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall(Lnet/minecraft/client/gui/components/AbstractWidget;Lnet/minecraft/client/gui/components/AbstractWidget;)V", cancellable = true)
    private void addSmall__593192122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-593192122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall([Lnet/minecraft/client/OptionInstance;)V", cancellable = true)
    private void addSmall__1834015952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1834015952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBig(Lnet/minecraft/client/gui/components/AbstractWidget;)V", cancellable = true)
    private void addBig__81753383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-81753383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBig(Lnet/minecraft/client/OptionInstance;)V", cancellable = true)
    private void addBig_1106211552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1106211552L))
            info.cancel();
    }


}
