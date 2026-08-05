package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerFunctionLibrary.class)
public class ServerFunctionLibrary_357080078Mixin {
        @Inject(at = @At("HEAD"), method = "getFunction(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getFunction_23188531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23188531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1595688898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1595688898L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getTag(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getTag_767970485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767970485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctions()Ljava/util/Map;", cancellable = true)
    private void getFunctions__1647543563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647543563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableTags()Ljava/lang/Iterable;", cancellable = true)
    private void getAvailableTags__1652669611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652669611L))
            info.setReturnValue(null);
    }


}
