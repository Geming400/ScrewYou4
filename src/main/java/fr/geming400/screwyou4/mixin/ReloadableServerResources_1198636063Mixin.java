package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ReloadableServerResources.class)
public class ReloadableServerResources_1198636063Mixin {
        @Inject(at = @At("HEAD"), method = "listeners()Ljava/util/List;", cancellable = true)
    private void listeners__1469994418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469994418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadResources(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/core/LayeredRegistryAccess;Ljava/util/List;Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/commands/Commands$CommandSelection;Lnet/minecraft/server/permissions/PermissionSet;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void loadResources__1385571300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385571300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionLibrary()Lnet/minecraft/server/ServerFunctionLibrary;", cancellable = true)
    private void getFunctionLibrary_1660588964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660588964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullRegistries()Lnet/minecraft/server/ReloadableServerRegistries$Holder;", cancellable = true)
    private void fullRegistries__68437051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68437051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeManager()Lnet/minecraft/world/item/crafting/RecipeManager;", cancellable = true)
    private void getRecipeManager__734040347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734040347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdvancements()Lnet/minecraft/server/ServerAdvancementManager;", cancellable = true)
    private void getAdvancements_1409646618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409646618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommands()Lnet/minecraft/commands/Commands;", cancellable = true)
    private void getCommands__484763673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484763673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateComponentsAndStaticRegistryTags()V", cancellable = true)
    private void updateComponentsAndStaticRegistryTags_1236910801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1236910801L))
            info.cancel();
    }


}
