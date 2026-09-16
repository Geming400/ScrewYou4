package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.score.ContextScoreboardNameProvider.class)
public class ContextScoreboardNameProvider_1205087263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_296460994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296460994L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private void target_242026825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242026825L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.DIRECT_ATTACKER);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1975510787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1975510787L))
            info.setReturnValue("{JFmfQwbLd\uB950o-WSb.uL=U\u33F7\u171FT?p*p_yv{Y8rHX,fE^\u9247\u8DEBa");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1762439353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762439353L))
            info.setReturnValue(-197523977);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2023434780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023434780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forTarget(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/providers/score/ScoreboardNameProvider;", cancellable = true)
    private static void forTarget_310106258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310106258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1984590490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984590490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreHolder(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/scores/ScoreHolder;", cancellable = true)
    private void getScoreHolder__110873580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110873580L))
            info.setReturnValue(null);
    }


}
