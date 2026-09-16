package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.ScoreboardValue.class)
public class ScoreboardValue_697126177Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__211500092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211500092L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/level/storage/loot/providers/score/ScoreboardNameProvider;", cancellable = true)
    private void target__556801598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556801598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1467549701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467549701L))
            info.setReturnValue("{`1I6wHLb?e$UAJbxv5a1b/$CUn|5a3+}f)9B4D.,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1254478267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254478267L))
            info.setReturnValue(-1723418789);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_467655356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467655356L))
            info.setReturnValue(6.742703E8F);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__1726591815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726591815L))
            info.setReturnValue(6.742703E8F);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__321592595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-321592595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "score()Ljava/lang/String;", cancellable = true)
    private void score_730444219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730444219L))
            info.setReturnValue("Xt)&");
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1763571430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763571430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromScoreboard(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Ljava/lang/String;F)Lnet/minecraft/world/level/storage/loot/providers/number/ScoreboardValue;", cancellable = true)
    private static void fromScoreboard_675414688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675414688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromScoreboard(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/providers/number/ScoreboardValue;", cancellable = true)
    private static void fromScoreboard__838838664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838838664L))
            info.setReturnValue(null);
    }


}
