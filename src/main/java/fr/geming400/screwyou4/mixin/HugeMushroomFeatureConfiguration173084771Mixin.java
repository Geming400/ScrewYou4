package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration.class)
public class HugeMushroomFeatureConfiguration173084771Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1558597030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558597030L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__962375204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962375204L))
            info.setReturnValue(">>(J#s괒6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_211347513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211347513L))
            info.setReturnValue(1586247477);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOn()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceOn_205853360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205853360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foliageRadius()I", cancellable = true)
    private void foliageRadius_211347017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211347017L))
            info.setReturnValue(188839472);
    }

    @Inject(at = @At("HEAD"), method = "capProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void capProvider__1759621730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759621730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stemProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void stemProvider__1759621730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759621730L))
            info.setReturnValue(null);
    }


}
