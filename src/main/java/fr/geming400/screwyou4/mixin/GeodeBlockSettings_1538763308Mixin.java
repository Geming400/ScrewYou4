package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.GeodeBlockSettings.class)
public class GeodeBlockSettings_1538763308Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1370691730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370691730L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_403303332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403303332L))
            info.setReturnValue("V蜫5+F4R0Eਠ!6Mu1(^2bHd'?iq_Uy(nYm_佟qkT凂$+,z}6)F,-鲶2ꗓ;t+\"|饨&xg骧v<p&s;:IRkZ#a(HE3+R曚'퓀Tn葱19q+cdx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1577026049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577026049L))
            info.setReturnValue(-1445460814);
    }

    @Inject(at = @At("HEAD"), method = "innerLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void innerLayerProvider__393943194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393943194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invalidBlocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void invalidBlocks__1136250945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136250945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cannotReplace()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void cannotReplace__1136250945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136250945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "middleLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void middleLayerProvider__393943194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393943194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "innerPlacements()Ljava/util/List;", cancellable = true)
    private void innerPlacements__1129867173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129867173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outerLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void outerLayerProvider__393943194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393943194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillingProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void fillingProvider__393943194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393943194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alternateInnerLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void alternateInnerLayerProvider__393943194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393943194L))
            info.setReturnValue(null);
    }


}
