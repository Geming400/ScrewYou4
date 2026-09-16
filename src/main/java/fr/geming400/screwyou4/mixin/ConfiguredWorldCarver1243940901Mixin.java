package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver.class)
public class ConfiguredWorldCarver1243940901Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_335314633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335314633L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2014364426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014364426L))
            info.setReturnValue("hU]K\"\u4D17e\uC1DE7\u8E18F*{Jgs");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1801292992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801292992L))
            info.setReturnValue(-1078294143);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;", cancellable = true)
    private void config__978800583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978800583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve_512734682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512734682L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk__208645199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-208645199L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "worldCarver()Lnet/minecraft/world/level/levelgen/carver/WorldCarver;", cancellable = true)
    private void worldCarver__1084463424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084463424L))
            info.setReturnValue(null);
    }


}
