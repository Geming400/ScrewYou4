package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FlameParticle.class)
public class FlameParticle26387077Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FlameParticle;", cancellable = true)
    private static void values__2072253300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072253300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FlameParticle;", cancellable = true)
    private static void valueOf_549818899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549818899L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FlameParticle.OMINOUS);
    }

    @Inject(at = @At("HEAD"), method = "decode(I)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner$FlameParticle;", cancellable = true)
    private static void decode_37475182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37475182L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.FlameParticle.OMINOUS);
    }

    @Inject(at = @At("HEAD"), method = "encode()I", cancellable = true)
    private void encode_1896192021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896192021L))
            info.setReturnValue(1640209118);
    }


}
