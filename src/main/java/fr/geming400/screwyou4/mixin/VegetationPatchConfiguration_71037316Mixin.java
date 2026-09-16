package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration.class)
public class VegetationPatchConfiguration_71037316Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__837588953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837588953L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_841460840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841460840L))
            info.setReturnValue("\uCA8C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_628389406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628389406L))
            info.setReturnValue(1942808168);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void depth_1126436713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126436713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceable()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void replaceable__564444763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564444763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "surface()Lnet/minecraft/world/level/levelgen/placement/CaveSurface;", cancellable = true)
    private void surface_1270953999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270953999L))
            info.setReturnValue(net.minecraft.world.level.levelgen.placement.CaveSurface.FLOOR);
    }

    @Inject(at = @At("HEAD"), method = "xzRadius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void xzRadius__325746600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-325746600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extraEdgeColumnChance()F", cancellable = true)
    private void extraEdgeColumnChance_711808463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711808463L))
            info.setReturnValue(1.91135E7F);
    }

    @Inject(at = @At("HEAD"), method = "verticalRange()I", cancellable = true)
    private void verticalRange_1069986914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069986914L))
            info.setReturnValue(745026222);
    }

    @Inject(at = @At("HEAD"), method = "vegetationChance()F", cancellable = true)
    private void vegetationChance__964502652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964502652L))
            info.setReturnValue(1.91135E7F);
    }

    @Inject(at = @At("HEAD"), method = "vegetationFeature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void vegetationFeature_321028727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321028727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "groundState()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void groundState_1771976584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771976584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extraBottomBlockChance()F", cancellable = true)
    private void extraBottomBlockChance_917307168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917307168L))
            info.setReturnValue(1.91135E7F);
    }


}
