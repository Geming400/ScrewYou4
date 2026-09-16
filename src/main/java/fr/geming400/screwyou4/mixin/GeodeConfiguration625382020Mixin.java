package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration.class)
public class GeodeConfiguration625382020Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__283244248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283244248L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1395805545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1395805545L))
            info.setReturnValue("N\u7C36bO57fHFg;TC\u3F6E][D!5ZE\u01C7Q\u9FB25sx0;#OJ\uB002\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1182734111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182734111L))
            info.setReturnValue(-998701390);
    }

    @Inject(at = @At("HEAD"), method = "distributionPoints()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void distributionPoints_263415846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263415846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usePotentialPlacementsChance()D", cancellable = true)
    private void usePotentialPlacementsChance__2012311092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2012311092L))
            info.setReturnValue(2.687436007277734E8D);
    }

    @Inject(at = @At("HEAD"), method = "placementsRequireLayer0Alternate()Z", cancellable = true)
    private void placementsRequireLayer0Alternate__789750569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789750569L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "maxGenOffset()I", cancellable = true)
    private void maxGenOffset__845971253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845971253L))
            info.setReturnValue(817368111);
    }

    @Inject(at = @At("HEAD"), method = "geodeBlockSettings()Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;", cancellable = true)
    private void geodeBlockSettings_1432652581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432652581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pointOffset()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void pointOffset__1944842006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944842006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useAlternateLayer0Chance()D", cancellable = true)
    private void useAlternateLayer0Chance_712436223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712436223L))
            info.setReturnValue(2.6874360075653875E8D);
    }

    @Inject(at = @At("HEAD"), method = "noiseMultiplier()D", cancellable = true)
    private void noiseMultiplier__816676342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816676342L))
            info.setReturnValue(2.687436000859907E8D);
    }

    @Inject(at = @At("HEAD"), method = "outerWallDistance()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void outerWallDistance_1269979603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269979603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minGenOffset()I", cancellable = true)
    private void minGenOffset_1469073721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469073721L))
            info.setReturnValue(1468447932);
    }

    @Inject(at = @At("HEAD"), method = "invalidBlocksThreshold()I", cancellable = true)
    private void invalidBlocksThreshold_3115676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3115676L))
            info.setReturnValue(1308527857);
    }

    @Inject(at = @At("HEAD"), method = "geodeCrackSettings()Lnet/minecraft/world/level/levelgen/GeodeCrackSettings;", cancellable = true)
    private void geodeCrackSettings__1325039733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325039733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "geodeLayerSettings()Lnet/minecraft/world/level/levelgen/GeodeLayerSettings;", cancellable = true)
    private void geodeLayerSettings__458735459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458735459L))
            info.setReturnValue(null);
    }


}
