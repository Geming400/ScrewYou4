package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement.class)
public class RandomSpreadStructurePlacement1918617814Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacementType;", cancellable = true)
    private void type__1022279577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022279577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spreadType()Lnet/minecraft/world/level/levelgen/structure/placement/RandomSpreadType;", cancellable = true)
    private void spreadType__825409456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825409456L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType.TRIANGULAR);
    }

    @Inject(at = @At("HEAD"), method = "separation()I", cancellable = true)
    private void separation__2048305354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048305354L))
            info.setReturnValue(1752222280);
    }

    @Inject(at = @At("HEAD"), method = "spacing()I", cancellable = true)
    private void spacing__103420839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103420839L))
            info.setReturnValue(-1133513724);
    }

    @Inject(at = @At("HEAD"), method = "getPotentialStructureChunk(JII)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getPotentialStructureChunk__444924379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444924379L))
            info.setReturnValue(null);
    }


}
