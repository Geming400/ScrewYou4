package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontManager.class)
public class FontManager1736657104Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__377918325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-377918325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload_95270216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(95270216L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "createFontFilterFishy()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void createFontFilterFishy_1948774467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948774467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateOptions(Lnet/minecraft/client/Options;)V", cancellable = true)
    private void updateOptions_412124015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(412124015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFont()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void createFont__338499114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338499114L))
            info.setReturnValue(null);
    }


}
