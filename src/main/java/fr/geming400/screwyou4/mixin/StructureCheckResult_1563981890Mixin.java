package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureCheckResult.class)
public class StructureCheckResult_1563981890Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;", cancellable = true)
    private static void values_701193393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701193393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;", cancellable = true)
    private static void valueOf_549472202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549472202L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.StructureCheckResult.CHUNK_LOAD_NEEDED);
    }


}
