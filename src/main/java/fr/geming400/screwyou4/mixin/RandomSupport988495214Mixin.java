package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.RandomSupport.class)
public class RandomSupport988495214Mixin {
        @Inject(at = @At("HEAD"), method = "mixStafford13(J)J", cancellable = true)
    private static void mixStafford13__1163717082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163717082L))
            info.setReturnValue(8162236734498832782L);
    }

    @Inject(at = @At("HEAD"), method = "generateUniqueSeed()J", cancellable = true)
    private static void generateUniqueSeed__1267244746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267244746L))
            info.setReturnValue(-4255952531932057483L);
    }

    @Inject(at = @At("HEAD"), method = "upgradeSeedTo128bit(J)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void upgradeSeedTo128bit__731772036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731772036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seedFromHashOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void seedFromHashOf_1136161390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136161390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeSeedTo128bitUnmixed(J)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void upgradeSeedTo128bitUnmixed_1886107170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886107170L))
            info.setReturnValue(null);
    }


}
