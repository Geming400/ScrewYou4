package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceSpreader.SpreadPos.class)
public class SpreadPos_2092759747Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1184133478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184133478L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1431784025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431784025L))
            info.setReturnValue("VMKW^2!NC\u1AC1f2fHQvGCK.\u46C0\u1651C\u301E\u0821xg1Ny7[D<r*\u15BA*g\u6A863&/l2?([Q\u25FD2Td");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1644855459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644855459L))
            info.setReturnValue(49494915);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__188016529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188016529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "face()Lnet/minecraft/core/Direction;", cancellable = true)
    private void face_280803946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280803946L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }


}
