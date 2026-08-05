package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.class)
public class StructureTemplatePool185224987Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_223487233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223487233L))
            info.setReturnValue(-868598936);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;)I", cancellable = true)
    private void getMaxSize__1724874195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724874195L))
            info.setReturnValue(1217291764);
    }

    @Inject(at = @At("HEAD"), method = "getFallback()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getFallback_1734100759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734100759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemplates()Ljava/util/List;", cancellable = true)
    private void getTemplates_1811561803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811561803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomTemplate(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElement;", cancellable = true)
    private void getRandomTemplate_808335831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808335831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledTemplates(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledTemplates_141708203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141708203L))
            info.setReturnValue(null);
    }


}
