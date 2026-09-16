package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootParams.Builder.class)
public class Builder110404917Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/world/level/storage/loot/LootParams;", cancellable = true)
    private void create__515866514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-515866514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getParameter_942653359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942653359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel__10699693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10699693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withParameter_162370218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162370218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptionalParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withOptionalParameter_1941190954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941190954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLuck(F)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withLuck__1093707830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093707830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDynamicDrop(Lnet/minecraft/resources/Identifier;Lnet/minecraft/world/level/storage/loot/LootParams$DynamicDrop;)Lnet/minecraft/world/level/storage/loot/LootParams$Builder;", cancellable = true)
    private void withDynamicDrop_607015141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607015141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptionalParameter_1426430255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426430255L))
            info.setReturnValue(new java.lang.Object());
    }


}
