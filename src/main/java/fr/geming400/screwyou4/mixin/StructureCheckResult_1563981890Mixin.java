package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureCheckResult.class)
public class StructureCheckResult_1563981890Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;", cancellable = true)
    private static void values__73002609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73002609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;", cancellable = true)
    private static void valueOf__1432703502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432703502L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.StructureCheckResult.CHUNK_LOAD_NEEDED);
    }


}
