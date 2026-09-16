package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Beardifier.Rigid.class)
public class Rigid_259226738Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__649399531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649399531L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1029650262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029650262L))
            info.setReturnValue("`jX8K,'!)x\u6303^\u3862fOFc[%\uAC67*L)T\u2DD1)n]o{x$QO'U\u69B7U Qm9[\u1128\u627BaJ*,Ho)('HJ'eqw\"VGDCa9{ ^\uC2CA\u73DFWE;JqDVsi$7y-*)mV\u4B1A5=+Q*O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_816578828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816578828L))
            info.setReturnValue(-347553989);
    }

    @Inject(at = @At("HEAD"), method = "box()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void box__734373690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734373690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "groundLevelDelta()I", cancellable = true)
    private void groundLevelDelta_2043726780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043726780L))
            info.setReturnValue(2051429057);
    }

    @Inject(at = @At("HEAD"), method = "terrainAdjustment()Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private void terrainAdjustment_21215458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21215458L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.TerrainAdjustment.ENCAPSULATE);
    }


}
