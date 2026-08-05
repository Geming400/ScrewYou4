package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerFunctionLibrary.class)
public class ServerFunctionLibrary_357080078Mixin {
        @Inject(at = @At("HEAD"), method = "getFunction(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getFunction__1478824831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1478824831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1284306811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1284306811L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getTag(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getTag_487735577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487735577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableTags()Ljava/lang/Iterable;", cancellable = true)
    private void getAvailableTags__763755999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763755999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctions()Ljava/util/Map;", cancellable = true)
    private void getFunctions_1669449200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669449200L))
            info.setReturnValue(null);
    }


}
