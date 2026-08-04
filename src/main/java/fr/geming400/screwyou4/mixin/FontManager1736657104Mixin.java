package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontManager.class)
public class FontManager1736657104Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1774931843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1774931843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__216111871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216111871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateOptions(Lnet/minecraft/client/Options;)V", cancellable = true)
    private void updateOptions__480479964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-480479964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFontFilterFishy()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void createFontFilterFishy__1292141279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292141279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFont()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void createFont__1292141279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292141279L))
            info.setReturnValue(null);
    }


}
