package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.OptionsList.class)
public class OptionsList_579384850Mixin {
        @Inject(at = @At("HEAD"), method = "findOption(Lnet/minecraft/client/OptionInstance;)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void findOption_1755034695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755034695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetOption(Lnet/minecraft/client/OptionInstance;)V", cancellable = true)
    private void resetOption__134157055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-134157055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_617647095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617647095L))
            info.setReturnValue(-1608291657);
    }

    @Inject(at = @At("HEAD"), method = "applyUnsavedChanges()V", cancellable = true)
    private void applyUnsavedChanges_617659588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(617659588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addHeader(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void addHeader__1321794088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1321794088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBig(Lnet/minecraft/client/OptionInstance;)V", cancellable = true)
    private void addBig__134157055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-134157055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBig(Lnet/minecraft/client/gui/components/AbstractWidget;)V", cancellable = true)
    private void addBig__663131496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-663131496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall(Lnet/minecraft/client/gui/components/AbstractWidget;Lnet/minecraft/client/OptionInstance;Lnet/minecraft/client/gui/components/AbstractWidget;)V", cancellable = true)
    private void addSmall__1395699967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1395699967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall([Lnet/minecraft/client/OptionInstance;)V", cancellable = true)
    private void addSmall_1130618838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1130618838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall(Lnet/minecraft/client/gui/components/AbstractWidget;Lnet/minecraft/client/gui/components/AbstractWidget;)V", cancellable = true)
    private void addSmall_649107052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(649107052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSmall(Ljava/util/List;)V", cancellable = true)
    private void addSmall__199833739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-199833739L))
            info.cancel();
    }


}
