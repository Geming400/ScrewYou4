package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.score.FixedScoreboardNameProvider.class)
public class FixedScoreboardNameProvider1643055590Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1842644550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842644550L))
            info.setReturnValue("\u15BCc0");
    }

    @Inject(at = @At("HEAD"), method = "forName(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/providers/score/ScoreboardNameProvider;", cancellable = true)
    private static void forName_1828284615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828284615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_734429322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734429322L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1881488181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881488181L))
            info.setReturnValue("\uADE2\"\u8EB3\u7018^*\u6202xE\u56FDc_3&zNERU\u249E7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2094559615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094559615L))
            info.setReturnValue(-594173337);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1585466452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585466452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreHolder(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/scores/ScoreHolder;", cancellable = true)
    private void getScoreHolder_327094748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327094748L))
            info.setReturnValue(null);
    }


}
