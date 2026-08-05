package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureCheck.class)
public class StructureCheck1119676977Mixin {
        @Inject(at = @At("HEAD"), method = "incrementReference(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)V", cancellable = true)
    private void incrementReference_707626799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(707626799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStructureLoad(Lnet/minecraft/world/level/ChunkPos;Ljava/util/Map;)V", cancellable = true)
    private void onStructureLoad__829475149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-829475149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkStart(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement;Z)Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;", cancellable = true)
    private void checkStart__479142211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479142211L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.StructureCheckResult.CHUNK_LOAD_NEEDED);
    }


}
