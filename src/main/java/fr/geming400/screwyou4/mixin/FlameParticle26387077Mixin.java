package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FlameParticle.class)
public class FlameParticle26387077Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FlameParticle;", cancellable = true)
    private static void values__721776530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721776530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FlameParticle;", cancellable = true)
    private static void valueOf__1842844437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842844437L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FlameParticle.OMINOUS);
    }

    @Inject(at = @At("HEAD"), method = "decode(I)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FlameParticle;", cancellable = true)
    private static void decode_515232924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515232924L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FlameParticle.OMINOUS);
    }

    @Inject(at = @At("HEAD"), method = "encode()I", cancellable = true)
    private void encode_64649323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64649323L))
            info.setReturnValue(-1297959878);
    }


}
