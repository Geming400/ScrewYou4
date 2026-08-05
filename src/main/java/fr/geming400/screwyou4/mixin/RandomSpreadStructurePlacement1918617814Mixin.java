package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement.class)
public class RandomSpreadStructurePlacement1918617814Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacementType;", cancellable = true)
    private void type__445329951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445329951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spreadType()Lnet/minecraft/world/level/levelgen/structure/placement/RandomSpreadType;", cancellable = true)
    private void spreadType_537646717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537646717L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType.TRIANGULAR);
    }

    @Inject(at = @At("HEAD"), method = "getPotentialStructureChunk(JII)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getPotentialStructureChunk__2023739481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023739481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spacing()I", cancellable = true)
    private void spacing_1956880060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956880060L))
            info.setReturnValue(-1774754690);
    }

    @Inject(at = @At("HEAD"), method = "separation()I", cancellable = true)
    private void separation_1956880060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956880060L))
            info.setReturnValue(-1774754690);
    }


}
