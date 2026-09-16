package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.JigsawStructure.class)
public class JigsawStructure1401280852Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__253945134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253945134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPoolAliases()Ljava/util/List;", cancellable = true)
    private void getPoolAliases_387172240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387172240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartPool()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getStartPool__622300312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-622300312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint__519473003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519473003L))
            info.setReturnValue(null);
    }


}
