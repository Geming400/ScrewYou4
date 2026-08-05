package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration.class)
public class BlockColumnConfiguration_1278812045Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1630642993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630642993L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_143352069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143352069L))
            info.setReturnValue("<\u5D98dBS\u7BC7E'H&py#1np}\u78DDlI\u6A93C`69Ecb=lX?6K5;0\u6B2AP}Ba(\uB517[OUs\u89E2\u016EtF!y\u44D4J6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1317074786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317074786L))
            info.setReturnValue(900378930);
    }

    @Inject(at = @At("HEAD"), method = "layer(Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/configurations/BlockColumnConfiguration$Layer;", cancellable = true)
    private static void layer__1052913560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052913560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/List;", cancellable = true)
    private void layers__1389818436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389818436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/core/Direction;", cancellable = true)
    private void direction_515956759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515956759L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "simple(Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/configurations/BlockColumnConfiguration;", cancellable = true)
    private static void simple_1702708501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702708501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prioritizeTip()Z", cancellable = true)
    private void prioritizeTip_1317090627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317090627L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowedPlacement()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void allowedPlacement_1311580633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311580633L))
            info.setReturnValue(null);
    }


}
