package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.JigsawStructure.class)
public class JigsawStructure1401280852Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_255679384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255679384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartPool()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getStartPool__1344810672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344810672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPoolAliases()Ljava/util/List;", cancellable = true)
    private void getPoolAliases__1267349628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267349628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_1400611830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400611830L))
            info.setReturnValue(null);
    }


}
