package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ReloadableServerResources.class)
public class ReloadableServerResources_1198636063Mixin {
        @Inject(at = @At("HEAD"), method = "listeners()Ljava/util/List;", cancellable = true)
    private void listeners__1220221171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220221171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdvancements()Lnet/minecraft/server/ServerAdvancementManager;", cancellable = true)
    private void getAdvancements_427043697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427043697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeManager()Lnet/minecraft/world/item/crafting/RecipeManager;", cancellable = true)
    private void getRecipeManager_1918705660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918705660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommands()Lnet/minecraft/commands/Commands;", cancellable = true)
    private void getCommands_982685353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982685353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateComponentsAndStaticRegistryTags()V", cancellable = true)
    private void updateComponentsAndStaticRegistryTags_709672469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(709672469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFunctionLibrary()Lnet/minecraft/server/ServerFunctionLibrary;", cancellable = true)
    private void getFunctionLibrary_2064907569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064907569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullRegistries()Lnet/minecraft/server/ReloadableServerRegistries$Holder;", cancellable = true)
    private void fullRegistries_631438927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631438927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadResources(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/core/LayeredRegistryAccess;Ljava/util/List;Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/commands/Commands$CommandSelection;Lnet/minecraft/server/permissions/PermissionSet;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void loadResources__1702475875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702475875L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
