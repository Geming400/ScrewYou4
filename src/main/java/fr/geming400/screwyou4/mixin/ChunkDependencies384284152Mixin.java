package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkDependencies.class)
public class ChunkDependencies384284152Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_422546398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422546398L))
            info.setReturnValue(343258580);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void get_521238349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521238349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__751176319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751176319L))
            info.setReturnValue("y+A?Gt{@VP;zaA4O쫔.Vc7oc+xB=jwDJHꟐl+xJD/W[U뫄@|駘");
    }

    @Inject(at = @At("HEAD"), method = "asList()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void asList_1352062685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352062685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRadius()I", cancellable = true)
    private void getRadius_422546398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422546398L))
            info.setReturnValue(343258580);
    }

    @Inject(at = @At("HEAD"), method = "getRadiusOf(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)I", cancellable = true)
    private void getRadiusOf__932334643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932334643L))
            info.setReturnValue(1544302475);
    }


}
