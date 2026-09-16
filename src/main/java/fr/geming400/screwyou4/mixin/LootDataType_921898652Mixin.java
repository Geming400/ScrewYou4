package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootDataType.class)
public class LootDataType_921898652Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_13272383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(13272383L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1692322176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692322176L))
            info.setReturnValue("b\u732B\u9D5E\uCD4B7|0Ew'c|xZ\uFD02`*IuQX=@k,G61Bc\u06BE&\uB3B8[;m>\u1336\u9D9D\uC3D7jSJ^w\u43DBSuc}/*?#\u637EW=}>.)-l\u37C3JI1\u0F11qfaY;WSml\u96EBY$");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/stream/Stream;", cancellable = true)
    private static void values__1647428058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647428058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1479250742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479250742L))
            info.setReturnValue(-1228238352);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__882810889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882810889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registryKey_1840241962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840241962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runValidation(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;Lnet/minecraft/core/HolderLookup;)V", cancellable = true)
    private void runValidation__359218702(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-359218702L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runValidation(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/storage/loot/Validatable;)V", cancellable = true)
    private void runValidation_727707390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(727707390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contextGetter()Lnet/minecraft/world/level/storage/loot/LootDataType$ContextGetter;", cancellable = true)
    private void contextGetter_1383233708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383233708L))
            info.setReturnValue(null);
    }


}
