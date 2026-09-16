package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelManager.class)
public class ModelManager_753227180Mixin {
        @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__888159213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888159213L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "requiresRender(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void requiresRender_704244124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704244124L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItemModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void getItemModel__1856240229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856240229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemProperties(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/item/ClientItem$Properties;", cancellable = true)
    private void getItemProperties_410588244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410588244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidStateModelSet()Lnet/minecraft/client/renderer/block/FluidStateModelSet;", cancellable = true)
    private void getFluidStateModelSet_1849258897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849258897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockStateModelSet()Lnet/minecraft/client/renderer/block/BlockStateModelSet;", cancellable = true)
    private void getBlockStateModelSet__1786605327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1786605327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityModels()Ljava/util/function/Supplier;", cancellable = true)
    private void entityModels__1356464033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356464033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockModelSet()Lnet/minecraft/client/renderer/block/BlockModelSet;", cancellable = true)
    private void getBlockModelSet__1292958217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292958217L))
            info.setReturnValue(null);
    }


}
