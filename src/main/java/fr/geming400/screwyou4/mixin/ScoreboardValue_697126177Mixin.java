package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.ScoreboardValue.class)
public class ScoreboardValue_697126177Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2082638435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082638435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/level/storage/loot/providers/score/ScoreboardNameProvider;", cancellable = true)
    private void target__1765703949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765703949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__438333799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438333799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_735388918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735388918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__1679842142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679842142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_735385539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735385539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__2021210429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2021210429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1861987396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861987396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "score()Ljava/lang/String;", cancellable = true)
    private void score__438334295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438334295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromScoreboard(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Ljava/lang/String;F)Lnet/minecraft/world/level/storage/loot/providers/number/ScoreboardValue;", cancellable = true)
    private static void fromScoreboard_1570877886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570877886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromScoreboard(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/providers/number/ScoreboardValue;", cancellable = true)
    private static void fromScoreboard__394310758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394310758L))
            info.setReturnValue(null);
    }


}
