package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration.class)
public class VegetationPatchConfiguration_71037316Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1456549574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1456549574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1064422660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064422660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_109300057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109300057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void depth_1896317708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896317708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vegetationFeature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void vegetationFeature_1619913087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619913087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "groundState()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void groundState__1861669186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861669186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extraEdgeColumnChance()F", cancellable = true)
    private void extraEdgeColumnChance_109296678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109296678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extraBottomBlockChance()F", cancellable = true)
    private void extraBottomBlockChance_109296678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109296678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalRange()I", cancellable = true)
    private void verticalRange_109299561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109299561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vegetationChance()F", cancellable = true)
    private void vegetationChance_109296678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109296678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceable()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void replaceable_1690990359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690990359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "surface()Lnet/minecraft/world/level/levelgen/placement/CaveSurface;", cancellable = true)
    private void surface__837817310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837817310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xzRadius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void xzRadius_1896317708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896317708L))
            info.setReturnValue(null);
    }


}
