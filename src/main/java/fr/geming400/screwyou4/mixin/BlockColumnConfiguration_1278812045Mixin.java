package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration.class)
public class BlockColumnConfiguration_1278812045Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_370185776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370185776L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2049235569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049235569L))
            info.setReturnValue("7 p\u7E96c%A!e|8@Vs}\u6F77l\u8ECB_H?'i.S?8\u3894");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1836164135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1836164135L))
            info.setReturnValue(-2069094461);
    }

    @Inject(at = @At("HEAD"), method = "layer(Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/configurations/BlockColumnConfiguration$Layer;", cancellable = true)
    private static void layer_837568631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837568631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/List;", cancellable = true)
    private void layers_2109124094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109124094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/core/Direction;", cancellable = true)
    private void direction_807815126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807815126L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "simple(Lnet/minecraft/util/valueproviders/IntProvider;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/configurations/BlockColumnConfiguration;", cancellable = true)
    private static void simple_2097096355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097096355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prioritizeTip()Z", cancellable = true)
    private void prioritizeTip_489506407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489506407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowedPlacement()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void allowedPlacement__1823321828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823321828L))
            info.setReturnValue(null);
    }


}
