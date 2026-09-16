package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.class)
public class LootContext_1433872359Mixin {
        @Inject(at = @At("HEAD"), method = "getRandom()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom_392029338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(392029338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getParameter__2028846496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2028846496L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_1312767748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312767748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLuck()F", cancellable = true)
    private void getLuck__1986777406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986777406L))
            info.setReturnValue(3.804478E8F);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptionalParameter__1545069600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545069600L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getResolver()Lnet/minecraft/core/HolderGetter$Provider;", cancellable = true)
    private void getResolver__1188418482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188418482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "popVisitedElement(Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;)V", cancellable = true)
    private void popVisitedElement_266581783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(266581783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushVisitedElement(Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;)Z", cancellable = true)
    private void pushVisitedElement__1753039772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753039772L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addDynamicDrops(Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addDynamicDrops_398705121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(398705121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasParameter(Lnet/minecraft/util/context/ContextKey;)Z", cancellable = true)
    private void hasParameter__1036930534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036930534L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createVisitedEntry(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;)Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;", cancellable = true)
    private static void createVisitedEntry_1950492387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950492387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVisitedEntry(Lnet/minecraft/world/level/storage/loot/LootTable;)Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;", cancellable = true)
    private static void createVisitedEntry_554323522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554323522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVisitedEntry(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;)Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;", cancellable = true)
    private static void createVisitedEntry_910970269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910970269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasVisitedElement(Lnet/minecraft/world/level/storage/loot/LootContext$VisitedEntry;)Z", cancellable = true)
    private void hasVisitedElement__190914588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190914588L))
            info.setReturnValue(false);
    }


}
