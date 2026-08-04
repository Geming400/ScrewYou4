package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagLoader.class)
public class TagLoader1370509631Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/Map;", cancellable = true)
    private void load__1251646098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1251646098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Ljava/util/Map;)Ljava/util/Map;", cancellable = true)
    private void build_1197245986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197245986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildUpdatedLookups(Lnet/minecraft/core/RegistryAccess$Frozen;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void buildUpdatedLookups_491009358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491009358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadTagsForExistingRegistries(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/core/RegistryAccess;)Ljava/util/List;", cancellable = true)
    private static void loadTagsForExistingRegistries__223517612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223517612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadTagsFromNetwork(Lnet/minecraft/tags/TagNetworkSerialization$NetworkPayload;Lnet/minecraft/core/Registry;)Ljava/util/Map;", cancellable = true)
    private static void loadTagsFromNetwork_1932967440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932967440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadTagsForRegistry(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/core/WritableRegistry;)V", cancellable = true)
    private static void loadTagsForRegistry__2040028703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2040028703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadTagsForRegistry(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/tags/TagLoader$ElementLookup;)Ljava/util/Map;", cancellable = true)
    private static void loadTagsForRegistry_984313006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984313006L))
            info.setReturnValue(null);
    }


}
