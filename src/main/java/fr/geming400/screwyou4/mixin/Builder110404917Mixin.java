package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootParams.Builder.class)
public class Builder110404917Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/world/level/storage/loot/LootParams;", cancellable = true)
    private void create_98775530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98775530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getParameter_1705340866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705340866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_777942917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777942917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withParameter__2013467097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013467097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptionalParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withOptionalParameter__2013467097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013467097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLuck(F)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withLuck__1025678797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025678797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDynamicDrop(Lnet/minecraft/resources/Identifier;Lnet/minecraft/world/level/storage/loot/LootParams$DynamicDrop;)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withDynamicDrop_1891495869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891495869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptionalParameter_1705340866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705340866L))
            info.setReturnValue(null);
    }


}
