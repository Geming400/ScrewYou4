package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.SimpleReloadInstance.class)
public class SimpleReloadInstance_17826146Mixin {
        @Inject(at = @At("HEAD"), method = "done()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void done_1731201406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1731201406L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;)Lnet/minecraft/server/packs/resources/ReloadInstance;", cancellable = true)
    private static void of_131271918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(131271918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;Z)Lnet/minecraft/server/packs/resources/ReloadInstance;", cancellable = true)
    private static void create__224764276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224764276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActualProgress()F", cancellable = true)
    private void getActualProgress_56085508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(56085508L))
            info.setReturnValue(1.614023E8F);
    }


}
