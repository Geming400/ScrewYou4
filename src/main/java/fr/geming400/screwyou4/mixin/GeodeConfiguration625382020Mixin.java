package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration.class)
public class GeodeConfiguration625382020Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2010894279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010894279L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__510077955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-510077955L))
            info.setReturnValue("Ox98Vg;Q\u52E9Dln>{'0}72';nia|H;q\u1A74#?D;N\u64C1_6()119BW\u3551G\u46ED\u4378P5c5\u68ADZ>vi=iUAD\uB658tp9\uD60F=ppgg}\"J/a|S\uBA59@(7,w(n\u76F98");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_663644762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663644762L))
            info.setReturnValue(-1752914449);
    }

    @Inject(at = @At("HEAD"), method = "distributionPoints()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void distributionPoints__1844304883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844304883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usePotentialPlacementsChance()D", cancellable = true)
    private void usePotentialPlacementsChance_663639461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663639461L))
            info.setReturnValue(4.932875003843847E8D);
    }

    @Inject(at = @At("HEAD"), method = "placementsRequireLayer0Alternate()Z", cancellable = true)
    private void placementsRequireLayer0Alternate_663660603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663660603L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "geodeCrackSettings()Lnet/minecraft/world/level/levelgen/GeodeCrackSettings;", cancellable = true)
    private void geodeCrackSettings__1929651210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929651210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "geodeBlockSettings()Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;", cancellable = true)
    private void geodeBlockSettings__362379453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362379453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "geodeLayerSettings()Lnet/minecraft/world/level/levelgen/GeodeLayerSettings;", cancellable = true)
    private void geodeLayerSettings__1019800577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019800577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseMultiplier()D", cancellable = true)
    private void noiseMultiplier_663639461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663639461L))
            info.setReturnValue(4.932875003843847E8D);
    }

    @Inject(at = @At("HEAD"), method = "minGenOffset()I", cancellable = true)
    private void minGenOffset_663644266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663644266L))
            info.setReturnValue(-1574390960);
    }

    @Inject(at = @At("HEAD"), method = "useAlternateLayer0Chance()D", cancellable = true)
    private void useAlternateLayer0Chance_663639461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663639461L))
            info.setReturnValue(4.932875003843847E8D);
    }

    @Inject(at = @At("HEAD"), method = "outerWallDistance()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void outerWallDistance__1844304883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844304883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pointOffset()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void pointOffset__1844304883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844304883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invalidBlocksThreshold()I", cancellable = true)
    private void invalidBlocksThreshold_663644266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663644266L))
            info.setReturnValue(-1574390960);
    }

    @Inject(at = @At("HEAD"), method = "maxGenOffset()I", cancellable = true)
    private void maxGenOffset_663644266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663644266L))
            info.setReturnValue(-1574390960);
    }


}
