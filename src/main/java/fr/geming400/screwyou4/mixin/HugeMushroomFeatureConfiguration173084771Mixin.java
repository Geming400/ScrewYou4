package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration.class)
public class HugeMushroomFeatureConfiguration173084771Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__735541497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735541497L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_943508296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943508296L))
            info.setReturnValue(".<R0;43MZiKlw01cg{_an/93#VD'0,NG\u56EF<\u463CSO/!$[M?\uFEDAIXwCzgkb9^Oj\u1E6B.8W##s\u5175!5W?(A5#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_730436862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730436862L))
            info.setReturnValue(-130116867);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOn()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceOn_234752666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234752666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "capProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void capProvider_92052161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92052161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stemProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void stemProvider_1129288440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129288440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foliageRadius()I", cancellable = true)
    private void foliageRadius__1436420098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436420098L))
            info.setReturnValue(1291772854);
    }


}
