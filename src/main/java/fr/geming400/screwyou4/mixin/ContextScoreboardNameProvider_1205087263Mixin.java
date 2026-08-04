package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.score.ContextScoreboardNameProvider.class)
public class ContextScoreboardNameProvider_1205087263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1704367775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704367775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private void target_695083066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695083066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_69627287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69627287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1243350004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243350004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1354026310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354026310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreHolder(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/scores/ScoreHolder;", cancellable = true)
    private void getScoreHolder__1922463124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922463124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forTarget(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/providers/score/ScoreboardNameProvider;", cancellable = true)
    private static void forTarget__910415400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910415400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__623948224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623948224L))
            info.setReturnValue(null);
    }


}
