package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelManager.class)
public class ModelManager_753227180Mixin {
        @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1199541300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199541300L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getFluidStateModelSet()Lnet/minecraft/client/renderer/block/FluidStateModelSet;", cancellable = true)
    private void getFluidStateModelSet_77616155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77616155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresRender(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void requiresRender_1182865408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182865408L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItemModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void getItemModel__1377195909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377195909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemProperties(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/item/ClientItem$Properties;", cancellable = true)
    private void getItemProperties__1636817480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636817480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockModelSet()Lnet/minecraft/client/renderer/block/BlockModelSet;", cancellable = true)
    private void getBlockModelSet__1368762265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368762265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityModels()Ljava/util/function/Supplier;", cancellable = true)
    private void entityModels_284068588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284068588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockStateModelSet()Lnet/minecraft/client/renderer/block/BlockStateModelSet;", cancellable = true)
    private void getBlockStateModelSet__1720190754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720190754L))
            info.setReturnValue(null);
    }


}
