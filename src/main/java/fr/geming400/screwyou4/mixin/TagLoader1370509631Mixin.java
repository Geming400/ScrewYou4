package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagLoader.class)
public class TagLoader1370509631Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/packs/resources/ResourceManager;)Ljava/util/Map;", cancellable = true)
    private void load__1649478840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649478840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Ljava/util/Map;)Ljava/util/Map;", cancellable = true)
    private void build__72797936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72797936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildUpdatedLookups(Lnet/minecraft/core/RegistryAccess$Frozen;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void buildUpdatedLookups__1415622822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415622822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadTagsForExistingRegistries(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/core/RegistryAccess;)Ljava/util/List;", cancellable = true)
    private static void loadTagsForExistingRegistries_1019271428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019271428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadTagsFromNetwork(Lnet/minecraft/tags/TagNetworkSerialization$NetworkPayload;Lnet/minecraft/core/Registry;)Ljava/util/Map;", cancellable = true)
    private static void loadTagsFromNetwork__969303701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969303701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadTagsForRegistry(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/core/WritableRegistry;)V", cancellable = true)
    private static void loadTagsForRegistry__1181992344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1181992344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadTagsForRegistry(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/tags/TagLoader$ElementLookup;)Ljava/util/Map;", cancellable = true)
    private static void loadTagsForRegistry_977337973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977337973L))
            info.setReturnValue(null);
    }


}
