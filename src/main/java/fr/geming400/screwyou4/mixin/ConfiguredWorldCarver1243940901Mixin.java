package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver.class)
public class ConfiguredWorldCarver1243940901Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1665514136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665514136L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_108480926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108480926L))
            info.setReturnValue("f烕!CV㒸>sc他03⪍@rXP5䠊sk([xXc.E! LOE;mᾡelZ*O&_䋵7,QZ$腀ꯑqs]QX҄/7涉^mU{n6>t▎W83S-n艱E팖]x`mjihL9;aB)럪Pkv|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1282203643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282203643L))
            info.setReturnValue(-2007736287);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/carver/CarverConfiguration;", cancellable = true)
    private void config_482869947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482869947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStartChunk(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void isStartChunk__463070340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463070340L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "worldCarver()Lnet/minecraft/world/level/levelgen/carver/WorldCarver;", cancellable = true)
    private void worldCarver__1898027807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898027807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "carve(Lnet/minecraft/world/level/levelgen/carver/CarvingContext;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/Aquifer;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/CarvingMask;)Z", cancellable = true)
    private void carve__1501553475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501553475L))
            info.setReturnValue(false);
    }


}
