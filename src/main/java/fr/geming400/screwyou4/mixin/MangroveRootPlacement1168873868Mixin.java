package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacement.class)
public class MangroveRootPlacement1168873868Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1740581169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740581169L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_33413893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33413893L))
            info.setReturnValue("#C\u3747\uCCF5)l-G\u9CC9a\u3D21<\u2ADBd^mZ3\u714A3F42{65I=3u`ervNzd}csC&>oica?!02+2'\u42ECA[]XYeJ<bQ\u1A92lg9V+W\u3321");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1207136610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207136610L))
            info.setReturnValue(-1513474530);
    }

    @Inject(at = @At("HEAD"), method = "canGrowThrough()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void canGrowThrough__1506140384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506140384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxRootWidth()I", cancellable = true)
    private void maxRootWidth_1207136114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207136114L))
            info.setReturnValue(1408708691);
    }

    @Inject(at = @At("HEAD"), method = "maxRootLength()I", cancellable = true)
    private void maxRootLength_1207136114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207136114L))
            info.setReturnValue(1408708691);
    }

    @Inject(at = @At("HEAD"), method = "muddyRootsProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void muddyRootsProvider__763832633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763832633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomSkewChance()F", cancellable = true)
    private void randomSkewChance_1207133231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207133231L))
            info.setReturnValue(4.433096E8F);
    }

    @Inject(at = @At("HEAD"), method = "muddyRootsIn()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void muddyRootsIn__1506140384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506140384L))
            info.setReturnValue(null);
    }


}
