package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.class)
public class StructureTemplatePool185224987Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_628956576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628956576L))
            info.setReturnValue(-762100330);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;)I", cancellable = true)
    private void getMaxSize__979632770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979632770L))
            info.setReturnValue(-689816379);
    }

    @Inject(at = @At("HEAD"), method = "getFallback()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getFallback__1602496577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602496577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledTemplates(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledTemplates_1932755059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932755059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemplates()Ljava/util/List;", cancellable = true)
    private void getTemplates_665457230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665457230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomTemplate(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElement;", cancellable = true)
    private void getRandomTemplate_111196138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111196138L))
            info.setReturnValue(null);
    }


}
