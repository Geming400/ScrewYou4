package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.SimpleReloadInstance.class)
public class SimpleReloadInstance_17826146Mixin {
        @Inject(at = @At("HEAD"), method = "done()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void done__1659276800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659276800L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;)Lnet/minecraft/server/packs/resources/ReloadInstance;", cancellable = true)
    private static void of_1454264695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454264695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;Z)Lnet/minecraft/server/packs/resources/ReloadInstance;", cancellable = true)
    private static void create__1084112248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084112248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActualProgress()F", cancellable = true)
    private void getActualProgress__1600768045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1600768045L))
            info.setReturnValue(5.921681E8F);
    }


}
